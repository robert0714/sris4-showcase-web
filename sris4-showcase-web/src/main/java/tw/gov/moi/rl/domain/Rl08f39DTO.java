/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 製作選舉人人數初步確定統計表(選委會)DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f39DTO", propOrder = { "voterRollsInfoDTO", "resultList" })
@XmlRootElement(name = "Rl08f39DTO")
public class Rl08f39DTO extends BaseITextReportParams implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 選舉名冊資訊DTO. */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

    /** 選舉人人數初步確定統計表(選委會)結果清單. */
    @FieldName("選舉人人數初步確定統計表(選委會)結果清單")
    @XmlElement(name = "ResultList", required = true)
    private List<Rl08f39Result> resultList = new ArrayList<Rl08f39Result>();

    @Override
    public String getMainReportName() {
        return voterRollsInfoDTO.getReportName();
    }

    @Override
    public String getReportExt() {
        return StringUtils.EMPTY;
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        final String extension = StringUtils.lowerCase(voterRollsInfoDTO.getReportType());

        return ("pdf".equals(extension)) ? ReportFormat.PDF : ReportFormat.CSV;
    }

    /**
     * 取得選舉人人數初步確定統計表(選委會)結果清單.
     * 
     * @return 選舉人人數初步確定統計表(選委會)結果清單
     */
    public List<Rl08f39Result> getResultList() {
        return resultList;
    }

    /**
     * 取得選舉名冊資訊DTO.
     * 
     * @return 選舉名冊資訊DTO
     */
    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    /**
     * 設定選舉人人數初步確定統計表(選委會)結果清單.
     * 
     * @param resultList
     *            選舉人人數初步確定統計表(選委會)結果清單
     */
    public void setResultList(final List<Rl08f39Result> resultList) {
        this.resultList = resultList;
    }

    /**
     * 設定選舉名冊資訊DTO.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     */
    public void setVoterRollsInfoDTO(final VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }

}
