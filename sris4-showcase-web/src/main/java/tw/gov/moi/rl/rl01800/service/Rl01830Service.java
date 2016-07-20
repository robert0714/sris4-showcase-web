/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01830DTO;

/**
 * 分(合)戶撤銷登記服務.
 * 
 * @author Andy
 */
public interface Rl01830Service {

    /** 戶長. */
    public static final String HOUSEHOLD_HEAD_NAME = "戶長";

    /** 遷入地. */
    public static final String IN_REMARK = "遷入地";

    /** 遷出地. */
    public static final String OUT_REMARK = "遷出地";

    /** 控制器名稱. */
    public static final String CONTROLLER_NAME = "Rl01830Controller";

    /** 類別名稱. */
    public static final String SERVICE_NAME = "Rl01830ServiceImpl";

    /**
     * 組合記事.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             組合記事失敗
     */
    public void autoNotes(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 檢核「教育程度」.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             檢核「教育程度」失敗
     */
    public void cehckEducation(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 檢查「國民身分證掛失註記」.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             檢查「國民身分證掛失註記」失敗
     */
    public void checkCardLost(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 檢核是否已完成資料驗證.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @return String
     * @throws RisBusinessException
     *             檢核是否已完成資料驗證失敗
     */
    public String checkIsVerifyData(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             清除大戶查詢ID DTO失敗
     */
    public void clearBigHouseholdQryDTO(final Rl01830DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 移除分合撤銷人員.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             移除分合撤銷人員失敗
     */
    public void doAddMoveOutMember(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 刪除分合撤銷出登記資料.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除分合撤銷出登記資料失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl01830DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得原登記申請書資料.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得原登記申請書資料失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doGetApplicationContent(final Rl01830DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 自立新戶.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             自立新戶失敗
     */
    public void doNewHouseHold(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 取得戶長姓名.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得戶長姓名失敗
     */
    public void getHouseHoldName(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 初始化分（合）戶撤銷登記.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01830DTO
     * @throws RisBusinessException
     *             初始化分合撤銷登記失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01830DTO initOperationDTO(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 編輯分（合）戶撤銷登記.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01830DTO
     * @throws RisBusinessException
     *             編輯分（合）戶撤銷登記失敗
     */
    public Rl01830DTO loadOperationDTO(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 預設當事人資料與戶內成員清單(大戶).
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預設當事人資料與戶內成員清單(大戶)失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void procApplyKind_BigHousehold(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶).
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得多個當事人個人資料(大戶)失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void queryPeopleBigHousehold(final Rl01830DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽分（合）戶撤銷登記.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01830DTO
     * @throws RisBusinessException
     *             預覽分（合）戶撤銷登記失敗
     */
    public Rl01830DTO reviewOperationDTO(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             暫存遷入登記申請資料至XLDF Table失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldfs(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            分（合）戶撤銷登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             執行資料驗證並自動組合記事失敗
     */
    public void verifyAppData(Rl01830DTO dto, ExecutantType execType) throws RisBusinessException;
}
