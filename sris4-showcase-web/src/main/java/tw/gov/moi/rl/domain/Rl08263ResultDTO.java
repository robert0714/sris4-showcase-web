package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf013sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08263ResultDTO", propOrder = { "dataNo", "rldf013sType" })
@XmlRootElement(name = "Rl08263ResultDTO")
public class Rl08263ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 流水號 **/
    @XmlElement(name = "DataNo")
    @FieldName("流水號")
    private String dataNo;

    /** 資料 **/
    @XmlElement(name = "Rldf013sType")
    @FieldName("資料")
    private Rldf013sType rldf013sType;

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
     * @return the rldf013sType
     */
    public Rldf013sType getRldf013sType() {
        return rldf013sType;
    }

    /**
     * @param rldf013sType
     *            the rldf013sType to set
     */
    public void setRldf013sType(Rldf013sType rldf013sType) {
        this.rldf013sType = rldf013sType;
    }

}
