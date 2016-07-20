/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.dto.PrintJobDTO;

/**
 * 戶籍登記業務列印共用元件介面.
 * 
 * @author Jay Kan
 */
public interface HouseholdBusinessPrintComponent {

    /** 戶籍登記申請書報表檔名 */
    String REPORT_NAME = "RLRPA0000";

    /** 戶籍登記申請書報表檔名 */
    String REPORT_CERTIFICATION_NAME = "RLRPC0000";

    String FINE_REPORT_NAME = "RLRPR0000";

    String LOCATION = "APPLY_RPT";

    /** 戶籍謄本申請書報表名稱 */
    String RLRP02100 = "RLRP02100";

    /** 戶口名簿申請書報表名稱 */
    String RLRP02512 = "RLRP02512";

    /** 姓名更改紀錄申請書報表名稱 */
    String RLRP02E00 = "RLRP02E00";

    /** 婚姻更改紀錄申請書報表名稱 */
    String RLRP02G00 = "RLRP02G00";

    /** 遷徙更改紀錄申請書報表名稱 */
    String RLRP02H00 = "RLRP02H00";

    /**
     * 平常戶籍大簿與規費模組一般呼叫列印輸出的檔案pdf路徑.
     * 
     * @param pPrintJobDTO
     *            {@link PrintJobDTO}
     * @param pExecutantType
     *            {@link ExecutantType}
     * @return 傳回cognos主機所傳回的檔案路徑
     */
    public String genericStatePrint(final PrintJobDTO pPrintJobDTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

    /**
     * Gets the report name combination.
     * 
     * 取得報表組合(如果是套餐,則內部是排列)
     * 
     * @param testResult
     *            the test result
     * @param maxNo
     *            the max no
     * @return the report name combination
     */
    public List<String[]> getReportNameCombinationInnerPermutation(final List<String> testResult, final int maxNo);
}
