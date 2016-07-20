/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.utils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tw.gov.moi.domain.XldfaplcexType;
import tw.gov.moi.domain.XldfhdrmType;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.domain.XldftrnstnType;
import tw.gov.moi.domain.XldftxnoprType;
import tw.gov.moi.domain.XldftxnprsType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.RlHouseholdDeleteType;
import tw.gov.moi.rl.component.dto.RlHouseholdRemoveDTO;
import tw.gov.moi.rl.component.dto.RlHouseholdRemoveType;
import tw.gov.moi.rl.component.dto.XLDFAction;
import tw.gov.moi.rl.component.dto.XLDFDeletedDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFOperationAccess;
import tw.gov.moi.rl.component.dto.XLDFState;
import tw.gov.moi.rl.component.dto.XLDFTransaction;
import tw.gov.moi.rl.component.xldf.annotations.RldfMappingEntity;
import tw.gov.moi.rl.component.xldf.annotations.XldfKeyMapping;
import tw.gov.moi.rs.dto.PairEntry;

/**
 * The Class XLDFDomainUtils.
 * 
 * @author JL
 */
public final  class XLDFDomainUtils {
    /** The LOG. */
    private static final transient Logger LOG = LoggerFactory.getLogger(XLDFDomainUtils.class);

    /** The Constant primitList. */
    private static final List<String> primitList = Arrays.asList(new String[] { "transactionId", "sequenceId", "serialNo",
            "siteId", "lockMode", "action", "state" });

    private XLDFDomainUtils(){}
    /**
     * 塞值到物件屬性中.
     * 
     * @param source
     *            the source
     * @param name
     *            the name
     * @param obj
     *            the obj
     */
    public static void setProperties(final Object source, final String name, final Object obj) {
        try {
            BeanUtils.setProperty(source, name, obj);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
    }

    /**
     * 取物件屬性值.
     * 
     * @param source
     *            the source
     * @param fieldName
     *            the field name
     * @return the object
     */
    public static Object caseObjectByProperties(final Object source, final String fieldName) {
        Object returnVal = null;
        try {
            final Field sField = source.getClass().getDeclaredField(fieldName);
            if (sField != null) {
                sField.setAccessible(Boolean.TRUE);
                returnVal = sField.get(source);
            }
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return returnVal;
    }

    /**
     * 取物件屬性並轉成字串.
     * 
     * @param source
     *            the source
     * @param field
     *            the field
     * @return the string
     */
    public static String caseStringByProperties(final Object source, final String field) {
        String returnVal;
        try {
            returnVal = org.apache.commons.beanutils.BeanUtils.getProperty(source, field);
        } catch (Exception e) {
            returnVal = StringUtils.EMPTY;
        }
        return returnVal;
    }

    /**
     * 取物件屬性並轉成布林值.
     * 
     * @param source
     *            the source
     * @param field
     *            the field
     * @return true, if successful
     */
    public static boolean caseBooleanByProperties(final Object source, final String field) {
        boolean returnVal;
        try {
            returnVal = RlConstant.XLDF_LOCK_MODE_T == BooleanUtils.toBoolean(org.apache.commons.beanutils.BeanUtils.getProperty(
                    source, field));
        } catch (Exception e) {
            returnVal = Boolean.FALSE;
        }
        return returnVal;
    }

    /**
     * 將字串轉換成XLDFState.
     * 
     * @param state
     *            the state
     * @return the xLDF state
     */
    public static XLDFState caseXldfState(final String state) {
        XLDFState returnVal;
        if (StringUtils.equalsIgnoreCase(state, RlConstant.XLDF_STATE_O)) {
            returnVal = XLDFState.origin;
        } else if (StringUtils.equalsIgnoreCase(state, RlConstant.XLDF_STATE_C)) {
            returnVal = XLDFState.changed;
        } else {
            returnVal = XLDFState.none;
        }
        return returnVal;
    }

    /**
     * 將字串轉換成RlHouseholdRemoveType. RLDF下除戶處理類別
     * 
     * @param removeProcessType
     *            the String
     * @return the removeProcessType RlHouseholdRemoveType
     */
    public static RlHouseholdRemoveType caseRemoveProcessType(final String removeProcessType) {
        RlHouseholdRemoveType returnVal;
        if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdRemoveType.COPY.ordinal()), removeProcessType)) {
            returnVal = RlHouseholdRemoveType.COPY;
        } else if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdRemoveType.REMOVE_LIGHT.ordinal()), 
                removeProcessType)) {
            returnVal = RlHouseholdRemoveType.REMOVE_LIGHT;
        } else if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdRemoveType.REMOVE_ALL.ordinal()), removeProcessType)) {
            returnVal = RlHouseholdRemoveType.REMOVE_ALL;
            
        } else if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdRemoveType.MOVEIN_PERSON.ordinal()), 
                removeProcessType)) {
            returnVal = RlHouseholdRemoveType.MOVEIN_PERSON;
        } else if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdRemoveType.MOVEIN_PERSON_FOREIGN.ordinal()),
                removeProcessType)) {
            returnVal = RlHouseholdRemoveType.MOVEIN_PERSON_FOREIGN;
        } else {
            returnVal = RlHouseholdRemoveType.NONE;
        }
        return returnVal;
    }

    /**
     * 將RlHouseholdRemoveType轉換成字串.
     * 
     * @param removeProcessType
     *            RlHouseholdRemoveType
     * @return the String
     */
    public static String caseRemoveProcessType(final RlHouseholdRemoveType removeProcessType) {
        return String.valueOf(removeProcessType.ordinal());
    }

    /**
     * 將字串轉換成RlHouseholdDeleteType. RLDF刪除M檔處理類別
     *
     * @param deleteProcessType the delete process type
     * @return the removeProcessType RlHouseholdRemoveType
     */
    public static RlHouseholdDeleteType caseDeleteProcessType(final String deleteProcessType) {
        RlHouseholdDeleteType returnVal;
        if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdDeleteType.DELETE_ALL.ordinal()), deleteProcessType)) {
            returnVal = RlHouseholdDeleteType.DELETE_ALL;
        } else if (StringUtils.equalsIgnoreCase(String.valueOf(RlHouseholdDeleteType.DELETE_LIGHT.ordinal()), 
                deleteProcessType)) {
            returnVal = RlHouseholdDeleteType.DELETE_LIGHT;
        } else {
            returnVal = RlHouseholdDeleteType.DELETE_NONE;
        }
        return returnVal;
    }

    /**
     * 將RlHouseholdDeleteType轉換成字串.
     * 
     * @param deleteProcessType
     *            RlHouseholdDeleteType
     * @return the String
     */
    public static String caseDeleteProcessType(final RlHouseholdDeleteType deleteProcessType) {
        return String.valueOf(deleteProcessType.ordinal());
    }

    /**
     * XLDFAction轉換成字串.
     * 
     * @param action
     *            the action
     * @return the string
     */
    public static String caseXldfAction(final XLDFAction action) {
        String returnVal;
        switch (action) {
            case read:
                returnVal = RlConstant.XLDF_ACTION_R;
                break;
            case update:
                returnVal = RlConstant.XLDF_ACTION_U;
                break;
            case insert:
                returnVal = RlConstant.XLDF_ACTION_I;
                break;
            case delete:
                returnVal = RlConstant.XLDF_ACTION_D;
                break;
            case copy:
                returnVal = RlConstant.XLDF_ACTION_C;
                break;

            default:
                returnVal = "N";
                break;
        }
        return returnVal;
    }

    /**
     * 將字串轉成XLDFAction.
     * 
     * @param action
     *            the action
     * @return the xLDF action
     */
    public static XLDFAction caseXldfAction(final String action) {
        XLDFAction returnVal;
        if (StringUtils.equalsIgnoreCase(action, RlConstant.XLDF_ACTION_R)) {
            returnVal = XLDFAction.read;
        } else if (StringUtils.equalsIgnoreCase(action, RlConstant.XLDF_ACTION_U)) {
            returnVal = XLDFAction.update;
        } else if (StringUtils.equalsIgnoreCase(action, RlConstant.XLDF_ACTION_I)) {
            returnVal = XLDFAction.insert;
        } else if (StringUtils.equalsIgnoreCase(action, RlConstant.XLDF_ACTION_D)) {
            returnVal = XLDFAction.delete;
        } else if (StringUtils.equalsIgnoreCase(action, RlConstant.XLDF_ACTION_C)) {
            returnVal = XLDFAction.copy;
        } else {
            returnVal = XLDFAction.none;
        }
        return returnVal;
    }

    /**
     * 取得XldfopracsType物件.
     * 
     * @param transactionId
     *            the transaction id
     * @param sequenceId
     *            the sequence id
     * @param xldfType
     *            the xldf type
     * @param domainKey
     *            the domain key
     * @param action
     *            the action
     * @param serialNo
     *            the serial no
     * @param copyRefDomainKey
     *            the copy ref domain key
     * @param copyRefXldfType
     *            the copy ref xldf type
     * @return the xldfopracs type instance
     */
    public static XldfopracsType getXldfopracsTypeInstance(final String transactionId, final Integer sequenceId,
            final String xldfType, final String domainKey, final String action, final Integer serialNo,
            final String copyRefDomainKey, final String copyRefXldfType) {
        final XldfopracsType returnVal = new XldfopracsType();
        returnVal.setTransactionId(transactionId);
        returnVal.setSequenceId(sequenceId);
        returnVal.setXldfType(xldfType);
        returnVal.setDomainKey(domainKey);
        returnVal.setAction(action);
        returnVal.setSerialNo(serialNo);
        returnVal.setCopyRefDomainKey(StringUtils.defaultString(copyRefDomainKey));
        returnVal.setCopyRefXldfType(StringUtils.defaultString(copyRefXldfType));
        return returnVal;
    }

    /**
     * 取得XldftxnoprType物件.
     *
     * @param transactionId            the transaction id
     * @param sequenceId            the sequence id
     * @param operationCode            the operation code
     * @param operationPhase the operation phase
     * @return the xldftxnopr type instance
     */
    public static XldftxnoprType getXldftxnoprTypeInstance(final String transactionId, final Integer sequenceId,
            final String operationCode, final Integer operationPhase) {
        final XldftxnoprType returnVal = new XldftxnoprType();
        returnVal.setTransactionId(transactionId);
        returnVal.setSequenceId(sequenceId);
        returnVal.setOperationCode(operationCode);
        returnVal.setOperationPhase(operationPhase);
        returnVal.setStored(RlConstant.XLDF_STORE_F);
        return returnVal;
    }

    /**
     * 取得XldftxnprsType物件.
     * 
     * @param transactionId
     *            the transaction id
     * @param personSerialNo
     *            the person serial no
     * @param xldfType
     *            the xldf type
     * @param domainKey
     *            the domain key
     * @param deleteMark
     *            the delete mark
     * @return the xldftxnprs type instance
     */
    public static XldftxnprsType getXldftxnprsTypeInstance(String transactionId, Integer personSerialNo, String xldfType,
            String domainKey, boolean deleteMark) {
        final XldftxnprsType returnVal = new XldftxnprsType();
        returnVal.setTransactionId(transactionId);
        returnVal.setPersonSerialNo(personSerialNo);
        returnVal.setXldfType(xldfType);
        returnVal.setDomainKey(domainKey);
        returnVal.setDeleteMark(deleteMark);
        return returnVal;
    }

    /**
     * 複製物件屬性到另一個物件(其屬性值需不為null,並且需有XmlElement.class的Annotation).
     * 
     * @param soruce
     *            the soruce
     * @param target
     *            the target
     */
    public static void copyPropertiesBreakNull(final Object soruce, final Object target) {
        final Field[] fields = soruce.getClass().getDeclaredFields();        
        Object value;
        for (Field sField : fields) {
            sField.setAccessible(Boolean.TRUE);
            try {
                value = sField.get(soruce);
                if (value != null && PropertyUtils.isWriteable(target, sField.getName())) {
                    final Field tField = target.getClass().getDeclaredField(sField.getName());
                    if (tField != null && tField.getType().equals(sField.getType())
                            && tField.getAnnotation(XmlElement.class) != null) {
                        tField.setAccessible(Boolean.TRUE);
                        tField.set(target, value);
                    }
                }
            } catch (Exception e) {
                if(soruce!=null && target!=null){
                    LOG.error("soruce:{} , target:{}", soruce.getClass().getCanonicalName(), target.getClass().getCanonicalName());
                }
                LOG.error(e.getMessage(), e);
            }
        }
    }

    /**
     * 將物件屬性轉換成List<PairEntry>
     * Type(其屬性值需不為null,並且需有XmlElement.class的Annotation).
     * 
     * @param soruce
     *            the soruce
     * @return the list
     */
    public static List<PairEntry> casePropertiesBreakNullToPairEntry(final Object soruce) {
        final Field[] fields = soruce.getClass().getDeclaredFields();
        Object value;
        final List<PairEntry> returnVal = new ArrayList<PairEntry>();
        int i = 0;
        for (Field sField : fields) {
            sField.setAccessible(Boolean.TRUE);
            try {
                value = sField.get(soruce);
                if (value != null && sField.getAnnotation(XmlElement.class) != null) {
                    returnVal.add(new PairEntry());
                    returnVal.get(i).setKey(sField.getName());
                    returnVal.get(i).setValue(value);
                    i++;
                }
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
            }
        }
        return returnVal;
    }

    /**
     * 將物件屬性轉換成Map<String, Object>
     * Type(其屬性值需不為null,並且需有XmlElement.class的Annotation).
     * 
     * @param soruce
     *            the soruce
     * @return the map
     */
    public static Map<String, Object> casePropertiesBreakNullToMap(final Object soruce) {
        final Map<String, Object> returnVal = new HashMap<String, Object>();
        casePropertiesBreakNullToMap(returnVal, soruce);
        return returnVal;
    }

    /**
     * 將物件屬性轉換成Map<String, Object>
     * Type(其屬性值需不為null,並且需有XmlElement.class的Annotation).
     * 
     * @param returnVal
     *            the return val
     * @param soruce
     *            the soruce
     */
    public static void casePropertiesBreakNullToMap(final Map<String, Object> returnVal, final Object soruce) {
        final Field[] fields = soruce.getClass().getDeclaredFields();
        Object value;
        for (Field sField : fields) {
            sField.setAccessible(Boolean.TRUE);
            try {
                value = sField.get(soruce);
                if (value != null && sField.getAnnotation(XmlElement.class) != null) {
                    returnVal.put(sField.getName(), value);
                }
            } catch (Exception e) {
                LOG.error(e.getMessage(), e);
            }
        }
    }

    /**
     * 將Map<String, String>轉換成List<PairEntry> Type.
     * 
     * @param keys
     *            the keys
     * @return the list
     */
    public static List<PairEntry> casePropertiesBreakNullToPairEntry(Map<String, String> keys) {
        final List<PairEntry> returnVal = new ArrayList<PairEntry>();
        for (Entry<String, String> entryUnit : keys.entrySet()) {
            final PairEntry unit = new PairEntry();
            unit.setKey(entryUnit.getKey());
            unit.setValue(entryUnit.getValue());
            returnVal.add(unit);
        }
        return returnVal;
    }

    /**
     * 比較兩個物件，將值相等的屬性清空成Null(部份特定屬性不清除，如"XLDF PK").
     * 
     * @param soruce
     *            the soruce
     * @param target
     *            the target
     * @param config
     *            the config
     */
    public static void clearEqToNull(final Object soruce, final Object target, final RldfMappingEntity config) {
        Object value;

        final List<String> values = new ArrayList<String>();
        if (config != null && config.keys() != null) {
            for (XldfKeyMapping key : config.keys()) {
                values.add(key.name());
            }
        }
        if (soruce == null) {
            final Field[] fields = target.getClass().getDeclaredFields();
            for (Field tField : fields) {
                tField.setAccessible(Boolean.TRUE);
                try {
                    if (primitList.indexOf(tField.getName()) < 0 && values.indexOf(tField.getName()) < 0
                            && tField.getAnnotation(XmlElement.class) != null) {
                        tField.set(target, null);
                    }
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        } else {
            final Field[] fields = soruce.getClass().getDeclaredFields();
            for (Field sField : fields) {
                sField.setAccessible(Boolean.TRUE);
                try {
                    value = sField.get(soruce);
                    if (value != null) {
                        final Field tField = target.getClass().getDeclaredField(sField.getName());
                        tField.setAccessible(Boolean.TRUE);
                        if (tField != null && values.indexOf(sField.getName()) < 0 && value.equals(tField.get(target))
                                && tField.getType().equals(sField.getType()) && tField.getAnnotation(XmlElement.class) != null
                                && primitList.indexOf(tField.getName()) < 0) {
                            tField.set(target, null);
                        }
                    }
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                }
            }
        }
    }

    /**
     * 取得XLDFOperationAccess物件.
     * 
     * @param master
     *            the master
     * @param access
     *            the access
     * @param copyAccess
     *            the copy access
     * @return the xLDF operation access
     */
    public static XLDFOperationAccess getXLDFOperationAccess(final XLDFTransaction master, final XldfopracsType access,
            final XLDFOperationAccess copyAccess) {
        XLDFOperationAccess returnVal;
        if (access == null) {
            returnVal = null;
        } else {
            returnVal = new XLDFOperationAccess();
            returnVal.setTransactionId(master.getTransactionId());
            returnVal.setAcceptAdminOfficeCode(master.getAcceptAdminOfficeCode());
            returnVal.setOperationSequenceId(access.getSequenceId());
            returnVal.setAcion(caseXldfAction(access.getAction()));
            returnVal.setDomainKey(access.getDomainKey());
            returnVal.setXldfType(caseXldfType(access.getXldfType()));
            returnVal.setCopyReference(copyAccess);
        }
        return returnVal;
    }

    /**
     * 取得XLDFOperationAccess物件.
     *  
     *
     * @param txnId the txn id
     * @param acceptAdminOfficeCode the accept admin office code
     * @param access            the access
     * @param copyAccess            the copy access
     * @return the xLDF operation access
     */
    public static XLDFOperationAccess getXLDFOperationAccess(final String txnId, final String acceptAdminOfficeCode,
            final XldfopracsType access, final XLDFOperationAccess copyAccess) {
        XLDFOperationAccess returnVal;
        if (access == null) {
            returnVal = null;
        } else {
            returnVal = new XLDFOperationAccess();
            returnVal.setTransactionId(txnId);
            returnVal.setAcceptAdminOfficeCode(acceptAdminOfficeCode);
            returnVal.setOperationSequenceId(access.getSequenceId());
            returnVal.setAcion(caseXldfAction(access.getAction()));
            returnVal.setDomainKey(access.getDomainKey());
            returnVal.setXldfType(caseXldfType(access.getXldfType()));
            returnVal.setCopyReference(copyAccess);
        }
        return returnVal;
    }

    /**
     * 取得外加申請人(XldfaplcexType)物件.
     *
     * @param transaction the transaction
     * @return the list
     */
    public static List<XldfaplcexType> castXldfaplcexTypeInstance(final XldftrnstnType transaction) {
        final List<XldfaplcexType> returnList = new ArrayList<XldfaplcexType>();

        if (StringUtils.isNotBlank(transaction.getApplyId1())) {
            final XldfaplcexType apply1 = new XldfaplcexType();
            apply1.setTransactionId(transaction.getTransactionId());
            apply1.setSequenceId(Integer.valueOf(0));
            apply1.setPersonId(transaction.getApplyId1());
            apply1.setPersonRole(RlConstant.STRING_A);
            apply1.setNightPhoneExtension(transaction.getApplyNightPhoneExtension1());
            apply1.setDayPhoneNumber(transaction.getApplyDayPhoneNumber1());
            apply1.setAreaCode(transaction.getApplyAreaCode1());
            apply1.setNightPhoneNumber(transaction.getApplyNightPhoneNumber1());
            apply1.setStreet(transaction.getApplyStreet1());
            apply1.setDayPhoneExtension(transaction.getApplyDayPhoneExtension1());
            apply1.setSiteId(transaction.getApplySiteId1());
            apply1.setNeighbor(transaction.getApplyNeighbor1());
            apply1.setDayPhoneAreacode(transaction.getApplyDayPhoneAreacode1());
            apply1.setRemoveDate(transaction.getApplyRemoveDate1());
            apply1.setRelationship(transaction.getApplyRelationship1());
            apply1.setNightPhoneAreacode(transaction.getApplyNightPhoneAreacode1());
            apply1.setVillage(transaction.getApplyVillage1());
            apply1.setBirthYymmdd(transaction.getApplyBirthYymmdd1());
            apply1.setName(transaction.getApplyName1());
            apply1.setCellPhoneNumber(transaction.getApplyCellPhoneNumber1());
            apply1.setRemoveTime(transaction.getApplyRemoveTime1());
            returnList.add(apply1);
        }

        if (StringUtils.isNotBlank(transaction.getApplyId2())) {

            final XldfaplcexType apply2 = new XldfaplcexType();
            apply2.setTransactionId(transaction.getTransactionId());
            apply2.setSequenceId(Integer.valueOf(0));
            apply2.setPersonId(transaction.getApplyId2());
            apply2.setPersonRole(RlConstant.STRING_A);
            apply2.setNightPhoneExtension(transaction.getApplyNightPhoneExtension2());
            apply2.setDayPhoneNumber(transaction.getApplyDayPhoneNumber2());
            apply2.setAreaCode(transaction.getApplyAreaCode2());
            apply2.setNightPhoneNumber(transaction.getApplyNightPhoneNumber2());
            apply2.setStreet(transaction.getApplyStreet2());
            apply2.setDayPhoneExtension(transaction.getApplyDayPhoneExtension2());
            apply2.setSiteId(transaction.getApplySiteId2());
            apply2.setNeighbor(transaction.getApplyNeighbor2());
            apply2.setDayPhoneAreacode(transaction.getApplyDayPhoneAreacode2());
            apply2.setRemoveDate(transaction.getApplyRemoveDate2());
            apply2.setRelationship(transaction.getApplyRelationship2());
            apply2.setNightPhoneAreacode(transaction.getApplyNightPhoneAreacode2());
            apply2.setVillage(transaction.getApplyVillage2());
            apply2.setBirthYymmdd(transaction.getApplyBirthYymmdd2());
            apply2.setName(transaction.getApplyName2());
            apply2.setCellPhoneNumber(transaction.getApplyCellPhoneNumber2());
            apply2.setRemoveTime(transaction.getApplyRemoveTime2());
            returnList.add(apply2);
        }

        if (StringUtils.isNotBlank(transaction.getCommId())) {
            final XldfaplcexType comm = new XldfaplcexType();
            comm.setTransactionId(transaction.getTransactionId());
            comm.setSequenceId(Integer.valueOf(0));
            comm.setPersonId(transaction.getCommId());
            comm.setPersonRole(RlConstant.STRING_C);
            comm.setAreaCode(transaction.getCommAreaCode());
            comm.setStreet(transaction.getCommStreet());
            comm.setSiteId(transaction.getCommSiteId());
            comm.setNeighbor(transaction.getCommNeighbor());
            comm.setRemoveDate(transaction.getCommRemoveDate());
            comm.setRelationship(transaction.getCommRelationship());
            comm.setVillage(transaction.getCommVillage());
            comm.setBirthYymmdd(transaction.getCommBirthYymmdd());
            comm.setName(transaction.getCommName());
            comm.setRemoveTime(transaction.getCommRemoveTime());
            returnList.add(comm);
        }

        return returnList;
    }

    /**
     * Case rl remove dto.
     *
     * @param srcObj the src obj
     * @return the rl household remove dto
     */
    public static RlHouseholdRemoveDTO caseRlRemoveDTO(final XldfhdrmType srcObj) {
        final RlHouseholdRemoveDTO dto = new RlHouseholdRemoveDTO();

        dto.setPersonId(srcObj.getPersonId());
        dto.setSiteId(srcObj.getSiteId());
        dto.setTransactionId(srcObj.getTransactionId());
        dto.setSequenceId(String.valueOf(srcObj.getSequenceId()));
        dto.setUseType(srcObj.getUseType());
        dto.setHouseholdId(srcObj.getHouseholdId());
        dto.setHouseholdHeadId(srcObj.getHouseholdHeadId());
        dto.setMasterDeadFlag(StringUtils.equals("Y", srcObj.getMasterDeadFlag()));
        dto.setMoveinPlacePersonFlag(StringUtils.equals("Y", srcObj.getMoveinplacePersonFlag()));
        dto.setRemoveYyymmdd(srcObj.getRemoveYyymmdd());
        dto.setRemoveTime(srcObj.getRemoveTime());
        dto.setSpecialUpdate(srcObj.getSpecialUpdate());
        dto.setOperationCode(srcObj.getOperationCode());
        dto.setProcessType(XLDFDomainUtils.caseRemoveProcessType(srcObj.getRemoveProcessType()));
        dto.setDeleteType(XLDFDomainUtils.caseDeleteProcessType(srcObj.getDeleteType()));
        dto.setMasterPersonId(srcObj.getMasterPersonId());
        return dto;
    }

    /**
     * 取得XLDFDeletedDomainKey.
     *
     * @param access the access
     * @return XLDFDeletedDomainKey
     */

    public static XLDFDeletedDomainKey castXLDFDeletedDomainKey(final XldfopracsType access) {
        final String siteId = XLDFDomainKeyFormatUtils.getXldfKeySiteId(XLDFDomainUtils.caseXldfType(access.getXldfType()),
                access.getDomainKey());
        return createXLDFDeletedDomainKey(access.getTransactionId(), access.getSerialNo(), access.getDomainKey(),
                XLDFDomainUtils.caseXldfType(access.getXldfType()), siteId);
    }

    /**
     * 取得XLDFDeletedDomainKey.
     *
     * @param transactionId the transaction id
     * @param seqId the seq id
     * @param domainKey the domain key
     * @param xldfType the xldf type
     * @param siteId the site id
     * @return XLDFDeletedDomainKey
     */
    public static XLDFDeletedDomainKey createXLDFDeletedDomainKey(final String transactionId, Integer seqId, String domainKey,
            Class<? extends XLDFDomainObject> xldfType, String siteId) {
        final XLDFDeletedDomainKey delDomainKey = new XLDFDeletedDomainKey();

        delDomainKey.setDomainKey(transactionId);
        delDomainKey.setOperationSequenceId(seqId);
        delDomainKey.setTransactionId(transactionId);
        delDomainKey.setXldfType(xldfType);
        delDomainKey.setSiteId(siteId);
        return delDomainKey;
    }

    /**
     * 將類別名稱轉換成XLDFDomainObject 類別.
     * 
     * @param className
     *            the class name
     * @return the class<? extends xldf domain object>
     */
    @SuppressWarnings("unchecked")
    public static Class<? extends XLDFDomainObject> caseXldfType(final String className) {
        Class<? extends XLDFDomainObject> clazz = null;
        try {
            clazz = (Class<? extends XLDFDomainObject>) Class.forName(StringUtils.join(new Object[] {
                    "tw.gov.moi.rl.component.xldf.dto.", className.trim() }));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return clazz;
    }

    /**
     * 將類別名稱轉換成XLDFDomainObjectID類別.
     * 
     * @param className
     *            the class name
     * @return the class
     */
    public static Class<?> caseXldfTypeId(final String className) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%sID", className.trim()));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return clazz;
    }

    /**
     * 將類別轉換成XLDFDomainObjectID類別.
     * 
     * @param clazz
     *            the clazz
     * @return the class
     */
    public static Class<?> caseXldfTypeId(final Class<?> clazz) {
        Class<?> lClazz = null;
        try {
            lClazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%sID", clazz.getSimpleName()));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 將類別轉換成XLDFDomainObject類別.
     *
     * @param className the class name
     * @return the class
     */
    public static Class<?> caseXldfTypeByDomainKey(final String className) {
        Class<?> lClazz = null;
        try {
            lClazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%s", className.replace("ID", "")));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 將類別轉換成XLDFDomainObject類別.
     *
     * @param className the class name
     * @return the class
     */
    public static Class<? extends XLDFDomainObject> caseXldfClassByDomainKey(final String className) {
        Class<? extends XLDFDomainObject> lClazz = null;
        try {
            lClazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%s", className.replace("ID", ""))).asSubclass(
                    XLDFDomainObject.class);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 取得XLDFXXMT BY XLDFXXM.
     *
     * @param className the class name
     * @return the class
     */
    public static Class<?> getXldfmtClassByXldfmClass(final String className) {
        Class<?> lClazz = null;
        try {
            lClazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%sT", className));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 取得XLDFXXXX BY RldfXXXType or TLdfXXXType.
     *
     * @param rldfTypeclass the rldf typeclass
     * @return the class
     */
    public static Class<? extends XLDFDomainObject> getXldfDomainObjectTypeByHibernateEntityType(final Class<?> rldfTypeclass) {
        final String canonicalName = rldfTypeclass.getCanonicalName();
        final String rldfTypeName = rldfTypeclass.getSimpleName();
        final String tldfTypePattern01 = "tw.gov.moi.domain.Tldf.*Type";
        final String rldfTypePattern01 = "tw.gov.moi.domain.Rldf.*Type";
        final String rcdfTypePattern01 = "tw.gov.moi.domain.Rcdf.*Type";
        final String xldfTypePattern01 = "tw.gov.moi.domain.Xldf.*Type";
        final String xcdfTypePattern01 = "tw.gov.moi.domain.Xcdf.*Type";
        Class<? extends XLDFDomainObject> lClazz = null;
        String xldfClassName = null;
        try {
            if (canonicalName.matches(rcdfTypePattern01)) {
                final String removeTypeName = StringUtils.replaceOnce(rldfTypeName, "R", "X").replace("Type", "");
                xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%s",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
            } else if (canonicalName.matches(tldfTypePattern01)) {
                final String removeTypeName = StringUtils.replaceOnce(rldfTypeName, "T", "X").replace("Type", "");
                xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%sT",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
            } else if (canonicalName.matches(rldfTypePattern01)) {
                final String removeTypeName = StringUtils.replaceOnce(rldfTypeName, "R", "X").replace("Type", "");
                xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%s",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
            } else if (canonicalName.matches(xldfTypePattern01)) {
                final String removeTypeName = StringUtils.removeEndIgnoreCase(rldfTypeName, "Type");
                xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%s",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
            } else if (canonicalName.matches(xcdfTypePattern01)) {
                final String removeTypeName = StringUtils.removeEndIgnoreCase(rldfTypeName, "Type");
                xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%s",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
            }
            lClazz = Class.forName(xldfClassName).asSubclass(XLDFDomainObject.class);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        } finally {
            if (StringUtils.isNotBlank(xldfClassName) && lClazz == null) {
                throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6325E, String.format(
                        "class type:   %s  沒有對應的XLDF domain object:   %S ", canonicalName, xldfClassName));
            }
        }
        return lClazz;
    }

    /**
     * 取得XLDFXXXX BY RldfXXXType.
     *
     * @param rldfTypeName the rldf type name
     * @return the class
     */
    public static Class<? extends XLDFDomainObject> getXldfClassByRldfType(final String rldfTypeName) {
        Class<? extends XLDFDomainObject> lClazz = null;
        try {
            if (StringUtils.equals("Rcdf001mType", rldfTypeName)) {
                lClazz = Class.forName(String.format("tw.gov.moi.rl.component.xldf.dto.%s", "XCDF001MRL")).asSubclass(
                        XLDFDomainObject.class);
            } else if (StringUtils.equals("Rcdf074aType", rldfTypeName)) {
                lClazz = null;
            } else {
                final String removeTypeName = StringUtils.replaceOnce(rldfTypeName, "R", "X").replace("Type", "");
                final String xldfClassName = String.format("tw.gov.moi.rl.component.xldf.dto.%s",
                        removeTypeName.substring(0, removeTypeName.length()).toUpperCase());
                lClazz = Class.forName(xldfClassName).asSubclass(XLDFDomainObject.class);
            }
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 判斷是否為XLDFMT系列的Class.
     *
     * @param clazz the clazz
     * @return 是否為XLDFMT系列的Class
     */
    public static boolean ifXldfMtClass(final Class<? extends XLDFDomainObject> clazz) {
        boolean xldfmtSource = Boolean.FALSE;
        if (StringUtils.equals(RlConstant.XLDFMT_CLASS_REG, clazz.getSimpleName())) {
            xldfmtSource = Boolean.TRUE;
        }
        return xldfmtSource;

    }

    /**
     * 將類別名稱轉成domaintype類別Class.
     * 
     * @param className
     *            the class name
     * @return the class
     */
    public static Class<?> caseRldfTypeId(final String className) {
        Class<?> clazz = null;
        try {
            if (StringUtils.isNotBlank(className)) {
                clazz = Class.forName(String.format("tw.gov.moi.domain.%s", className.trim()));
            }
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return clazz;
    }

    /**
     * 將類別名稱轉成domaintype類別Class.
     *
     * @param lClassType the l class type
     * @return the class
     */
    public static Class<?> caseEntityTypeFromXldfName(final String lClassType) {
        Class<?> clazz = null;
        try {
            if (StringUtils.isNotBlank(lClassType)) {
             // 從Rldf->XLDF
                final Class<? extends XLDFDomainObject> lXldfClass = XLDFDomainUtils.caseXldfType(lClassType);
             // 得到所對應的RLDF
                clazz = DomainObjectTypeUtils.getRLDFEntityClass(lXldfClass);

            }
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return clazz;
    }

    /**
     * 將傳入的物件XLDFCLASS,RldfType calss, RldfObject 轉成只有key值的object.
     *
     * @param xClass the x class
     * @param rldfSrcObj the rldf src obj
     * @return obj Object with key
     * @throws Exception the exception
     */
    public static Object getQueryKeyObject(final Class<? extends XLDFDomainObject> xClass,
            final Object rldfSrcObj) throws Exception {

        final Object returnVal = org.springframework.beans.BeanUtils.instantiate(rldfSrcObj.getClass());
        final XldfKeyMapping[] keys = XLDFDomainKeyFormatUtils.getKeys(xClass);
        setNullPropertiesEntity(returnVal);
        for (int num = 0; num < keys.length; num++) {
            XLDFDomainUtils.setProperties(returnVal, keys[num].name(),
                    StringUtils.defaultString(XLDFDomainUtils.caseStringByProperties(rldfSrcObj, keys[num].name())));
        }

        return returnVal;
    }

    /**
     * **
     * Query Object , transactionId, personId,siteId
     * 
     * *****.
     *
     * @param xClass the x class
     * @param keys the keys
     * @param queryPramNames the query pram names
     * @param txnId the txn id
     * @return the hb xldf qry object
     * @throws IllegalAccessException the illegal access exception
     * @throws InvocationTargetException the invocation target exception
     * @throws NoSuchMethodException the no such method exception
     */
    public static Object getHbXLDFQryObject(final Class<? extends XLDFDomainObject> xClass, 
            final Map<String, String> keys, final String[] queryPramNames, 
            final String txnId) throws IllegalAccessException,
            InvocationTargetException, NoSuchMethodException {

        final Object xldfQryObj = org.springframework.beans.BeanUtils.instantiate(getEntityType(xClass));

        setNullPropertiesEntity(xldfQryObj);
        // 設定Key值
        for (String qryParamName : queryPramNames) {
            BeanUtils.setProperty(xldfQryObj, qryParamName, keys.get(qryParamName));
        }
        // +上txnId
        BeanUtils.setProperty(xldfQryObj, RlConstant.OBJ_F_T_ID, txnId);
        return xldfQryObj;
    }

    /**
     * **
     * 由於嘉國的所產生的hibernate entity 會帶入預設值....
     * 
     * .而這預設值在使用ObjectQuery時會當成查詢條件
     * 
     * 所以new 這entity後...對此entity的屬性跑loop值設null (
     * personSerialNo預設值為0才會消失,其他hibernate entity有屬性為 boolean<primitive
     * type>就真的變成搜尋的必要條件...這是這方法需要注意的地方)
     * 
     * 所以照此作後搜尋條件就會變回一個transactionId
     *
     * @param entity the new null properties entity
     * @throws IllegalAccessException the illegal access exception
     * @throws InvocationTargetException the invocation target exception
     * @throws NoSuchMethodException the no such method exception
     */
    public static void setNullPropertiesEntity(final Object entity) throws 
    IllegalAccessException, InvocationTargetException, NoSuchMethodException {
     final PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(entity);
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            final  String propertyName = propertyDescriptor.getName();
            if (PropertyUtils.isWriteable(entity, propertyName)) {
                PropertyUtils.setProperty(entity, propertyName, null);
            }
        }
    }

    /**
     * 取得XldfxxxType from RldfxxxType
     *  
     *
     * @param rldfTypeName the rldf type name
     * @return the class
     */
    public static Class<?> getXldfDomainTypeByRldfType(final String rldfTypeName) {
        Class<?> lClazz = null;
        try {

            lClazz = Class.forName(String.format("tw.gov.moi.domain.%s", StringUtils.replaceOnce(rldfTypeName, "R", "X")));
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return lClazz;
    }

    /**
     * 取得XldfKeyMapping(該物件的Rldf PK).
     *
     * @param xldfClass            the xldf class
     * @return the keys
     */
    public static Class<?> getEntityType(final Class<? extends XLDFDomainObject> xldfClass) {
        final RldfMappingEntity target = xldfClass.getAnnotation(RldfMappingEntity.class);
        Class<?> returnVal;
        if (target == null) {
            returnVal = null;
        } else {
            returnVal = target.xldfEntityClass();
        }
        return returnVal;
    }

}
