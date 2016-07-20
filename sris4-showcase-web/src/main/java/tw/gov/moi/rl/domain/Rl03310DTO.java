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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03310DTO", propOrder = { "queryType", "queryPersonId", "querySpecialCode", "queryEndYyymmdd",
        "personName", "rldf008mList" })
@XmlRootElement(name = "Rl03310DTO")
public class Rl03310DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 查詢類別 */
    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType;

    /** 當事人統編 **/
    @XmlElement(name = "QueryPersonId")
    @FieldName("當事人統編")
    private String queryPersonId;

    /** 特殊註記別 **/
    @XmlElement(name = "QuerySpecialCode")
    @FieldName("特殊註記別")
    private String querySpecialCode;

    /** 列管終止日期 **/
    @XmlElement(name = "QueryEndYyymmdd")
    @FieldName("列管終止日期")
    private String queryEndYyymmdd;

    /** 姓名 **/
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 特殊註記資料 **/
    @XmlElement(name = "DataList")
    @FieldName("特殊註記資料")
    private List<Rl03310Result> dataList;

    /**
     * @return the queryType
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * @param queryType
     *            the queryType to set
     */
    public void setQueryType(String queryType) {
        this.queryType = queryType;
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
     * @return the querySpecialCode
     */
    public String getQuerySpecialCode() {
        return querySpecialCode;
    }

    /**
     * @param querySpecialCode
     *            the querySpecialCode to set
     */
    public void setQuerySpecialCode(String querySpecialCode) {
        this.querySpecialCode = querySpecialCode;
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
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName
     *            the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return the dataList
     */
    public List<Rl03310Result> getDataList() {
        if (dataList == null) {
            this.setDataList(new ArrayList<Rl03310Result>());
        }
        return dataList;
    }

    /**
     * @param dataList
     *            the dataList to set
     */
    public void setDataList(List<Rl03310Result> dataList) {
        this.dataList = dataList;
    }

}
