package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfq003Type;
import tw.gov.moi.domain.Rldfs003Type;
import tw.gov.moi.domain.Rldfw003Type;

public class Rl08210003DTO {
    /** 結婚登記申請書資料檔 */
    @XmlElement(name = "Rldfs003Types")
    @FieldName("結婚登記申請書資料檔")
    private List<Rldfs003Type> rldfs003Types = new ArrayList<Rldfs003Type>();

    // /** 夫結婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft003TypesM")
    // @FieldName("夫結婚登記申請書歷史資料檔")
    // private Rldft003Type rldft003TypesM;

    /** 夫結婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq003TypesM")
    @FieldName("夫結婚登記申請書凍結歷史資料檔")
    private Rldfq003Type rldfq003TypesM;

    // /** 妻結婚登記申請書歷史資料檔 */
    // @XmlElement(name = "Rldft003TypesW")
    // @FieldName("妻結婚登記申請書歷史資料檔")
    // private Rldft003Type rldft003TypesW;

    /** 妻結婚登記申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq003TypesW")
    @FieldName("妻結婚登記申請書凍結歷史資料檔")
    private Rldfq003Type rldfq003TypesW;

    /** 辦理他所結婚登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw003Types")
    @FieldName("辦理他所結婚登記申請書歷史資料檔")
    private List<Rldfw003Type> rldfw003Types = new ArrayList<Rldfw003Type>();

    public List<Rldfs003Type> getRldfs003Types() {
        return rldfs003Types;
    }

    public void setRldfs003Types(List<Rldfs003Type> rldfs003Types) {
        this.rldfs003Types = rldfs003Types;
    }

    // public Rldft003Type getRldft003TypesM() {
    // return rldft003TypesM;
    // }
    //
    // public void setRldft003TypesM(Rldft003Type rldft003TypesM) {
    // this.rldft003TypesM = rldft003TypesM;
    // }

    public Rldfq003Type getRldfq003TypesM() {
        return rldfq003TypesM;
    }

    public void setRldfq003TypesM(Rldfq003Type rldfq003TypesM) {
        this.rldfq003TypesM = rldfq003TypesM;
    }

    // public Rldft003Type getRldft003TypesW() {
    // return rldft003TypesW;
    // }
    //
    // public void setRldft003TypesW(Rldft003Type rldft003TypesW) {
    // this.rldft003TypesW = rldft003TypesW;
    // }

    public Rldfq003Type getRldfq003TypesW() {
        return rldfq003TypesW;
    }

    public void setRldfq003TypesW(Rldfq003Type rldfq003TypesW) {
        this.rldfq003TypesW = rldfq003TypesW;
    }

    public List<Rldfw003Type> getRldfw003Types() {
        return rldfw003Types;
    }

    public void setRldfw003Types(List<Rldfw003Type> rldfw003Types) {
        this.rldfw003Types = rldfw003Types;
    }

    @Override
    public String toString() {
        return "Rl08210003DTO [rldfs003Types="
                + rldfs003Types
                // + ", rldft003TypesM=" + rldft003TypesM
                // + ", rldft003TypesW=" + rldft003TypesW
                + ", rldfq003TypesM=" + rldfq003TypesM + ", rldfq003TypesW=" + rldfq003TypesW + ", rldfw003Types="
                + rldfw003Types + "]";
    }

}
