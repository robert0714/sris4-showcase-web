/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rsdf217mType;
import tw.gov.moi.domain.Rsdf217yType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08110ComponentDTO;
import tw.gov.moi.rl.domain.Rldf002sDTO;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 戶籍登記通報資料新增元件.
 */
/**
 * @author gtu001
 *
 */
public interface Rl08110Component {

    /**
     * 新增申請書通報案件.
     * 
     * @param obnfDTO
     *            the obnf dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void addApplyData(DBSMain dbs, ObnfDTO obnfDTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增非通報案件.
     * 
     * @param rldf002sDTO
     *            the rldf002s dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void addData(DBSMain dbs, Rldf002sDTO rldf002sDTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param rldfl217
     *            the rldfl217
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doTotalMonthData(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param rldfl217
     *            the rldfl217
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doTotalMonthDataTest(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算年報表資料.
     * 
     * @param rldfl217
     *            the rldfl217
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doTotalYearData(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8110d(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8110m(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算年報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8110y(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8111d(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算月報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8111m(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 計算年報表資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void do8111y(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 通報戶籍登記案件資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doSendMonth(Rsdf217mType rsdf217m, ExecutantType executantType) throws RisBusinessException;

    /**
     * 通報戶籍登記案件資料.
     * 
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doSendYear(Rsdf217yType rsdf217y, ExecutantType executantType) throws RisBusinessException;

    /**
     * 給Rl08110Job做的通報.
     * 
     * @param executantType
     */
    void doSendForRl08110Job(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 給Rl08112Job做的通報.
     * 
     * @param executantType
     */
    void doSendForRl08112Job(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲戶的統計資料
     * 
     * @param executantType
     */
    void doRsdf811a(Rl08110ComponentDTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 給Rl08111Job做的通報.
     * 
     * @param executantType
     */
    void doSendForRl08111Job(Rl08110ComponentDTO dto, ExecutantType executantType);
    
    public static String JOB_KEY = "rl08110ComponentDTO";
}
