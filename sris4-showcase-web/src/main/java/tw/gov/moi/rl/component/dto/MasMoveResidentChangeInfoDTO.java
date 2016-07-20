package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masMoveResidentChangeInfoDTO", propOrder = { "xldfName", "rldfName", "hName", "removeType",
        "specialNotice" })
@XmlRootElement(name = "MasMoveResidentChangeInfoDTO")
public class MasMoveResidentChangeInfoDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 598726909330491199L;

    /** xldf類別名稱 */
    @XmlElement(name = "XldfName", required = true)
    @FieldName("xldf類別名稱")
    private String xldfName;

    /** rldf類別名稱 */
    @XmlElement(name = "RldfName", required = true)
    @FieldName("rldf類別名稱")
    private String rldfName;

    /** 通報類別 */
    @XmlElement(name = "noticeType", required = true)
    @FieldName("通報類別")
    private String noticeType;

    /** 特殊通報: */
    @XmlElement(name = "specialNotice", required = true)
    @FieldName("特殊通報")
    private SpecialNoticeParam specialNotice;

    public MasMoveResidentChangeInfoDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MasMoveResidentChangeInfoDTO(String xldfName, String rldfName, String noticeType,
            SpecialNoticeParam specialNotice) {
        super();
        this.xldfName = xldfName;
        this.rldfName = rldfName;
        this.noticeType = noticeType;
        this.specialNotice = specialNotice;
    }

    /**
     * @return the xldfName
     */
    public String getXldfName() {
        return xldfName;
    }

    /**
     * @param xldfName
     *            the xldfName to set
     */
    public void setXldfName(String xldfName) {
        this.xldfName = xldfName;
    }

    /**
     * @return the rldfName
     */
    public String getRldfName() {
        return rldfName;
    }

    /**
     * @param rldfName
     *            the rldfName to set
     */
    public void setRldfName(String rldfName) {
        this.rldfName = rldfName;
    }

    /**
     * @return the noticeType
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * @param noticeType
     *            the noticeType to set
     */
    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * @return the specialNotice
     */
    public SpecialNoticeParam getSpecialNotice() {
        return specialNotice;
    }

    /**
     * @param specialNotice
     *            the specialNotice to set
     */
    public void setSpecialNotice(SpecialNoticeParam specialNotice) {
        this.specialNotice = specialNotice;
    }

}
