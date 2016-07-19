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
import tw.gov.moi.domain.Rldfs103Type;
import tw.gov.moi.domain.Rldft003Type;

/**
 * 
 * @author Peter Yu
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x403DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType" })
@XmlRootElement(name = "Rl0x403DTO")
public class Rl0x403DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MainDTO")
    @FieldName("主檔")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    // 來源資料
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Object selectData = new Object();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Object> resutlts = new ArrayList<Object>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs103Type recored = new Rldfs103Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldft003Type commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Object lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Object unLockData = null;

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("(作業點代碼")
    private String siteId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteLabel", required = true)
    @FieldName("(作業點代碼")
    private String siteLabel;

    public static class Rl0x403ChoiceBtn {

        // <!-- 婚姻狀況代碼 -->
        private String marriageCode;
        private List<?> marriageCodeList;

        // <!-- 結婚地點代碼 -->
        private String mrgPlaceCode;
        private List<?> mrgPlaceCodeList;

        // <!-- 婚姻類別代碼 -->
        private String mrgTypeCode;
        private List<?> mrgTypeCodeList;

        // <!-- 教育程度註記 -->
        private String educationMark;
        private List<?> educationMarkList;

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

        public String getMrgPlaceCode() {
            return mrgPlaceCode;
        }

        public void setMrgPlaceCode(String mrgPlaceCode) {
            this.mrgPlaceCode = mrgPlaceCode;
        }

        public List<?> getMrgPlaceCodeList() {
            return mrgPlaceCodeList;
        }

        public void setMrgPlaceCodeList(List<?> mrgPlaceCodeList) {
            this.mrgPlaceCodeList = mrgPlaceCodeList;
        }

        public String getMrgTypeCode() {
            return mrgTypeCode;
        }

        public void setMrgTypeCode(String mrgTypeCode) {
            this.mrgTypeCode = mrgTypeCode;
        }

        public List<?> getMrgTypeCodeList() {
            return mrgTypeCodeList;
        }

        public void setMrgTypeCodeList(List<?> mrgTypeCodeList) {
            this.mrgTypeCodeList = mrgTypeCodeList;
        }

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

    public Object getSelectData() {
        return selectData;
    }

    public void setSelectData(Object selectData) {
        this.selectData = selectData;
    }

    public List<Object> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Object> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldft003Type getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldft003Type commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs103Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs103Type recored) {
        this.recored = recored;
    }

    @Override
    public String toString() {
        return "Rl0x403DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", reason=" + reason + ", isVerify="
                + isVerify + ", commononType=" + commononType + "]";
    }

    // public String getGender() {
    // return gender;
    // }
    //
    // public void setGender(String gender) {
    // this.gender = gender;
    // }
    //
    // public String getIdType() {
    // return idType;
    // }
    //
    // public void setIdType(String idType) {
    // this.idType = idType;
    // }
    //
    // public String getVillage() {
    // return village;
    // }
    //
    // public void setVillage(String village) {
    // this.village = village;
    // }

    public Object getLockData() {
        return lockData;
    }

    public void setLockData(Object lockData) {
        this.lockData = lockData;
    }

    public Object getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Object unLockData) {
        this.unLockData = unLockData;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getSiteLabel() {
        return siteLabel;
    }

    public void setSiteLabel(String siteLabel) {
        this.siteLabel = siteLabel;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

}
