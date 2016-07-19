/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01330DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 住變登記服務.
 * 
 * @author Andy
 */
public interface Rl01330Service {

    /** 控制器名稱. */
    public static final String CONTROLLER_NAME = "Rl01330Controller";

    /** The Constant HOUSEHOLD_HEAD_NAME. */
    public static final String HOUSEHOLD_HEAD_NAME = "戶長";

    /** The Constant HOUSEHOLD_REGISTRATION_OFFICE. */
    public static final String HOUSEHOLD_REGISTRATION_OFFICE = "戶政事務所";

    /** The Constant IN_REMARK. */
    public static final String IN_REMARK = "遷入地";

    /** RSCD3012. */
    public static final String[] LIMIT_MARK = new String[] { "2", "A", "D", "E", "F" };

    /** The Constant MAX_MOVE_PEOPLE. */
    public static final int MAX_MOVE_PEOPLE = RlConstant.BIG_HOUSEHOLD_NUM;

    /** The Constant NOTE_CODE_3750000001. */
    public static final String NOTE_CODE_3750000001 = "3750000001";

    /** The Constant OUT_REMARK. */
    public static final String OUT_REMARK = "遷出地";

    /** 類別名稱. */
    public static final String SERVICE_NAME = "Rl01330ServiceImpl";

    /** The Constant TASK_CODE. */
    public static final String TASK_CODE = "rl01330";

    /**
     * 自動組合記事.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             自動組合記事失敗
     */
    public void autoNotes(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 檢查「教育程度」.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             檢查「教育程度」失敗
     */
    public void cehckEducation(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 檢查「國民身分證掛失註記」.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             檢查「國民身分證掛失註記」失敗
     */
    public void checkCardLost(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 檢核是否已完成資料驗證.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @return String
     * @throws RisBusinessException
     *             檢核是否已完成資料驗證失敗
     */
    public String checkIsVerifyData(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             清除大戶查詢ID DTO失敗
     */
    public void clearBigHouseholdQryDTO(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 移除住變人員.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             移除住變人員失敗
     */
    public void doAddMoveOutMember(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 刪除住變出登記資料.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除住變出登記資料失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 刪除罰款紀錄.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除罰款紀錄失敗
     */
    public void doDeteleFineRecord(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 自立新戶.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             自立新戶失敗
     */
    public void doNewHouseHold(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得戶長姓名.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得戶長姓名失敗
     */
    public void getHouseHoldName(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 初始化住變登記.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01330DTO
     * @throws RisBusinessException
     *             初始化住變登記失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01330DTO initOperationDTO(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 載入編輯頁面.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01330DTO
     * @throws RisBusinessException
     *             載入編輯頁面失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01330DTO loadOperationDTO(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param execType
     *            使用者資訊
     * @return Rl01330DTO
     */
    public Rl01330DTO loadTempFile(final TempFileDTO<Rl01330DTO> tempFileDTO, final ExecutantType execType);

    /**
     * 預設當事人資料與戶內成員清單(大戶).
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預設當事人資料與戶內成員清單(大戶)失敗
     */
    public void procApplyKind_BigHousehold(final Rl01330DTO dto, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶).
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得多個當事人個人資料(大戶)失敗
     */
    public void queryPeopleBigHousehold(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入住址變更登記DTO.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @return Rl01330DTO
     * @throws RisBusinessException
     *             再次驗證狀態時載入住址變更登記DTO失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01330DTO reviewOperationDTO(final Rl01330DTO dto, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             暫存遷入登記申請資料至XLDF Table失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldfs(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            住址變更登記DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             執行資料驗證並自動組合記事失敗
     */
    public void verifyAppData(final Rl01330DTO dto, final ExecutantType execType) throws RisBusinessException;
}
