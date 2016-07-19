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
import tw.gov.moi.domain.Rldf014sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08264DTO", propOrder = { "rl08264Edit", "rl08264List", "rl08264NotData", "rldf014sType" })
@XmlRootElement(name = "Rl08264DTO")
public class Rl08264DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 新增流水號 **/
    @XmlElement(name = "Rl08264Edit")
    @FieldName("新增流水號")
    private List<Rl08264ResultDTO> rl08264Edit;

    /** 查詢結果清單 **/
    @XmlElement(name = "Rl08264List")
    @FieldName("查詢結果清單")
    private List<Rl08264ResultDTO> rl08264List;

    /** 沒資料清單 **/
    @XmlElement(name = "Rl08264NotData")
    @FieldName("沒資料清單")
    private List<Rl08264ResultDTO> rl08264NotData;

    /** 所選取編輯資料 **/
    @XmlElement(name = "Rldf014sType")
    @FieldName("所選取編輯資料")
    private Rldf014sType rldf014sType;
    
    
    /** 統計年份**/
    @XmlElement(name = "StatYear")
    @FieldName("統計年份")
    private String statYear; // 統計年份

    /**
     * @return the rl08264Edit
     */
    public List<Rl08264ResultDTO> getRl08264Edit() {
        if (rl08264Edit == null) {
            rl08264Edit = new ArrayList<Rl08264ResultDTO>();
        }
        return rl08264Edit;
    }

    /**
     * @param rl08264Edit
     *            the rl08264Edit to set
     */
    public void setRl08264Edit(List<Rl08264ResultDTO> rl08264Edit) {
        this.rl08264Edit = rl08264Edit;
    }

    /**
     * @return the rl08264List
     */
    public List<Rl08264ResultDTO> getRl08264List() {
        if (rl08264List == null) {
            rl08264List = new ArrayList<Rl08264ResultDTO>();
        }
        return rl08264List;
    }

    /**
     * @param rl08264List
     *            the rl08264List to set
     */
    public void setRl08264List(List<Rl08264ResultDTO> rl08264List) {
        this.rl08264List = rl08264List;
    }

    /**
     * @return the rl08264NotData
     */
    public List<Rl08264ResultDTO> getRl08264NotData() {
        if (rl08264NotData == null) {
            rl08264NotData = new ArrayList<Rl08264ResultDTO>();
        }
        return rl08264NotData;
    }

    /**
     * @param rl08264NotData
     *            the rl08264NotData to set
     */
    public void setRl08264NotData(List<Rl08264ResultDTO> rl08264NotData) {
        this.rl08264NotData = rl08264NotData;
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
