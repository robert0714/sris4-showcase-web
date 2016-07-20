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

import org.apache.commons.lang3.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rl.rl08f00.service.Rl08f36Service;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 選舉人名冊起迄頁次明細及各鄰人數統計表DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f36DTO", propOrder = { "voterRollsInfoDTO", "kind1DataList", "kind2DataList" })
@XmlRootElement(name = "Rl08f36DTO")
public class Rl08f36DTO extends BaseITextReportParams implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 選舉名冊資訊DTO */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

    /** 選舉人名冊起迄頁次明細及各鄰人數統計表. */
    @FieldName("選舉人名冊起迄頁次明細及各鄰人數統計表")
    @XmlElement(name = "Kind1DataMap", required = true)
    private List<Rlrp08f36DTO> kind1DataList = new ArrayList<Rlrp08f36DTO>();

    /** 未滿選舉居住期間者名冊起迄頁次明細及各鄰人數統計表. */
    @FieldName("未滿選舉居住期間者名冊起迄頁次明細及各鄰人數統計表")
    @XmlElement(name = "Kind2DataMap", required = true)
    private List<Rlrp08f36DTO> kind2DataList = new ArrayList<Rlrp08f36DTO>();

    /**
     * 取得選舉名冊資訊DTO.
     * 
     * @return 選舉名冊資訊DTO
     */
    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
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

    @Override
    public String getMainReportName() {
        final String voteCode = this.getVoterRollsInfoDTO().getVoteCode();

        if (StringUtils.equals(voteCode, "08F00")) {
            return Rl08f36Service.RLRP08F36;
        } else {
            return Rl08f36Service.RLRP08J36;
        }
    }

    @Override
    public String getReportExt() {
        final String voteCode = this.getVoterRollsInfoDTO().getVoteCode();

        if (StringUtils.equals(voteCode, "08F00")) {
            return Rl08f36Service.RLRP08F36;
        } else {
            return Rl08f36Service.RLRP08J36;
        }
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(this.voterRollsInfoDTO.getReportType()) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    public List<Rlrp08f36DTO> getKind1DataList() {
        return this.kind1DataList;
    }

    public void setKind1DataList(List<Rlrp08f36DTO> kind1DataList) {
        this.kind1DataList = kind1DataList;
    }

    public List<Rlrp08f36DTO> getKind2DataList() {
        return this.kind2DataList;
    }

    public void setKind2DataList(List<Rlrp08f36DTO> kind2DataList) {
        this.kind2DataList = kind2DataList;
    }

}
