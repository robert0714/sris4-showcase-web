/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02700DTO;

/**
 * 簿頁改換寫及記事刪減服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl02700Service {

    String AUTO_NOTE_ID = "Z0Z7930002";

    /**
     * 驗證簿頁改換寫及記事刪減.
     * 
     * @param rl02700dto
     *            the rl02700dto
     * @param executantType
     *            the executant type
     * @throws RuntimeException
     *             the runtime exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(final Rl02700DTO rl02700dto, final ExecutantType executantType);

    /**
     * 儲存簿頁改換記事.
     * 
     * @param rl02700dto
     *            the rl02700dto
     * @param executantType
     *            the executant type
     * @throws RuntimeException
     *             the runtime exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl02700DTO rl02700dto, final ExecutantType executantType);

    /**
     * 儲存全戶動態記事.
     * 
     * @param rl02700dto
     *            the rl02700dto
     * @param executantType
     *            the executant type
     * @throws RuntimeException
     *             the runtime exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSaveHouseContent(final Rl02700DTO rl02700dto, final ExecutantType executantType)
            throws RuntimeException;

    /**
     * 儲存個人動態記事.
     * 
     * @param rl02700dto
     *            the rl02700dto
     * @param executantType
     *            the executant type
     * @throws RuntimeException
     *             the runtime exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSavePersonContent(final Rl02700DTO rl02700dto, final ExecutantType executantType)
            throws RuntimeException;
}
