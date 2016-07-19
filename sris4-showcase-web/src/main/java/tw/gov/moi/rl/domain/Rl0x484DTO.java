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
import tw.gov.moi.domain.Rldfs184Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x321DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored", "Reason" })
@XmlRootElement(name = "Rl0x321DTO")
public class Rl0x484DTO implements Serializable {

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
    private Rldfs184Type recored = new Rldfs184Type();

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

    public Rldfs184Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs184Type recored) {
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

    public static class Rl0x484ChoiceBtn {
        private String afterItem;   //變更項目
        private List<?> afterItemList;   //變更項目
        private String educationMark;   //教育程度註記
        private List<?> educationMarkList;   //教育程度註記
        private String lawCode; //引用法條代碼
        private String lawCodeLabel; //引用法條代碼 - 中文
        private List<?> lawCodeList; //引用法條代碼
        private String nameChangeNum;   //改名次數
        private List<?> nameChangeNumList;   //改名次數
        private String nameChangeType;  //姓名變更類別
        private List<?> nameChangeTypeList;  //姓名變更類別
        private String nationalityCode; //當事人外籍者（原屬）國籍代碼
        private List<?> nationalityCodeList; //當事人外籍者（原屬）國籍代碼
        private String nochangeReasonCode;  //不變更原因代碼
        private List<?> nochangeReasonCodeList;  //不變更原因代碼
        private String orgNameType; //原從姓類別
        private List<?> orgNameTypeList; //原從姓類別
        private String orgLastName;//原從姓
        private List<?> orgLastNameList;//原從姓
        private String orgNameWay;  //原命名方式
        private List<?> orgNameWayList;  //原命名方式
        private String orgNameWayLabel; //原命名方式 - 使用代碼
        private String updateReasonCode;    //變更原因代碼
        private List<?> updateReasonCodeList;    //變更原因代碼
        private String updateReasonCodeLabel;//變更原因代碼 - 使用代碼
        
        private boolean show_nameChangeType;//姓名變更類別
        private boolean show_nameChangeNum;//改名次數
        private boolean show_orgNameType; //原從姓類別
        private boolean show_orgLastName; //原從姓
        private boolean show_orgNameWay; //原命名方式
        
        public String getOrgNameWayLabel() {
            return orgNameWayLabel;
        }
        public void setOrgNameWayLabel(String orgNameWayLabel) {
            this.orgNameWayLabel = orgNameWayLabel;
        }
        public String getUpdateReasonCodeLabel() {
            return updateReasonCodeLabel;
        }
        public void setUpdateReasonCodeLabel(String updateReasonCodeLabel) {
            this.updateReasonCodeLabel = updateReasonCodeLabel;
        }
        public String getAfterItem() {
            return afterItem;
        }
        public void setAfterItem(String afterItem) {
            this.afterItem = afterItem;
        }
        public List<?> getAfterItemList() {
            return afterItemList;
        }
        public void setAfterItemList(List<?> afterItemList) {
            this.afterItemList = afterItemList;
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
        public String getNameChangeNum() {
            return nameChangeNum;
        }
        public void setNameChangeNum(String nameChangeNum) {
            this.nameChangeNum = nameChangeNum;
        }
        public List<?> getNameChangeNumList() {
            return nameChangeNumList;
        }
        public void setNameChangeNumList(List<?> nameChangeNumList) {
            this.nameChangeNumList = nameChangeNumList;
        }
        public String getNameChangeType() {
            return nameChangeType;
        }
        public void setNameChangeType(String nameChangeType) {
            this.nameChangeType = nameChangeType;
        }
        public List<?> getNameChangeTypeList() {
            return nameChangeTypeList;
        }
        public void setNameChangeTypeList(List<?> nameChangeTypeList) {
            this.nameChangeTypeList = nameChangeTypeList;
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
        public String getNochangeReasonCode() {
            return nochangeReasonCode;
        }
        public void setNochangeReasonCode(String nochangeReasonCode) {
            this.nochangeReasonCode = nochangeReasonCode;
        }
        public List<?> getNochangeReasonCodeList() {
            return nochangeReasonCodeList;
        }
        public void setNochangeReasonCodeList(List<?> nochangeReasonCodeList) {
            this.nochangeReasonCodeList = nochangeReasonCodeList;
        }
        public String getOrgNameType() {
            return orgNameType;
        }
        public void setOrgNameType(String orgNameType) {
            this.orgNameType = orgNameType;
        }
        public List<?> getOrgNameTypeList() {
            return orgNameTypeList;
        }
        public void setOrgNameTypeList(List<?> orgNameTypeList) {
            this.orgNameTypeList = orgNameTypeList;
        }
        public String getOrgNameWay() {
            return orgNameWay;
        }
        public void setOrgNameWay(String orgNameWay) {
            this.orgNameWay = orgNameWay;
        }
        public List<?> getOrgNameWayList() {
            return orgNameWayList;
        }
        public void setOrgNameWayList(List<?> orgNameWayList) {
            this.orgNameWayList = orgNameWayList;
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
        public String getOrgLastName() {
            return orgLastName;
        }
        public void setOrgLastName(String orgLastName) {
            this.orgLastName = orgLastName;
        }
        public List<?> getOrgLastNameList() {
            return orgLastNameList;
        }
        public void setOrgLastNameList(List<?> orgLastNameList) {
            this.orgLastNameList = orgLastNameList;
        }
        public boolean isShow_nameChangeType() {
            return show_nameChangeType;
        }
        public void setShow_nameChangeType(boolean show_nameChangeType) {
            this.show_nameChangeType = show_nameChangeType;
        }
        public boolean isShow_nameChangeNum() {
            return show_nameChangeNum;
        }
        public void setShow_nameChangeNum(boolean show_nameChangeNum) {
            this.show_nameChangeNum = show_nameChangeNum;
        }
        public boolean isShow_orgNameType() {
            return show_orgNameType;
        }
        public void setShow_orgNameType(boolean show_orgNameType) {
            this.show_orgNameType = show_orgNameType;
        }
        public boolean isShow_orgLastName() {
            return show_orgLastName;
        }
        public void setShow_orgLastName(boolean show_orgLastName) {
            this.show_orgLastName = show_orgLastName;
        }
        public boolean isShow_orgNameWay() {
            return show_orgNameWay;
        }
        public void setShow_orgNameWay(boolean show_orgNameWay) {
            this.show_orgNameWay = show_orgNameWay;
        }
        public String getLawCodeLabel() {
            return lawCodeLabel;
        }
        public void setLawCodeLabel(String lawCodeLabel) {
            this.lawCodeLabel = lawCodeLabel;
        }
    }

    @Override
    public String toString() {
        return "Rl0x321DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto + ", selectData=" + selectData + ", addData=" + addData + ", queryData=" + queryData
                + ", resutlts=" + resutlts + ", recored=" + recored + ", reason=" + reason + ", data=" + data + ", time=" + time + ", isVerify=" + isVerify + ", commononType=" + commononType + "]";
    }
}
