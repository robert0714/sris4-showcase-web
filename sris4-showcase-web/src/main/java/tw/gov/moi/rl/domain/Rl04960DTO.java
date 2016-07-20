package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04960DTO", propOrder = { "IsAreaSelected", "IsdoorSelected" })
@XmlRootElement(name = "Rl04960DTO")
public class Rl04960DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "IsAreaSelected")
    @FieldName("行政區域調整清檔")
    private boolean isAreaSelected;

    @XmlElement(name = "IsdoorSelected")
    @FieldName("門牌整編資料清檔")
    private boolean isdoorSelected;

    @XmlElement(name = "IsdoorSelected")
    @FieldName("戶政事務所清檔")
    private boolean isAdminOfficeCodeSelected;

    public boolean isAreaSelected() {
        return isAreaSelected;
    }

    public void setAreaSelected(boolean isAreaSelected) {
        this.isAreaSelected = isAreaSelected;
    }

    public boolean isIsdoorSelected() {
        return isdoorSelected;
    }

    public void setIsdoorSelected(boolean isdoorSelected) {
        this.isdoorSelected = isdoorSelected;
    }

    public boolean isAdminOfficeCodeSelected() {
        return isAdminOfficeCodeSelected;
    }

    public void setAdminOfficeCodeSelected(boolean isAdminOfficeCodeSelected) {
        this.isAdminOfficeCodeSelected = isAdminOfficeCodeSelected;
    }

}
