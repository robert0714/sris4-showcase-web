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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02100MDTOResult", propOrder = { "rldf001ms", "rldf004ms", "rldf002ms", "rldf005ms", "rldf047ms" })
@XmlRootElement(name = "Rl02100MDTOResult", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rl02100MDTOResult implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf001ms")
    @FieldName("當事人個人基本資料")
    List<Rldf001mType> rldf001ms = new ArrayList<Rldf001mType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf004ms")
    @FieldName("當事人個人基本資料")
    List<Rldf004mType> rldf004ms = new ArrayList<Rldf004mType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf002ms")
    @FieldName("當事人個人基本資料")
    List<Rldf002mType> rldf002ms = new ArrayList<Rldf002mType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf005ms")
    @FieldName("當事人個人基本資料")
    List<Rldf005mType> rldf005ms = new ArrayList<Rldf005mType>();

    /** 當事人個人基本資料. */
    @XmlElement(name = "Rldf047ms")
    @FieldName("當事人個人基本資料")
    List<Rldf047mType> rldf047ms = new ArrayList<Rldf047mType>();

    public List<Rldf001mType> getRldf001ms() {
        return rldf001ms;
    }

    public void setRldf001ms(List<Rldf001mType> rldf001ms) {
        this.rldf001ms = rldf001ms;
    }

    public List<Rldf004mType> getRldf004ms() {
        return rldf004ms;
    }

    public void setRldf004ms(List<Rldf004mType> rldf004ms) {
        this.rldf004ms = rldf004ms;
    }

    public List<Rldf002mType> getRldf002ms() {
        return rldf002ms;
    }

    public void setRldf002ms(List<Rldf002mType> rldf002ms) {
        this.rldf002ms = rldf002ms;
    }

    public List<Rldf005mType> getRldf005ms() {
        return rldf005ms;
    }

    public void setRldf005ms(List<Rldf005mType> rldf005ms) {
        this.rldf005ms = rldf005ms;
    }

    public List<Rldf047mType> getRldf047ms() {
        return rldf047ms;
    }

    public void setRldf047ms(List<Rldf047mType> rldf047ms) {
        this.rldf047ms = rldf047ms;
    }

}
