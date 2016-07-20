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
import tw.gov.moi.domain.Rldf009sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03720DTO", propOrder = { "queryStartSiteId", "queryStartYyymmdd", "queryEndYyymmdd",
        "queryApplyCode", "queryPersonId", "queryPersonName", "rldf009sList" })
@XmlRootElement(name = "Rl03720DTO")
public class Rl03720DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 通報起始地 **/
    @XmlElement(name = "QueryStartSiteId")
    @FieldName("通報起始地")
    private String queryStartSiteId;

    /** 當事人統編 **/
    @XmlElement(name = "QueryStartYyymmdd")
    @FieldName("當事人統編")
    private String queryStartYyymmdd;

    /** 特殊註記別 **/
    @XmlElement(name = "QueryEndYyymmdd")
    @FieldName("特殊註記別")
    private String queryEndYyymmdd;

    /** 列管終止日期 **/
    @XmlElement(name = "QueryApplyCode")
    @FieldName("列管終止日期")
    private String queryApplyCode;

    /** 查詢統號 **/
    @XmlElement(name = "QueryPersonId")
    @FieldName("查詢統號")
    private String queryPersonId;

    /** 查詢姓名 **/
    @XmlElement(name = "qQueryPersonName")
    @FieldName("查詢姓名")
    private String queryPersonName;

    /** 特殊註記資料 **/
    @XmlElement(name = "Rldf009sList")
    @FieldName("特殊註記資料")
    private List<Rldf009sType> rldf009sList;

    /**
     * @return the queryStartSiteId
     */
    public String getQueryStartSiteId() {
        return queryStartSiteId;
    }

    /**
     * @param queryStartSiteId
     *            the queryStartSiteId to set
     */
    public void setQueryStartSiteId(String queryStartSiteId) {
        this.queryStartSiteId = queryStartSiteId;
    }

    /**
     * @return the queryStartYyymmdd
     */
    public String getQueryStartYyymmdd() {
        return queryStartYyymmdd;
    }

    /**
     * @param queryStartYyymmdd
     *            the queryStartYyymmdd to set
     */
    public void setQueryStartYyymmdd(String queryStartYyymmdd) {
        this.queryStartYyymmdd = queryStartYyymmdd;
    }

    /**
     * @return the queryEndYyymmdd
     */
    public String getQueryEndYyymmdd() {
        return queryEndYyymmdd;
    }

    /**
     * @param queryEndYyymmdd
     *            the queryEndYyymmdd to set
     */
    public void setQueryEndYyymmdd(String queryEndYyymmdd) {
        this.queryEndYyymmdd = queryEndYyymmdd;
    }

    /**
     * @return the queryApplyCode
     */
    public String getQueryApplyCode() {
        return queryApplyCode;
    }

    /**
     * @param queryApplyCode
     *            the queryApplyCode to set
     */
    public void setQueryApplyCode(String queryApplyCode) {
        this.queryApplyCode = queryApplyCode;
    }

    /**
     * @return the queryPersonId
     */
    public String getQueryPersonId() {
        return queryPersonId;
    }

    /**
     * @param queryPersonId
     *            the queryPersonId to set
     */
    public void setQueryPersonId(String queryPersonId) {
        this.queryPersonId = queryPersonId;
    }

    /**
     * @return the queryPersonName
     */
    public String getQueryPersonName() {
        return queryPersonName;
    }

    /**
     * @param queryPersonName
     *            the queryPersonName to set
     */
    public void setQueryPersonName(String queryPersonName) {
        this.queryPersonName = queryPersonName;
    }

    /**
     * @return the rldf009sList
     */
    public List<Rldf009sType> getRldf009sList() {
        if (rldf009sList == null) {
            this.setRldf009sList(new ArrayList<Rldf009sType>());
        }
        return rldf009sList;
    }

    /**
     * @param rldf009sList
     *            the rldf009sList to set
     */
    public void setRldf009sList(List<Rldf009sType> rldf009sList) {
        this.rldf009sList = rldf009sList;
    }

}
