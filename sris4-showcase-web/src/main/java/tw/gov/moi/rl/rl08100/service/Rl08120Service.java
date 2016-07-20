/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfs001Type;
import tw.gov.moi.domain.Rldfs002Type;
import tw.gov.moi.domain.Rldfs003Type;
import tw.gov.moi.domain.Rldfs004Type;
import tw.gov.moi.domain.Rldfs005Type;
import tw.gov.moi.domain.Rldfs061Type;
import tw.gov.moi.domain.Rldfs062Type;
import tw.gov.moi.domain.Rldfs079Type;
import tw.gov.moi.domain.Rldfs080Type;
import tw.gov.moi.domain.Rldfs081Type;
import tw.gov.moi.domain.Rldfs090Type;
import tw.gov.moi.domain.Rldfs091Type;
import tw.gov.moi.domain.Rldfs092Type;
import tw.gov.moi.domain.Rldfs093Type;
import tw.gov.moi.domain.Rldfs09dType;
import tw.gov.moi.domain.Rldfs09eType;
import tw.gov.moi.domain.Rldfs09pType;
import tw.gov.moi.domain.Rldfs09sType;
import tw.gov.moi.domain.Rldfs09tType;
import tw.gov.moi.domain.Rldfs09uType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08120DTO;

/**
 * 製作戶籍人口統計月報表之1、5與6處理服務介面 Interface Rl08120Service.
 * 
 * @author kenfc
 */

public interface Rl08120Service {

    public final String ALL_REPORT = "All";

    public final String PROGRAM_ID = "RL08120";

    final String AREA_CODE_2_REG = "09|10|63|64|65|66|67|68$";

    Class<?>[] CLASS_ARRAY = { Rldfs001Type.class, Rldfs09eType.class, Rldfs002Type.class, Rldfs09dType.class,
            Rldfs003Type.class, Rldfs090Type.class, Rldfs004Type.class, Rldfs091Type.class, Rldfs079Type.class,
            Rldfs080Type.class, Rldfs005Type.class, Rldfs061Type.class, Rldfs062Type.class, Rldfs081Type.class,
            Rldfs09sType.class, Rldfs09tType.class, Rldfs092Type.class, Rldfs093Type.class, Rldfs09pType.class,
            Rldfs09uType.class };

    /**
     * 查詢輸入條件內容
     */
    public void doConvert(Rl08120DTO rl08120DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢查 RSDFZ211 有無資料
     * 
     * @param rl08120DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkData(final Rl08120DTO rl08120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢 ESETFLAG table，是否已做備份
     * 
     * @param dto
     * @param executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryEsetflag(final Rl08120DTO dto, final ExecutantType executantType);

    void doBatchReportJobAll(Rl08120DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doPreview(Rl08120DTO dto, ExecutantType executantType) throws RisBusinessException;

    void validateRsdf023mCanExecute(Rl08120DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doDownloadAll(Rl08120DTO dto, ExecutantType executantType) throws RisBusinessException;

    void moveData(final Rl08120DTO rl08120DTO, final ExecutantType executantType);
}
