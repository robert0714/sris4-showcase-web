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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf003dType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf022dType;

/**
 * The Class Rl02ae0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ae0TempDTO", propOrder = { "TempCardNo", "TempCellophaneNo", "TempProcessStatus",
        "TempExpireCaseType", "TempApplyCaseType", "TempApplyYyymmdd", "TempApplyHhmmss", "TempApplyReason",
        "Apply001m", "Apply004m", "Litigant001m", "Litigant004m", "Litigant005m", "Apply022d", "Apply002d",
        "Apply012d", "Expire022d", "Expire002d", "Expire012d", "Rldf003d" })
@XmlRootElement(name = "Rl02ae0TempDTO")
public class Rl02ae0TempDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 暫存空白證號 */
    @FieldName("暫存空白證號")
    @XmlElement(name = "TempCardNo")
    private String tempCardNo = "";

    /** 暫存膠膜號 */
    @FieldName("暫存膠膜號")
    @XmlElement(name = "TempCellophaneNo")
    private String tempCellophaneNo = "";

    /** 暫存處理狀態 */
    @FieldName("暫存處理狀態")
    @XmlElement(name = "TempProcessStatus")
    private String tempProcessStatus = "";

    /** 暫存註銷案件是否異地辦理 */
    @FieldName("暫存註銷案件是否異地辦理")
    @XmlElement(name = "TempExpireCaseType")
    private String tempExpireCaseType = "";

    /** 暫存請領案件是否異地辦理 */
    @FieldName("暫存請領案件是否異地辦理")
    @XmlElement(name = "TempApplyCaseType")
    private String tempApplyCaseType = "N";

    /** 暫存申請日期 */
    @FieldName("暫存申請日期")
    @XmlElement(name = "TempApplyYyymmdd")
    private String tempApplyYyymmdd = "";

    /** 暫存申請時間 */
    @FieldName("暫存申請時間")
    @XmlElement(name = "TempApplyHhmmss")
    private String tempApplyHhmmss = "";

    /** 暫存註銷原因 */
    @FieldName("暫存註銷原因")
    @XmlElement(name = "TempApplyReason")
    private String tempApplyReason = "";

    /** 暫存申請人全戶資料 */
    @FieldName("暫存申請人全戶資料")
    @XmlElement(name = "Apply001m")
    private Rldf001mType apply001m = null;

    /** 暫存申請人個人資料 */
    @FieldName("暫存申請人個人資料")
    @XmlElement(name = "Apply004m")
    private Rldf004mType apply004m = null;

    /** 暫存當事人全戶資料 */
    @FieldName("暫存當事人全戶資料")
    @XmlElement(name = "Litigant001m")
    private Rldf001mType litigant001m = null;

    /** 暫存當事人個人資料 */
    @FieldName("暫存當事人個人資料")
    @XmlElement(name = "Litigant004m")
    private Rldf004mType litigant004m = null;

    /** 暫存當事人個人註記 */
    @FieldName("暫存當事人個人註記")
    @XmlElement(name = "Litigant005m")
    private Rldf005mType litigant005m = null;

    /** 暫存異地請領案件 */
    @FieldName("暫存異地請領案件")
    @XmlElement(name = "Apply022d")
    private Rldf022dType apply022d = null;

    /** 暫存本地請領案件 */
    @FieldName("暫存本地請領案件")
    @XmlElement(name = "Apply002d")
    private Rldf002dType apply002d = null;

    /** 暫存請領膠膜狀態 */
    @FieldName("暫存請領膠膜狀態")
    @XmlElement(name = "Apply012d")
    private Rldf012dType apply012d = null;

    /** 暫存異地註銷案件 */
    @FieldName("暫存異地註銷案件")
    @XmlElement(name = "Expire022d")
    private Rldf022dType expire022d = null;

    /** 暫存本地註銷案件 */
    @FieldName("暫存本地註銷案件")
    @XmlElement(name = "Expire002d")
    private Rldf002dType expire002d = null;

    /** 暫存註銷膠膜狀態 */
    @FieldName("暫存註銷膠膜狀態")
    @XmlElement(name = "Expire012d")
    private Rldf012dType expire012d = null;

    /** 國民身分證及膠膜註銷記錄檔 */
    @FieldName("國民身分證及膠膜註銷記錄檔")
    @XmlElement(name = "Rldf003d")
    private Rldf003dType rldf003d = null;

    public String getTempCardNo() {
        return tempCardNo;
    }

    public void setTempCardNo(String tempCardNo) {
        this.tempCardNo = tempCardNo;
    }

    public String getTempCellophaneNo() {
        return tempCellophaneNo;
    }

    public void setTempCellophaneNo(String tempCellophaneNo) {
        this.tempCellophaneNo = tempCellophaneNo;
    }

    public String getTempProcessStatus() {
        return tempProcessStatus;
    }

    public void setTempProcessStatus(String tempProcessStatus) {
        this.tempProcessStatus = tempProcessStatus;
    }

    public String getTempExpireCaseType() {
        return tempExpireCaseType;
    }

    public void setTempExpireCaseType(String tempExpireCaseType) {
        this.tempExpireCaseType = tempExpireCaseType;
    }

    public String getTempApplyCaseType() {
        return tempApplyCaseType;
    }

    public void setTempApplyCaseType(String tempApplyCaseType) {
        this.tempApplyCaseType = tempApplyCaseType;
    }

    public String getTempApplyYyymmdd() {
        return tempApplyYyymmdd;
    }

    public void setTempApplyYyymmdd(String tempApplyYyymmdd) {
        this.tempApplyYyymmdd = tempApplyYyymmdd;
    }

    public String getTempApplyHhmmss() {
        return tempApplyHhmmss;
    }

    public void setTempApplyHhmmss(String tempApplyHhmmss) {
        this.tempApplyHhmmss = tempApplyHhmmss;
    }

    public String getTempApplyReason() {
        return tempApplyReason;
    }

    public void setTempApplyReason(String tempApplyReason) {
        this.tempApplyReason = tempApplyReason;
    }

    public Rldf001mType getApply001m() {
        return apply001m;
    }

    public void setApply001m(Rldf001mType apply001m) {
        this.apply001m = apply001m;
    }

    public Rldf004mType getApply004m() {
        return apply004m;
    }

    public void setApply004m(Rldf004mType apply004m) {
        this.apply004m = apply004m;
    }

    public Rldf001mType getLitigant001m() {
        return litigant001m;
    }

    public void setLitigant001m(Rldf001mType litigant001m) {
        this.litigant001m = litigant001m;
    }

    public Rldf004mType getLitigant004m() {
        return litigant004m;
    }

    public void setLitigant004m(Rldf004mType litigant004m) {
        this.litigant004m = litigant004m;
    }

    public Rldf005mType getLitigant005m() {
        return litigant005m;
    }

    public void setLitigant005m(Rldf005mType litigant005m) {
        this.litigant005m = litigant005m;
    }

    public Rldf022dType getApply022d() {
        return apply022d;
    }

    public void setApply022d(Rldf022dType apply022d) {
        this.apply022d = apply022d;
    }

    public Rldf002dType getApply002d() {
        return apply002d;
    }

    public void setApply002d(Rldf002dType apply002d) {
        this.apply002d = apply002d;
    }

    public Rldf012dType getApply012d() {
        return apply012d;
    }

    public void setApply012d(Rldf012dType apply012d) {
        this.apply012d = apply012d;
    }

    public Rldf022dType getExpire022d() {
        return expire022d;
    }

    public void setExpire022d(Rldf022dType expire022d) {
        this.expire022d = expire022d;
    }

    public Rldf002dType getExpire002d() {
        return expire002d;
    }

    public void setExpire002d(Rldf002dType expire002d) {
        this.expire002d = expire002d;
    }

    public Rldf012dType getExpire012d() {
        return expire012d;
    }

    public void setExpire012d(Rldf012dType expire012d) {
        this.expire012d = expire012d;
    }

    public Rldf003dType getRldf003d() {
        return rldf003d;
    }

    public void setRldf003d(Rldf003dType rldf003d) {
        this.rldf003d = rldf003d;
    }

}
