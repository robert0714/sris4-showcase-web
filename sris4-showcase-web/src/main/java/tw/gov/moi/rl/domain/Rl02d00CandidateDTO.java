package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
 
/**
 * The Class Rl02d00CandidateDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02d00CandidateDTO", propOrder = { "checked", "applyCode", "applyTransactionId", "", "malePersonId",
        "femalePersonId", "maleName", "femaleName", "classType", "cancelMark", "maleNowState", "femaleNowState",
        "registerDate", "rldf087tOr088tOr89tList" })
@XmlRootElement(name = "Rl02d00CandidateDTO")
public class Rl02d00CandidateDTO implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8709188560885104476L;
    
    /** The checked. */
    @FieldName("夫-戶籍現況")
    @XmlElement(name = "checked", required = true)
    private boolean checked;

    /** The apply code. */
    @FieldName("申請書代碼")
    @XmlElement(name = "applyCode", required = true)
    private String applyCode;

    /** The apply transaction id. */
    @FieldName("交易序號")
    @XmlElement(name = "applyTransactionId", required = true)
    private String applyTransactionId;

    /** The apply sequence id. */
    @FieldName("交易順序")
    @XmlElement(name = "applySequenceId", required = true)
    private Integer applySequenceId;

    /** The male person id. */
    @FieldName("夫-身分證字號")
    @XmlElement(name = "malePersonId", required = true)
    private String malePersonId;

    /** The female person id. */
    @FieldName("妻-身分證字號")
    @XmlElement(name = "femalePersonId", required = true)
    private String femalePersonId;

    /** The male name. */
    @FieldName("夫-姓名")
    @XmlElement(name = "maleName", required = true)
    private String maleName;

    /** The female name. */
    @FieldName("妻-姓名")
    @XmlElement(name = "femaleName", required = true)
    private String femaleName;

    /** The class type. */
    @FieldName("型別")
    @XmlElement(name = "classType", required = true)
    private Class<?> classType;

    /** The cancel mark. */
    @FieldName("夫-戶籍現況")
    @XmlElement(name = "cancelMark", required = true)
    private String cancelMark;

    /** The male now state. */
    @FieldName("夫-戶籍現況")
    @XmlElement(name = "maleNowState", required = true)
    private String maleNowState;

    /** The female now state. */
    @FieldName("妻-戶籍現況")
    @XmlElement(name = "femaleNowState", required = true)
    private String femaleNowState;

    /** The register date. */
    @FieldName("登記日期")
    @XmlElement(name = "registerDate", required = true)
    private String registerDate;

    /** The rldf087t or088t or89t list. */
    @FieldName("結離婚證明書清單")
    @XmlElement(name = "rldf087tOr088tOr89tList", required = true)
    private List<Serializable> rldf087tOr088tOr89tList;

    /**
     * Checks if is checked.
     *
     * @return true, if is checked
     */
    public boolean isChecked() {
        return this.checked;
    }

    /**
     * Sets the checked.
     *
     * @param checked the new checked
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /**
     * Gets the apply code.
     *
     * @return the apply code
     */
    public String getApplyCode() {
        return this.applyCode;
    }

    /**
     * Sets the apply code.
     *
     * @param applyCode the new apply code
     */
    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the apply transaction id.
     *
     * @return the apply transaction id
     */
    public String getApplyTransactionId() {
        return this.applyTransactionId;
    }

    /**
     * Sets the apply transaction id.
     *
     * @param applyTransactionId the new apply transaction id
     */
    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the male person id.
     *
     * @return the male person id
     */
    public String getMalePersonId() {
        return this.malePersonId;
    }

    /**
     * Sets the male person id.
     *
     * @param malePersonId the new male person id
     */
    public void setMalePersonId(String malePersonId) {
        this.malePersonId = malePersonId;
    }

    /**
     * Gets the female person id.
     *
     * @return the female person id
     */
    public String getFemalePersonId() {
        return this.femalePersonId;
    }

    /**
     * Sets the female person id.
     *
     * @param femalePersonId the new female person id
     */
    public void setFemalePersonId(String femalePersonId) {
        this.femalePersonId = femalePersonId;
    }

    /**
     * Gets the male name.
     *
     * @return the male name
     */
    public String getMaleName() {
        return this.maleName;
    }

    /**
     * Sets the male name.
     *
     * @param maleName the new male name
     */
    public void setMaleName(String maleName) {
        this.maleName = maleName;
    }

    /**
     * Gets the female name.
     *
     * @return the female name
     */
    public String getFemaleName() {
        return this.femaleName;
    }

    /**
     * Sets the female name.
     *
     * @param femaleName the new female name
     */
    public void setFemaleName(String femaleName) {
        this.femaleName = femaleName;
    }

    /**
     * Gets the register date.
     *
     * @return the register date
     */
    public String getRegisterDate() {
        return this.registerDate;
    }

    /**
     * Sets the register date.
     *
     * @param registerDate the new register date
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the male now state.
     *
     * @return the male now state
     */
    public String getMaleNowState() {
        return this.maleNowState;
    }

    /**
     * Sets the male now state.
     *
     * @param maleNowState the new male now state
     */
    public void setMaleNowState(String maleNowState) {
        this.maleNowState = maleNowState;
    }

    /**
     * Gets the female now state.
     *
     * @return the female now state
     */
    public String getFemaleNowState() {
        return this.femaleNowState;
    }

    /**
     * Sets the female now state.
     *
     * @param femaleNowState the new female now state
     */
    public void setFemaleNowState(String femaleNowState) {
        this.femaleNowState = femaleNowState;
    }

    /**
     * Gets the rldf087t or088t or89t list.
     *
     * @return the rldf087t or088t or89t list
     */
    public List<Serializable> getRldf087tOr088tOr89tList() {
        if (this.rldf087tOr088tOr89tList == null) {
            this.rldf087tOr088tOr89tList = new ArrayList<Serializable>();
        }
        return this.rldf087tOr088tOr89tList;
    }

    /**
     * Sets the rldf087t or088t or89t list.
     *
     * @param rldf087tOr088tOr89tList the new rldf087t or088t or89t list
     */
    public void setRldf087tOr088tOr89tList(List<Serializable> rldf087tOr088tOr89tList) {
        this.rldf087tOr088tOr89tList = rldf087tOr088tOr89tList;
    }

    /**
     * Gets the class type.
     *
     * @return the class type
     */
    public Class<?> getClassType() {
        return this.classType;
    }

    /**
     * Sets the class type.
     *
     * @param classType the new class type
     */
    public void setClassType(Class<?> classType) {
        this.classType = classType;
    }

    /**
     * Gets the class type name.
     *
     * @return the class type name
     */
    public String getClassTypeName() {
        if (this.classType == null) {
            return StringUtils.EMPTY;
        } else {
            return this.classType.getSimpleName();
        }
    }

    /**
     * Gets the cancel mark.
     *
     * @return the cancel mark
     */
    public String getCancelMark() {
        return this.cancelMark;
    }

    /**
     * Sets the cancel mark.
     *
     * @param cancelMark the new cancel mark
     */
    public void setCancelMark(String cancelMark) {
        this.cancelMark = cancelMark;
    }

    /**
     * Gets the apply sequence id.
     *
     * @return the apply sequence id
     */
    public Integer getApplySequenceId() {
        return this.applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     *
     * @param applySequenceId the new apply sequence id
     */
    public void setApplySequenceId(Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

}
