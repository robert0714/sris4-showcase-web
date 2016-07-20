/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * XLDF逕為登記申請人業務元件介面
 * 
 * @author Marcus Chen
 * 
 */
public interface XLDFEnforceBusinessComponent {

    /**
     * 取得逕為登記申請人.
     * 
     * @param conn
     *            DBSMain
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            建立XLDF交易設定參數
     * @return 傳回產生的XLDF交易物件
     * @throws RisBusinessException
     *             「交易已存在」、「查無當事人資料」、「鎖定當事人資料失敗」、「寫入交易當事人失敗
     */
    XldfefaplcType getEnforceApplicant(final DBSMain conn1, final ExecutantType executantType)
            throws RisBusinessException;

}
