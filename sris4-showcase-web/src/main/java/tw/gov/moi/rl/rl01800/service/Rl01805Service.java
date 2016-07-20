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
import tw.gov.moi.rl.domain.Rl01805DTO;

/**
 * 住變撤銷登記服務介面
 * 
 * @author Marcus Chen
 */
public interface Rl01805Service {
    /**
     * 清除當事人資料
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶遷出時，不可執行清除國民身分證統一編號」
     *             RisBusinessException：「未勾選欲清除國民身分證統一編號」
     */
    void cancelSelectPerson(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 檢核撤銷後戶籍地
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    void checkMoveInSiteId(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO
     * 
     * @param Rl01805DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    void clearBigHouseholdQryDTO(final Rl01805DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除住變撤銷登記資料
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     *             RisBusinessException：「執行住變撤銷登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 初始化遷入全戶資料
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     */
    void initMoveInHouse(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 初始化住變撤銷登記
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化住變撤銷登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01805DTO initOperationDTO(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入住變撤銷登記編輯頁面
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入住變撤銷登記」失敗
     */
    Rl01805DTO loadOperationDTO(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得兼任戶長個人資料
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「擬入戶戶長個人基本資料不存在」
     *             RisBusinessException：「擬入戶戶長須為現住人口」
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryConcurrentHead(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     */
    void queryManyPerson(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得遷入戶資料
     * 
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶基本資料不存在」
     *             RisBusinessException：「擬入戶戶長個人基本資料不存在」
     *             RisBusinessException：「擬入戶戶長須為現住人口」
     *             RisBusinessException：「該戶沒有戶長」
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryMoveInData(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶)
     * 
     * @param rl01804
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryPeopleBigHousehold(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得單一當事人個人資料
     * 
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     */
    void querySinglePerson(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入住變撤銷登記編輯後頁面
     * 
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入住變撤銷登記」失敗
     */
    Rl01805DTO reviewOperationDTO(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存住變撤銷登記申請資料至XLDF Table
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     *             RisBusinessException：「執行住變撤銷登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldf(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 保留個人記事料
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「未選擇個人記事」
     */
    void selectPersonRegister(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 設定戶長稱謂
     * 
     * @param dto
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    void setHeadRelationShip(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 設定要顯示的記事
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化住變撤銷登記」失敗
     */
    void showPersonRegister(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     * @param exe
     * @return Rl01805DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01805DTO dto, final ExecutantType exe) throws RisBusinessException;
}
