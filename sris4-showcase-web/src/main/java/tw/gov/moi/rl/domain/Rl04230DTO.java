/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl04230DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04230DTO", propOrder = { "ModeType", "Village", "Neighbor", "FullNeighbor", "StreetDoor",
        "ModifyMark", "ResultList", "QueryType" })
@XmlRootElement(name = "Rl04230DTO")
public class Rl04230DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 異動類別 */
    @XmlElement(name = "ModeType", required = true)
    @FieldName("異動類別")
    private String modeType;

    /** 村里 */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 鄰-補0的 */
    @XmlElement(name = "FullNeighbor", required = true)
    @FieldName("鄰-補0的")
    private String fullNeighbor;

    /** 街路門牌 */
    @XmlElement(name = "StreetDoor", required = true)
    @FieldName("街路門牌")
    private String streetDoor;

    /** 更正註記 */
    @XmlElement(name = "ModifyMark", required = true)
    @FieldName("更正註記")
    private String modifyMark;

    /** 查詢結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果 ")
    private List<Rl04230ResultDTO> resultList;

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    @XmlElement(name = "QueryDTO")
    @FieldName("查詢條件")
    private RlStreetFullAdressDTO queryDTO = new RlStreetFullAdressDTO();

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getModeType() {
        return modeType;
    }

    public void setModeType(final String modeType) {
        this.modeType = modeType;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoor() {
        return streetDoor;
    }

    public void setStreetDoor(final String streetDoor) {
        this.streetDoor = streetDoor;
    }

    public List<Rl04230ResultDTO> getResultList() {
        return resultList;
    }

    public void setResultList(final List<Rl04230ResultDTO> resultList) {
        this.resultList = resultList;
    }

    public String getModifyMark() {
        return modifyMark;
    }

    public void setModifyMark(final String modifyMark) {
        this.modifyMark = modifyMark;
    }

    public String getFullNeighbor() {
        return fullNeighbor;
    }

    public void setFullNeighbor(final String fullNeighbor) {
        this.fullNeighbor = fullNeighbor;
    }

    public RlStreetFullAdressDTO getQueryDTO() {
        return queryDTO;
    }

    public void setQueryDTO(RlStreetFullAdressDTO queryDTO) {
        this.queryDTO = queryDTO;
    }

}