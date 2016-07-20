package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde808wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f60ResultDTO", propOrder = { "votePoint", "man1Rlde808wType", "man2Rlde808wType",
        "man3Rlde808wType", "man4Rlde808wType", "man5Rlde808wType", "woman1Rlde808wType", "woman2Rlde808wType",
        "woman3Rlde808wType", "woman4Rlde808wType", "woman5Rlde808wType" })
@XmlRootElement(name = "Rl08f60ResultDTO")
public class Rl08f60ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 投票所 */
    @XmlElement(name = "votePoint")
    private String votePoint = "";

    /** 男性選舉權1Rlde808wType */
    @FieldName("查詢結果 ")
    @XmlElement(name = "man1Rlde808wType")
    private Rlde808wType man1Rlde808wType = null;

    /** 男性選舉權2Rlde808wType */
    @XmlElement(name = "man2Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType man2Rlde808wType = null;

    /** 男性選舉權3Rlde808wType */
    @XmlElement(name = "man3Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType man3Rlde808wType = null;

    /** 男性選舉權4Rlde808wType */
    @XmlElement(name = "man4Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType man4Rlde808wType = null;

    /** 男性選舉權5Rlde808wType */
    @XmlElement(name = "man5Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType man5Rlde808wType = null;

    /** 女性選舉權1Rlde808wType */
    @XmlElement(name = "woman1Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType woman1Rlde808wType = null;

    /** 女性選舉權2Rlde808wType */
    @XmlElement(name = "woman2Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType woman2Rlde808wType = null;

    /** 女性選舉權3Rlde808wType */
    @XmlElement(name = "woman3Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType woman3Rlde808wType = null;

    /** 女性選舉權4Rlde808wType */
    @XmlElement(name = "woman4Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType woman4Rlde808wType = null;

    /** 女性選舉權5Rlde808wType */
    @XmlElement(name = "woman5Rlde808wType")
    @FieldName("查詢結果 ")
    private Rlde808wType woman5Rlde808wType = null;

    public Rlde808wType getMan1Rlde808wType() {
        return man1Rlde808wType;
    }

    public void setMan1Rlde808wType(Rlde808wType man1Rlde808wType) {
        this.man1Rlde808wType = man1Rlde808wType;
    }

    public Rlde808wType getMan2Rlde808wType() {
        return man2Rlde808wType;
    }

    public void setMan2Rlde808wType(Rlde808wType man2Rlde808wType) {
        this.man2Rlde808wType = man2Rlde808wType;
    }

    public Rlde808wType getMan3Rlde808wType() {
        return man3Rlde808wType;
    }

    public void setMan3Rlde808wType(Rlde808wType man3Rlde808wType) {
        this.man3Rlde808wType = man3Rlde808wType;
    }

    public Rlde808wType getMan4Rlde808wType() {
        return man4Rlde808wType;
    }

    public void setMan4Rlde808wType(Rlde808wType man4Rlde808wType) {
        this.man4Rlde808wType = man4Rlde808wType;
    }

    public Rlde808wType getMan5Rlde808wType() {
        return man5Rlde808wType;
    }

    public void setMan5Rlde808wType(Rlde808wType man5Rlde808wType) {
        this.man5Rlde808wType = man5Rlde808wType;
    }

    public Rlde808wType getWoman1Rlde808wType() {
        return woman1Rlde808wType;
    }

    public void setWoman1Rlde808wType(Rlde808wType woman1Rlde808wType) {
        this.woman1Rlde808wType = woman1Rlde808wType;
    }

    public Rlde808wType getWoman2Rlde808wType() {
        return woman2Rlde808wType;
    }

    public void setWoman2Rlde808wType(Rlde808wType woman2Rlde808wType) {
        this.woman2Rlde808wType = woman2Rlde808wType;
    }

    public Rlde808wType getWoman3Rlde808wType() {
        return woman3Rlde808wType;
    }

    public void setWoman3Rlde808wType(Rlde808wType woman3Rlde808wType) {
        this.woman3Rlde808wType = woman3Rlde808wType;
    }

    public Rlde808wType getWoman4Rlde808wType() {
        return woman4Rlde808wType;
    }

    public void setWoman4Rlde808wType(Rlde808wType woman4Rlde808wType) {
        this.woman4Rlde808wType = woman4Rlde808wType;
    }

    public Rlde808wType getWoman5Rlde808wType() {
        return woman5Rlde808wType;
    }

    public void setWoman5Rlde808wType(Rlde808wType woman5Rlde808wType) {
        this.woman5Rlde808wType = woman5Rlde808wType;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getVotePoint() {
        return votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }
}
