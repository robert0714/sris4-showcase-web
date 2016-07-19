/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rs.annotations.FieldDescription;
import tw.gov.moi.rs.dto.ObnfDTO;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlHouseholdRemoveResultDTO", propOrder = { "obnfList", "toCommitResult" })
@XmlRootElement(name = "RlHouseholdRemoveResultDTO")
public class RlHouseholdRemoveResultDTO {

    /** 通報 */
    @XmlElement(name = "ObnfList")
    @FieldDescription(desc = "通報")
    private List<ObnfDTO> obnfList = new ArrayList<ObnfDTO>();

    /** 下除戶要commit的物件 */
    @XmlElement(name = "ToCommitResult")
    @FieldDescription(desc = "下除戶要commit的物件")
    private MasMoveResultDTO toCommitResult = new MasMoveResultDTO();

    /**
     * @return the obnfList
     */
    public List<ObnfDTO> getObnfList() {
        return obnfList;
    }

    /**
     * @param obnfList
     *            the obnfList to set
     */
    public void setObnfList(List<ObnfDTO> obnfList) {
        this.obnfList = obnfList;
    }

    /**
     * @return the toCommitResult
     */
    public MasMoveResultDTO getToCommitResult() {
        return toCommitResult;
    }

    /**
     * @param toCommitResult
     *            the toCommitResult to set
     */
    public void setToCommitResult(MasMoveResultDTO toCommitResult) {
        this.toCommitResult = toCommitResult;
    }

}
