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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05800DTO", propOrder = { "registerYyymmddS", "registerYyymmddE", "applyCode", "peopleInfo",
        "listRl05800ResultDTO" })
@XmlRootElement(name = "Rl05800DTO")
public class Rl05800DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 處理日期(起) */
    @XmlElement(name = "registerYyymmddS")
    @FieldName("處理日期(起)")
    private String registerYyymmddS;

    /** 處理日期(迄) */
    @XmlElement(name = "registerYyymmddE")
    @FieldName("處理日期(迄)")
    private String registerYyymmddE;

    /** 登記案件類別 */
    @XmlElement(name = "applyCode")
    @FieldName("登記案件類別")
    private String applyCode;

    /** 當事人 */
    @XmlElement(name = "peopleInfo")
    @FieldName("當事人")
    private Rl05800ResultDTO peopleInfo = new Rl05800ResultDTO();

    /** 顯示資料 */
    @XmlElement(name = "listRl05800ResultDTO")
    @FieldName("顯示資料")
    private List<Rl05800ResultDTO> listRl05800ResultDTO = new ArrayList<Rl05800ResultDTO>(0);

    public Rl05800ResultDTO getPeopleInfo() {
        return peopleInfo;
    }

    public void setPeopleInfo(Rl05800ResultDTO peopleInfo) {
        this.peopleInfo = peopleInfo;
    }

    public String getRegisterYyymmddS() {
        return registerYyymmddS;
    }

    public void setRegisterYyymmddS(String registerYyymmddS) {
        this.registerYyymmddS = registerYyymmddS;
    }

    public String getRegisterYyymmddE() {
        return registerYyymmddE;
    }

    public void setRegisterYyymmddE(String registerYyymmddE) {
        this.registerYyymmddE = registerYyymmddE;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public List<Rl05800ResultDTO> getListRl05800ResultDTO() {
        return listRl05800ResultDTO;
    }

    public void setListRl05800ResultDTO(List<Rl05800ResultDTO> listRl05800ResultDTO) {
        this.listRl05800ResultDTO = listRl05800ResultDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
