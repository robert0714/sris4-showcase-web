/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rlde209wType;
import tw.gov.moi.domain.Rlde210wType;
import tw.gov.moi.domain.Rlde211wType;
import tw.gov.moi.domain.Rlde212wType;
import tw.gov.moi.domain.Rlde213wType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldf007mType;
import tw.gov.moi.domain.Rldf045mType;
import tw.gov.moi.domain.Rldf053mType;
import tw.gov.moi.domain.Rldf062mType;
import tw.gov.moi.domain.Rldf063mType;
import tw.gov.moi.domain.Rldf087tType;
import tw.gov.moi.domain.Rldf088tType;
import tw.gov.moi.domain.Rldf089tType;
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rs.domain.Rldf087tDTO;

/**
 * 資料讀取共用元件介面.
 */
public interface RlGetDataPlusComponent {

    String ERR_MSG_LastRldf004h = "getLastRldf004hError: 「取得最後一筆除戶個人基本資料」失敗";
    String ERR_MSG_LastRldf006m = "getLastRldf006hError: 「取得最後一筆個人遷徙紀錄」失敗";
    String ERR_MSG_LastRldf007m = "getLastRldf007hError: 「取得最後一筆姓名更改紀錄」失敗";
    String ERR_MSG_LastRldf062m = "getLastRldf062hError: 「取得最後一筆國防部相驗屍體證明書通報資料」失敗";
    String ERR_MSG_LastRldf063m = "getLastRldf063hError: 「取得最後一筆法務部相驗屍體證明書通報資料」失敗";
    String ERR_MSG_LastRldf053m = "getLastRldf053hError: 「取得最後一筆衛生署死亡證明書資料」失敗";
    String ERR_MSG_GET_RLDE211W = "「取得異地或本地的「村里」漢語、通用拼音資料」失敗";
    String ERR_MSG_GET_RLDE212W = "「取得異地或本地的「街路門牌」漢語、通用拼音資料」失敗";
    String ERR_MSG_GET_RLDE213W = "「取得本地的「國籍」漢語、通用拼音資料」失敗";
    String ERR_MSG_GET_RLDE210W = "「取得本地的「出生地」漢語、通用拼音資料」失敗";
    String ERR_MSG_GET_RLDE209W = "「取得本地的「行政區域」漢語、通用拼音資料」失敗";
    String ERR_MSG_LastRldfm03m = "getLastRldfm03mError: 「取得最後一筆統號更改紀錄」失敗";
    String ERR_MSG_ORGIDRECORDS = "getOrgIdRecordsError: 「取得指定之原統號的統號更改紀錄」失敗";

    /**
     * 取得最後一筆除戶個人基本資料 Gets the last rldf004h.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf004h
     */
    Rldf004hType getLastRldf004h(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得最後一筆個人遷徙紀錄 Gets the last rldf006m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf006m
     */
    Rldf006mType getLastRldf006m(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得最後一筆姓名更改紀錄 Gets the last rldf007m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param changeType
     *            the change type
     * @param executant
     *            the executant
     * @return the last rldf007m
     */
    Rldf007mType getLastRldf007m(final DBSMain conn, final String personId, final String siteId,
            final String changeType, final ExecutantType executant);

    /**
     * 取得最後一筆姓名羅馬拼音記錄檔 Gets the last rldf047m.
     * 
     * @param xLDFPersonDataDomainObject
     *            the x ldf person data domain object
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @return the last rldf047h
     */
    XLDFDomainObject getLastRldf047m(final DBSMain conn, XLDFPersonDataDomainObject xLDFPersonDataDomainObject,
            ExecutantType executantType, final String operationCode);

    /**
     * 取得最後一筆國防部相驗屍體證明書通報資料
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf062m
     */
    Rldf062mType getLastRldf062m(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得最後一筆法務部相驗屍體證明書通報資料
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf062m
     */
    Rldf063mType getLastRldf063m(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得逕遷戶所人口通報資料
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf062m
     */
    Rldf053mType getLastRldf053m(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得逕遷戶所人口通報資料
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the last rldf062m
     */
    List<Rldf045mType> getRldf045m(final DBSMain conn, final String personId, final String siteId,
            final ExecutantType executant);

    /**
     * 取得異地或本地的「村里」漢語、通用拼音資料.
     * 
     * @param pVillage
     *            村里中文名稱
     * @param pSiteId
     *            作業點代碼
     * @param pExecutantType
     *            使用者資訊
     * @return List：村里名稱中英文對照檔資料
     */
    List<Rlde211wType> getRlde211w(final String pVillage, final String pSiteId, final ExecutantType pExecutantType);

    /**
     * 取得異地或本地的「街路門牌」漢語、通用拼音資料.
     * 
     * @param pStreetDoorplate
     *            街路門牌中文名稱
     * @param pSiteId
     *            作業點代碼
     * @param pExecutantType
     *            使用者資訊
     * @return List：街路門牌名稱中英文對照檔資料
     */
    List<Rlde212wType> getRlde212w(final String pStreetDoorplate, final String pSiteId,
            final ExecutantType pExecutantType);

    /**
     * 取得本地的「國籍」漢語、通用拼音資料.
     * 
     * @param pCode
     *            國籍代碼
     * @param pExecutantType
     *            使用者資訊
     * @return List：國籍名稱中英文對照檔資料
     */
    List<Rlde213wType> getRlde213w(final String pCode, final ExecutantType pExecutantType);

    /**
     * 取得本地的「出生地」漢語、通用拼音資料.
     * 
     * @param pBirthPlaceCode
     *            出生地代碼
     * @param pExecutantType
     *            使用者資訊
     * @return List：出生地中英文對照檔資料
     */
    List<Rlde210wType> getRlde210w(final String pBirthPlaceCode, final ExecutantType pExecutantType);

    /**
     * 取得本地的「行政區域」漢語、通用拼音資料.
     * 
     * @param pAreaCode
     *            行政區域代碼
     * @param pExecutantType
     *            使用者資訊
     * @return List：行政區域中英文對照檔資料
     */
    List<Rlde209wType> getRlde209w(final String pAreaCode, final ExecutantType pExecutantType);

    /**
     * Gets the last rldfm03m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the last rldfm03m
     */
    Rldfm03mType getLastRldfm03m(final String personId, final String siteId, final ExecutantType pExecutantType);

    /**
     * Gets the org id records.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the org id records
     */
    List<Rldfm03mType> getOrgIdRecords(final String personId, final String siteId, final ExecutantType pExecutantType);

    /**
     * 從中央取得登記婚前結離婚證明書資料(適用於無戶籍者).
     * 
     * @param pPersonName
     *            the person name
     * @param pBirthDate
     *            the birth date
     * @param pExecutantType
     *            the executant type
     * @return the rldf087t from rc
     */
    List<Rldf087tType> getRldf087tFromRC(final String pPersonName, final String pBirthDate,
            final ExecutantType pExecutantType);

    /**
     * 從中央取得登記婚後中文結離婚證明書資料(適用於無戶籍者).
     * 
     * @param pPersonName
     *            the person name
     * @param pBirthDate
     *            the birth date
     * @param pExecutantType
     *            the executant type
     * @return the rldf088t from rc
     */
    List<Rldf088tType> getRldf088tFromRC(final String pPersonName, final String pBirthDate,
            final ExecutantType pExecutantType);
    /**
     * 從中央取得登記婚後中文結離婚證明書資料(適用於各種情形).
     * 
     * @param Rldf087tDTO          dto
     *
     * @param pExecutantType
     *            the executant type
     * @return the rldf088t from rc
     */
    public List<Rldf088tType> getRldf088tFromRC(final Rldf087tDTO dto,
            final ExecutantType pExecutantType) ;
    /**
     * 從中央取得登記婚後英文結離婚證明書資料(適用於無戶籍者).
     * 
     * @param pPersonId
     *            the person id
     * @param pExecutantType
     *            the executant type
     * @return the rldf089t from rc
     */
    List<Rldf089tType> getRldf089tFromRC(final String pPersonId, final ExecutantType pExecutantType);
}
