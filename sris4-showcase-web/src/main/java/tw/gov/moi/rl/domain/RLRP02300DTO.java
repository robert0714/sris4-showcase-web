package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldfs017Type;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rLRP02300DTO", propOrder = { "Type", "DoorNumber", "SiteName", "FreeReason", "CertificateDTO" })
@XmlRootElement(name = "RLRP02300DTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RLRP02300DTO {

    @XmlElement(name = "Type")
    @FieldName("申請書")
    private Xldfs017Type type;

    @XmlElement(name = "DoorNumber")
    @FieldName("門牌號")
    private String doorNumber;

    @XmlElement(name = "SiteName")
    @FieldName("戶政事務所")
    private String siteName;

    @XmlElement(name = "FreeReason")
    @FieldName("規費原因")
    private String freeReason = null;

    @XmlElement(name = "CertificateDTO")
    @FieldName("附繳證件")
    private CertificateDTO certificateDTO = null;

    public String getFreeReason() {
        return freeReason;
    }

    public void setFreeReason(String freeReason) {
        this.freeReason = freeReason;
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

    public Xldfs017Type getType() {
        return type;
    }

    public void setType(Xldfs017Type type) {
        this.type = type;
    }

    public CertificateDTO getCertificateDTO() {
        return certificateDTO;
    }

    public void setCertificateDTO(CertificateDTO certificateDTO) {
        this.certificateDTO = certificateDTO;
    }

}
