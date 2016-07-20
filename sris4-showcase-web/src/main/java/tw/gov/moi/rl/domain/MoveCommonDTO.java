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

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class InputDateDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveCommonDTO", propOrder = { "membersPersonData", "month", "day" })
@XmlRootElement(name = "MoveCommonDTO")
public class MoveCommonDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5749513051363482050L;

    /** 戶內成員personDataObject */
    @XmlElement(name = "MembersPersonData")
    @FieldName("戶內成員personDataObject")
    private List<XLDFPersonDataDomainObject> membersPersonData = new ArrayList<XLDFPersonDataDomainObject>(20);

    public MoveCommonDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the membersPersonData
     */
    public List<XLDFPersonDataDomainObject> getMembersPersonData() {
        return membersPersonData;
    }

    /**
     * @param membersPersonData
     *            the membersPersonData to set
     */
    public void setMembersPersonData(List<XLDFPersonDataDomainObject> membersPersonData) {
        this.membersPersonData = membersPersonData;
    }

}
