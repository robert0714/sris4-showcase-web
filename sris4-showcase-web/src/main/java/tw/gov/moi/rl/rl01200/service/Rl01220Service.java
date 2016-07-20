/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01220DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 死亡（死亡宣告）登記服務介面.
 * 
 * @author Charles Chen
 */
public interface Rl01220Service {

    final String PROCESS_MARK_REG = "D|E";

    /** 補登資料 */
    final String TEMP_SITE_ID = "88888888";

    final String APPLY_CODE = "002";

    final String OTHER_CERTIFICATE_CODE = "7";

    final String START = "*";

    final String HOUSE_HOLD_RELATIONSHIP = "戶長";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01220DTO initLoadPage(final Rl01220DTO rl01220DTO, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param bean
     *            Rl01220DTO
     * @return 戶籍記事清單
     * @throws RisBusinessException
     *             「執行資料驗證並自動組合記事」失敗
     */

    /** 初始化死亡登記 */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01220DTO initOperationDTO(final Rl01220DTO rl01220DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 載入死亡登記 */
    public Rl01220DTO loadOperationDTO(final Rl01220DTO rl01220DTO, final ExecutantType ExecutantType)
            throws RisBusinessException;

    /** 檢討死亡登記 */
    public Rl01220DTO reviewOperationDTO(final Rl01220DTO rl01220DTO, final ExecutantType ExecutantType)
            throws RisBusinessException;

    /** 取得配偶資料 */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01220DTO getSpouseData(final Rl01220DTO rl01220DTO, final ExecutantType ExecutantType)
            throws RisBusinessException;

    /** 刪除配偶資料 */
    public Rl01220DTO clearSpouseData(final Rl01220DTO rl01220DTO, final ExecutantType ExecutantType)
            throws RisBusinessException;

    // 刪除死亡登記XLDF資料
    @RisServiceMethod(value = MethodType.DELETE)
    public void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 執行資料驗證並自動組合記事 */
    public Rl01220DTO verifyAppData(final Rl01220DTO rl01220DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 儲存死亡登記申請資料至XLDF Table */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01220DTO rl01220DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除死亡（死亡宣告）登記之罰鍰資料XLDF
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public void doDeleteHouseholdFine(final Rl01220DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 將DTO檔案反序列化成DTO物件。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     * @return 死亡登記DTO
     */
    Rl01220DTO loadTempFile(final TempFileDTO<Rl01220DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO物件序列化成檔案。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     */
    void saveTempFile(final TempFileDTO<Rl01220DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 
     * @param dto
     * @param exec
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doFineCheckAndCleanOldFine(final Rl01220DTO dto, final ExecutantType exec);
}
