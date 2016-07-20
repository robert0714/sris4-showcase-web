package tw.gov.moi.rl.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rLRP02350DTO", propOrder = { "Type", "SiteName", "DoorNumber", //
        "IsPrintVillageNegighbor",//
        "IsPrintPersonOfApplication", "ApplyId", "AppplyName" })
//
@XmlRootElement(name = "RLRP02350DTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RLRP02350DTO {

    @XmlElement(name = "Type")
    @FieldName("列印歷史")
    private List<Rl02300PrintDTO> rl02300PrintDTOs = null;

    @XmlElement(name = "SiteName")
    @FieldName("戶政事務所名稱")
    private String siteName;

    @XmlElement(name = "DoorNumber")
    @FieldName("門證字號")
    private String doorNumber;

    @XmlElement(name = "IsPrintVillageNegighbor")
    @FieldName("是否列印村里鄰")
    private boolean isPrintVillageNegighbor = false;// 是否列印村里鄰

    @XmlElement(name = "IsPrintPersonOfApplication")
    @FieldName("是否列印上給")
    private boolean isPrintPersonOfApplication = false;// 是否列印上給

    @XmlElement(name = "ApplyId")
    @FieldName("申請人之帳號")
    private String applyId;// 申請人之帳號

    @XmlElement(name = "AppplyName")
    @FieldName("申請人")
    private String appplyName;// 申請人

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getAppplyName() {
        return appplyName;
    }

    public void setAppplyName(String appplyName) {
        this.appplyName = appplyName;
    }

    public boolean isPrintVillageNegighbor() {
        return isPrintVillageNegighbor;
    }

    public void setPrintVillageNegighbor(boolean isPrintVillageNegighbor) {
        this.isPrintVillageNegighbor = isPrintVillageNegighbor;
    }

    public boolean isPrintPersonOfApplication() {
        return isPrintPersonOfApplication;
    }

    public void setPrintPersonOfApplication(boolean isPrintPersonOfApplication) {
        this.isPrintPersonOfApplication = isPrintPersonOfApplication;
    }

    public List<Rl02300PrintDTO> getRl02300PrintDTOs() {
        return rl02300PrintDTOs;
    }

    public void setRl02300PrintDTOs(List<Rl02300PrintDTO> rl02300PrintDTOs) {
        this.rl02300PrintDTOs = rl02300PrintDTOs;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

}
