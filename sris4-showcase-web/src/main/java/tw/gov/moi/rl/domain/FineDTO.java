package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfd009Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FineDTO", propOrder = { "fineName", "finePrice", "fineId" })
@XmlRootElement(name = "FineDTO")
public class FineDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5896984733088428530L;

    /** 罰鍰名稱 */
    @XmlElement(name = "FineName")
    @FieldName("罰鍰名稱")
    private String fineName;
    

    /** 法令依據條文 */
    @XmlElement(name = "LawList")
    @FieldName("法令依據條文")
    List<Rldfd009Type> lawList  = new ArrayList<Rldfd009Type>();;

    /** 金額 */
    @XmlElement(name = "FinePrice")
    @FieldName("金額")
    private String finePrice = "";

    /** 罰鍰書類別 */
    @XmlElement(name = "FineId")
    @FieldName("罰鍰書類別")
    private String fineId;

	public String getFineName() {
		return fineName;
	}

	public void setFineName(String fineName) {
		this.fineName = fineName;
	}

	public List<Rldfd009Type> getLawList() {
		return lawList;
	}

	public void setLawList(List<Rldfd009Type> lawList) {
		this.lawList = lawList;
	}

	public String getFinePrice() {
		return finePrice;
	}

	public void setFinePrice(String finePrice) {
		this.finePrice = finePrice;
	}

	public String getFineId() {
		return fineId;
	}

	public void setFineId(String fineId) {
		this.fineId = fineId;
	}

	
    

}
