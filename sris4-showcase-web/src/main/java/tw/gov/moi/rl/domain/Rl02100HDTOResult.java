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
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.domain.Rldf047hType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02100HDTOResult", propOrder = { "targetPersonData", "householdData", "householdHeadData",
        "householdMembers", "rldf007mTypes", "rldf002mTypes", "rldf005mTypes", "rldf047mType", "rldfm02mTypes",
        "rldfm08mTypes", "rldfm01mType", "rldfm06mTypes", "rldf006mTypes", "rldf008mTypes", "rldf030mTypes",
        "rldf002dTypes", "rldf039mTypes", "rldf040mTypes", "rldfm03mTypes", "rldf018dTypes" })
@XmlRootElement(name = "Rl02100HDTOResult", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rl02100HDTOResult implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf001ms")
    @FieldName("當事人個人基本資料")
    List<Rldf001hType> rldf001hs = new ArrayList<Rldf001hType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf004ms")
    @FieldName("當事人個人基本資料")
    List<Rldf004hType> rldf004hs = new ArrayList<Rldf004hType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf002ms")
    @FieldName("當事人個人基本資料")
    List<Rldf002hType> rldf002hs = new ArrayList<Rldf002hType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf005ms")
    @FieldName("當事人個人基本資料")
    List<Rldf005hType> rldf005hs = new ArrayList<Rldf005hType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf047ms")
    @FieldName("當事人個人基本資料")
    List<Rldf047hType> rldf047hs = new ArrayList<Rldf047hType>();

    public List<Rldf001hType> getRldf001hs() {
        return rldf001hs;
    }

    public void setRldf001hs(List<Rldf001hType> rldf001hs) {
        this.rldf001hs = rldf001hs;
    }

    public List<Rldf004hType> getRldf004hs() {
        return rldf004hs;
    }

    public void setRldf004hs(List<Rldf004hType> rldf004hs) {
        this.rldf004hs = rldf004hs;
    }

    public List<Rldf002hType> getRldf002hs() {
        return rldf002hs;
    }

    public void setRldf002hs(List<Rldf002hType> rldf002hs) {
        this.rldf002hs = rldf002hs;
    }

    public List<Rldf005hType> getRldf005hs() {
        return rldf005hs;
    }

    public void setRldf005hs(List<Rldf005hType> rldf005hs) {
        this.rldf005hs = rldf005hs;
    }

    public List<Rldf047hType> getRldf047hs() {
        return rldf047hs;
    }

    public void setRldf047hs(List<Rldf047hType> rldf047hs) {
        this.rldf047hs = rldf047hs;
    }

}
