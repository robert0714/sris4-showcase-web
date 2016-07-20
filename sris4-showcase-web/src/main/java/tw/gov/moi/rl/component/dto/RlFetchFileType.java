/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * 取file的類型
 * 
 * @author marcus
 * 
 */
public enum RlFetchFileType {

    /** None */
    NONE,
    /** 取得當事人4M 1M與戶長4M */
    M_4_1_HEAD4,

    /** 取得當事人4M 1M與戶長4M +戶內成員所有個人基本相關資料 */
    M_4_1_HEAD4_ALLMEMBERS,

    /** 取得當事人4M 1M與戶長4M +戶內成員的4M */
    M_4_1_HEAD4_MEMBER_4M,

    /** 取得戶下成員4M */
    MEMBER_4M,

    /** 取得戶下成員4 5 10m 全戶基本資料 */
    MEMBER_4M_5M_10M_Household_1M,

    /** 取得戶下成員4 5 10m m10m 全戶基本資料 */
    MEMBER_4M_5M_M10M_Household_1M,

    /** 取得戶下成員全部個人基本資料 和 全戶基本資料 與戶下成員4M */
    MEMBER_ALL_Household_MEMBER,

    /** 取得戶下成員全部個人基本資料(大戶遷徙使用) */
    MEMBER_ALL,

}
