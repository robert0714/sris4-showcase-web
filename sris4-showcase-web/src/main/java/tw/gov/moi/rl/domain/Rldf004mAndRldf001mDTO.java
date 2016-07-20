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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf004mAndRldf001mDTO", propOrder = { "rldf004mList", "rldf001mList" })
@XmlRootElement(name = "Rldf004mAndRldf001mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf004mAndRldf001mDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "Rldf004mList")
    @FieldName("rldf004mList")
    private List<Rldf004mType> rldf004mList = new ArrayList<Rldf004mType>();

    @XmlElement(name = "Rldf001mList")
    @FieldName("rldf001mList")
    private List<Rldf001mType> rldf001mList = new ArrayList<Rldf001mType>();

    public List<Rldf004mType> getRldf004mList() {
        return rldf004mList;
    }

    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    public List<Rldf001mType> getRldf001mList() {
        return rldf001mList;
    }

    public void setRldf001mList(List<Rldf001mType> rldf001mList) {
        this.rldf001mList = rldf001mList;
    }

    @Override
    public String toString() {
        return "Rldf004mAndRldf001mDTO [rldf004mList=" + rldf004mList + ", rldf001mList=" + rldf001mList + "]";
    }

}
