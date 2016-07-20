/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.HouseholdOperation;
import tw.gov.moi.rl.domain.XLDFPersonDataDTO;

/**
 * 戶籍登記作業變更顯示共用元件介面.
 * 
 * @author CK Lin
 * 
 */
public interface HouseholdOperationChangeComponent {

    /** The Constant SHOW. */
    boolean SHOW = true;

    /** The Constant NOT_SHOW. */
    boolean NOT_SHOW = false;

    /** The Constant ERR_MSG_ChangeOperation. */
    final static String ERR_MSG_ChangeOperation = "戶籍登記作業變更顯示失敗";

    /** The Constant ERR_MSG_RenewOperation. */
    final static String ERR_MSG_RenewOperation = "執行補登資料時，戶籍登記作業變更顯示失敗";

    /**
     * 依當事人條件變更顯示戶籍登記作業清單.
     * 
     * @param personDataDTO
     *            個人基本資料DTO
     * @param householdOperationMap
     *            戶籍登記作業清單
     * @param executantType
     *            執行環境參數
     */
    public void changeHouseholdOperation(final XLDFPersonDataDTO personDataDTO,
            final Map<String, HouseholdOperation> householdOperationMap, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 補登資料依當事人條件變更顯示戶籍登記作業清單.
     * 
     * @param personDataDTO
     *            個人基本資料DTO
     * @param householdOperationMap
     *            戶籍登記作業清單
     * @param executantType
     *            執行環境參數
     */
    public void renewHouseholdOperation(final XLDFPersonDataDTO personDataDTO,
            final Map<String, HouseholdOperation> householdOperationMap, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 符合條件時，是否顯示登記作業
     * 
     * @param personCode
     *            個人基本資料代碼
     * @param value
     *            比對值
     * @return boolean
     */
    public boolean equalShowOperationRender(String personCode, String value, boolean isShow);

    /**
     * 等於空白時，是否顯示登記作業
     * 
     * @param personCode
     *            個人基本資料代碼
     * @param value
     *            比對值
     * @param householdOperation
     *            戶籍登記作業物件
     * @return boolean
     */
    public boolean blankShowOperationRender(String personCode, boolean isShow);

}
