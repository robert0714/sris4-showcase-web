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
import tw.gov.moi.domain.Rldf012sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08262DTO", propOrder = { "rl08262Edit", "rl08262List", "rl08262NotData", "rldf012sType","statYear" })
@XmlRootElement(name = "Rl08262DTO")
public class Rl08262DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 新增流水號 **/
    @XmlElement(name = "Rl08262Edit")
    @FieldName("新增流水號")
    private List<Rl08262ResultDTO> rl08262Edit;

    /** 查詢結果清單 **/
    @XmlElement(name = "Rl08262List")
    @FieldName("查詢結果清單")
    private List<Rl08262ResultDTO> rl08262List;

    /** 沒資料清單 **/
    @XmlElement(name = "Rl08262NotData")
    @FieldName("沒資料清單")
    private List<Rl08262ResultDTO> rl08262NotData;

    /** 所選取編輯資料 **/
    @XmlElement(name = "Rldf012sType")
    @FieldName("所選取編輯資料")
    private Rldf012sType rldf012sType;

    /** 統計年份**/
    @XmlElement(name = "StatYear")
    @FieldName("統計年份")
    private String statYear; // 統計年份

    
    /**
     * @return the rl08262Edit
     */
    public List<Rl08262ResultDTO> getRl08262Edit() {
        if (rl08262Edit == null) {
            rl08262Edit = new ArrayList<Rl08262ResultDTO>();
        }
        return rl08262Edit;
    }

    /**
     * @param rl08262Edit
     *            the rl08262Edit to set
     */
    public void setRl08262Edit(List<Rl08262ResultDTO> rl08262Edit) {
        this.rl08262Edit = rl08262Edit;
    }

    /**
     * @return the rl08262List
     */
    public List<Rl08262ResultDTO> getRl08262List() {
        if (rl08262List == null) {
            rl08262List = new ArrayList<Rl08262ResultDTO>();
        }
        return rl08262List;
    }

    /**
     * @param rl08262List
     *            the rl08262List to set
     */
    public void setRl08262List(List<Rl08262ResultDTO> rl08262List) {
        this.rl08262List = rl08262List;
    }

    /**
     * @return the rl08262NotData
     */
    public List<Rl08262ResultDTO> getRl08262NotData() {
        if (rl08262NotData == null) {
            rl08262NotData = new ArrayList<Rl08262ResultDTO>();
        }
        return rl08262NotData;
    }

    /**
     * @param rl08262NotData
     *            the rl08262NotData to set
     */
    public void setRl08262NotData(List<Rl08262ResultDTO> rl08262NotData) {
        this.rl08262NotData = rl08262NotData;
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
