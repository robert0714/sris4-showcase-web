/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.dto.FeeDTO;
import tw.gov.moi.rl.common.dto.XLDFDomainIndentitiyDTO;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFQueryParams;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF002M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004H;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDF005M;
import tw.gov.moi.rl.component.xldf.dto.XLDF005MT;
import tw.gov.moi.rl.component.xldf.dto.XLDF006M;
import tw.gov.moi.rl.component.xldf.dto.XLDF006MT;
import tw.gov.moi.rl.component.xldf.dto.XLDF007M;
import tw.gov.moi.rl.component.xldf.dto.XLDF008M;
import tw.gov.moi.rl.component.xldf.dto.XLDF010M;
import tw.gov.moi.rl.component.xldf.dto.XLDF011M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;
import tw.gov.moi.rl.component.xldf.dto.XLDF049M;
import tw.gov.moi.rl.component.xldf.dto.XLDF087T;
import tw.gov.moi.rl.component.xldf.dto.XLDF088T;
import tw.gov.moi.rl.component.xldf.dto.XLDF089T;
import tw.gov.moi.rl.component.xldf.dto.XLDFM01M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM02M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM03M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM04M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM05M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM06M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM08M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM09M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10H;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10MT;
import tw.gov.moi.rl.component.xldf.dto.XLDFM11M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM12M;
import tw.gov.moi.rl.component.xldf.dto.XLDFM13M;
import tw.gov.moi.rl.component.xldf.dto.XLDFU002;
import tw.gov.moi.rl.domain.RlPersonDataResultDTO;

/**
 * 戶籍登記業務共用元件介面.
 * 
 * @author JL
 * 
 */
public interface HouseholdBusinessComponent {

    /**
     * 取得個人基本資料（RLDF004M）.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param oprCode
     *            作業代碼
     * @param seqId
     *            作業順序編號
     * @param isLock
     *            是否鎖定
     * @param info
     *            ExecutantType
     * @return XLDF004M
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF004M getPersonData(String personId, String siteId, String oprCode, String seqId, boolean isLock,
            ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人基本資料（RLDF004M）.
     * 
     * @param conn
     *            the conn
     * @param param
     *            the param
     * @param info
     *            the info
     * @return XLDF004M
     * @throws RisBusinessException
     *             the ris business exception
     */

    XLDF004M getPersonData(final DBSMain conn, final XLDFCreationParams param, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得全戶基本資料（RLDF001M）.
     * 
     * @param householdHeadId
     *            戶長統號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param oprCode
     *            作業代碼
     * @param seqId
     *            作業順序編號
     * @param isLock
     *            是否鎖定
     * @param info
     *            執行環境設定參數
     * @return the household data
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF001M getHouseholdData(String householdHeadId, String householdId, String siteId, String oprCode, String seqId,
            boolean isLock, ExecutantType info) throws RisBusinessException;

    /**
     * 取得全戶基本資料（RLDF001M）.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回全戶基本資料XLDF001M
     * @throws RisBusinessException
     *             「全戶基本資料不存在」
     */
    XLDF001M getHouseholdData(final DBSMain conn, final XLDFCreationParams param, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得戶下成員清單.
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @param domainKeys
     *            不用新增的domainKey值
     * @return 傳回戶籍成員統號清單
     * @throws RisBusinessException
     *              「戶籍資料不存在」
     */
    Map<String, XLDFDomainObject> getHouseholdMembersXLDF(DBSMain conn, XLDFCreationParams param, ExecutantType info,
            String... domainKeys) throws RisBusinessException;

    /**
     * 確認是否需要進行大戶遷徙(>7人).
     * 
     * @param conn
     *            DB連線
     * 
     * @param param
     *            建立XLDF交易設定參數(包含1M的KEY值)
     * @param info
     *            執行環境設定參數
     * @return 傳回戶籍成員統號清單
     * @throws RisBusinessException
     *              「戶籍資料不存在」
     */
    boolean checkIfBigHousehold(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得所內註記清單.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回所內註記清單
     * @throws RisBusinessException
     *              「所內記事資料不存在」
     */
    List<String> getXldf030mCode(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得所內註記清單.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回所內註記清單
     * @throws RisBusinessException
     *              「所內記事資料不存在」
     */
    List<String> getXldf030mCode(DBSMain conn, XLDFCreationParams param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得個人記事資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF005M> getXldf005m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人記事資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF005M> getXldf005m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得遷出未接通報資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回遷出未接通報資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF011M> getXldf011m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得遷出未接通報資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回遷出未接通報資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF011M> getXldf011m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得限制遷徙人口資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回限制遷徙人口資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF010M> getXldf010m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得限制遷徙人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回限制遷徙人口資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF010M> getXldf010m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得全戶記事資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF002M> getXldf002m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得全戶記事資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF002M> getXldf002m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人遷徙紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF006M> getXldf006m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人遷徙紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF006M> getXldf006m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名更改紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF007M> getXldf007m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF007M> getXldf007m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得特殊人口資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF008M> getXldf008m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得特殊人口資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF008M> getXldf008m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得所內記事資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF030M> getXldf030m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得所內記事資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF030M> getXldf030m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得所內記事資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF030T> getXldf030t(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF047M> getXldf047m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF047M> getXldf047m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF049M> getXldf049m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF049M> getXldf049m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得出生資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回出生資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    XLDFM01M getXldfm01m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得出生資料.
     * 
     * @param connm
     *            the connm
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回出生資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    XLDFM01M getXldfm01m(final DBSMain connm, final XLDFCreationParams param, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得婚姻記錄.
     * 
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM02M> getXldfm02m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得婚姻記錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM02M> getXldfm02m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得統號更改紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM03M> getXldfm03m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得統號更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM03M> getXldfm03m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM04M> getXldfm04m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM04M> getXldfm04m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM05M> getXldfm05m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM05M> getXldfm05m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM06M> getXldfm06m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM06M> getXldfm06m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM08M> getXldfm08m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM08M> getXldfm08m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM09M> getXldfm09m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM09M> getXldfm09m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得取得個人申請書紀錄.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM10M> getXldfm10m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM10M> getXldfm10m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.(MT)
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM10MT> getXldfm10mt(DBSMain conn, XLDFCreationParams param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param conn
     *            Connection
     * @param exec
     *            ExecutantType
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param operationCode
     *            作業編號
     * @param opertionSequenceId
     *            作業順序
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    List<XLDFM10M> getXldfm10mList(final DBSMain conn, final ExecutantType exec, final String personId,
            final String siteId, final String applyCode, final String operationCode, final Integer opertionSequenceId)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param conn
     *            Connection
     * @param exec
     *            ExecutantType
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            the remove time
     * @param applyCode
     *            申請書代碼
     * @param operationCode
     *            作業編號
     * @param opertionSequenceId
     *            作業順序
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             取得個人申請書紀錄失敗
     */
    // FIXME Viva
    List<XLDFM10H> getXldfm10hList(final DBSMain conn, final ExecutantType exec, final String personId,
            final String siteId, final String removeYyymmdd, final String removeTime, String applyCode,
            final String operationCode, final Integer opertionSequenceId) throws RisBusinessException;

    /**
     * 取得個人申請書紀錄(補登資料MT).
     * 
     * @param conn
     *            Connection
     * @param exec
     *            ExecutantType
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param operationCode
     *            作業編號
     * @param opertionSequenceId
     *            作業順序
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    List<XLDFM10MT> getXldfm10mtList(final DBSMain conn, final ExecutantType exec, final String personId,
            final String siteId, final String applyCode, final String operationCode, final Integer opertionSequenceId)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄(登記日期、時間亦為條件).
     * 
     * @param conn
     *            Connection
     * @param exec
     *            ExecutantType
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param registerYyymmdd
     *            登記日期
     * @param registerTime
     *            登記時間
     * @param applyCode
     *            申請書代碼
     * @param operationCode
     *            作業編號
     * @param opertionSequenceId
     *            作業順序
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    List<XLDFM10M> getXldfm10mListByRegisterDateTime(final DBSMain conn, final ExecutantType exec,
            final String personId, final String siteId, final String registerYyymmdd, final String registerTime,
            final String applyCode, final String operationCode, final Integer opertionSequenceId)
            throws RisBusinessException;

    /**
     * 取得取得個人姓氏資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM11M> getXldfm11m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人姓氏資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM11M> getXldfm11m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得取得個人國民身分證列印旗標資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM12M> getXldfm12m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得其他出生地記錄資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回其他出生地記錄資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM13M> getXldfm13m(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得其他出生地記錄資料.
     * 
     * @param conn
     *            the conn
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回其他出生地記錄資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM13M> getXldfm13m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得個人國民身分證列印旗標資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFM12M> getXldfm12m(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 以相對人統號取得保護家庭暴力資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            the param
     * @param info
     *            執行環境設定參數
     * @return 傳回個人申請書紀錄
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF049M> getXldf049mByViolatorId(final DBSMain conn, final XLDFCreationParams param, final ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得登記婚前結(離)婚證明書資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回登記婚前結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF087T> getXldf087t(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得登記婚前結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回登記婚前結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF087T> getXldf087t(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得結(離)婚證明書資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF088T> getXldf088t(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF088T> getXldf088t(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得英文結(離)婚證明書資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回英文結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF089T> getXldf089t(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得英文結(離)婚證明書資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回英文結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF089T> getXldf089t(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得補登個人記事資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回登記婚前結(離)婚證明書資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF005MT> getXldf005mT(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得補登個人記事資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF005MT> getXldf005mT(DBSMain conn, XLDFCreationParams param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 取得遷徙紀錄資料.
     * 
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回遷徙紀錄資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF006MT> getXldf006mT(XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 取得遷徙紀錄資料.
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回遷徙紀錄資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDF006MT> getXldf006mT(DBSMain conn, XLDFCreationParams param, ExecutantType info)
            throws RisBusinessException;

    /**
     * 檢核本項登記是否已建立過指定的XLDF Origin資料並執行加鎖.
     * 
     * @param conn1
     *            the conn1
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @param doLock
     *            lock Flag
     * @return the xLDF domain object
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDFDomainObject checkOrgXLDFIfCreatedAndLock(DBSMain conn1, ExecutantType executantType, XLDFQueryParams params,
            boolean doLock) throws RisBusinessException;

    /**
     * 檢核本項登記是否已建立過指定的XLDF Origin資料並執行加鎖.(獨立之TXN)
     * 
     * @param conn1
     *            the conn1
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @param doLock
     *            lock Flag
     * @return the xLDF domain object
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDFDomainObject checkOrgXLDFIfCreatedAndLock(ExecutantType executantType, XLDFQueryParams params, boolean doLock)
            throws RisBusinessException;

    /**
     * 檢核本項登記是否已建立過指定的XLDF Origin資料並執行加鎖.並createOriginXldf
     * 
     * @param conn1
     *            the conn1
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @param doLock
     *            lock Flag
     * @param operationCode
     *            the operation code
     * @return the xLDF domain object
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDFDomainObject checkOrgXLDFIfCreatedAndLockAndCreate(DBSMain conn1, ExecutantType executantType,
            XLDFCreationParams params) throws RisBusinessException;

    /**
     * 檢核本項登記是否已建立過指定的XLDF Origin資料並執行加鎖.並createOriginXldf
     * 
     * @param conn1
     *            the conn1
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @param doLock
     *            lock Flag
     * @param operationCode
     *            the operation code
     * @return the xLDF domain object
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDFDomainObject checkOrgXLDFIfCreatedAndLockAndCreate(ExecutantType executantType, XLDFCreationParams params)
            throws RisBusinessException;

    /**
     * 檢核本項登記是否已建立過指定的XLDF Origin資料並執行加鎖.並createOriginXldf
     * 
     * @param conn1
     *            the conn1
     * @param executantType
     *            執行環境設定參數
     * @param params
     *            查詢XLDF設定參數
     * @param doLock
     *            lock Flag
     * @param operationCode
     *            the operation code
     * @return the xLDF domain object
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDFDomainObject checkOrgXLDFIfCreatedAndLockAndCreate(DBSMain conn1, ExecutantType executantType,
            XLDFQueryParams params, boolean doLock, final String operationCode) throws RisBusinessException;

    /**
     * 新增規費明細.
     * 
     * @param conn
     *            資料庫連線
     * @param dto
     *            規費傳輸物件
     * @param isFines
     *            是否需罰緩
     * @param operationCode
     *            作業代碼
     * @param info
     *            執行環境設定參數
     * @throws RisBusinessException
     *              「新增規費明細錯誤」
     */
    void saveXldfu003(DBSMain conn, FeeDTO dto, boolean isFines, String operationCode, ExecutantType info)
            throws RisBusinessException;

    /**
     * 新增規費主檔.
     * 
     * @param conn
     *            資料庫連線
     * @param operSequenceId
     *            作業順序編號
     * @param operationCode
     *            作業代碼
     * @param serialNumber
     *            識別序號
     * @param siteId
     *            作業點代碼
     * @param info
     *            執行環境設定參數
     * @return XLDFU002
     * @throws RisBusinessException
     *              「新增規費主檔失敗」
     */
    XLDFU002 createXLDFU002(DBSMain conn, Integer operSequenceId, String operationCode, String serialNumber,
            final String siteId, ExecutantType info) throws RisBusinessException;

    /**
     * 新增規費明細.
     * 
     * @param conn
     *            資料庫連線
     * @param dto
     *            規費傳輸物件
     * @param domainObj
     *            規費主檔
     * @param isFines
     *            是否為罰鍰
     * @param info
     *            執行環境設定參數
     * @return XLDFU003
     * @throws RisBusinessException
     *              「新增規費明細失敗」
     */
    void createXLDFU003(DBSMain conn, FeeDTO dto, boolean isFines, ExecutantType info) throws RisBusinessException;

    /**
     * 取得戶內人口數.
     * 
     * @param conn
     *            資料庫連線
     * @param dto
     *            XLDF領域物件識別資料傳輸物件
     * @param info
     *            執行環境設定參數
     * @return 戶內人口數
     * @throws RisBusinessException
     *             「XLDF領域物件類別錯誤」、「戶籍資料不存在」
     * 
     */
    int getHouseholdMemberCnt(DBSMain conn, XLDFDomainIndentitiyDTO dto, ExecutantType info)
            throws RisBusinessException;

    /**
     * Gets the household member cnt.
     * 
     * @param conn
     *            資料庫連線
     * @param param
     *            the param
     * @param info
     *            執行環境設定參數
     * @return 戶內人口數
     * @throws RisBusinessException
     *             「XLDF領域物件類別錯誤」、「戶籍資料不存在」
     */
    int getHouseholdMemberCnt(DBSMain conn, XLDFCreationParams param, ExecutantType info) throws RisBusinessException;

    /**
     * 以統一編號、作業點代碼, 找出最後一筆個人除戶XLDF領域物物.
     * 
     * @param conn
     *            the conn
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param oprCode
     *            the opr code
     * @param seqId
     *            the seq id
     * @param isLock
     *            the is lock
     * @param info
     *            the info
     * @return the last xldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF004H getLastXldf004h(DBSMain conn, String personId, String siteId, String oprCode, String seqId,
            boolean isLock, ExecutantType info) throws RisBusinessException;

    /**
     * 以統一編號、作業點代碼, 找出最後一筆個人遷徙紀錄.
     * 
     * @param conn
     *            the conn
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param oprCode
     *            the opr code
     * @param seqId
     *            the seq id
     * @param isLock
     *            the is lock
     * @param info
     *            the info
     * @return the last xldf006m
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF006M getLastXldf006m(DBSMain conn, String personId, String siteId, String oprCode, String seqId,
            boolean isLock, ExecutantType info) throws RisBusinessException;

    /**
     * 檢核FeeDTO資料.
     * 
     * @param dto
     *            規費傳輸物件 ExecutantType 使用者資訊
     * @param info
     *            the info
     * @throws RisBusinessException
     *              「檢核FeeDTO資料錯誤」
     */
    public void checkFeeDTO(final FeeDTO dto, ExecutantType info) throws RisBusinessException;

    /**
     * 附繳證件檔案上傳.
     * 
     * @param pDBSMain
     *            the dBS main
     * @param pOperationSequenceId
     *            作業序號
     * @param pOperationCode
     *            作業代碼
     * @param pSuffixName
     *            流水號
     * @param pFileExtension
     *            副檔名
     * @param pContents
     *            檔案內容
     * @param pExecutantType
     *            the executant type
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    boolean uploadFile(final DBSMain pDBSMain, final String pOperationSequenceId, final String pOperationCode,
            final String pSuffixName, final String pFileExtension, final byte[] pContents,
            final ExecutantType pExecutantType) throws Exception;

    /**
     * 執行儲存30M的特殊通報紀錄
     * 
     * @param conn1
     * @param param
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void insertXldf030mSpecialObnf(final DBSMain conn1, final XLDF030M xldf030m, final String operationCode,
            final Integer seqId, final ExecutantType exe) throws RisBusinessException;

    /**
     * 執行儲存30T的特殊通報紀錄
     * 
     * @param conn1
     * @param param
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void insertXldf030tSpecialObnf(final DBSMain conn1, final XLDF030T xldf030t, final String operationCode,
            final Integer seqId, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得MAP RLDF與XLDFTYPE
     * 
     * @param data
     * @return MAP
     * @throws RisBusinessException
     */
    Map<Class<?>, List<?>> getRldfDataMap(RlPersonDataResultDTO data) throws RisBusinessException;

    /**
     * 取得記事欄位化
     * 
     * @param conn
     *            DB連線
     * @param param
     *            建立XLDF交易設定參數
     * @param info
     *            執行環境設定參數
     * @return 傳回個人記事資料
     * @throws RisBusinessException
     *               「XLDF領域物件類別錯誤」
     */
    List<XLDFDomainObject> getXldfyXXXmType(DBSMain conn, XLDFCreationParams param, ExecutantType info)
            throws RisBusinessException;

}
