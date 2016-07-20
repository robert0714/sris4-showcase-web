/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08fs0DTO;

/**
 * 選舉人投票所調整介面.
 * 
 * @author Viva.Hong
 */
public interface Rl08fs0Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl08fs0Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl08fs0ServiceImpl";

    /**
     * 查詢.
     * 
     * @param dto
     *            選舉造冊封面列印DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             查詢失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void doQuery(final Rl08fs0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 儲存.
     * 
     * @param dto
     *            選舉造冊封面列印DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             儲存失敗
     */
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl08fs0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 驗證Vote office.
     * 
     * @param dto
     *            選舉造冊封面列印DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             驗證Vote office失敗
     */
    public void voteOfficeCheck(final Rl08fs0DTO dto, final ExecutantType execType) throws RisBusinessException;
}
