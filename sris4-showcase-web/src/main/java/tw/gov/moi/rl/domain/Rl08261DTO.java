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
import tw.gov.moi.domain.Rldf011sType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08261DTO", propOrder = { "rl08261Edit", "rl08261List", "rl08261NotData", "rldf011sType",
        "oldMotherNationality","statYear"})
@XmlRootElement(name = "Rl08261DTO")
public class Rl08261DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 新增流水號 **/
    @XmlElement(name = "Rl08261Edit")
    @FieldName("新增流水號")
    private List<Rl08261ResultDTO> rl08261Edit;

    /** 查詢結果清單 **/
    @XmlElement(name = "Rl08261List")
    @FieldName("查詢結果清單")
    private List<Rl08261ResultDTO> rl08261List;

    /** 沒資料清單 **/
    @XmlElement(name = "Rl08261NotData")
    @FieldName("沒資料清單")
    private List<Rl08261ResultDTO> rl08261NotData;

    /** 所選取編輯資料 **/
    @XmlElement(name = "Rldf011sType")
    @FieldName("所選取編輯資料")
    private Rldf011sType rldf011sType;

    /** 母原國籍 **/
    @XmlElement(name = "OldMotherNationality")
    @FieldName("母原國籍")
    private String oldMotherNationality; // 母國籍

    
    /** 統計年份**/
    @XmlElement(name = "StatYear")
    @FieldName("統計年份")
    private String statYear; // 統計年份

    
    /**
     * @return the rl08261Edit
     */
    public List<Rl08261ResultDTO> getRl08261Edit() {
        if (rl08261Edit == null) {
            rl08261Edit = new ArrayList<Rl08261ResultDTO>();
        }
        return rl08261Edit;
    }

    /**
     * @param rl08261Edit
     *            the rl08261Edit to set
     */
    public void setRl08261Edit(List<Rl08261ResultDTO> rl08261Edit) {
        this.rl08261Edit = rl08261Edit;
    }

    /**
     * @return the rl08261List
     */
    public List<Rl08261ResultDTO> getRl08261List() {
        if (rl08261List == null) {
            rl08261List = new ArrayList<Rl08261ResultDTO>();
        }
        return rl08261List;
    }

    /**
     * @param rl08261List
     *            the rl08261List to set
     */
    public void setRl08261List(List<Rl08261ResultDTO> rl08261List) {
        this.rl08261List = rl08261List;
    }

    /**
     * @return the rl08261NotData
     */
    public List<Rl08261ResultDTO> getRl08261NotData() {
        if (rl08261NotData == null) {
            rl08261NotData = new ArrayList<Rl08261ResultDTO>();
        }
        return rl08261NotData;
    }

    /**
     * @param rl08261NotData
     *            the rl08261NotData to set
     */
    public void setRl08261NotData(List<Rl08261ResultDTO> rl08261NotData) {
        this.rl08261NotData = rl08261NotData;
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

    /**
     * @return the oldMotherNationality
     */
    public String getOldMotherNationality() {
        return oldMotherNationality;
    }

    /**
     * @param oldMotherNationality
     *            the oldMotherNationality to set
     */
    public void setOldMotherNationality(String oldMotherNationality) {
        this.oldMotherNationality = oldMotherNationality;
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
