package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.domain.RsLockTypeDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlSingleLockResponseDto", propOrder = {  "lockType" })
@XmlRootElement(name = "RlSingleLockResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlSingleLockResponseDto implements Serializable {    
    private static final long serialVersionUID = 1318061171129863863L;
    /** the lock type */
    @FieldName("the lock type")
    @XmlElement(name = "LockType")
    private RsLockTypeDTO lockType;
    
    public RsLockTypeDTO getLockType() {
        return lockType;
    }    
    public void setLockType(RsLockTypeDTO lockType) {
        this.lockType = lockType;
    }
}
