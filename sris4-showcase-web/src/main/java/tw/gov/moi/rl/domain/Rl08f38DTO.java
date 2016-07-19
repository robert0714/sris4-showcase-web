/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 製作選舉人數統計表(選委會)DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f38DTO", propOrder = { "rlrpMap", "voterRollsInfoDTO" })
@XmlRootElement(name = "Rl08f38DTO")
public class Rl08f38DTO extends BaseITextReportParams implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 報表統計資料. */
    @FieldName("報表統計資料")
    @XmlElement(name = "報表統計資料", required = true)
    private Map<String, int[]> rlrpMap = new LinkedHashMap<String, int[]>();

    /** 選舉名冊資訊DTO. */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rs.common.report.dto.RsReportInfo#getMainReportName()
     */
    @Override
    public String getMainReportName() {
        return voterRollsInfoDTO.getReportName();
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rs.common.report.dto.RsReportInfo#getReportExt()
     */
    @Override
    public String getReportExt() {
        return voterRollsInfoDTO.getVotePoint();
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rs.common.report.dto.RsReportInfo#getReportFormatEnum()
     */
    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(voterRollsInfoDTO.getReportType()) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    /**
     * 取得報表統計資料.
     * 
     * @return 報表統計資料
     */
    public Map<String, int[]> getRlrpMap() {
        return rlrpMap;
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
     * 設定報表統計資料.
     * 
     * @param rlrpMap
     *            報表統計資料
     */
    public void setRlrpMap(final Map<String, int[]> rlrpMap) {
        this.rlrpMap = rlrpMap;
    }

    /**
     * 設定是否為分區.
     * 
     * @param voterRollsInfoDTO
     *            選舉名冊資訊DTO
     */
    public void setVoterRollsInfoDTO(final VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }
}
