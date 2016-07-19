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

/**
 * 空白國民身分證及膠膜領發月報表 DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rlrp02ba0DTO", propOrder = { "type", "assignQty", "hhProQty", "lccFstQty", "lccRepQty", "lccChgQty",
        "lccProvQty", "ttProvQty", "dhProQty", "dccFstQty", "dccRepQty", "dccChgQty", "dccProvQty", "dtProvQty",
        "lhVoidQty", "lhucvQty", "lcucvQty", "llLostQty", "dhVoidQty", "dhucvQty", "dcucvQty", "dlLostQty",
        "destroyQty", "lostQty", "hhImperfectQty", "ccImperfectQty", "imperfectQty", "hhRemainsQty", "ccRemainsQty" })
@XmlRootElement(name = "Rlrp02ba0DTO")
public class Rlrp02ba0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4117462322895710696L;

    /** 類別. */
    @XmlElement(name = "Type")
    @FieldName("類別")
    private String type = "";

    /** 實領數. */
    @XmlElement(name = "AssignQty")
    @FieldName("實領數")
    private String assignQty = "0";

    /** 本地截至上月止累計核發數. */
    @XmlElement(name = "HhProQty")
    @FieldName("本地截至上月止累計核發數")
    private String hhProQty = "0";

    /** 本地初次請領. */
    @XmlElement(name = "LccFstQty")
    @FieldName("本地初次請領")
    private String lccFstQty = "0";

    /** 本地補發. */
    @XmlElement(name = "LccRepQty")
    @FieldName("本地補發")
    private String lccRepQty = "0";

    /** 本地換發. */
    @XmlElement(name = "LccChgQty")
    @FieldName("本地換發")
    private String lccChgQty = "0";

    /** 本地小計. */
    @XmlElement(name = "LccProvQty")
    @FieldName("本地小計")
    private String lccProvQty = "0";

    /** 本地截至本月止已發累計數. */
    @XmlElement(name = "TtProvQty")
    @FieldName("本地截至本月止已發累計數")
    private String ttProvQty = "0";

    /** 代發截至上月止累計核發數. */
    @XmlElement(name = "DhProQty")
    @FieldName("代發截至上月止累計核發數")
    private String dhProQty = "0";

    /** 代發初次請領. */
    @XmlElement(name = "DccFstQty")
    @FieldName("代發初次請領")
    private String dccFstQty = "0";

    /** 代發補發. */
    @XmlElement(name = "DccRepQty")
    @FieldName("代發補發")
    private String dccRepQty = "0";

    /** 代發換發. */
    @XmlElement(name = "DccChgQty")
    @FieldName("代發換發")
    private String dccChgQty = "0";

    /** 代發小計. */
    @XmlElement(name = "DccProvQty")
    @FieldName("代發小計")
    private String dccProvQty = "0";

    /** 代發截至本月止已發累計數. */
    @XmlElement(name = "DtProvQty")
    @FieldName("代發截至本月止已發累計數")
    private String dtProvQty = "0";

    /** 本地截至上月止作廢累計數. */
    @XmlElement(name = "LhVoidQty")
    @FieldName("本地截至上月止作廢累計數")
    private String lhVoidQty = "0";

    /** 本地上月製妥數. */
    @XmlElement(name = "LhucvQty")
    @FieldName("本地上月製妥數")
    private String lhucvQty = "0";

    /** 本地本月製妥數. */
    @XmlElement(name = "LcucvQty")
    @FieldName("本地本月製妥數")
    private String lcucvQty = "0";

    /** 本地截至本月止累計作廢數. */
    @XmlElement(name = "LlLostQty")
    @FieldName("本地截至本月止累計作廢數")
    private String llLostQty = "0";

    /** 代發截至上月止作廢累計數. */
    @XmlElement(name = "DhVoidQty")
    @FieldName("代發截至上月止作廢累計數")
    private String dhVoidQty = "0";

    /** 代發上月製妥數. */
    @XmlElement(name = "DhucvQty")
    @FieldName("代發上月製妥數")
    private String dhucvQty = "0";

    /** 代發本月製妥數. */
    @XmlElement(name = "DcucvQty")
    @FieldName("代發本月製妥數")
    private String dcucvQty = "0";

    /** 代發截至本月止累計作廢數. */
    @XmlElement(name = "DlLostQty")
    @FieldName("代發截至本月止累計作廢數")
    private String dlLostQty = "0";

    /** 焚燬數. */
    @XmlElement(name = "DestroyQty")
    @FieldName("焚燬數")
    private String destroyQty = "0";

    /** 遺失核銷數. */
    @XmlElement(name = "LostQty")
    @FieldName("遺失核銷數")
    private String lostQty = "0";

    /** 截至上月止瑕疵累計數. */
    @XmlElement(name = "HhImperfectQty")
    @FieldName("截至上月止瑕疵累計數")
    private String hhImperfectQty = "0";

    /** 本月瑕疵數. */
    @XmlElement(name = "CcImperfectQty")
    @FieldName("本月瑕疵數")
    private String ccImperfectQty = "0";

    /** 截至本月止累計瑕疵數. */
    @XmlElement(name = "ImperfectQty")
    @FieldName("截至本月止累計瑕疵數")
    private String imperfectQty = "0";

    /** 上月結餘數. */
    @XmlElement(name = "HhRemainsQty")
    @FieldName("上月結餘數")
    private String hhRemainsQty = "0";

    /** 本月結餘數. */
    @XmlElement(name = "CcRemainsQty")
    @FieldName("本月結餘數")
    private String ccRemainsQty = "0";

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAssignQty() {
        return this.assignQty;
    }

    public void setAssignQty(String assignQty) {
        this.assignQty = assignQty;
    }

    public String getHhProQty() {
        return this.hhProQty;
    }

    public void setHhProQty(String hhProQty) {
        this.hhProQty = hhProQty;
    }

    public String getLccFstQty() {
        return this.lccFstQty;
    }

    public void setLccFstQty(String lccFstQty) {
        this.lccFstQty = lccFstQty;
    }

    public String getLccRepQty() {
        return this.lccRepQty;
    }

    public void setLccRepQty(String lccRepQty) {
        this.lccRepQty = lccRepQty;
    }

    public String getLccChgQty() {
        return this.lccChgQty;
    }

    public void setLccChgQty(String lccChgQty) {
        this.lccChgQty = lccChgQty;
    }

    public String getLccProvQty() {
        return this.lccProvQty;
    }

    public void setLccProvQty(String lccProvQty) {
        this.lccProvQty = lccProvQty;
    }

    public String getTtProvQty() {
        return this.ttProvQty;
    }

    public void setTtProvQty(String ttProvQty) {
        this.ttProvQty = ttProvQty;
    }

    public String getDhProQty() {
        return this.dhProQty;
    }

    public void setDhProQty(String dhProQty) {
        this.dhProQty = dhProQty;
    }

    public String getDccFstQty() {
        return this.dccFstQty;
    }

    public void setDccFstQty(String dccFstQty) {
        this.dccFstQty = dccFstQty;
    }

    public String getDccRepQty() {
        return this.dccRepQty;
    }

    public void setDccRepQty(String dccRepQty) {
        this.dccRepQty = dccRepQty;
    }

    public String getDccChgQty() {
        return this.dccChgQty;
    }

    public void setDccChgQty(String dccChgQty) {
        this.dccChgQty = dccChgQty;
    }

    public String getDccProvQty() {
        return this.dccProvQty;
    }

    public void setDccProvQty(String dccProvQty) {
        this.dccProvQty = dccProvQty;
    }

    public String getDtProvQty() {
        return this.dtProvQty;
    }

    public void setDtProvQty(String dtProvQty) {
        this.dtProvQty = dtProvQty;
    }

    public String getLhVoidQty() {
        return this.lhVoidQty;
    }

    public void setLhVoidQty(String lhVoidQty) {
        this.lhVoidQty = lhVoidQty;
    }

    public String getLhucvQty() {
        return this.lhucvQty;
    }

    public void setLhucvQty(String lhucvQty) {
        this.lhucvQty = lhucvQty;
    }

    public String getLcucvQty() {
        return this.lcucvQty;
    }

    public void setLcucvQty(String lcucvQty) {
        this.lcucvQty = lcucvQty;
    }

    public String getLlLostQty() {
        return this.llLostQty;
    }

    public void setLlLostQty(String llLostQty) {
        this.llLostQty = llLostQty;
    }

    public String getDhVoidQty() {
        return this.dhVoidQty;
    }

    public void setDhVoidQty(String dhVoidQty) {
        this.dhVoidQty = dhVoidQty;
    }

    public String getDhucvQty() {
        return this.dhucvQty;
    }

    public void setDhucvQty(String dhucvQty) {
        this.dhucvQty = dhucvQty;
    }

    public String getDcucvQty() {
        return this.dcucvQty;
    }

    public void setDcucvQty(String dcucvQty) {
        this.dcucvQty = dcucvQty;
    }

    public String getDlLostQty() {
        return this.dlLostQty;
    }

    public void setDlLostQty(String dlLostQty) {
        this.dlLostQty = dlLostQty;
    }

    public String getDestroyQty() {
        return this.destroyQty;
    }

    public void setDestroyQty(String destroyQty) {
        this.destroyQty = destroyQty;
    }

    public String getLostQty() {
        return this.lostQty;
    }

    public void setLostQty(String lostQty) {
        this.lostQty = lostQty;
    }

    public String getHhImperfectQty() {
        return this.hhImperfectQty;
    }

    public void setHhImperfectQty(String hhImperfectQty) {
        this.hhImperfectQty = hhImperfectQty;
    }

    public String getCcImperfectQty() {
        return this.ccImperfectQty;
    }

    public void setCcImperfectQty(String ccImperfectQty) {
        this.ccImperfectQty = ccImperfectQty;
    }

    public String getImperfectQty() {
        return this.imperfectQty;
    }

    public void setImperfectQty(String imperfectQty) {
        this.imperfectQty = imperfectQty;
    }

    public String getHhRemainsQty() {
        return this.hhRemainsQty;
    }

    public void setHhRemainsQty(String hhRemainsQty) {
        this.hhRemainsQty = hhRemainsQty;
    }

    public String getCcRemainsQty() {
        return this.ccRemainsQty;
    }

    public void setCcRemainsQty(String ccRemainsQty) {
        this.ccRemainsQty = ccRemainsQty;
    }

    @Override
    public String toString() {
        return "Rlrp02ba0DTO [type=" + type + ", assignQty=" + assignQty + ", hhProQty=" + hhProQty + ", lccFstQty="
                + lccFstQty + ", lccRepQty=" + lccRepQty + ", lccChgQty=" + lccChgQty + ", lccProvQty=" + lccProvQty
                + ", ttProvQty=" + ttProvQty + ", dhProQty=" + dhProQty + ", dccFstQty=" + dccFstQty + ", dccRepQty="
                + dccRepQty + ", dccChgQty=" + dccChgQty + ", dccProvQty=" + dccProvQty + ", dtProvQty=" + dtProvQty
                + ", lhVoidQty=" + lhVoidQty + ", lhucvQty=" + lhucvQty + ", lcucvQty=" + lcucvQty + ", llLostQty="
                + llLostQty + ", dhVoidQty=" + dhVoidQty + ", dhucvQty=" + dhucvQty + ", dcucvQty=" + dcucvQty
                + ", dlLostQty=" + dlLostQty + ", destroyQty=" + destroyQty + ", lostQty=" + lostQty
                + ", hhImperfectQty=" + hhImperfectQty + ", ccImperfectQty=" + ccImperfectQty + ", imperfectQty="
                + imperfectQty + ", hhRemainsQty=" + hhRemainsQty + ", ccRemainsQty=" + ccRemainsQty + "]";
    }

}
