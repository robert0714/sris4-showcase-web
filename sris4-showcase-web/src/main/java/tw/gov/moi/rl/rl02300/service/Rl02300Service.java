/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02300DTO;

public interface Rl02300Service {

    /**
     * 初編
     */
    final static String YES = "1";

    /**
     * 初編
     */
    final static String NO = "0";

    /**
     * 初編
     */
    final static String REGISTERKIND_ONE = "1";

    /**
     * 改編
     */
    final static String REGISTERKIND_TWO = "2";

    /**
     * 增編
     */
    final static String REGISTERKIND_THREE = "3";

    /**
     * 合併
     */
    final static String REGISTERKIND_FOUR = "4";
    final static String REGISTERKIND_FIVE = "1";
    final static String REGISTERKIND_SIX = "1";

    /**
     * 整編
     */
    final static String REGISTERKIND_SEVEN = "7";

    final static String REGISTERKIND_A = "A";

    /**
     * 門牌歷史
     */
    final static String REGISTERKIND_0 = "0";

    /**
     * 取得當事人資料
     * 
     * @param rl02300dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doQueryPersonInfo(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得受委託資料
     * 
     * @param rl02300dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doQueryDegPersonInfo(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得規費資料
     * 
     * @param rl02300dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void doQueryRldfu001(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the rl02300 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02300DTO doQuery(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 選取處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the rl02300 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02300DTO doSelect(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 門牌核發處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the rl02300 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02300DTO doApproves(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 申請書存檔處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印選擇處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the rl02300 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public Rl02300DTO printerSelect(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印申請書處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void printerApplication(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印證明書處理.
     * 
     * @param rl02300dto
     *            the rl02300dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void printerCertificate(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 變更附繳證件
     * 
     * @param rl02300dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void onchangeCertificate(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    public void verifyPlusDat(Rl02300DTO rl02300dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印規費收據
     * 
     * @param rl02300dto
     * @param execType
     * @throws RisBusinessException
     */
    public void printReceipt(final Rl02300DTO rl02300dto, ExecutantType execType) throws RisBusinessException;

}
