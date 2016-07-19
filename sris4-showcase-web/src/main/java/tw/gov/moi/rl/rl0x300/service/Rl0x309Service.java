/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0x300.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldfv002Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x309DTO;

/**
 * 個人遷徙紀錄職權更正介面.
 * 
 * @author Derek
 */
public interface Rl0x309Service {

    /** The FUN c_ code. */
    static String FUNC_CODE = "RL0X309";

    /**
     * 初始化畫面.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    void initWebUI(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 查詢取得資料後，導頁至職權更正類別為修改或刪除之頁面.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doApply(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 申請職權更正修改.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doEditApply(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 設定記錄檔.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @return the rldv002
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfv002Type> getRldv002(Rl0x309DTO dto, ExecutantType exe);

    /**
     * Sets the query result.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setQueryResult(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 新增居住地.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @return the rl0x309 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0x309DTO addResidence(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核准.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSumit(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 核退.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doReject(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * Lock data.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void lockData(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * Unlock data.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void unlockData(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 清除畫面.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void cleanWebUI(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 重製頁面.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void refreshUI(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面左邊內容.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @return the uI left value
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf006mType getUILeftValue(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 取得畫面右邊內容.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @return the uI right value
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf006mType getUIRightValue(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 代碼顯示內容.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void setCodeLabele(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * 驗證資料.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;

    /**
     * Verify data edit.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyDataEdit(Rl0x309DTO dto, ExecutantType exe) throws RisBusinessException;
}
