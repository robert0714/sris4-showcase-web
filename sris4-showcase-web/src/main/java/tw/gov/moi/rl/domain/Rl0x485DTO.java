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
import tw.gov.moi.domain.Rldf021mType;
import tw.gov.moi.domain.Rldfs185Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x321DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored", "Reason" })
@XmlRootElement(name = "Rl0x321DTO")
public class Rl0x485DTO implements Serializable {

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
    private Object selectData = new Object();

    // 來源資料
    @XmlElement(name = "AddData")
    @FieldName("新增資料")
    private Object addData = new Object();

    // 來源資料
    @XmlElement(name = "AddData")
    @FieldName("新增資料")
    private Object queryData = new Object();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf021mType> resutlts = new ArrayList<Rldf021mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs185Type recored = new Rldfs185Type();

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
    private Object commononType = null;
    
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private boolean verifyDataOld;
    public boolean isVerifyDataOld() {
        return verifyDataOld;
    }
    public void setVerifyDataOld(boolean verifyDataOld) {
        this.verifyDataOld = verifyDataOld;
    }
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private Object lockData;
    public Object getLockData() {
        return lockData;
    }
    public void setLockData(Object lockData) {
        this.lockData = lockData;
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

    public Object getSelectData() {
        return selectData;
    }

    public void setSelectData(Object selectData) {
        this.selectData = selectData;
    }

    public List<Rldf021mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf021mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs185Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs185Type recored) {
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

    public Object getAddData() {
        return addData;
    }

    public void setAddData(Object addData) {
        this.addData = addData;
    }

    public Object getQueryData() {
        return queryData;
    }

    public void setQueryData(Object queryData) {
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

    public Object getCommononType() {
        return commononType;
    }

    public void setCommononType(Object commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public static class Rl0x485ChoiceBtn {
        private String educationMark;//   教育程度註記
        private List<?> educationMarkList;//   教育程度註記
        private String lawCode;// 引用法條代碼
        private String lawCodeLabel;// 引用法條代碼 - 中文
        private List<?> lawCodeList;// 引用法條代碼
        private String nameWay;// 從姓方式代碼
        private List<?> nameWayList;// 從姓方式代碼
        private String nationalityCode;// 當事人外籍者（原屬）國籍代碼
        private List<?> nationalityCodeList;// 當事人外籍者（原屬）國籍代碼
        private String updateReasonCode;//    更正原因代碼
        private List<?> updateReasonCodeList;//    更正原因代碼
        
        public String getLawCodeLabel() {
            return lawCodeLabel;
        }
        public void setLawCodeLabel(String lawCodeLabel) {
            this.lawCodeLabel = lawCodeLabel;
        }
        public String getEducationMark() {
            return educationMark;
        }
        public void setEducationMark(String educationMark) {
            this.educationMark = educationMark;
        }
        public List<?> getEducationMarkList() {
            return educationMarkList;
        }
        public void setEducationMarkList(List<?> educationMarkList) {
            this.educationMarkList = educationMarkList;
        }
        public String getLawCode() {
            return lawCode;
        }
        public void setLawCode(String lawCode) {
            this.lawCode = lawCode;
        }
        public List<?> getLawCodeList() {
            return lawCodeList;
        }
        public void setLawCodeList(List<?> lawCodeList) {
            this.lawCodeList = lawCodeList;
        }
        public String getNameWay() {
            return nameWay;
        }
        public void setNameWay(String nameWay) {
            this.nameWay = nameWay;
        }
        public List<?> getNameWayList() {
            return nameWayList;
        }
        public void setNameWayList(List<?> nameWayList) {
            this.nameWayList = nameWayList;
        }
        public String getNationalityCode() {
            return nationalityCode;
        }
        public void setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
        }
        public List<?> getNationalityCodeList() {
            return nationalityCodeList;
        }
        public void setNationalityCodeList(List<?> nationalityCodeList) {
            this.nationalityCodeList = nationalityCodeList;
        }
        public String getUpdateReasonCode() {
            return updateReasonCode;
        }
        public void setUpdateReasonCode(String updateReasonCode) {
            this.updateReasonCode = updateReasonCode;
        }
        public List<?> getUpdateReasonCodeList() {
            return updateReasonCodeList;
        }
        public void setUpdateReasonCodeList(List<?> updateReasonCodeList) {
            this.updateReasonCodeList = updateReasonCodeList;
        }
    }

    @Override
    public String toString() {
        return "Rl0x321DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto + ", selectData=" + selectData + ", addData=" + addData + ", queryData=" + queryData
                + ", resutlts=" + resutlts + ", recored=" + recored + ", reason=" + reason + ", data=" + data + ", time=" + time + ", isVerify=" + isVerify + ", commononType=" + commononType + "]";
    }
}
