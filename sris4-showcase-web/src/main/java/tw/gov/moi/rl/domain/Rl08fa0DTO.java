package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08fa0DTO", propOrder = { "voteCode", "voteDate", "regionList", "regionCode", "village", "adMark",
        "includeList", "status", "statusCheck", "delRegionCode", "rlde804wData", "labelHead" })
@XmlRootElement(name = "Rl08fa0DTO")
public class Rl08fa0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 選舉組合代碼 */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 相同選區劃分清單 */
    @XmlElement(name = "RegionList")
    @FieldName("相同選區劃分清單")
    private List<Map<String, String>> regionList;

    /** 相同選區劃分代碼(名稱) */
    @XmlElement(name = "RegionCode")
    @FieldName("相同選區劃分代碼(名稱)")
    private String regionCode;

    /** 相同選區劃分代碼(名稱) */
    @XmlElement(name = "regionCode01")
    @FieldName("相同選區劃分代碼(名稱)")
    private String regionCode01;

    /** 村里 **/
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 村里 **/
    @XmlElement(name = "Village01")
    @FieldName("村里")
    private String village01;

    /** 增減註記 **/
    @XmlElement(name = "AdMark")
    @FieldName("增減註記")
    private String adMark;

    /** 內含的縣市/鄉鎮市區清單 */
    @XmlElement(name = "IncludeList")
    @FieldName("內含的縣市/鄉鎮市區清單")
    private List<Rl08fa0ResultDTO> includeList;

    /** 內含的縣市/鄉鎮市區清單 */
    @XmlElement(name = "includeList01")
    @FieldName("內含的縣市/鄉鎮市區清單")
    private List<Rl08fa0ResultDTO> includeList01;

    /** 作業狀態 **/
    @XmlElement(name = "Status", required = true)
    @FieldName("作業狀態")
    private String status;

    /** 作業狀態檢核 **/
    @XmlElement(name = "StatusCheck", required = true)
    @FieldName("作業狀態檢核")
    private String statusCheck;

    /** 刪除相同選區劃分代碼(名稱) */
    @XmlElement(name = "DelRegionCode")
    @FieldName("刪除相同選區劃分代碼(名稱)")
    private String delRegionCode;

    /** rlde804w資料是否存在 */
    @XmlElement(name = "Rlde804wData")
    @FieldName("rlde804w資料是否存在")
    private boolean rlde804wData;

    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead;

    @XmlElement(name = "Addition")
    @FieldName("增加動作")
    private String addition;

    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

    @XmlElement(name = "ErrorCodeMessage")
    @FieldName("錯誤訊息")
    private String errorCodeMessage;

    /**
     * @return the voteCode
     */
    public String getVoteCode() {
        return voteCode;
    }

    /**
     * @param voteCode
     *            the voteCode to set
     */
    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    /**
     * @return the voteDate
     */
    public String getVoteDate() {
        return voteDate;
    }

    /**
     * @param voteDate
     *            the voteDate to set
     */
    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    /**
     * @return the regionList
     */
    public List<Map<String, String>> getRegionList() {
        if (this.regionList == null) {
            this.regionList = new ArrayList<Map<String, String>>();
        }
        return regionList;
    }

    /**
     * @param regionList
     *            the regionList to set
     */
    public void setRegionList(List<Map<String, String>> regionList) {
        this.regionList = regionList;
    }

    /**
     * @return the regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * @param regionCode
     *            the regionCode to set
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    /**
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * @param village
     *            the village to set
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * @return the adMark
     */
    public String getAdMark() {
        return adMark;
    }

    /**
     * @param adMark
     *            the adMark to set
     */
    public void setAdMark(String adMark) {
        this.adMark = adMark;
    }

    /**
     * @return the includeList
     */
    public List<Rl08fa0ResultDTO> getIncludeList() {
        if (this.includeList == null) {
            this.includeList = new ArrayList<Rl08fa0ResultDTO>();
        }
        return includeList;
    }

    /**
     * @param includeList
     *            the includeList to set
     */
    public void setIncludeList(List<Rl08fa0ResultDTO> includeList) {
        this.includeList = includeList;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the statusCheck
     */
    public String getStatusCheck() {
        return statusCheck;
    }

    /**
     * @param statusCheck
     *            the statusCheck to set
     */
    public void setStatusCheck(String statusCheck) {
        this.statusCheck = statusCheck;
    }

    /**
     * @return the delRegionCode
     */
    public String getDelRegionCode() {
        return delRegionCode;
    }

    /**
     * @param delRegionCode
     *            the delRegionCode to set
     */
    public void setDelRegionCode(String delRegionCode) {
        this.delRegionCode = delRegionCode;
    }

    /**
     * @return the rlde804wData
     */
    public boolean isRlde804wData() {
        return rlde804wData;
    }

    /**
     * @param rlde804wData
     *            the rlde804wData to set
     */
    public void setRlde804wData(boolean rlde804wData) {
        this.rlde804wData = rlde804wData;
    }

    /**
     * @return the labelHead
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * @param labelHead
     *            the labelHead to set
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    public String getRegionCode01() {
        return regionCode01;
    }

    public void setRegionCode01(String regionCode01) {
        this.regionCode01 = regionCode01;
    }

    public List<Rl08fa0ResultDTO> getIncludeList01() {
        if (this.includeList01 == null) {
            this.includeList01 = new ArrayList<Rl08fa0ResultDTO>();
        }
        return includeList01;
    }

    public void setIncludeList01(List<Rl08fa0ResultDTO> includeList01) {
        this.includeList01 = includeList01;
    }

    public String getVillage01() {
        return village01;
    }

    public void setVillage01(String village01) {
        this.village01 = village01;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCodeMessage() {
        return errorCodeMessage;
    }

    public void setErrorCodeMessage(String errorCodeMessage) {
        this.errorCodeMessage = errorCodeMessage;
    }

}
