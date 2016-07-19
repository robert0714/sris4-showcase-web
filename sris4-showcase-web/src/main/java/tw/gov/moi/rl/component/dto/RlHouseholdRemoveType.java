/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * @author marcus
 * 
 */
public enum RlHouseholdRemoveType {

    /** 將M檔Copy到H檔 :處理Table設定檔: */
    COPY,

    /** 將M檔Copy到H檔 全部:處理Table設定檔: */
    REMOVE_ALL,

    /** 將M檔Copy到H檔 部份:處理Table設定檔: */
    REMOVE_LIGHT,

    /** 遷入地為當事人之除口資料 */
    MOVEIN_PERSON,

    /** 自國外遷入或是遷出撤銷國外 ,遷入地為當事人之除口資料 */
    MOVEIN_PERSON_FOREIGN,

    /** 無 */
    NONE,

}
