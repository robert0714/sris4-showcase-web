package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class Rl08f400DTOLivingCode implements Serializable {

    private String livingCode = "";

    @XmlElement(name = "voteCode", required = true)
    @FieldName(" 記錄08F20_選舉權(2)轉錄條件_非原住民調整 ")
    private String activeVote2Living1;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("記錄08F20_選舉權(2)08F20轉錄條件_平地原住民調整")
    private String activeVote2Living2;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("記錄08F20_選舉權(2)08F20轉錄條件_山地原住民調整")
    private String activeVote2Living3;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("記錄08F20_選舉權(3)轉錄條件_非原住民調整")
    private String activeVote3Living1;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("記錄08F20_選舉權(3)08F20轉錄條件_平地原住民調整")
    private String activeVote3Living2;

    @XmlElement(name = "voteCode", required = true)
    @FieldName("記錄08F20_選舉權(3)08F20轉錄條件_山地原住民調整")
    private String activeVote3Living3;

    public String getLivingCode() {
        return livingCode;
    }

    public void setLivingCode(String livingCode) {
        this.livingCode = livingCode;
    }

    public String getActiveVote2Living1() {
        return activeVote2Living1;
    }

    public void setActiveVote2Living1(String activeVote2Living1) {
        this.activeVote2Living1 = activeVote2Living1;
    }

    public String getActiveVote2Living2() {
        return activeVote2Living2;
    }

    public void setActiveVote2Living2(String activeVote2Living2) {
        this.activeVote2Living2 = activeVote2Living2;
    }

    public String getActiveVote2Living3() {
        return activeVote2Living3;
    }

    public void setActiveVote2Living3(String activeVote2Living3) {
        this.activeVote2Living3 = activeVote2Living3;
    }

    public String getActiveVote3Living1() {
        return activeVote3Living1;
    }

    public void setActiveVote3Living1(String activeVote3Living1) {
        this.activeVote3Living1 = activeVote3Living1;
    }

    public String getActiveVote3Living2() {
        return activeVote3Living2;
    }

    public void setActiveVote3Living2(String activeVote3Living2) {
        this.activeVote3Living2 = activeVote3Living2;
    }

    public String getActiveVote3Living3() {
        return activeVote3Living3;
    }

    public void setActiveVote3Living3(String activeVote3Living3) {
        this.activeVote3Living3 = activeVote3Living3;
    }

}