package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfq0z5Type;

public class Rl082100Z5DTO {
    // /** 現無戶籍者離婚動態申請書資料 */
    // @XmlElement(name = "Rldft0z5Type")
    // @FieldName("現無戶籍者離婚動態申請書資料")
    // private List<Rldft0z5Type> rldft05zTypes = new ArrayList<Rldft0z5Type>();

    /** 現無戶籍者離婚動態申請書凍結資料 */
    @XmlElement(name = "Rldft0z5Types")
    @FieldName("現無戶籍者離婚動態申請書凍結資料")
    private List<Rldfq0z5Type> rldfq0z5Types = new ArrayList<Rldfq0z5Type>();

    // /** 夫現無戶籍者離婚動態申請書資料歷史資料檔 */
    // @XmlElement(name = "Rldft0z5TypeM")
    // @FieldName("夫現無戶籍者離婚動態申請書資料歷史資料檔")
    // private Rldft0z5Type rldft0z5TypeM;

    /** 夫現無戶籍者離婚動態申請書資料凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z5TypeM")
    @FieldName("夫現無戶籍者離婚動態申請書資料凍結歷史資料檔")
    private Rldfq0z5Type rldfq0z5TypeM;

    // /** 妻現無戶籍者離婚動態申請書資料歷史資料檔 */
    // @XmlElement(name = "Rldft0z5TypeW")
    // @FieldName("妻現無戶籍者離婚動態申請書資料歷史資料檔")
    // private Rldft0z5Type rldft0z5TypeW;

    /** 妻現無戶籍者離婚動態申請書資料凍結歷史資料檔 */
    @XmlElement(name = "Rldfq0z5TypeW")
    @FieldName("妻現無戶籍者離婚動態申請書資料凍結歷史資料檔")
    private Rldfq0z5Type rldfq0z5TypeW;

    // public List<Rldft0z5Type> getRldft05zTypes() {
    // return rldft05zTypes;
    // }
    //
    // public void setRldft05zTypes(List<Rldft0z5Type> rldft05zTypes) {
    // this.rldft05zTypes = rldft05zTypes;
    // }

    public List<Rldfq0z5Type> getRldfq0z5Types() {
        return rldfq0z5Types;
    }

    public void setRldfq0z5Types(List<Rldfq0z5Type> rldfq0z5Types) {
        this.rldfq0z5Types = rldfq0z5Types;
    }

    // public Rldft0z5Type getRldft0z5TypeM() {
    // return rldft0z5TypeM;
    // }
    //
    // public void setRldft0z5TypeM(Rldft0z5Type rldft0z5TypeM) {
    // this.rldft0z5TypeM = rldft0z5TypeM;
    // }

    public Rldfq0z5Type getRldfq0z5TypeM() {
        return rldfq0z5TypeM;
    }

    public void setRldfq0z5TypeM(Rldfq0z5Type rldfq0z5TypeM) {
        this.rldfq0z5TypeM = rldfq0z5TypeM;
    }

    // public Rldft0z5Type getRldft0z5TypeW() {
    // return rldft0z5TypeW;
    // }
    //
    // public void setRldft0z5TypeW(Rldft0z5Type rldft0z5TypeW) {
    // this.rldft0z5TypeW = rldft0z5TypeW;
    // }
    public Rldfq0z5Type getRldfq0z5TypeW() {
        return rldfq0z5TypeW;
    }

    public void setRldfq0z5TypeW(Rldfq0z5Type rldfq0z5TypeW) {
        this.rldfq0z5TypeW = rldfq0z5TypeW;
    }
}
