package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf014sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08264ResultDTO", propOrder = { "dataNo", "rldf014sType" })
@XmlRootElement(name = "Rl08264ResultDTO")
public class Rl08264ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 流水號 **/
    @XmlElement(name = "DataNo")
    @FieldName("流水號")
    private String dataNo;

    /**  **/
    @XmlElement(name = "Rldf014sType")
    @FieldName("資料")
    private Rldf014sType rldf014sType;

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
     * @return the rldf014sType
     */
    public Rldf014sType getRldf014sType() {
        return rldf014sType;
    }

    /**
     * @param rldf014sType
     *            the rldf014sType to set
     */
    public void setRldf014sType(Rldf014sType rldf014sType) {
        this.rldf014sType = rldf014sType;
    }

}
