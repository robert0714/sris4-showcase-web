package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf048mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05291DTOResult", propOrder = { "PersonId", "Yyymmdd", "PerosnName", "Rldf004m" })
@XmlRootElement(name = "Rl05291DTOResult")
public class Rl05291DTOResult implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    @XmlElement(name = "PersonId")
    @FieldName("舊統號")
    private String oldPersonId = "";

    @XmlElement(name = "Yyymmdd")
    @FieldName("日期")
    private String yyymmdd = "";

    @XmlElement(name = "PerosnName")
    @FieldName("姓名")
    private String perosnName = "";

    @XmlElement(name = "Rldf004m")
    @FieldName("個人資料")
    private Rldf004mType rldf004m = null;

    private Rldf048mType rldf048m = null;

    public boolean isOk() {
        return ((rldf004m != null) && (rldf048m != null));
    }

    public Rldf048mType getRldf048m() {
        return rldf048m;
    }

    public void setRldf048m(Rldf048mType rldf048m) {
        this.rldf048m = rldf048m;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getYyymmdd() {
        return yyymmdd;
    }

    public void setYyymmdd(String yyymmdd) {
        this.yyymmdd = yyymmdd;
    }

    public String getPerosnName() {
        return perosnName;
    }

    public void setPerosnName(String perosnName) {
        this.perosnName = perosnName;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

    public String getOldPersonId() {
        return oldPersonId;
    }

    public void setOldPersonId(String oldPersonId) {
        this.oldPersonId = oldPersonId;
    }

    @Override
    public String toString() {
        return "Rl05291DTOResult [personId=" + personId + ", yyymmdd=" + yyymmdd + ", perosnName=" + perosnName
                + ", rldf004m=" + rldf004m + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rl05291DTOResult) {
            final Rl05291DTOResult result = (Rl05291DTOResult) obj;
            if (this.personId.equals(result.getOldPersonId())) {
                return true;
            }
        }

        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
