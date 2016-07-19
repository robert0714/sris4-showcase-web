package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfal01Type;

/**
 * 全國個人概要資料查詢核准處理DTO
 * 
 * @author David Wu
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03920DTO", propOrder = { "siteId", "personId", "userId", "userName", "verifyResult", "verifyType",
        "selectModel", "selectList", "resultList" })
@XmlRootElement(name = "Rl03920DTO")
public class Rl03920DTO implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1330679580004865059L;
    
    /** 作業點代碼 */
    @XmlElement(name = "siteId", required = false)
    @FieldName("作業點代碼")
    private String siteId = "";
    
    /** 統一編號 */
    @XmlElement(name = "personId", required = false)
    @FieldName("統一編號")
    private String personId = "";

    /** 戶籍員帳號 */
    @XmlElement(name = "userId", required = false)
    @FieldName("戶籍員帳號")
    private String userId = "";
    
    /** 戶籍員姓名 */
    @XmlElement(name = "userName", required = false)
    @FieldName("戶籍員姓名")
    private String userName = "";

    /** 審核狀況 */
    @XmlElement(name = "verifyResult", required = false)
    @FieldName("審核狀況")
    private String verifyResult = "";

    /** 審核狀況 */
    @XmlElement(name = "verifyType", required = false)
    @FieldName("審核種類")
    private String verifyType = "";
    
    @XmlElement(name = "selectModel")
    @FieldName("頁面選取資料")
    private Rldfal01Type selectModel;

    @XmlElement(name = "selectList")
    @FieldName("頁面多筆選取資料")
    private Rldfal01Type[] selectList;
    
    @XmlElement(name = "resultList")
    @FieldName("查詢結果(存放RLDFAL01)")
    private List<Rldfal01Type> resultList;
    
    /**
     * Gets the person id.
     *
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     *
     * @param personId the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
    }

    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    public Rldfal01Type[] getSelectList() {
        return selectList;
    }

    public void setSelectList(Rldfal01Type[] selectList) {
        this.selectList = selectList;
    }

    public Rldfal01Type getSelectModel() {
        return selectModel;
    }

    public void setSelectModel(Rldfal01Type selectModel) {
        this.selectModel = selectModel;
    }

    public List<Rldfal01Type> getResultList() {
        if (resultList == null) {
            resultList = new ArrayList<Rldfal01Type>();
        }
        return resultList;
    }

    public void setResultList(List<Rldfal01Type> resultList) {
        this.resultList = resultList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
