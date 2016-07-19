/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.annotations.RldfMappingEntity;
import tw.gov.moi.rl.component.xldf.annotations.XldfDsNameMaping;
import tw.gov.moi.rl.component.xldf.annotations.XldfKeyMapping;
import tw.gov.moi.rl.component.xldf.dto.XLDF004H;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004MT;
import tw.gov.moi.rs.common.constant.RsCDMesg;
import tw.gov.moi.rs.dto.PairEntry;

/**
 * The Class XLDFDomainKeyFormatUtils.
 * 
 * @author JL
 */
public final  class XLDFDomainKeyFormatUtils {
    
   
    
    /** The Constant BLANK_PARAMS. */
    private static final transient Object[] BLANK_PARAMS = new Object[] {};

    
    /** The LOG. */
    private static final transient Logger LOG = LoggerFactory.getLogger(XLDFDomainKeyFormatUtils.class);
    
    /**
     * Instantiates a new XLDF domain key format utils.
     */
    private XLDFDomainKeyFormatUtils(){}
    
    /**
     * 由Rldf去識別，組合DomainKey字串.
     * 
     * @param clazz
     *            the clazz
     * @param values
     *            the values
     * @return the rldf key
     */
    public static String getRldfKey(final Class<?> clazz, final String... values) {
        final Class<? extends XLDFDomainObject> xldfClass = DomainObjectTypeUtils.getRldfTargetPersonMapping().get(
                clazz);
        return getXldfKey(xldfClass);
    }

    /**
     * 由Rldf去識別，組合DomainKey字串.
     *
     * @param rldfTypeName the rldf type name
     * @param pariEntryList the pari entry list
     * @return the rldf key
     */
    public static String getRldfKey(final String rldfTypeName, final List<PairEntry> pariEntryList) {
        final Class<? extends XLDFDomainObject> xldfClass = XLDFDomainUtils.getXldfClassByRldfType(rldfTypeName);

        String domainKey = RlConstant.EMPTY_STRING;
        if (xldfClass != null) {
            domainKey = getXldfKey(xldfClass, pariEntryList);
        }
        return domainKey;
    }

    

    /**
     * 由Xldf去識別，組合DomainKey字串.
     * 
     * @param clazz
     *            the clazz
     * @param values
     *            the values
     * @return the xldf key
     */
    public static String getXldfKey(final Class<? extends XLDFDomainObject> clazz, final String... values) {
        final StringBuffer returnVal = new StringBuffer();
        final XldfKeyMapping[] keys = getKeys(clazz);
        for (int num = 0; num < keys.length; num++) {
            returnVal.append(StringUtils.rightPad(StringUtils.defaultString(values[num]), keys[num].length()));
        }
        return returnVal.toString();
    }

    /**
     * 取得XldfKeyMapping(該物件的Rldf PK).
     *
     * @param xldfClass            the xldf class
     * @return the keys
     */
    public static XldfKeyMapping[] getKeys(final Class<? extends XLDFDomainObject> xldfClass) {
        final RldfMappingEntity target = xldfClass.getAnnotation(RldfMappingEntity.class);
        XldfKeyMapping[] returnVal;
        if (target == null) {
            returnVal = null;
        } else {
            returnVal = target.keys();
        }
        return returnVal;
    }

    /**
     * 由Xldf去識別，組合XLDFDomainKey物件..
     * 
     * @param clazz
     *            the obj
     * @param values
     *            the values
     * @return the xldf key
     * @throws Exception
     *             the exception
     */
    public static XLDFDomainKey getXldfKey(final   Class<?>  clazz, final List<Object> values) throws Exception {
        if(!ClassUtils.isAssignable(clazz, XLDFDomainObject.class)){
            //是XLDFDomainObject才可以繼續往下作
            throw new RisBusinessException(RsCDMesg.TX6324E);
        }
        final Class<?> domainKeyObj = XLDFDomainUtils.caseXldfTypeId(clazz);
        final Class<?>[] paramTypes = new Class<?>[values.size()];
        XLDFDomainKey returnVal = null;
        // prepare typeparam
        for (int i = 0; i < values.size(); i++) {
            paramTypes[i] = values.get(i).getClass();
        }
        
        // get param constructor
        final Constructor<?> paramConstructor = domainKeyObj.getConstructor(paramTypes);

        if (paramConstructor != null) {
            // get XldfDomainKey
            returnVal = (XLDFDomainKey) paramConstructor.newInstance(values.toArray());
        }
        return returnVal;
    }
    /**
     * 由Rldf物件組合出XLDFDomainKey 字串.
     * 
     * @param obj
     *            the obj
     * @return the rldf key
     */
    public static String getRldfKey(final Object obj) {
        final StringBuffer returnVal = new StringBuffer();
        final Class<? extends XLDFDomainObject> xldfClass = DomainObjectTypeUtils.getRldfTargetPersonMapping().get(
                obj.getClass());
        if (xldfClass != null) {
            final XldfKeyMapping[] keys = getKeys(xldfClass);
            if (obj != null && keys != null) {
                try {
                    for (XldfKeyMapping key : keys) {
                        returnVal.append(StringUtils.rightPad(
                                StringUtils.defaultString(BeanUtils.getProperty(obj, key.name())), key.length()));
                    }
                } catch (Exception e) {
                    returnVal.delete(0, returnVal.length());
                }
            }
        }
        return returnVal.toString();
    }

    /**
     * 由Xldf物件組合出XLDFDomainKey 字串.
     *
     * @param obj            the obj
     * @param xldfClass the xldf class
     * @return the rldf key
     */
    public static String getRldfKey(final Object obj, final Class<? extends XLDFDomainObject> xldfClass) {
        final StringBuffer returnVal = new StringBuffer();
        if (xldfClass != null) {
            final XldfKeyMapping[] keys = getKeys(xldfClass);
            if (obj != null && keys != null) {
                try {
                    for (XldfKeyMapping key : keys) {
                        returnVal.append(StringUtils.rightPad(
                                StringUtils.defaultString(BeanUtils.getProperty(obj, key.name())), key.length()));
                    }
                } catch (Exception e) {
                    returnVal.delete(0, returnVal.length());
                }
            }
        }
        return returnVal.toString();
    }
    
   

    /**
     * 由Xldf物件組合出XLDFDomainKey 字串.
     * 
     * @param <E>
     *            the element type
     * @param obj
     *            the obj
     * @return the xldf key
     */
    public static <E extends XLDFDomainObject> String getXldfKey(final E obj) {
        final StringBuffer returnVal = new StringBuffer();
        final Method method = org.springframework.beans.BeanUtils.findDeclaredMethodWithMinimalParameters(
                obj.getClass(), "getDomainObj");
        if (method != null) {
            final XldfKeyMapping[] keys = getKeys(obj.getClass());
            if (obj != null && keys != null) {
                try {
                    Object domainObj;
                    if (method != null) {
                        for (int num = 0; num < keys.length; num++) {
                            domainObj = method.invoke(obj, BLANK_PARAMS);
                            returnVal.append(StringUtils.rightPad(StringUtils.defaultString((domainObj == null) ? null
                                    : BeanUtils.getProperty(domainObj, keys[num].name())), keys[num].length()));
                        }
                    }
                } catch (Exception e) {
                    returnVal.delete(0, returnVal.length());
                }
            }
        }
        return returnVal.toString();
    }

    /**
     * 由Xldf物件組合出XLDFDomainKey 字串並轉成List<String> 型態.
     * 
     * @param <E>
     *            the element type
     * @param obj
     *            the obj
     * @return the xldf keys
     */
    public static <E extends XLDFDomainObject> List<String> getXldfKeys(final E obj) {
        final List<String> returnVal = new ArrayList<String>();
        final Method method = org.springframework.beans.BeanUtils.findDeclaredMethodWithMinimalParameters(
                obj.getClass(), "getDomainObj");
        if (method != null) {
            final XldfKeyMapping[] keys = getKeys(obj.getClass());
            if (obj != null && keys != null) {
                try {
                    Object domainObj;
                    if (method != null) {
                        for (int num = 0; num < keys.length; num++) {
                            domainObj = method.invoke(obj, BLANK_PARAMS);
                            returnVal.add(BeanUtils.getProperty(domainObj, keys[num].name()));
                        }
                    }
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                    returnVal.add(StringUtils.EMPTY);
                }
            }
        }
        return returnVal;
    }

    /**
     * 由Xldf物件組合出XLDFDomainKey 字串並轉成List<Object> 型態.
     * 
     * @param <E>
     *            the element type
     * @param obj
     *            the obj
     * @return the xldf keys
     */
    public static <E extends XLDFDomainObject> List<Object> getXldfKeysObject(final E obj) {
        final List<Object> returnVal = new ArrayList<Object>();
        final Method method = org.springframework.beans.BeanUtils.findDeclaredMethodWithMinimalParameters(
                obj.getClass(), "getDomainObj");
        if (method != null) {
            final XldfKeyMapping[] keys = getKeys(obj.getClass());
            if (obj != null && keys != null) {
                try {
                    Object domainObj;
                    if (method != null) {
                        for (int num = 0; num < keys.length; num++) {
                            domainObj = method.invoke(obj, BLANK_PARAMS);
                            returnVal.add(XLDFDomainUtils.caseObjectByProperties(domainObj, keys[num].name()));
                        }
                    }
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                    returnVal.add(StringUtils.EMPTY);
                }
            }
        }
        return returnVal;
    }

    /**
     * 由Xldf物件，與傳入的字串，轉成List<String> 型態.
     * 
     * @param clazz
     *            the clazz
     * @param domainKey
     *            the domain key
     * @return the xldf keys
     */
    public static List<String> getXldfKeys(final Class<? extends XLDFDomainObject> clazz, final String domainKey) {
        final List<String> returnVal = new ArrayList<String>();
        final XldfKeyMapping[] keys = getKeys(clazz);
        int focesLength = 0;
        for (int num = 0; num < keys.length; num++) {
            returnVal.add(StringUtils.substring(domainKey, focesLength, focesLength + keys[num].length()));
            focesLength += keys[num].length();
        }
        return returnVal;
    }

    /**
     * 由Xldf物件，與傳入的字串，轉成Map<String, String> 型態.
     * 
     * @param clazz
     *            the clazz
     * @param domainKey
     *            the domain key
     * @return the xldf map keys
     */
    public static Map<String, String> getXldfMapKeys(final Class<? extends XLDFDomainObject> clazz,
            final String domainKey) {
        final Map<String, String> returnVal = new HashMap<String, String>();
        final XldfKeyMapping[] keys = getKeys(clazz);
        int focesLength = 0;
        for (int num = 0; num < keys.length; num++) {
            returnVal.put(keys[num].name(),
                    StringUtils.substring(domainKey, focesLength, focesLength + keys[num].length()));
            focesLength += keys[num].length();
        }
        return returnVal;
    }

    /**
     * 由Xldf物件，與傳入的字串，得到key值中的siteId的值.
     *
     * @param clazz            the clazz
     * @param domainKey            the domain key
     * @return the xldf map keys
     */
    public static String getXldfKeySiteId(final Class<? extends XLDFDomainObject> clazz, final String domainKey) {
        return getXldfKeyByKeyName(clazz, domainKey, RlConstant.OBJ_TYPE_SITE_ID);
    }

    /**
     * 由Xldf物件，與傳入的字串，轉成取出某key的值.
     *
     * @param clazz            the clazz
     * @param domainKey            the domain key
     * @param keyName the key name
     * @return the xldf map keys
     */
    public static String getXldfKeyByKeyName(final Class<? extends XLDFDomainObject> clazz, final String domainKey,
            final String keyName) {
        final Map<String, String> returnVal = new HashMap<String, String>();
        final XldfKeyMapping[] keys = getKeys(clazz);
        int focesLength = 0;
        for (int num = 0; num < keys.length; num++) {
            returnVal.put(keys[num].name(),
                    StringUtils.substring(domainKey, focesLength, focesLength + keys[num].length()));
            focesLength += keys[num].length();
        }

        String returnKey = returnVal.get(keyName);
        if (StringUtils.isBlank(returnKey)) {
            returnKey = RlConstant.EMPTY_STRING;
        }
        return returnKey;
    }

    /**
     * 由XLDFDomainObject，轉成Map<String, String> 型態.
     *
     * @param obj the obj
     * @return the xldf map keys
     */
    public static Map<String, String> getXldfMapKeys(final XLDFDomainObject obj) {
        final Map<String, String> returnVal = new LinkedHashMap<String, String>();
        final Method method = org.springframework.beans.BeanUtils.findDeclaredMethodWithMinimalParameters(
                obj.getClass(), "getDomainObj");
        if (method != null) {
            final XldfKeyMapping[] keys = getKeys(obj.getClass());
            if (obj != null && keys != null) {
                Object domainObj = null;
                if (method != null) {
                    for (XldfKeyMapping lKey : keys) {
                        try {
                            if (domainObj == null) {
                                domainObj = method.invoke(obj, BLANK_PARAMS);
                            }
                            returnVal.put(lKey.name(), XLDFDomainUtils.caseStringByProperties(domainObj, lKey.name()));
                        } catch (Exception e) {
                            LOG.error(e.getMessage(), e);
                            returnVal.put(lKey.name(), StringUtils.EMPTY);
                        }

                    }
                }

            }
        }
        return returnVal;
    }

    /**
     * 由XLDFDomainObject，轉成Map<String, String> 型態.
     *
     * @param obj the obj
     * @return the xldf map keys
     */
    public static Map<String, String> getXCDF001MKeys(final XLDFDomainObject obj) {
        final Map<String, String> returnVal = new LinkedHashMap<String, String>();
        final Method method = org.springframework.beans.BeanUtils.findDeclaredMethodWithMinimalParameters(
                obj.getClass(), "getDomainObj");
        final Class<? extends XLDFDomainObject> xcdf001mClz = XLDFDomainUtils.caseXldfType("XCDF001MRL");

        if (method != null) {
            final XldfKeyMapping[] keys = getKeys(xcdf001mClz);
            if (obj != null && keys != null) {
                Object domainObj = null;
                if (method != null) {
                    for (XldfKeyMapping lKey : keys) {
                        try {
                            if (domainObj == null) {
                                domainObj = method.invoke(obj, BLANK_PARAMS);
                            }
                            returnVal.put(lKey.name(), XLDFDomainUtils.caseStringByProperties(domainObj, lKey.name()));
                        } catch (Exception e) {
                            LOG.error(e.getMessage(), e);
                            returnVal.put(lKey.name(), StringUtils.EMPTY);
                        }

                    }
                }
            }
        }
        return returnVal;
    }

    /**
     * 由Xldf物件，與傳入的字串，轉成Map<String, String> 型態.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @param domainKey
     *            the domain key
     * @return the rldf map keys
     */
    public static Map<String, String> getRldfMapKeys(final Class<? extends XLDFDomainObject> xldfClazz,
            final String domainKey) {
        return getXldfMapKeys(xldfClazz, domainKey);
    }

    /**
     * 將傳入的物件其key值，轉成List<String> 型態.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @param obj
     *            the obj
     * @return the xldf keys
     */
    public static List<String> getXldfKeys(final Class<? extends XLDFDomainObject> xldfClazz, final Object obj) {
        final List<String> returnVal = new ArrayList<String>();
        final XldfKeyMapping[] keys = getKeys(xldfClazz);
        for (int num = 0; num < keys.length; num++) {
            returnVal.add(XLDFDomainUtils.caseStringByProperties(obj, keys[num].name()));
        }
        return returnVal;
    }

    /**
     * 將傳入的物件其key值，轉成字串 型態.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @param obj
     *            the obj
     * @return the xldf key
     */
    public static String getXldfKey(final Class<? extends XLDFDomainObject> xldfClazz, final Object obj) {
        final StringBuffer returnVal = new StringBuffer();
        final XldfKeyMapping[] keys = getKeys(xldfClazz);
        for (int num = 0; num < keys.length; num++) {
            returnVal.append(StringUtils.rightPad(
                    StringUtils.defaultString(XLDFDomainUtils.caseStringByProperties(obj, keys[num].name())),
                    keys[num].length()));
        }
        return returnVal.toString();
    }

    /**
     * 將傳入的物件其key值，轉成Map<String,String>.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @param obj
     *            the obj
     * @return theMap<String,String>.
     */
    public static Map<String, String> getXldfMapKeys(final Class<? extends XLDFDomainObject> xldfClazz, final Object obj) {

        final Map<String, String> returnVal = new HashMap<String, String>();

        final XldfKeyMapping[] keys = getKeys(xldfClazz);
        for (int num = 0; num < keys.length; num++) {
            returnVal.put(keys[num].name(),
                    StringUtils.defaultString(XLDFDomainUtils.caseStringByProperties(obj, keys[num].name())));
        }
        return returnVal;
    }

    /**
     * 將傳入的物件其key值，轉成字串 型態.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @param obj
     *            the obj
     * @return the xldf key
     */
    public static List<PairEntry> getXldfKeyPairEntry(final Class<? extends XLDFDomainObject> xldfClazz, final Object obj) {
        final List<PairEntry> returnList = new ArrayList<PairEntry>();
        final XldfKeyMapping[] keys = getKeys(xldfClazz);
        for (int num = 0; num < keys.length; num++) {
            final PairEntry pariEntry = new PairEntry();
            pariEntry.setKey(keys[num].name());
            pariEntry.setValue(XLDFDomainUtils.caseObjectByProperties(obj, keys[num].name()));
            returnList.add(pariEntry);
        }
        return returnList;
    }

    /**
     * 取得XldfDsNameMaping annotation 設定值.
     * 
     * @param xldfClazz
     *            the xldf clazz
     * @return the xldf ds config
     */
    public static XldfDsNameMaping getXldfDsConfig(final Class<? extends XLDFDomainObject> xldfClazz) {
        return xldfClazz.getAnnotation(XldfDsNameMaping.class);
    }

    /**
     * 判斷傳入的物件屬於XLDF004H.class or XLDF004M.class.
     * 
     * @param <E>
     *            the element type
     * @param obj
     *            the obj
     * @return the select person entity
     */
    public static <E extends XLDFDomainObject> Class<E> getSelectPersonEntity(Object obj) {
        final Class<?>[] mergeClass = new Class<?>[] { XLDF004H.class, XLDF004M.class };
        XldfKeyMapping[] keys;
        boolean isProcess = Boolean.FALSE;
        Class<E> returnVal = null;
        // 用Class的key值與傳進來的param的有值得key做判斷 是哪個Class
        for (Class<?> targetClass : mergeClass) {
            keys = getKeys((Class<E>) targetClass);
            isProcess = Boolean.TRUE;
            for (int num = 0; num < keys.length; num++) {
                isProcess &= StringUtils.defaultString(XLDFDomainUtils.caseStringByProperties(obj, keys[num].name())).trim()
                        .matches(keys[num].regEx());
            }
            if (isProcess) {
                returnVal = (Class<E>) targetClass;
                break;
            }
        }

        // 如果是4M、再繼續判斷是否為4MT
        if (XLDF004M.class.equals(returnVal)) {
            // 判斷是否為補登資料 (若siteId是"88888888") 取出param的siteId
            final String paramSiteId = XLDFDomainUtils.caseStringByProperties(obj, "siteId");
            if (StringUtils.equals(RlConstant.TLDF_SITE_ID, paramSiteId)) {
                returnVal = (Class<E>) XLDF004MT.class;
            }
        }
        return returnVal;
    }

    /**
     * 取得RldfMappingEntity annotation 設定值.
     * 
     * @param xldfClass
     *            the xldf class
     * @return the rldf ds config
     */
    public static RldfMappingEntity getRldfDsConfig(final Class<? extends XLDFDomainObject> xldfClass) {
        return xldfClass.getAnnotation(RldfMappingEntity.class);
    }

    /**
     * 取得RldfMappingEntity annotation 設定值.
     *
     * @param xldfClassName the xldf class name
     * @return the rldf ds config
     */
    public static RldfMappingEntity getRldfDsConfig(final String xldfClassName) {
        final Class<?> xldfClass = XLDFDomainUtils.getXldfClassByRldfType(xldfClassName);
        return xldfClass.getAnnotation(RldfMappingEntity.class);
    }

}
