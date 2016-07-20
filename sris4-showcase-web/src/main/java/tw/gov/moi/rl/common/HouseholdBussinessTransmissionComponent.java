/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.HouseholdtransrecType;

/**
 * 戶籍登記業務傳輸共用元件介面.
 * 
 * @author Jay Kan
 */
public interface HouseholdBussinessTransmissionComponent {

    /** GET_HOUSEHOLDTRANSREC */
    String GET_HOUSEHOLDTRANSREC = "gethouseholdtransrec";

    /**
     * 非同步傳輸.
     * 
     * @param jobList
     *            the job list
     * @param execute
     *            the execute
     * @return true, if successful
     */
    boolean asynchUpload(final List<HouseholdtransrecType> jobList, final ExecutantType execute);

    /**
     * 更新Jobstate.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pJobList
     *            the job list
     * @param pState
     *            the state
     * @param pExecutantType
     *            the executant type
     * @return true, if successful
     */
    boolean updateJobState(final DBSMain pDBSMain, final List<HouseholdtransrecType> pJobList, final Integer pState,
            final ExecutantType pExecutantType);

    /**
     * 產生傳輸紀錄.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pPhase
     *            作業階段
     * @param pFilePath
     *            檔案路徑
     * @param pExecutantType
     *            the executant type
     * @return true, if successful
     */
    boolean generateHouseholdtransrec(final DBSMain pDBSMain, final Integer pPhase, final String pFilePath,
            final ExecutantType pExecutantType);

    /**
     * 尋找傳輸紀錄檔.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pTransactionId
     *            交易序號
     * @param pPhase
     *            作業階段
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    List<HouseholdtransrecType> findByTransactionAndPhase(final DBSMain pDBSMain, final String pTransactionId,
            final Integer pPhase, final ExecutantType pExecutantType);
}