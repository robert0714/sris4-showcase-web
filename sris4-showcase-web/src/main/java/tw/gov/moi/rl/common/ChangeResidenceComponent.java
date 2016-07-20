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
import tw.gov.moi.rl.common.dto.IdCardDTO;
import tw.gov.moi.rl.common.dto.MigrateInDTO;
import tw.gov.moi.rl.component.dto.MigrateOutDTO;
import tw.gov.moi.rl.component.dto.XLDFCreationParams;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFQueryParams;
import tw.gov.moi.rl.component.dto.XldfyDataProcParam;
import tw.gov.moi.rl.component.xldf.dto.XLDF003S;
import tw.gov.moi.rl.component.xldf.dto.XLDF039S;
import tw.gov.moi.rl.domain.RemoveOldDataDTO;
import tw.gov.moi.rl.domain.RlGetRldfyDataDTO;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * 遷徙作業業務共用元件介面
 * 
 * @author Marcus Chen
 * 
 */
public interface ChangeResidenceComponent {

    /**
     * 執行遷徙類暫存作業
     * 
     * @param conn1
     * @param param
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void addInChangeResidenceXldf(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 處理遷入地的當事人除口
     * 
     * @param conn1
     * @param param
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    public void processMoveinPlaceResidents(final DBSMain conn1, final XLDFCreationParams param,
            final MigrateInDTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之特殊人口資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf006mForCancel(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之特殊人口資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf006m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之姓名更改紀錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf007m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之特殊人口資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf008m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之限制遷徙人口資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf010m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存撤銷後戶籍地之所內記事資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf030m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存撤銷後戶籍地之他所行政協助所內記事
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf030t(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之姓名羅馬拼音紀錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf047m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之保護家庭暴力資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf049m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之出生資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm01m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之婚姻記錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm02m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之統號更改紀錄檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm03m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之收養記錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm04m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之監護、輔助、未成年子女權利義務行使負擔資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm05m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之國民身分證掛失紀錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm06m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之監護、輔助、未成年子女權利義務行使負擔紀錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm08m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之出生日期更改紀錄
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm09m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之個人申請書紀錄檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm10m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地姓名區分檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldfm11m(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入地戶籍地之全國個人資料摘要檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXcdf001mrl(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之登記婚前結(離)婚證明書資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf087t(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之結(離)婚證明書資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf088t(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存擬入戶籍地之英文結(離)婚證明書資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            MigrateInDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf089t(final DBSMain conn1, final XLDFCreationParams param, final MigrateInDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除當事人遷出地的最後1筆遷徙紀錄
     * 
     * @param param
     *            XLDFQueryParams
     * @param dto
     *            MigrateOutDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void procOutXldf006mForCancel(final DBSMain conn1, final XLDFQueryParams param, final MigrateOutDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存臨時身分證換發資料
     * 
     * @param param
     *            XLDFCreationParams
     * @param dto
     *            IdCardDTO
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf2A10(final DBSMain conn1, final XLDFCreationParams param, final IdCardDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存XLDF1464 撤銷逕遷戶所 記錄檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf1464(final DBSMain conn1, final XLDFCreationParams param, final IdCardDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存XLDF1461 新增逕遷戶所 記錄檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf1461(final DBSMain conn1, final XLDFCreationParams param, final IdCardDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存XLDF1440 撤銷失蹤人口 記錄檔
     * 
     * @param param
     *            XLDFCreationParams
     * @param exe
     *            ExecutantType
     * @throws RisBusinessException
     */
    public void addInXldf1440(final DBSMain conn1, final XLDFCreationParams param, final IdCardDTO dto,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 處理當事人之擬入地舊戶資料
     * 
     * @param dto
     *            RemoveOldDataDTO
     * @param conn1
     *            DBSMain
     * @param exe
     *            ExecutantType
     */
    public void removeOldDataInArea(final RemoveOldDataDTO dto, final DBSMain conn1, final ExecutantType exe);

    /**
     * 處理當事人之擬入地舊戶資料(單一connection)
     * 
     * @param dto
     *            RemoveOldDataDTO
     * @param conn1
     *            DBSMain
     * @param exe
     *            ExecutantType
     */
    public void removeOldDataInArea(final RemoveOldDataDTO dto, final ExecutantType exe);

    /**
     * 暫存遷徙統計明細檔
     * 
     * @param conn1
     * @param xldf003s
     * @param personId
     * @param birthYyymmdd
     * @param educationMark
     * @param oprCode
     * @param txnId
     * @param seqId
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public XLDF039S createXldf039s(final DBSMain conn1, final XLDF003S xldf003s, final String personId,
            final String birthYyymmdd, final String educationMark, final String oprCode, final String txnId,
            Integer seqId, final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存記事欄位化的SiteId改變
     * 
     * @param conn1
     * @param ori5mList
     * @param oprCode
     * @param txnId
     * @param seqId
     * @param exe
     * @throws RisBusinessException
     */
    public void addinXldfyData(XldfyDataProcParam param, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得戶下成員(大戶) 獨立TXN
     * 
     * @param creParm
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public Map<String, XLDFDomainObject> queryHouseholdMember_BigHousehold(final XLDFCreationParams creParm,
            final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得統號對應相對的記事欄位化MAP
     * 
     * @param data
     * @return 記事欄位化MAP
     * @throws RisBusinessException
     */
    public Map<String, List<Object>> getRldfyDataMap(RlGetRldfyDataDTO data) throws RisBusinessException;

    /**
     * 包003S 0039S 通報
     * 
     * @param conn
     * @param seqId
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List<ObnfDTO> createRldf003s39sObnfDTO(DBSMain conn, Integer seqId, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 包所內記事030M 的Delete ObnfDTO
     * 
     * @param conn
     * @param seqId
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public List<ObnfDTO> makeDeleteRldf030mObnf(DBSMain conn, Integer seqId, ExecutantType exe)
            throws RisBusinessException;

    /**
     * 遷入地除口是否為大戶
     * 
     * @param conn
     * @param seqId
     * @param exe
     * @return
     * @throws RisBusinessException
     */
    public boolean checkMoveinDataBigHousehold(DBSMain conn, final String householdHeadId, final String householdId,
            final String dataSiteId, ExecutantType exe) throws RisBusinessException;

}
