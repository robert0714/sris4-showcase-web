/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.utils;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.annotations.RldfMappingEntity;


/**
 * The Class DomainObjectTypeUtils.
 *
 * @author JL
 */
@SuppressWarnings("unchecked")
public class DomainObjectTypeUtils {

    /** The rldf target person mapping. */
    private static Map<Class<?>, Class<? extends XLDFDomainObject>> rldfTargetPersonMapping;

    static {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "beans-xldf-config.xml" });
            rldfTargetPersonMapping = (Map<Class<?>, Class<? extends XLDFDomainObject>>) context.getBean("rldfTargetPersonMapping");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 取得RLDF 與XLDF 的對應表.
     *
     * @return the rldf target person mapping
     */
    public static Map<Class<?>, Class<? extends XLDFDomainObject>> getRldfTargetPersonMapping() {
        return rldfTargetPersonMapping;
    }


    /**
     * 取得XLDF 對應的 RLDF 型態.
     *
     * @param xldfClass the xldf class
     * @return the rLDF entity class
     */
    public static Class<?> getRLDFEntityClass(final Class<? extends XLDFDomainObject> xldfClass) {
        final RldfMappingEntity target = xldfClass.getAnnotation(RldfMappingEntity.class);
        Class<?> returnVal;
        if (target ==null){
            returnVal = null;
        }else{
            returnVal = target.value();
        }
        return returnVal;
    }

}
