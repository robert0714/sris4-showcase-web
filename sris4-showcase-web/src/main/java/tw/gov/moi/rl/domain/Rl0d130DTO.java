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
import tw.gov.moi.domain.Rldf012dType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0d130DTO", propOrder = { "no", "summy", "type", "verified", "processMarkBefor", "processMarkAfter",
        "rldf012dTypeList", "rldf012dLockList", "count" })
@XmlRootElement(name = "Rl0d130DTO")
public class Rl0d130DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 空白證號 */
    @XmlElement(name = "No", required = true)
    @FieldName("空白證號")
    private String no;

    /** 頁面張數 */
    @XmlElement(name = "Summy", required = true)
    @FieldName("頁面張數")
    private String summy;

    /** 型態 */
    @XmlElement(name = "Type", required = true)
    @FieldName("型態")
    private String type;

    /** 前處理註記 */
    @XmlElement(name = "ProcessMarkBefor", required = true)
    @FieldName("前處理註記")
    private String processMarkBefor;

    /** 後處理註記 */
    @XmlElement(name = "ProcessMarkAfter", required = true)
    @FieldName("後處理註記")
    private String processMarkAfter;

    /** Rldf012d list */
    @XmlElement(name = "Rldf012dTypeList")
    @FieldName("Rldf012d list")
    private List<Rldf012dType> rldf012dTypeList = new ArrayList<Rldf012dType>();

    /** 須被Lock的Rldf012d清單 */
    @XmlElement(name = "Rldf012dLockList", required = true)
    @FieldName("須被Lock的Rldf012d清單")
    private List<Rldf012dType> rldf012dLockList;

    /** 筆數 */
    @XmlElement(name = "Count")
    @FieldName("筆數")
    private String count;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getSummy() {
        return summy;
    }

    public void setSummy(String summy) {
        this.summy = summy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcessMarkBefor() {
        return processMarkBefor;
    }

    public void setProcessMarkBefor(String processMarkBefor) {
        this.processMarkBefor = processMarkBefor;
    }

    public String getProcessMarkAfter() {
        return processMarkAfter;
    }

    public void setProcessMarkAfter(String processMarkAfter) {
        this.processMarkAfter = processMarkAfter;
    }

    public List<Rldf012dType> getRldf012dTypeList() {
        return rldf012dTypeList;
    }

    public void setRldf012dTypeList(List<Rldf012dType> rldf012dTypeList) {
        this.rldf012dTypeList = rldf012dTypeList;
    }

    public List<Rldf012dType> getRldf012dLockList() {
        return rldf012dLockList;
    }

    public void setRldf012dLockList(List<Rldf012dType> rldf012dLockList) {
        this.rldf012dLockList = rldf012dLockList;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

}
