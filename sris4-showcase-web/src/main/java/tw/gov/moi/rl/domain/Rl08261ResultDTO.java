package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf011sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08261ResultDTO", propOrder = { "dataNo", "rldf011sType" })
@XmlRootElement(name = "Rl08261ResultDTO")
public class Rl08261ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 流水號 **/
    @XmlElement(name = "DataNo")
    @FieldName("流水號")
    private String dataNo;

    /** 資料 **/
    @XmlElement(name = "Rldf011sType")
    @FieldName("資料")
    private Rldf011sType rldf011sType;

    /**
     * @return the dataNo
     */
    public String getDataNo() {
        return dataNo;
    }

    /**
     * @param dataNo
     *            the dataNo to set
     */
    public void setDataNo(String dataNo) {
        this.dataNo = dataNo;
    }

    /**
     * @return the rldf011sType
     */
    public Rldf011sType getRldf011sType() {
        return rldf011sType;
    }

    /**
     * @param rldf011sType
     *            the rldf011sType to set
     */
    public void setRldf011sType(Rldf011sType rldf011sType) {
        this.rldf011sType = rldf011sType;
    }

}
