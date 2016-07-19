package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f00RsultDTO", propOrder = { "voteCode", "voteDate", "selected" })
@XmlRootElement(name = "Rl08f00RsultDTO")
public class Rl08f00ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉組合代碼 */
    @XmlElement(name = "voteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票日期 */
    @XmlElement(name = "voteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 選舉識別(1) */
    @XmlElement(name = "voteKind1")
    @FieldName("選舉識別(1)")
    private String voteKind1;

    /** 選舉識別(2) */
    @XmlElement(name = "voteKind2")
    @FieldName("選舉識別(2)")
    private String voteKind2;

    /** 選舉識別(3) */
    @XmlElement(name = "voteKind3")
    @FieldName("選舉識別(3)")
    private String voteKind3;

    /** 選舉識別(4) */
    @XmlElement(name = "voteKind4")
    @FieldName("選舉識別(4)")
    private String voteKind4;

    /** 選舉識別(5) */
    @XmlElement(name = "voteKind5")
    @FieldName("選舉識別(5)")
    private String voteKind5;

    @XmlElement(name = "selected")
    @FieldName("是否選擇 ")
    private boolean selected = false;

    public String getVoteKind4() {
        return voteKind4;
    }

    public void setVoteKind4(String voteKind4) {
        this.voteKind4 = voteKind4;
    }

    public String getVoteKind5() {
        return voteKind5;
    }

    public void setVoteKind5(String voteKind5) {
        this.voteKind5 = voteKind5;
    }

    public String getVoteKind1() {
        return voteKind1;
    }

    public void setVoteKind1(String voteKind1) {
        this.voteKind1 = voteKind1;
    }

    public String getVoteKind2() {
        return voteKind2;
    }

    public void setVoteKind2(String voteKind2) {
        this.voteKind2 = voteKind2;
    }

    public String getVoteKind3() {
        return voteKind3;
    }

    public void setVoteKind3(String voteKind3) {
        this.voteKind3 = voteKind3;
    }

    public String getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
