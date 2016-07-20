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
import tw.gov.moi.domain.Rldf013sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08263DTO", propOrder = { "rl08263Edit", "rl08263List", "rl08263NotData", "rldf013sType" ,"statYear"})
@XmlRootElement(name = "Rl08263DTO")
public class Rl08263DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 新增流水號 **/
    @XmlElement(name = "Rl08263Edit")
    @FieldName("新增流水號")
    private List<Rl08263ResultDTO> rl08263Edit;

    /** 查詢結果清單 **/
    @XmlElement(name = "Rl08263List")
    @FieldName("查詢結果清單")
    private List<Rl08263ResultDTO> rl08263List;

    /** 沒資料清單 **/
    @XmlElement(name = "Rl08263NotData")
    @FieldName("沒資料清單")
    private List<Rl08263ResultDTO> rl08263NotData;

    /** 所選取編輯資料 **/
    @XmlElement(name = "Rldf013sType")
    @FieldName("所選取編輯資料")
    private Rldf013sType rldf013sType;
    
    /** 統計年份**/
    @XmlElement(name = "StatYear")
    @FieldName("統計年份")
    private String statYear; // 統計年份

    /**
     * @return the rl08263Edit
     */
    public List<Rl08263ResultDTO> getRl08263Edit() {
        if (rl08263Edit == null) {
            rl08263Edit = new ArrayList<Rl08263ResultDTO>();
        }
        return rl08263Edit;
    }

    /**
     * @param rl08263Edit
     *            the rl08263Edit to set
     */
    public void setRl08263Edit(List<Rl08263ResultDTO> rl08263Edit) {
        this.rl08263Edit = rl08263Edit;
    }

    /**
     * @return the rl08263List
     */
    public List<Rl08263ResultDTO> getRl08263List() {
        if (rl08263List == null) {
            rl08263List = new ArrayList<Rl08263ResultDTO>();
        }
        return rl08263List;
    }

    /**
     * @param rl08263List
     *            the rl08263List to set
     */
    public void setRl08263List(List<Rl08263ResultDTO> rl08263List) {
        this.rl08263List = rl08263List;
    }

    /**
     * @return the rl08263NotData
     */
    public List<Rl08263ResultDTO> getRl08263NotData() {
        if (rl08263NotData == null) {
            rl08263NotData = new ArrayList<Rl08263ResultDTO>();
        }
        return rl08263NotData;
    }

    /**
     * @param rl08263NotData
     *            the rl08263NotData to set
     */
    public void setRl08263NotData(List<Rl08263ResultDTO> rl08263NotData) {
        this.rl08263NotData = rl08263NotData;
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

    
    /**
     * @return the statYear
     */
	public String getStatYear()
	{
		return statYear;
	}
	   /**
     * @param statYear
     *            the statYear to set
     */
	public void setStatYear(String statYear)
	{
		this.statYear = statYear;
	}
}
