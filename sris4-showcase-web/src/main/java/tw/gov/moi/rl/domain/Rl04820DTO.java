package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.domain.Rs04810MainDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04820DTO", propOrder = { "oldAdminOfficeCode", "newAdminOfficeCode", "status" })
@XmlRootElement(name = "Rl04820DTO")
public class Rl04820DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "OldAdminOfficeCode")
    @FieldName("調整前戶所代碼")
    private String oldAdminOfficeCode;

    @XmlElement(name = "NewAdminOfficeCode")
    @FieldName("調整後戶所代碼")
    private String newAdminOfficeCode;

    @XmlElement(name = "Status")
    @FieldName("驗證狀態")
    private String status = RlConstant.STRING_E;

    @XmlElement(name = "LockId")
    @FieldName("鎖定ID")
    private String lockId;

    private Rs04810MainDTO mainDTO;

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getNewAdminOfficeCode() {
        return newAdminOfficeCode;
    }

    public void setNewAdminOfficeCode(String newAdminOfficeCode) {
        this.newAdminOfficeCode = newAdminOfficeCode;
    }

    public String getOldAdminOfficeCode() {
        return oldAdminOfficeCode;
    }

    public void setOldAdminOfficeCode(String oldAdminOfficeCode) {
        this.oldAdminOfficeCode = oldAdminOfficeCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Rs04810MainDTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rs04810MainDTO mainDTO) {
        this.mainDTO = mainDTO;
    }

}
