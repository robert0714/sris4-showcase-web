package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rlde808wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl08f20DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f20DTO", propOrder = { "voteCode", "voteDate", "ageDate", "voteClassList", "nowRldf001m",
        "nowRldf004m", "nowRlde808w", "rlde808wList", "transferMap", "smallAreaList", "checkVoteResult", "labelHead" })
@XmlRootElement(name = "Rl08f20DTO")
public class Rl08f20DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "VoteCode", required = true)
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    @XmlElement(name = "VoteDate", required = true)
    @FieldName("投票日期")
    private String voteDate = "";

    @XmlElement(name = "AgeDate", required = true)
    @FieldName("年齡 (含當日)以前出生")
    private String ageDate = "";

    @XmlElement(name = "VoteClassList", required = true)
    @FieldName("投票權子畫面的DTO")
    private List<VoteDTO> voteClassList = new ArrayList<VoteDTO>();

    @XmlElement(name = "NowRldf001m", required = true)
    @FieldName("目前處理的Rldf001m")
    private Rldf001mType nowRldf001m = new Rldf001mType();

    @XmlElement(name = "NowRldf004m", required = true)
    @FieldName("目前處理的Rldf004m")
    private Rldf004mType nowRldf004m = new Rldf004mType();

    @XmlElement(name = "NowRlde808w", required = true)
    @FieldName("目前處理的投票所")
    private Rlde808wType nowRlde808w = new Rlde808wType();

    @XmlElement(name = "Rlde808wList", required = true)
    @FieldName("投票所清單")
    private List<Rlde808wType> rlde808wList = new ArrayList<Rlde808wType>();

    @XmlElement(name = "TransferMap", required = true)
    @FieldName("可供轉錄資料Map")
    private Map<String, Rlde806wType> transferMap = new HashMap<String, Rlde806wType>();

    @XmlElement(name = "SmallAreaList", required = true)
    @FieldName("相同選區劃分清單")
    private List<String> smallAreaList = new ArrayList<String>();

    @XmlElement(name = "CheckVoteResult", required = true)
    @FieldName("確認選舉人資料檔是否有資料")
    private boolean checkVoteResult = true;

    @XmlElement(name = "voteDTO", required = true)
    @FieldName("voteDTO")
    private VoteDTO voteDTO = new VoteDTO();

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl = "";

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(final String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(final String voteDate) {
        this.voteDate = voteDate;
    }

    public String getAgeDate() {
        return ageDate;
    }

    public void setAgeDate(final String ageDate) {
        this.ageDate = ageDate;
    }

    public List<VoteDTO> getVoteClassList() {
        return voteClassList;
    }

    public void setVoteClassList(final List<VoteDTO> voteClassList) {
        this.voteClassList = voteClassList;
    }

    public Rldf001mType getNowRldf001m() {
        return nowRldf001m;
    }

    public void setNowRldf001m(final Rldf001mType nowRldf001m) {
        this.nowRldf001m = nowRldf001m;
    }

    public Rldf004mType getNowRldf004m() {
        return nowRldf004m;
    }

    public void setNowRldf004m(final Rldf004mType nowRldf004m) {
        this.nowRldf004m = nowRldf004m;
    }

    public Rlde808wType getNowRlde808w() {
        return nowRlde808w;
    }

    public void setNowRlde808w(final Rlde808wType nowRlde808w) {
        this.nowRlde808w = nowRlde808w;
    }

    public List<Rlde808wType> getRlde808wList() {
        return rlde808wList;
    }

    public void setRlde808wList(final List<Rlde808wType> rlde808wList) {
        this.rlde808wList = rlde808wList;
    }

    public Map<String, Rlde806wType> getTransferMap() {
        return transferMap;
    }

    public void setTransferMap(final Map<String, Rlde806wType> transferMap) {
        this.transferMap = transferMap;
    }

    public VoteDTO getVoteDTO() {
        return voteDTO;
    }

    public void setVoteDTO(final VoteDTO voteClass) {
        this.voteDTO = voteClass;
    }

    public static class VoteDTO {

        @XmlElement(name = "VoteIdentity", required = true)
        @FieldName("選舉人身分")
        private List<String> voteIdentity;

        @XmlElement(name = "LivingPeriod", required = true)
        @FieldName("居住期間")
        private String livingPeriod;

        @XmlElement(name = "LivingAreaList", required = true)
        @FieldName("居住區域")
        private List<String> livingAreaList;

        @XmlElement(name = "LivingArea", required = true)
        @FieldName("居住區域")
        private String livingArea;

        @XmlElement(name = "CanVoteList", required = true)
        @FieldName("有選舉權人清單")
        private List<Rldf004mType> canVoteList = new ArrayList<Rldf004mType>();

        @XmlElement(name = "NotVoteList", required = true)
        @FieldName("無選舉權人清單")
        private List<Rldf004mType> notVoteList = new ArrayList<Rldf004mType>();

        @XmlElement(name = "LivingAreaYn", required = true)
        @FieldName("原住民是否區分居住區域 (Y/N)")
        private String livingAreaYn;

        @XmlElement(name = "VotePublishDate", required = true)
        @FieldName("選舉公告發布日")
        private String votePublishDate;

        @XmlElement(name = "SmallLivingAreaList", required = true)
        @FieldName("小選區")
        private List<String> smallLivingAreaList;

        @XmlElement(name = "SmallLivingArea", required = true)
        @FieldName("小選區 ")
        private String smallLivingArea;

        @XmlElement(name = "VoteIdentityTune1", required = true)
        @FieldName("選舉人身分調整1")
        private String voteIdentityTune1;

        @XmlElement(name = "VoteIdentityTune2", required = true)
        @FieldName("選舉人身分調整2")
        private String voteIdentityTune2;

        @XmlElement(name = "VoteIdentityTune3", required = true)
        @FieldName("選舉人身分調整3")
        private String voteIdentityTune3;

        @XmlElement(name = "VoteType", required = true)
        @FieldName("選舉組合代碼")
        private String voteType;

        @XmlElement(name = "Sort", required = true)
        @FieldName("選舉組合順序")
        private String sort;

        @XmlElement(name = "SmallLivingAreaListFor8J", required = true)
        @FieldName("小選區for08J00")
        private List<Map<String, List<String>>> smallLivingAreaListFor8J;

        @XmlElement(name = "SmallLivingAreaFor8J", required = true)
        @FieldName("小選區for08J00")
        private List<Map<String, String>> smallLivingAreaFor8J;

        public List<String> getVoteIdentity() {
            return voteIdentity;
        }

        public void setVoteIdentity(final List<String> voteIdentity) {
            this.voteIdentity = voteIdentity;
        }

        public String getLivingPeriod() {
            return livingPeriod;
        }

        public void setLivingPeriod(final String livingPeriod) {
            this.livingPeriod = livingPeriod;
        }

        public List<String> getLivingAreaList() {
            return livingAreaList;
        }

        public void setLivingAreaList(final List<String> livingAreaList) {
            this.livingAreaList = livingAreaList;
        }

        public List<Rldf004mType> getCanVoteList() {
            return canVoteList;
        }

        public void setCanVoteList(final List<Rldf004mType> canVoteList) {
            this.canVoteList = canVoteList;
        }

        public List<Rldf004mType> getNotVoteList() {
            return notVoteList;
        }

        public void setNotVoteList(final List<Rldf004mType> notVoteList) {
            this.notVoteList = notVoteList;
        }

        public String getLivingAreaYn() {
            return livingAreaYn;
        }

        public void setLivingAreaYn(final String livingAreaYn) {
            this.livingAreaYn = livingAreaYn;
        }

        public String getVotePublishDate() {
            return votePublishDate;
        }

        public void setVotePublishDate(final String votePublishDate) {
            this.votePublishDate = votePublishDate;
        }

        public List<String> getSmallLivingAreaList() {
            return smallLivingAreaList;
        }

        public void setSmallLivingAreaList(final List<String> smallLivingAreaList) {
            this.smallLivingAreaList = smallLivingAreaList;
        }

        public String getSmallLivingArea() {
            return smallLivingArea;
        }

        public void setSmallLivingArea(final String smallLivingArea) {
            this.smallLivingArea = smallLivingArea;
        }

        public String getVoteIdentityTune1() {
            return voteIdentityTune1;
        }

        public void setVoteIdentityTune1(final String voteIdentityTune1) {
            this.voteIdentityTune1 = voteIdentityTune1;
        }

        public String getVoteIdentityTune2() {
            return voteIdentityTune2;
        }

        public void setVoteIdentityTune2(final String voteIdentityTune2) {
            this.voteIdentityTune2 = voteIdentityTune2;
        }

        public String getVoteIdentityTune3() {
            return voteIdentityTune3;
        }

        public void setVoteIdentityTune3(final String voteIdentityTune3) {
            this.voteIdentityTune3 = voteIdentityTune3;
        }

        public String getVoteType() {
            return voteType;
        }

        public void setVoteType(final String voteType) {
            this.voteType = voteType;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(final String sort) {
            this.sort = sort;
        }

        public String getLivingArea() {
            return livingArea;
        }

        public void setLivingArea(final String livingArea) {
            this.livingArea = livingArea;
        }

        @Override
        public String toString() {
            return "VoteDTO [voteIdentity=" + voteIdentity + ", livingPeriod=" + livingPeriod + ", livingAreaList="
                    + livingAreaList + ", livingArea=" + livingArea + ", canVoteList=" + canVoteList + ", notVoteList="
                    + notVoteList + ", livingAreaYn=" + livingAreaYn + ", votePublishDate=" + votePublishDate
                    + ", smallLivingAreaList=" + smallLivingAreaList + ", smallLivingArea=" + smallLivingArea
                    + ", voteIdentityTune1=" + voteIdentityTune1 + ", voteIdentityTune2=" + voteIdentityTune2
                    + ", voteIdentityTune3=" + voteIdentityTune3 + ", voteType=" + voteType + ", sort=" + sort
                    + ", smallLivingAreaListFor8J=" + smallLivingAreaListFor8J + ", smallLivingAreaFor8J="
                    + smallLivingAreaFor8J + "]";
        }

        public List<Map<String, List<String>>> getSmallLivingAreaListFor8J() {
            return smallLivingAreaListFor8J;
        }

        public void setSmallLivingAreaListFor8J(List<Map<String, List<String>>> smallLivingAreaListFor8J) {
            this.smallLivingAreaListFor8J = smallLivingAreaListFor8J;
        }

        public List<Map<String, String>> getSmallLivingAreaFor8J() {
            return smallLivingAreaFor8J;
        }

        public void setSmallLivingAreaFor8J(List<Map<String, String>> smallLivingAreaFor8J) {
            this.smallLivingAreaFor8J = smallLivingAreaFor8J;
        }

        // public Map<String, String> getSmallLivingAreaMap() {
        // return smallLivingAreaMap;
        // }
        //
        // public void setSmallLivingAreaMap(Map<String, String>
        // smallLivingAreaMap) {
        // this.smallLivingAreaMap = smallLivingAreaMap;
        // }

    }

    @Override
    public String toString() {
        return "Rl08f20DTO [voteCode=" + voteCode + ", voteDate=" + voteDate + ", ageDate=" + ageDate
                + ", voteClassList=" + voteClassList + ", nowRldf001m=" + nowRldf001m + ", nowRldf004m=" + nowRldf004m
                + ", nowRlde808w=" + nowRlde808w + ", rlde808wList=" + rlde808wList + ", transferMap=" + transferMap
                + ", voteDTO=" + voteDTO + "]";
    }

    public boolean isCheckVoteResult() {
        return checkVoteResult;
    }

    public void setCheckVoteResult(boolean checkVoteResult) {
        this.checkVoteResult = checkVoteResult;
    }

    public List<String> getSmallAreaList() {
        if (smallAreaList == null) {
            smallAreaList = new ArrayList<String>();
        }
        return smallAreaList;
    }

    public void setSmallAreaList(List<String> smallAreaList) {
        this.smallAreaList = smallAreaList;
    }

    public String getLabelHead() {
        return labelHead;
    }

    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

}