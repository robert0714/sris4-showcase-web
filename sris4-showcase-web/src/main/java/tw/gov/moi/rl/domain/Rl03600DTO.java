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
@XmlType(name = "rl03600DTO", propOrder = { "querySpecialCode", "rldf030mList" })
@XmlRootElement(name = "Rl03600DTO")
public class Rl03600DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 通報起始地 **/
    @XmlElement(name = "QuerySpecialCode")
    @FieldName("通報起始地")
    private String querySpecialCode;

    /** 特殊註記資料 **/
    @XmlElement(name = "Rldf030mList")
    @FieldName("特殊註記資料")
    private List<Map<String, String>> rldf030mList;

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
     * @return the rldf030mList
     */
    public List<Map<String, String>> getRldf030mList() {
        if (rldf030mList == null) {
            this.setRldf030mList(new ArrayList<Map<String, String>>());
        }
        return rldf030mList;
    }

    /**
     * @param rldf030mList
     *            the rldf030mList to set
     */
    public void setRldf030mList(List<Map<String, String>> rldf030mList) {
        this.rldf030mList = rldf030mList;
    }

}
