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
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RelationData;
import tw.gov.moi.rl.component.dto.XLDFRegDetailObnfParams;
import tw.gov.moi.rl.component.xldf.dto.XLDF004H;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.component.xldf.dto.XLDF007M;
import tw.gov.moi.rl.component.xldf.dto.XLDF030T;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;
import tw.gov.moi.rl.domain.XLDFPersonDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 個人資料更新共用元件介面.
 * 
 * @author Jay Kan
 */
public interface PersonDataChangeComponent {

    /**
     * 更新關係人個人基本資料並新增所內記事、行政協助.
     * 
     * @param relationDataList
     *            關係人清單
     * @param personNoteList
     *            個人記事清單
     * @param xldf030mList
     *            所內記事清單
     * @param xldf030tList
     *            行政協助清單
     * @param operationSequenceId
     *            作業順序編號
     * @param registerDate
     *            登記日期
     * @param registerTime
     *            登記時間
     * @param executantType
     *            Executant Type
     * @param obnfParamsList
     *            特殊通報List物件
     * @param operationCode
     *            作業代碼
     */
    void createMSCMark(final List<RelationData> relationDataList,
            final List<XLDFPersonNoteDomainObject> personNoteList, final List<XLDF030T> xldf030mList,
            final List<XLDF030T> xldf030tList, final Integer operationSequenceId, final String registerDate,
            final String registerTime, final ExecutantType executantType,
            final List<XLDFRegDetailObnfParams> obnfParamsList, final String operationCode);

    /**
     * 取得最後一筆除戶個人基本資料.
     * 
     * @param conn1
     *            the conn1
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @param operationSequenceId
     *            the operation sequence id
     * @return the last rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF004H getLastRldf004h(final DBSMain conn1, final String personId, final String siteId,
            final ExecutantType executantType, final String operationCode, final Integer operationSequenceId)
            throws RisBusinessException;

    /**
     * 取得最後一筆除戶個人基本資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @param operationSequenceId
     *            the operation sequence id
     * @return the last rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    XLDF004H getLastRldf004h(final String personId, final String siteId, final ExecutantType executantType,
            final String operationCode, final Integer operationSequenceId) throws RisBusinessException;

    /**
     * 取得最後一筆姓名羅馬拼音記錄檔.
     * 
     * @param pDomainObject
     *            the domain object
     * @param pOperationCode
     *            作業代碼
     * @param pExecutantType
     *            the executant type
     * @return the last rldf047m
     */
    XLDF047M getLastRldf047m(final XLDFPersonDataDomainObject pDomainObject, final String pOperationCode,
            final ExecutantType pExecutantType);

    /**
     * 取得最後一筆統號更改記錄
     * 
     * @param pDomainObject
     *            the domain object
     * @param pOperationCode
     *            作業代碼
     * @param pExecutantType
     *            the executant type
     * @return the rldfm03m id list
     */
    List<String> getLastRldfm03m(final DBSMain dbi, final XLDFPersonDataDomainObject pDomainObject,
            final String pOperationCode, final ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 取得最後一筆統號更改記錄
     * 
     * @param pDomainObject
     *            the domain object
     * @param pOperationCode
     *            作業代碼
     * @param pExecutantType
     *            the executant type
     * @return the rldfm03m id list
     */
    List<String> getLastRldfm03m(final XLDFPersonDataDomainObject pDomainObject, final String pOperationCode,
            final ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 取得姓名更改紀錄.
     * 
     * @param pXldf004m
     *            XLDF004M
     * @param pModifyType
     *            更改類別
     * @param pOperationCode
     *            作業代碼
     * @param pExecutantType
     *            the executant type
     * @return the name chang data
     */
    XLDF007M getNameChangeData(final XLDF004M pXldf004m, final String pModifyType, final String pOperationCode,
            final ExecutantType pExecutantType);

    /**
     * 取得關係人資料.
     * 
     * @param pPersonId
     *            統號
     * @param pExecutantType
     *            the executant type
     * @return the releated person
     */
    List<RelationData> getReleatedPerson(final String pPersonId, final ExecutantType pExecutantType);

    /**
     * 取得關係人資料.
     * 
     * @param pPersonId
     *            統號
     * @param pExecutantType
     *            the executant type
     * @return the releated person
     */
    List<RelationData> getReleatedPerson(final String pPersonId, final ExecutantType pExecutantType,
            final Boolean fromRl);

    /**
     * 更新教育程度.
     * 
     * @param personDataDomainObject
     *            個人基本資料物件
     * @param orgEducationMark
     *            原教育程度註記
     * @param operSequenceId
     *            作業順序編號
     * @param registerDate
     *            登記日期
     * @param registerTime
     *            登記時間
     * @param executantType
     *            ExecutantType
     * @throws RisBusinessException
     *             更新教育程度失敗
     */
    void modifyEducation(final XLDFPersonDataDomainObject personDataDomainObject, final String orgEducationMark,
            final Integer operSequenceId, final String registerDate, final String registerTime,
            final ExecutantType executantType) throws RisBusinessException;

    /**
     * 更新教育程度.
     * 
     * @param personDataDomainObject
     *            個人基本資料物件
     * @param orgEducationMark
     *            原教育程度註記
     * @param operSequenceId
     *            作業順序編號
     * @param registerDate
     *            登記日期
     * @param registerTime
     *            登記時間
     * @param executantType
     *            ExecutantType
     * @param applySeq
     *            申請書流水號
     * @throws RisBusinessException
     *             更新教育程度失敗
     */
    void modifyEducation(final XLDFPersonDataDomainObject personDataDomainObject, final String orgEducationMark,
            final Integer operSequenceId, final String registerDate, final String registerTime,
            final ExecutantType executantType, final Integer applySeq) throws RisBusinessException;

    /**
     * 更新教育程度.
     * 
     * @param personDataDTO
     *            個人基本資料物件
     * @param orgEducationMark
     *            原教育程度註記
     * @param operSequenceId
     *            作業順序編號
     * @param registerDate
     *            登記日期
     * @param registerTime
     *            登記時間
     * @param executantType
     *            ExecutantType
     * @param applySeq
     *            申請書流水號
     * @throws RisBusinessException
     *             更新教育程度失敗
     */
    void modifyEducationByDTO(final XLDFPersonDataDTO personDataDTO, final String orgEducationMark,
            final Integer operSequenceId, final String registerDate, final String registerTime,
            final ExecutantType executantType, final Integer applySeq) throws RisBusinessException;
}
