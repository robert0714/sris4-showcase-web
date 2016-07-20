/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 選舉人名冊異動清單DTO.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f80DTO", propOrder = { "voterRollsInfoDTO" })
@XmlRootElement(name = "Rl08f80DTO")
public class Rl08f80DTO implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 選舉名冊資訊DTO */
    @FieldName("選舉名冊資訊DTO")
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

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

}
