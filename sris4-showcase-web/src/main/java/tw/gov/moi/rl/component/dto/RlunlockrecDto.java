package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.RlunlockrecType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlunlockrecDto", propOrder = { "wrapperData" })
@XmlRootElement(name = "RlunlockrecDto")
public class RlunlockrecDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 8698948120909582975L;
    
    /** 鎖定資料紀錄檔 */
    @XmlElement(name = "wrapperData", required = true)
    @FieldName("鎖定資料紀錄檔")
    private final RlunlockrecType wrapperData;

    public RlunlockrecType getWrapperData() {
        return wrapperData;
    }

    public RlunlockrecDto(RlunlockrecType wrapperData) {
	super();
	this.wrapperData = wrapperData;
    }
    
}
