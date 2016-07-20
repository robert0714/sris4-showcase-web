/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * RLDF刪除M檔處理類別
 * 
 * @author marcus
 * 
 */
public enum RlHouseholdDeleteType {

    /** 不刪除 */
    DELETE_NONE,

    /** 將5678M 30 30t 47 49 MXXM檔 87t 88t 89t 刪掉 */
    DELETE_ALL,

    /** 將MXXM檔 87t 88t 89t 刪掉 */
    DELETE_LIGHT,

}
