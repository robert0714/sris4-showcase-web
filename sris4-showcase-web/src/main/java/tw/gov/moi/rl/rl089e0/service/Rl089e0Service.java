/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl089e0.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089e0DTO;

/**
 * 職權更正案件統計表服務.
 * 
 * @author Viva.Hong
 */
public interface Rl089e0Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl089e0Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl089e0ServiceImpl";

    /** 報表名稱:RLRP089E0. */
    public final String RLRP089E0 = "RLRP089E0";

    /** 報表名稱:RLRP089E1. */
    public final String RLRP089E1 = "RLRP089E1";

    /** 報表名稱:RLRP089E2. */
    public final String RLRP089E2 = "RLRP089E2";

    /** 報表名稱:RLRP089E3. */
    public final String RLRP089E3 = "RLRP089E3";

    /** 報表名稱:RLRP089E4. */
    public final String RLRP089E4 = "RLRP089E4";

    /** 報表名稱:RLRP089E5. */
    public final String RLRP089E5 = "RLRP089E5";

    /** 報表名稱:RLRP089E6. */
    public final String RLRP089E6 = "RLRP089E6";

    /** 報表名稱:RLRP089E7. */
    public final String RLRP089E7 = "RLRP089E7";

    /** 報表名稱:RLRP089E8. */
    public final String RLRP089E8 = "RLRP089E8";

    /** 報表名稱:RLRP089E9. */
    public final String RLRP089E9 = "RLRP089E9";

    /** 報表名稱:RLRP089EA. */
    public final String RLRP089EA = "RLRP089EA";

    /** 報表名稱:RLRP089EB. */
    public final String RLRP089EB = "RLRP089EB";

    /** 報表名稱:RLRP089EC. */
    public final String RLRP089EC = "RLRP089EC";

    /** 報表名稱:RLRP089ED. */
    public final String RLRP089ED = "RLRP089ED";

    /** 報表名稱:RLRP089EE. */
    public final String RLRP089EE = "RLRP089EE";

    /** 報表名稱:RLRP089EF. */
    public final String RLRP089EF = "RLRP089EF";

    /** 報表名稱:RLRP089EG. */
    public final String RLRP089EG = "RLRP089EG";

    /**
     * 列印職權更正案件統計表.
     * 
     * @param dto
     *            職權更正案件統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             列印職權更正案件統計表失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl089e0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽職權更正案件統計表.
     * 
     * @param dto
     *            職權更正案件統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預覽職權更正案件統計表失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl089e0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得並下載職權更正案件統計表.
     * 
     * @param dto
     *            職權更正案件統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載職權更正案件統計表失敗
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl089e0DTO dto, final ExecutantType execType) throws RisBusinessException;

}
