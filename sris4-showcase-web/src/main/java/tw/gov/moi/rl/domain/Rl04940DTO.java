package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04940DTO", propOrder = {"Status", "LockId"})
@XmlRootElement(name = "Rl04940DTO")
public class Rl04940DTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(name = "Status")
    @FieldName("驗證狀態")
    private String status = RlConstant.STRING_E;
    
    @XmlElement(name = "LockId")
    @FieldName("鎖定ID")
    private String lockId;
    //for test
    @XmlElement(name = "Amount")
    @FieldName("數量")
    private String amount;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLockId() {
		return lockId;
	}

	public void setLockId(String lockId) {
		this.lockId = lockId;
	}

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }
}
