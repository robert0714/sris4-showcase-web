/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.XldfopracsType;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xldfyDataProcParam", propOrder = { "reserve5mList", "remove5mList", "rldfyList", "fromHtoM" })
@XmlRootElement(name = "XldfyDataProcParam")
public class XldfyDataProcParam implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    @XmlElement(name = "reserve5mList")
    @FieldName("保留的記事")
    private List<XLDFDomainObject> reserve5mList;

    @XmlElement(name = "remove5mList")
    @FieldName("刪除的記事")
    private List<XLDFDomainObject> remove5mList;

    @XmlElement(name = "rldfyList")
    @FieldName("RLDF的記事欄位化資料")
    private List<Object> rldfyList;

    @XmlElement(name = "fromHtoM")
    @FieldName("從除戶檔來的")
    private boolean fromHtoM = Boolean.FALSE;

    @XmlElement(name = "xdlfyAcesList")
    @FieldName("XLDF索引檔")
    private List<XldfopracsType> xdlfyAcesList;

    @XmlElement(name = "oriSiteId")
    @FieldName("原住地作業點代碼")
    private String oriSiteId;

    @XmlElement(name = "moveinSiteId")
    @FieldName("遷入地作業點代碼")
    private String moveinSiteId;

    @XmlElement(name = "oprCode")
    @FieldName("作業代碼")
    private String oprCode;

    @XmlElement(name = "seqId")
    @FieldName("作業順序號")
    private Integer seqId;

    @XmlElement(name = "exe")
    @FieldName("作業資訊")
    private ExecutantType exe;

    public XldfyDataProcParam() {
        super();
        // TODO Auto-generated constructor stub
    }

    public XldfyDataProcParam(List<XLDFDomainObject> reserve5mList, List<XLDFDomainObject> remove5mList,
            List<Object> rldfyList, boolean fromHtoM, List<XldfopracsType> xdlfyAcesList, String oriSiteId,
            String moveinSiteId, String oprCode, Integer seqId, ExecutantType exe) {
        super();
        this.reserve5mList = reserve5mList;
        this.remove5mList = remove5mList;
        this.rldfyList = rldfyList;
        this.fromHtoM = fromHtoM;
        this.xdlfyAcesList = xdlfyAcesList;
        this.oriSiteId = oriSiteId;
        this.moveinSiteId = moveinSiteId;
        this.oprCode = oprCode;
        this.seqId = seqId;
        this.exe = exe;
    }

    public List<XLDFDomainObject> getReserve5mList() {
        return reserve5mList;
    }

    public void setReserve5mList(List<XLDFDomainObject> reserve5mList) {
        this.reserve5mList = reserve5mList;
    }

    public List<XLDFDomainObject> getRemove5mList() {
        return remove5mList;
    }

    public void setRemove5mList(List<XLDFDomainObject> remove5mList) {
        this.remove5mList = remove5mList;
    }

    public List<Object> getRldfyList() {
        return rldfyList;
    }

    public void setRldfyList(List<Object> rldfyList) {
        this.rldfyList = rldfyList;
    }

    public boolean isFromHtoM() {
        return fromHtoM;
    }

    public void setFromHtoM(boolean fromHtoM) {
        this.fromHtoM = fromHtoM;
    }

    public List<XldfopracsType> getXdlfyAcesList() {
        return xdlfyAcesList;
    }

    public void setXdlfyAcesList(List<XldfopracsType> xdlfyAcesList) {
        this.xdlfyAcesList = xdlfyAcesList;
    }

    public String getOriSiteId() {
        return oriSiteId;
    }

    public void setOriSiteId(String oriSiteId) {
        this.oriSiteId = oriSiteId;
    }

    public String getOprCode() {
        return oprCode;
    }

    public void setOprCode(String oprCode) {
        this.oprCode = oprCode;
    }

    public Integer getSeqId() {
        return seqId;
    }

    public void setSeqId(Integer seqId) {
        this.seqId = seqId;
    }

    public ExecutantType getExe() {
        return exe;
    }

    public void setExe(ExecutantType exe) {
        this.exe = exe;
    }

    public String getMoveinSiteId() {
        return moveinSiteId;
    }

    public void setMoveinSiteId(String moveinSiteId) {
        this.moveinSiteId = moveinSiteId;
    }

}
