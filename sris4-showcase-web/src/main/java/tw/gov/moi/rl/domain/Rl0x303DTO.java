package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf021mType;
import tw.gov.moi.domain.Rldfs203Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x321DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored", "Reason" })
@XmlRootElement(name = "Rl0x321DTO")
public class Rl0x303DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MainDTO")
    @FieldName("查詢結果")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "EditResult")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    // 來源資料
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Rldf002mType selectData = new Rldf002mType();

    // 來源資料
    @XmlElement(name = "AddData")
    @FieldName("新增資料")
    private Rldf002mType addData = new Rldf002mType();

    // 來源資料
    @XmlElement(name = "AddData")
    @FieldName("新增資料")
    private Rldf002mType queryData = new Rldf002mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf021mType> resutlts = new ArrayList<Rldf021mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs203Type recored = new Rldfs203Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = "";

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String data = "";

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private String time = "";

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private boolean isVerify = false;

    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private Rldf002mType commononType = null;
    
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private Object lockData;
    public Object getLockData() {
        return lockData;
    }
    public void setLockData(Object lockData) {
        this.lockData = lockData;
    }
    
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private boolean verifyDataOld;
    public boolean isVerifyDataOld() {
        return verifyDataOld;
    }
    public void setVerifyDataOld(boolean verifyDataOld) {
        this.verifyDataOld = verifyDataOld;
    }

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    public Rldf002mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf002mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf021mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf021mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs203Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs203Type recored) {
        this.recored = recored;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldf002mType getAddData() {
        return addData;
    }

    public void setAddData(Rldf002mType addData) {
        this.addData = addData;
    }

    public Rldf002mType getQueryData() {
        return queryData;
    }

    public void setQueryData(Rldf002mType queryData) {
        this.queryData = queryData;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Rldf002mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf002mType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    @Override
    public String toString() {
        return "Rl0x321DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto + ", selectData=" + selectData + ", addData=" + addData + ", queryData=" + queryData
                + ", resutlts=" + resutlts + ", recored=" + recored + ", reason=" + reason + ", data=" + data + ", time=" + time + ", isVerify=" + isVerify + ", commononType=" + commononType + "]";
    }

}
