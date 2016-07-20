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
import tw.gov.moi.domain.Rldf021mType;
import tw.gov.moi.domain.Rldfs102Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x321DTO", propOrder = { "MainDTO", "EditResult", "SelectData", "AddData", "Resutlts", "Recored", "Reason" })
@XmlRootElement(name = "Rl0x321DTO")
public class Rl0x402DTO implements Serializable {

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
    private Rldfs102Type recored = new Rldfs102Type();

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

    public Rldfs102Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs102Type recored) {
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

    public static class Rl0x402ChoiceBtn {
        //<!-- 死亡地點性質代碼 -->
        private String deathPlaceCode;
        private List<?> deathPlaceCodeList;
        //<!-- 死亡地點（國別） -->
        private String deathCountry;
        private List<?> deathCountryList;
        //<!-- 死亡日期確定方式 -->
        private String deathWay;
        private List<?> deathWayList;
        
        //<!-- 登記項目 -->
        private String deathItem;
        private List<?> deathItemList;
        
        //<!-- 配偶作業點代碼 -->
        private String spSiteId;
        private List<?> spSiteIdList;
        
        //<!-- 婚姻狀況代碼 -->
        private String marriageCode;
        private List<?> marriageCodeList;
        
        //<!-- 死亡者外籍者（原屬）國籍代碼 -->
        private String nationalityCode;
        private List<?> nationalityCodeList;
        
        //<!-- 教育程度註記 -->
        private String educationMark;
        private List<?> educationMarkList;
        
        //<!-- 配偶教育程度註記 -->
        private String spEducationMark;
        private List<?> spEducationMarkList;
        
        public String getDeathPlaceCode() {
            return deathPlaceCode;
        }
        public void setDeathPlaceCode(String deathPlaceCode) {
            this.deathPlaceCode = deathPlaceCode;
        }
        public List<?> getDeathPlaceCodeList() {
            return deathPlaceCodeList;
        }
        public void setDeathPlaceCodeList(List<?> deathPlaceCodeList) {
            this.deathPlaceCodeList = deathPlaceCodeList;
        }
        public String getDeathCountry() {
            return deathCountry;
        }
        public void setDeathCountry(String deathCountry) {
            this.deathCountry = deathCountry;
        }
        public List<?> getDeathCountryList() {
            return deathCountryList;
        }
        public void setDeathCountryList(List<?> deathCountryList) {
            this.deathCountryList = deathCountryList;
        }
        public String getDeathWay() {
            return deathWay;
        }
        public void setDeathWay(String deathWay) {
            this.deathWay = deathWay;
        }
        public List<?> getDeathWayList() {
            return deathWayList;
        }
        public void setDeathWayList(List<?> deathWayList) {
            this.deathWayList = deathWayList;
        }
        public String getDeathItem() {
            return deathItem;
        }
        public void setDeathItem(String deathItem) {
            this.deathItem = deathItem;
        }
        public List<?> getDeathItemList() {
            return deathItemList;
        }
        public void setDeathItemList(List<?> deathItemList) {
            this.deathItemList = deathItemList;
        }
        public String getSpSiteId() {
            return spSiteId;
        }
        public void setSpSiteId(String spSiteId) {
            this.spSiteId = spSiteId;
        }
        public List<?> getSpSiteIdList() {
            return spSiteIdList;
        }
        public void setSpSiteIdList(List<?> spSiteIdList) {
            this.spSiteIdList = spSiteIdList;
        }
        public String getMarriageCode() {
            return marriageCode;
        }
        public void setMarriageCode(String marriageCode) {
            this.marriageCode = marriageCode;
        }
        public List<?> getMarriageCodeList() {
            return marriageCodeList;
        }
        public void setMarriageCodeList(List<?> marriageCodeList) {
            this.marriageCodeList = marriageCodeList;
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
        public String getSpEducationMark() {
            return spEducationMark;
        }
        public void setSpEducationMark(String spEducationMark) {
            this.spEducationMark = spEducationMark;
        }
        public List<?> getSpEducationMarkList() {
            return spEducationMarkList;
        }
        public void setSpEducationMarkList(List<?> spEducationMarkList) {
            this.spEducationMarkList = spEducationMarkList;
        }
    }

    /**
     * 死亡者外籍者（原屬）國籍代碼  -> 按鈕   是否顯示
     */
    public boolean isShowNationalityCodeBtn() {
        for(Rl0x001DTOResult edit : this.getEditResult()){
            if("personId".equals(StringUtils.trim(edit.getType().getColumnCode()))){
                String personId = StringUtils.trimToEmpty(edit.getField1());
                if(personId.matches("^.{2}(6|7|8|9).*$")){
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Rl0x321DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto + ", selectData=" + selectData + ", addData=" + addData + ", queryData=" + queryData
                + ", resutlts=" + resutlts + ", recored=" + recored + ", reason=" + reason + ", data=" + data + ", time=" + time + ", isVerify=" + isVerify + ", commononType=" + commononType + "]";
    }
}
