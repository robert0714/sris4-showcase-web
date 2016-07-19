/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a400.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a410DTO;

/**
 * 製作罰鍰處理服務介面
 */
public interface Rl0a410Service {

    /**
     * 查詢罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0a410 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a410DTO doQuery(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 編輯罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0a410 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public Rl0a410DTO editData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢驗證罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0a410 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public Rl0a410DTO verifyData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 確認新增罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void addConfirmData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印罰鍰.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存暫存罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public void saveXldfData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除暫存罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteXldfData(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存暫存規費資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDeleteXldfmainrcp(final Rl0a410DTO dto, final ExecutantType pExecutantType)
            throws RisBusinessException;

    /**
     * 刪除暫存規費資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void saveXldfmainrcp(final Rl0a410DTO dto, final ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 列印規費.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrintFee(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * getFineIdList.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return Rl0a410DTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a410DTO getFineIdList(Rl0a410DTO dto, ExecutantType executantType) throws RisBusinessException;

}
