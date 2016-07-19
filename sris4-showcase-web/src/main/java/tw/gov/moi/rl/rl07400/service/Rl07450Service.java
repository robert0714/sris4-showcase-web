/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07450DTO;

/**
 * 製作戶籍登記催告書Service Interface
 * 
 * @author Ahhong
 */
public interface Rl07450Service {

    /**
     * 查詢催告書資料
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 確認新增催告書資料
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void addConfirmData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存查詢催告書資料
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 編輯催告書資料
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void editData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印催告書
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 驗證輸入
     * 
     * @param executantType
     * @param dto
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void addVerifyData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存暫存Xldf009e與Xlde009e資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    public void saveXldfData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除暫存Xldf009e與Xlde009e資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteXldfData(Rl07450DTO dto, ExecutantType executantType) throws RisBusinessException;

}