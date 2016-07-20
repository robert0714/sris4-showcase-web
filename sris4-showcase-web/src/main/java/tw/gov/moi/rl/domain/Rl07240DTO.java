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
@XmlType(name = "rl07240DTO", propOrder = { "correctYear", "verifyButton", "rl07240Edit", "rl07240List" })
@XmlRootElement(name = "Rl07240DTO")
public class Rl07240DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 校正年份 */
    @XmlElement(name = "CorrectYear")
    @FieldName("校正年份")
    private String correctYear;

    /** 驗証鈕狀態 */
    @XmlElement(name = "VerifyButton")
    @FieldName("驗証鈕狀態")
    private boolean verifyButton;

    /** Rl07240Result Edit List. */
    @XmlElement(name = "Rl07240Edit")
    @FieldName("Rl07240Result Edit List")
    private List<Rl07240Result> rl07240Edit;

    /** Rl07240Result List. */
    @XmlElement(name = "Rl07240List")
    @FieldName("Rl07240Result List")
    private List<Rl07240Result> rl07240List;

    public String getCorrectYear() {
        return correctYear;
    }

    public void setCorrectYear(String correctYear) {
        this.correctYear = correctYear;
    }

    public List<Rl07240Result> getRl07240Edit() {
        if (rl07240Edit == null) {
            rl07240Edit = new ArrayList<Rl07240Result>();
        }
        return rl07240Edit;
    }

    public void setRl07240Edit(List<Rl07240Result> rl07240Edit) {
        this.rl07240Edit = rl07240Edit;
    }

    public List<Rl07240Result> getRl07240List() {
        if (rl07240List == null) {
            rl07240List = new ArrayList<Rl07240Result>();
        }
        return rl07240List;
    }

    public void setRl07240List(List<Rl07240Result> rl07240List) {
        this.rl07240List = rl07240List;
    }

    public boolean isVerifyButton() {
        return verifyButton;
    }

    public void setVerifyButton(boolean verifyButton) {
        this.verifyButton = verifyButton;
    }

}
