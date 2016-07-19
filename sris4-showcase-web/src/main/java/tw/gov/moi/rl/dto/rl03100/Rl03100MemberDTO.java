/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto.rl03100;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 31戶口名簿請領紀錄查看明細DTO
 * 
 * @author CK Lin
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100MemberDTO", propOrder = { "personId", "personName", "relationship" })
@XmlRootElement(name = "Rl03100MemberDTO")
public class Rl03100MemberDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    @XmlElement(name = "Relationship")
    @FieldName("稱謂")
    private String relationship = "";

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

}
