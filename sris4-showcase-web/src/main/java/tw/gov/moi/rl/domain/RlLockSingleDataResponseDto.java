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
@XmlType(name = "rlLockSingleDataResponseDto", propOrder = { "targetClassTypeCanonicalName", "contentId", "checkLockTypeResult"})
@XmlRootElement(name = "RlLockSingleDataResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlLockSingleDataResponseDto implements Serializable {
    
    /** 鎖定的資料的資料物件名稱 */
    @FieldName("鎖定的資料的資料物件名稱")
    @XmlElement(name = "TargetClassTypeCanonicalName", required = true)
    private String targetClassTypeCanonicalName;
    
    @FieldName("鎖定key值內容")
    @XmlElement(name = "ContentId", required = true)
    private String contentId;
    
    @FieldName("檢查鎖定的型態，判別是否有相同鎖定資料")
    @XmlElement(name = "CheckLockTypeResult", required = true)
    private Integer checkLockTypeResult;


    public String getTargetClassTypeCanonicalName() {
        return targetClassTypeCanonicalName;
    }

    public void setTargetClassTypeCanonicalName(String targetClassTypeCanonicalName) {
        this.targetClassTypeCanonicalName = targetClassTypeCanonicalName;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Integer getCheckLockTypeResult() {
        return checkLockTypeResult;
    }

    public void setCheckLockTypeResult(Integer checkLockTypeResult) {
        this.checkLockTypeResult = checkLockTypeResult;
    }

       
    
}
