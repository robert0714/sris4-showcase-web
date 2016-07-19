/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.domain.XldfopracsType;
import tw.gov.moi.domain.XldftrnstnType;
import tw.gov.moi.domain.XldftxnprsType;

/**
 * @author marcus
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLDFCreTxnCommitDTO", propOrder = { "xldfEntity", "xldfEntity", "workDetail", "targetDetail",
        "updateList", "updateKeyObjList" })
@XmlRootElement(name = "XLDFCreTxnCommitDTO")
public class XLDFCreTxnCommitDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 大部當事人DomainObject */
    @XmlElement(name = "XldfEntity", required = true)
    @FieldName("大部當事人DomainObject")
    private Object xldfEntity;

    @XmlElement(name = "XldfEntity", required = true)
    @FieldName("大部當事人DomainObject")
    private Object targetResult;

    @XmlElement(name = "WorkDetail", required = true)
    @FieldName("大部當事人XLDF索引")
    private XldfopracsType workDetail;

    @XmlElement(name = "TargetDetail", required = true)
    @FieldName("詳細訊息")
    private XldftxnprsType targetDetail = null;

    @XmlElement(name = "RomeDetail", required = true)
    @FieldName("羅馬拼音47M索引檔")
    private XldfopracsType romeDetail;

    @XmlElement(name = "RomeEntity", required = true)
    @FieldName("羅馬拼音檔")
    private Object romeEntity = null;

    @XmlElement(name = "Master", required = true)
    @FieldName("大簿主檔")
    private XldftrnstnType master = null;

    @XmlElement(name = "EnforceRecord", required = true)
    @FieldName("逕為登記主檔")
    private XldfefaplcType enforceRecord = null;

    public XLDFCreTxnCommitDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Object getXldfEntity() {
        return xldfEntity;
    }

    public void setXldfEntity(Object xldfEntity) {
        this.xldfEntity = xldfEntity;
    }

    public Object getTargetResult() {
        return targetResult;
    }

    public void setTargetResult(Object targetResult) {
        this.targetResult = targetResult;
    }

    public XldfopracsType getWorkDetail() {
        return workDetail;
    }

    public void setWorkDetail(XldfopracsType workDetail) {
        this.workDetail = workDetail;
    }

    public XldftxnprsType getTargetDetail() {
        return targetDetail;
    }

    public void setTargetDetail(XldftxnprsType targetDetail) {
        this.targetDetail = targetDetail;
    }

    public XldfopracsType getRomeDetail() {
        return romeDetail;
    }

    public void setRomeDetail(XldfopracsType romeDetail) {
        this.romeDetail = romeDetail;
    }

    public Object getRomeEntity() {
        return romeEntity;
    }

    public void setRomeEntity(Object romeEntity) {
        this.romeEntity = romeEntity;
    }

    public XldftrnstnType getMaster() {
        return master;
    }

    public void setMaster(XldftrnstnType master) {
        this.master = master;
    }

    public XldfefaplcType getEnforceRecord() {
        return enforceRecord;
    }

    public void setEnforceRecord(XldfefaplcType enforceRecord) {
        this.enforceRecord = enforceRecord;
    }

}
