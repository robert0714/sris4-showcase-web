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
@XmlType(name = "rl05800ResultDTO", propOrder = { "applyCode", "acceptanceCode", "settlementCode", "registerYyymmdd",
        "registerHhmmss", "listRl05800PeopleDTO" })
@XmlRootElement(name = "Rl05800ResultDTO")
public class Rl05800ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 登記案件類別 */
    @XmlElement(name = "applyCode")
    @FieldName("登記案件類別")
    private String applyCode;

    /** 受理戶政事務所 */
    @XmlElement(name = "acceptanceCode")
    @FieldName("受理戶政事務所")
    private String acceptanceCode;

    /** 起始戶政事務所 */
    @XmlElement(name = "settlementCode")
    @FieldName("起始戶政事務所")
    private String settlementCode;

    /** 登記日期 */
    @XmlElement(name = "registerYyymmdd")
    @FieldName("登記日期")
    private String registerYyymmdd;

    /** 登記時間 */
    @XmlElement(name = "registerHhmmss")
    @FieldName("登記時間")
    private String registerHhmmss;

    /** 當事人 */
    @XmlElement(name = "listRl05800PeopleDTO")
    @FieldName("當事人")
    private List<Rl05800PeopleDTO> listRl05800PeopleDTO = new ArrayList<Rl05800PeopleDTO>(0);

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getAcceptanceCode() {
        return acceptanceCode;
    }

    public void setAcceptanceCode(String acceptanceCode) {
        this.acceptanceCode = acceptanceCode;
    }

    public String getSettlementCode() {
        return settlementCode;
    }

    public void setSettlementCode(String settlementCode) {
        this.settlementCode = settlementCode;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterHhmmss() {
        return registerHhmmss;
    }

    public void setRegisterHhmmss(String registerHhmmss) {
        this.registerHhmmss = registerHhmmss;
    }

    public List<Rl05800PeopleDTO> getListRl05800PeopleDTO() {
        return listRl05800PeopleDTO;
    }

    public void setListRl05800PeopleDTO(List<Rl05800PeopleDTO> listRl05800PeopleDTO) {
        this.listRl05800PeopleDTO = listRl05800PeopleDTO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
