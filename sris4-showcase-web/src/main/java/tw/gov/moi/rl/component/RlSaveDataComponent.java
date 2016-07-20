/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf049mType;

/**
 * 透過WebService資料異動共用元件介面.
 * 
 * @author Jay Kan
 */
public interface RlSaveDataComponent {

    /** setRldf004m異動個人基本資料 */
    String SET_RLDF004M_EXT_MESSAGE = "setRldf004m異動個人基本資料";

    /** setRldf049m異動保護家庭暴力資料 */
    String SET_RLDF049M_EXT_MESSAGE = "setRldf049m異動保護家庭暴力資料";

    /** rldf004m */
    String RLDF004M = "rldf004m";

    /** person_id = ? */
    String RLDF004M_WHERE_CONDITION = "person_id = ?";

    /**
     * 異動個人基本資料.
     * 
     * @param pPersonId
     *            統號
     * @param pSiteId
     *            作業點代碼
     * @param pColumnNames
     *            異動欄位名稱
     * @param pColumnValues
     *            異動欄位值
     * @param pExecutantType
     *            the executant type
     */
    void setRldf004m(final String pPersonId, final String pSiteId, final List<String> pColumnNames,
            final List<String> pColumnValues, final ExecutantType pExecutantType);

    /**
     * 新增保護家庭暴力資料.
     * 
     * @param pSiteId
     *            作業點代碼
     * @param pRldf049mType
     *            the rldf049m type
     * @param pExecutantType
     *            the executant type
     */
    void setRldf049m(final String pSiteId, final Rldf049mType pRldf049mType, final ExecutantType pExecutantType);
}
