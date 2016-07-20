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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * 記事欄位化資料查詢與結果DTO
 * 
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetRldfyDataDTO", propOrder = { "personIds", "siteId", "reusltDataList", "queryHData",
        "removeYyymmdd", "removeTime" })
@XmlRootElement(name = "RlGetRldfyDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetRldfyDataDTO implements Serializable {

    private static final long serialVersionUID = -5656277621449846115L;

    /** 統號清單 */
    @XmlElement(name = "PersonIds", required = false)
    @FieldName("統號清單")
    private List<String> personIds;

    /** 記事欄位化的查詢條件List */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId;

    /** 記事欄位化的查詢結果List */
    @XmlElement(name = "ReusltDataList", required = false)
    @FieldName("查詢結果")
    private List<RlResultRldfyDataDTO> reusltDataList = new ArrayList<RlResultRldfyDataDTO>(20);

    /** 是否查詢除戶檔 */
    @XmlElement(name = "QueryHData", required = false)
    @FieldName("是否查詢除戶檔")
    private boolean queryHData;

    /** 除戶日期 */
    @XmlElement(name = "RemoveYyymmdd", required = false)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶日期 */
    @XmlElement(name = "RemoveTime", required = false)
    @FieldName("除戶時間")
    private String removeTime;

    public RlGetRldfyDataDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public List<String> getPersonIds() {
        return personIds;
    }

    public void setPersonIds(List<String> personIds) {
        this.personIds = personIds;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<RlResultRldfyDataDTO> getReusltDataList() {
        return reusltDataList;
    }

    public void setReusltDataList(List<RlResultRldfyDataDTO> reusltDataList) {
        this.reusltDataList = reusltDataList;
    }

    public boolean isQueryHData() {
        return queryHData;
    }

    public void setQueryHData(boolean queryHData) {
        this.queryHData = queryHData;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

}
