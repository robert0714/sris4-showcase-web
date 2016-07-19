package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfs001Type;
import tw.gov.moi.domain.Rldft001Type;
import tw.gov.moi.domain.Rldfw001Type;

public class Rl08210001DTO {
    /** 出生登記申請書資料檔 */
    @XmlElement(name = "Rldfs001Types")
    @FieldName("出生登記申請書資料檔")
    private List<Rldfs001Type> rldfs001Types = new ArrayList<Rldfs001Type>();

    /** 出生登記申請書歷史資料檔 */
    @XmlElement(name = "Rldft001Types")
    @FieldName("出生登記申請書歷史資料檔")
    private List<Rldft001Type> rldft001Types = new ArrayList<Rldft001Type>();

    /** 辦理他所出生登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw001Types")
    @FieldName("辦理他所出生登記申請書歷史資料檔")
    private List<Rldfw001Type> rldfw001Types = new ArrayList<Rldfw001Type>();

    public List<Rldfs001Type> getRldfs001Types() {
        return rldfs001Types;
    }

    public void setRldfs001Types(List<Rldfs001Type> rldfs001Types) {
        this.rldfs001Types = rldfs001Types;
    }

    public List<Rldft001Type> getRldft001Types() {
        return rldft001Types;
    }

    public void setRldft001Types(List<Rldft001Type> rldft001Types) {
        this.rldft001Types = rldft001Types;
    }

    public List<Rldfw001Type> getRldfw001Types() {
        return rldfw001Types;
    }

    public void setRldfw001Types(List<Rldfw001Type> rldfw001Types) {
        this.rldfw001Types = rldfw001Types;
    }

    @Override
    public String toString() {
        return "Rl08210001DTO [rldfs001Types=" + rldfs001Types + ", rldft001Types=" + rldft001Types
                + ", rldfw001Types=" + rldfw001Types + "]";
    }

}
