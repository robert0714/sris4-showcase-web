package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde800wType;
import tw.gov.moi.domain.Rlde806wType;

/**
 * 選舉人名冊報表 DTO
 * 
 * @author Weiren.Jheng
 * 
 */
public class Rlrp08f33DTO implements Serializable {

    private static final long serialVersionUID = 4292524604961149434L;

    /** 投票所. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 選舉組合作用檔. */
    @XmlElement(name = "Rlde800wType")
    @FieldName("選舉組合作用檔")
    private Rlde800wType rlde800wType;

    /** 選舉人資料檔. */
    @XmlElement(name = "DataByVillage")
    @FieldName("選舉人資料檔")
    private Map<String, List<Rlde806wType>> dataByVillage;

    /** 重印選舉人資料檔. */
    @XmlElement(name = "DataBySubPage")
    @FieldName("重印選舉人資料檔")
    private Map<ReprintInfo, List<Rlde806wType>> dataBySubPage;

    /** 選舉權（二）選舉人身分名稱. */
    @XmlElement(name = "ActiveVote2Living")
    @FieldName("選舉權（二）選舉人身分名稱")
    private List<String> activeVote2Living;

    /** 選舉權（三）選舉人身分名稱. */
    @XmlElement(name = "ActiveVote3Living")
    @FieldName("選舉權（三）選舉人身分名稱")
    private List<String> activeVote3Living;

    /** 選舉名冊種類. */
    @XmlElement(name = "SubTitle")
    @FieldName("選舉名冊種類")
    private String subTitle = "";

    /** 作業名稱. */
    @XmlElement(name = "TaskCode")
    @FieldName("作業名稱")
    private String taskCode = "";

    /** 作業點名稱. */
    @XmlElement(name = "SiteName")
    @FieldName("作業點名稱")
    private String siteName = "";

    /** 錯誤訊息清單. */
    @XmlElement(name = "ErrMsgList")
    @FieldName("錯誤訊息清單")
    private List<String> errMsgList = new ArrayList<String>();

    public Rlde800wType getRlde800wType() {
        return rlde800wType;
    }

    public void setRlde800wType(Rlde800wType rlde800wType) {
        this.rlde800wType = rlde800wType;
    }

    public Map<String, List<Rlde806wType>> getDataByVillage() {
        return dataByVillage;
    }

    public void setDataByVillage(Map<String, List<Rlde806wType>> dataByVillage) {
        this.dataByVillage = dataByVillage;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public List<String> getActiveVote2Living() {
        return activeVote2Living;
    }

    public void setActiveVote2Living(List<String> activeVote2Living) {
        this.activeVote2Living = activeVote2Living;
    }

    public List<String> getActiveVote3Living() {
        return activeVote3Living;
    }

    public void setActiveVote3Living(List<String> activeVote3Living) {
        this.activeVote3Living = activeVote3Living;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public Map<ReprintInfo, List<Rlde806wType>> getDataBySubPage() {
        return dataBySubPage;
    }

    public void setDataBySubPage(Map<ReprintInfo, List<Rlde806wType>> dataBySubPage) {
        this.dataBySubPage = dataBySubPage;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public List<String> getErrMsgList() {
        return errMsgList;
    }

    public void setErrMsgList(List<String> errMsgList) {
        this.errMsgList = errMsgList;
    }
}
