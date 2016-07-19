/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01814DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 死亡（死亡宣告）撤銷登記服務介面
 */
public interface Rl01814Service {

    /** 原死亡登記申請書 apply code */
    final String ORIGIN_APPLY_CODE = "002";

    /** 死亡撤銷登記申請書 apply code */
    final String APPLY_CODE = "09D";

    /** 作業代碼 */
    public final static String OPERATION_CODE = "01814";

    /** "附繳證件"為"其他"之代碼 */
    public final static String OTHER_CERTIFICATE_CODE = "5";

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
    public Rl01814DTO initLoadPage(final Rl01814DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化死亡撤銷登記
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the rl01814 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01814DTO initOperationDTO(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入死亡撤銷登記
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the rl01814 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01814DTO loadOperationDTO(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除死亡撤銷登記XLDF資料
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the rl01814 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public Rl01814DTO doDelete(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the rl01814 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    public Rl01814DTO verifyAppData(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存死亡撤銷登記申請資料至XLDF Table
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 自立新戶，取得新戶基本資料
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the new household
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01814DTO getNewHousehold(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 非自立新戶，取得擬入戶基本資料
     * 
     * @param rl01814DTO
     *            the rl01814 dto
     * @param executantType
     *            the executant type
     * @return the household
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01814DTO getHousehold(Rl01814DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除「死亡撤銷登記」之罰鍰資料XLDF
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public void doDeleteHouseholdFine(final Rl01814DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 將DTO檔案反序列化成DTO物件。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     * @return 死亡撤銷登記DTO
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01814DTO loadTempFile(final TempFileDTO<Rl01814DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO物件序列化成檔案。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void saveTempFile(final TempFileDTO<Rl01814DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 選取擬撤銷的原登記申請書。
     * 
     * @param dto
     *            死亡撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 死亡撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01814DTO selectOrgApplication(final Rl01814DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書。
     * 
     * @param dto
     *            死亡撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 死亡撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01814DTO viewOrgApplication(final Rl01814DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書。
     * 
     * @param dto
     *            死亡撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 死亡撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01814DTO reviewOperationDTO(final Rl01814DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 
     * @param dto
     * @param exec
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doFineCheckAndCleanOldFine(final Rl01814DTO dto, final ExecutantType exec) throws RisBusinessException;
}
