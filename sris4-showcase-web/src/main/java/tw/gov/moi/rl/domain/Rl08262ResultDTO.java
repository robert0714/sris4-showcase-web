package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf012sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08262ResultDTO", propOrder = { "dataNo", "rldf012sType" })
@XmlRootElement(name = "Rl08262ResultDTO")
public class Rl08262ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 流水號 **/
    @XmlElement(name = "DataNo")
    @FieldName("流水號")
    private String dataNo;

    /** 資料 **/
    @XmlElement(name = "Rldf012sType")
    @FieldName("資料")
    private Rldf012sType rldf012sType;

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
     * @return the rldf012sType
     */
    public Rldf012sType getRldf012sType() {
        return rldf012sType;
    }

    /**
     * @param rldf012sType
     *            the rldf012sType to set
     */
    public void setRldf012sType(Rldf012sType rldf012sType) {
        this.rldf012sType = rldf012sType;
    }

}
