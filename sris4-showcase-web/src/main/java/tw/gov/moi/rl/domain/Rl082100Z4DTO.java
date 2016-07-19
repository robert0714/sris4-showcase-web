package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfq0z4Type;

public class Rl082100Z4DTO {
    // /** 現無戶籍者結婚動態申請書資料 */
    // @XmlElement(name = "Rldft0z4Type")
    // @FieldName("現無戶籍者結婚動態申請書資料")
    // private List<Rldft0z4Type> rldft0z4Type = new ArrayList<Rldft0z4Type>();

    /** 現無戶籍者結婚動態申請書凍結資料 */
    @XmlElement(name = "Rldf0z4Type")
    @FieldName("現無戶籍者結婚動態申請書凍結資料")
    private List<Rldfq0z4Type> rldfq0z4Type = new ArrayList<Rldfq0z4Type>();

    // /** 妻現無戶籍者結婚動態申請書資料歷史資料檔 */
    // @XmlElement(name = "Rldft0z4TypeW")
    // @FieldName("妻現無戶籍者結婚動態申請書資料歷史資料檔")
    // private Rldft0z4Type rldft0z4TypeW;

    /** 妻現無戶籍者結婚動態申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z4TypeW")
    @FieldName("妻現無戶籍者結婚動態申請書凍結歷史資料檔")
    private Rldfq0z4Type rldfq0z4TypeW;

    // /** 夫現無戶籍者結婚動態申請書資料歷史資料檔 */
    // @XmlElement(name = "Rldft0z4TypeM")
    // @FieldName("夫現無戶籍者結婚動態申請書資料歷史資料檔")
    // private Rldft0z4Type rldft0z4TypeM;

    /** 夫現無戶籍者結婚動態申請書凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z4TypeM")
    @FieldName("夫現無戶籍者結婚動態申請書凍結歷史資料檔")
    private Rldfq0z4Type rldfq0z4TypeM;

    // public List<Rldft0z4Type> getRldft0z4Type() {
    // return rldft0z4Type;
    // }
    //
    // public void setRldft0z4Type(List<Rldft0z4Type> rldft0z4Type) {
    // this.rldft0z4Type = rldft0z4Type;
    // }

    public List<Rldfq0z4Type> getRldfq0z4Type() {
        return rldfq0z4Type;
    }

    public void setRldfq0z4Type(List<Rldfq0z4Type> rldfq0z4Type) {
        this.rldfq0z4Type = rldfq0z4Type;
    }

    // public Rldft0z4Type getRldft0z4TypeW() {
    // return rldft0z4TypeW;
    // }
    //
    // public void setRldft0z4TypeW(Rldft0z4Type rldft0z4TypeW) {
    // this.rldft0z4TypeW = rldft0z4TypeW;
    // }

    public Rldfq0z4Type getRldfq0z4TypeW() {
        return rldfq0z4TypeW;
    }

    public void setRldfq0z4TypeW(Rldfq0z4Type rldfq0z4TypeW) {
        this.rldfq0z4TypeW = rldfq0z4TypeW;
    }

    // public Rldft0z4Type getRldft0z4TypeM() {
    // return rldft0z4TypeM;
    // }
    //
    // public void setRldft0z4TypeM(Rldft0z4Type rldft0z4TypeM) {
    // this.rldft0z4TypeM = rldft0z4TypeM;
    // }

    public Rldfq0z4Type getRldfq0z4TypeM() {
        return rldfq0z4TypeM;
    }

    public void setRldfq0z4TypeM(Rldfq0z4Type rldfq0z4TypeM) {
        this.rldfq0z4TypeM = rldfq0z4TypeM;
    }
}
