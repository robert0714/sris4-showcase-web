package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04930DTO", propOrder = { "regDate", "regRange", "loginData", "editData", "process", "modifyKind" })
@XmlRootElement(name = "Rl04930DTO")
public class Rl04930DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 調整日期 **/
    @XmlElement(name = "RegDate")
    @FieldName("調整日期")
    private String regDate;

    /** 調整範圍 **/
    @XmlElement(name = "RegRange")
    @FieldName("調整範圍")
    private String regRange;

    /** 登錄資料 **/
    @XmlElement(name = "LoginData")
    @FieldName("登錄資料")
    private List<Rl04930DetailDTO> loginData;

    /** 修改資料 **/
    @XmlElement(name = "EditData")
    @FieldName("修改資料")
    private Rl04930DetailDTO editData;

    /** 處理註記 **/
    @XmlElement(name = "Process")
    @FieldName("處理註記")
    private String process;
    
    @XmlElement(name = "ModifyKind")
    @FieldName("編釘類別")
    private String modifyKind;

    public String getModifyKind() {
		return modifyKind;
	}

	public void setModifyKind(String modifyKind) {
		this.modifyKind = modifyKind;
	}

	/**
     * @return the regDate
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * @param regDate
     *            the regDate to set
     */
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    /**
     * @return the regRange
     */
    public String getRegRange() {
        return regRange;
    }

    /**
     * @param regRange
     *            the regRange to set
     */
    public void setRegRange(String regRange) {
        this.regRange = regRange;
    }

    /**
     * @return the loginData
     */
    public List<Rl04930DetailDTO> getLoginData() {
        return loginData;
    }

    /**
     * @param loginData
     *            the loginData to set
     */
    public void setLoginData(List<Rl04930DetailDTO> loginData) {
        this.loginData = loginData;
    }

    /**
     * @return the editData
     */
    public Rl04930DetailDTO getEditData() {
        return editData;
    }

    /**
     * @param editData
     *            the editData to set
     */
    public void setEditData(Rl04930DetailDTO editData) {
        this.editData = editData;
    }

    /**
     * @return the process
     */
    public String getProcess() {
        return process;
    }

    /**
     * @param process
     *            the process to set
     */
    public void setProcess(String process) {
        this.process = process;
    }

}
