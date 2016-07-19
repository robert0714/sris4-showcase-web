package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rc03100DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08800DTO", propOrder = { "NotifyCode", "OriginalCode", "DestinationCode", "StatisticYyymm",
        "Staff1", "Staff2", "Staff3", "Staff4", "Staff5", "Staff6", "Staff7", "Staff8", "Staff9", "Staff10", "Staff11",
        "Staff12", "Staff13", "Staff14", "Staff15", "Inspections1", "Inspections2", "Inspections3", "Inspections4",
        "Inspections5", "Inspections6", "Inspections7", "Inspections8", "Inspections9", "Inspections10",
        "Inspections11", "Inspections12", "Inspections13", "Inspections14", "Inspections15", "Rummage1", "Rummage2",
        "Rummage3", "Rummage4", "Rummage5", "Rummage6", "Rummage7", "Rummage8", "Rummage9", "Rummage10", "Rummage11",
        "Rummage12", "Rummage13", "Rummage14", "Rummage15", "Sum1", "Sum2", "Sum3", "Sum4", "Sum5", "Sum6", "Sum7",
        "Sum8", "Sum9", "Sum10", "Sum11", "Sum12", "Sum13", "Sum14", "Sum15" })
@XmlRootElement(name = "Rl08800DTO")
public class Rl08800DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "NotifyCode", required = true)
    @FieldName("通報類別")
    private String notifyCode;

    @XmlElement(name = "OriginalCode", required = true)
    @FieldName("起始地代碼")
    private String originalCode;

    @XmlElement(name = "DestinationCode", required = true)
    @FieldName("目的地代碼")
    private String destinationCode;

    @XmlElement(name = "StatisticYyymm", required = true)
    @FieldName("統計日期")
    private String statisticYyymm;

    @XmlElement(name = "Staff1", required = true)
    @FieldName("戶籍人員1")
    private String staff1;

    @XmlElement(name = "Staff2", required = true)
    @FieldName("戶籍人員2")
    private String staff2;

    @XmlElement(name = "Staff3", required = true)
    @FieldName("戶籍人員3")
    private String staff3;

    @XmlElement(name = "Staff4", required = true)
    @FieldName("戶籍人員4")
    private String staff4;

    @XmlElement(name = "Staff5", required = true)
    @FieldName("戶籍人員5")
    private String staff5;

    @XmlElement(name = "Staff6", required = true)
    @FieldName("戶籍人員6")
    private String staff6;

    @XmlElement(name = "Staff7", required = true)
    @FieldName("戶籍人員7")
    private String staff7;

    @XmlElement(name = "Staff8", required = true)
    @FieldName("戶籍人員8")
    private String staff8;

    @XmlElement(name = "Staff9", required = true)
    @FieldName("戶籍人員9")
    private String staff9;

    @XmlElement(name = "Staff10", required = true)
    @FieldName("戶籍人員10")
    private String staff10;

    @XmlElement(name = "Staff11", required = true)
    @FieldName("戶籍人員11")
    private String staff11;

    @XmlElement(name = "Staff12", required = true)
    @FieldName("戶籍人員12")
    private String staff12;

    @XmlElement(name = "Staff13", required = true)
    @FieldName("戶籍人員13")
    private String staff13;

    @XmlElement(name = "Staff14", required = true)
    @FieldName("戶籍人員14")
    private String staff14;

    @XmlElement(name = "Staff15", required = true)
    @FieldName("戶籍人員15")
    private String staff15;

    @XmlElement(name = "Inspections1", required = true)
    @FieldName("戶口查察1")
    private String inspections1;

    @XmlElement(name = "Inspections2", required = true)
    @FieldName("戶口查察2")
    private String inspections2;

    @XmlElement(name = "Inspections3", required = true)
    @FieldName("戶口查察3")
    private String inspections3;

    @XmlElement(name = "Inspections4", required = true)
    @FieldName("戶口查察4")
    private String inspections4;

    @XmlElement(name = "Inspections5", required = true)
    @FieldName("戶口查察5")
    private String inspections5;

    @XmlElement(name = "Inspections6", required = true)
    @FieldName("戶口查察6")
    private String inspections6;

    @XmlElement(name = "Inspections7", required = true)
    @FieldName("戶口查察7")
    private String inspections7;

    @XmlElement(name = "Inspections8", required = true)
    @FieldName("戶口查察8")
    private String inspections8;

    @XmlElement(name = "Inspections9", required = true)
    @FieldName("戶口查察9")
    private String inspections9;

    @XmlElement(name = "Inspections10", required = true)
    @FieldName("戶口查察10")
    private String inspections10;

    @XmlElement(name = "Inspections11", required = true)
    @FieldName("戶口查察11")
    private String inspections11;

    @XmlElement(name = "Inspections12", required = true)
    @FieldName("戶口查察12")
    private String inspections12;

    @XmlElement(name = "Inspections13", required = true)
    @FieldName("戶口查察13")
    private String inspections13;

    @XmlElement(name = "Inspections14", required = true)
    @FieldName("戶口查察14")
    private String inspections14;

    @XmlElement(name = "Inspections15", required = true)
    @FieldName("戶口查察15")
    private String inspections15;

    @XmlElement(name = "Rummage1", required = true)
    @FieldName("戶口臨檢1")
    private String rummage1;

    @XmlElement(name = "Rummage2", required = true)
    @FieldName("戶口臨檢2")
    private String rummage2;

    @XmlElement(name = "Rummage3", required = true)
    @FieldName("戶口臨檢3")
    private String rummage3;

    @XmlElement(name = "Rummage4", required = true)
    @FieldName("戶口臨檢4")
    private String rummage4;

    @XmlElement(name = "Rummage5", required = true)
    @FieldName("戶口臨檢5")
    private String rummage5;

    @XmlElement(name = "Rummage6", required = true)
    @FieldName("戶口臨檢6")
    private String rummage6;

    @XmlElement(name = "Rummage7", required = true)
    @FieldName("戶口臨檢7")
    private String rummage7;

    @XmlElement(name = "Rummage8", required = true)
    @FieldName("戶口臨檢8")
    private String rummage8;

    @XmlElement(name = "Rummage9", required = true)
    @FieldName("戶口臨檢9")
    private String rummage9;

    @XmlElement(name = "Rummage10", required = true)
    @FieldName("戶口臨檢10")
    private String rummage10;

    @XmlElement(name = "Rummage11", required = true)
    @FieldName("戶口臨檢11")
    private String rummage11;

    @XmlElement(name = "Rummage12", required = true)
    @FieldName("戶口臨檢12")
    private String rummage12;

    @XmlElement(name = "Rummage13", required = true)
    @FieldName("戶口臨檢13")
    private String rummage13;

    @XmlElement(name = "Rummage14", required = true)
    @FieldName("戶口臨檢14")
    private String rummage14;

    @XmlElement(name = "Rummage15", required = true)
    @FieldName("戶口臨檢15")
    private String rummage15;

    @XmlElement(name = "Sum1", required = true)
    @FieldName("合計1")
    private String sum1;

    @XmlElement(name = "Sum2", required = true)
    @FieldName("合計2")
    private String sum2;

    @XmlElement(name = "Sum3", required = true)
    @FieldName("合計3")
    private String sum3;

    @XmlElement(name = "Sum4", required = true)
    @FieldName("合計4")
    private String sum4;

    @XmlElement(name = "Sum5", required = true)
    @FieldName("合計5")
    private String sum5;

    @XmlElement(name = "Sum6", required = true)
    @FieldName("合計6")
    private String sum6;

    @XmlElement(name = "Sum7", required = true)
    @FieldName("合計7")
    private String sum7;

    @XmlElement(name = "Sum8", required = true)
    @FieldName("合計8")
    private String sum8;

    @XmlElement(name = "Sum9", required = true)
    @FieldName("合計9")
    private String sum9;

    @XmlElement(name = "Sum10", required = true)
    @FieldName("合計10")
    private String sum10;

    @XmlElement(name = "Sum11", required = true)
    @FieldName("合計11")
    private String sum11;

    @XmlElement(name = "Sum12", required = true)
    @FieldName("合計12")
    private String sum12;

    @XmlElement(name = "Sum13", required = true)
    @FieldName("合計13")
    private String sum13;

    @XmlElement(name = "Sum14", required = true)
    @FieldName("合計14")
    private String sum14;

    @XmlElement(name = "Sum15", required = true)
    @FieldName("合計15")
    private String sum15;

    public String getNotifyCode() {
        return notifyCode;
    }

    public void setNotifyCode(final String notifyCode) {
        this.notifyCode = notifyCode;
    }

    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(final String originalCode) {
        this.originalCode = originalCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(final String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public String getStatisticYyymm() {
        return statisticYyymm;
    }

    public void setStatisticYyymm(final String statisticYyymm) {
        this.statisticYyymm = statisticYyymm;
    }

    public String getStaff1() {
        return staff1;
    }

    public void setStaff1(final String staff1) {
        this.staff1 = staff1;
    }

    public String getStaff2() {
        return staff2;
    }

    public void setStaff2(final String staff2) {
        this.staff2 = staff2;
    }

    public String getStaff3() {
        return staff3;
    }

    public void setStaff3(final String staff3) {
        this.staff3 = staff3;
    }

    public String getStaff4() {
        return staff4;
    }

    public void setStaff4(final String staff4) {
        this.staff4 = staff4;
    }

    public String getStaff5() {
        return staff5;
    }

    public void setStaff5(final String staff5) {
        this.staff5 = staff5;
    }

    public String getStaff6() {
        return staff6;
    }

    public void setStaff6(final String staff6) {
        this.staff6 = staff6;
    }

    public String getStaff7() {
        return staff7;
    }

    public void setStaff7(final String staff7) {
        this.staff7 = staff7;
    }

    public String getStaff8() {
        return staff8;
    }

    public void setStaff8(final String staff8) {
        this.staff8 = staff8;
    }

    public String getStaff9() {
        return staff9;
    }

    public void setStaff9(final String staff9) {
        this.staff9 = staff9;
    }

    public String getStaff10() {
        return staff10;
    }

    public void setStaff10(final String staff10) {
        this.staff10 = staff10;
    }

    public String getStaff11() {
        return staff11;
    }

    public void setStaff11(final String staff11) {
        this.staff11 = staff11;
    }

    public String getStaff12() {
        return staff12;
    }

    public void setStaff12(final String staff12) {
        this.staff12 = staff12;
    }

    public String getStaff13() {
        return staff13;
    }

    public void setStaff13(final String staff13) {
        this.staff13 = staff13;
    }

    public String getStaff14() {
        return staff14;
    }

    public void setStaff14(final String staff14) {
        this.staff14 = staff14;
    }

    public String getStaff15() {
        return staff15;
    }

    public void setStaff15(final String staff15) {
        this.staff15 = staff15;
    }

    public String getInspections1() {
        return inspections1;
    }

    public void setInspections1(final String inspections1) {
        this.inspections1 = inspections1;
    }

    public String getInspections2() {
        return inspections2;
    }

    public void setInspections2(final String inspections2) {
        this.inspections2 = inspections2;
    }

    public String getInspections3() {
        return inspections3;
    }

    public void setInspections3(final String inspections3) {
        this.inspections3 = inspections3;
    }

    public String getInspections4() {
        return inspections4;
    }

    public void setInspections4(final String inspections4) {
        this.inspections4 = inspections4;
    }

    public String getInspections5() {
        return inspections5;
    }

    public void setInspections5(final String inspections5) {
        this.inspections5 = inspections5;
    }

    public String getInspections6() {
        return inspections6;
    }

    public void setInspections6(final String inspections6) {
        this.inspections6 = inspections6;
    }

    public String getInspections7() {
        return inspections7;
    }

    public void setInspections7(final String inspections7) {
        this.inspections7 = inspections7;
    }

    public String getInspections8() {
        return inspections8;
    }

    public void setInspections8(final String inspections8) {
        this.inspections8 = inspections8;
    }

    public String getInspections9() {
        return inspections9;
    }

    public void setInspections9(final String inspections9) {
        this.inspections9 = inspections9;
    }

    public String getInspections10() {
        return inspections10;
    }

    public void setInspections10(final String inspections10) {
        this.inspections10 = inspections10;
    }

    public String getInspections11() {
        return inspections11;
    }

    public void setInspections11(final String inspections11) {
        this.inspections11 = inspections11;
    }

    public String getInspections12() {
        return inspections12;
    }

    public void setInspections12(final String inspections12) {
        this.inspections12 = inspections12;
    }

    public String getInspections13() {
        return inspections13;
    }

    public void setInspections13(final String inspections13) {
        this.inspections13 = inspections13;
    }

    public String getInspections14() {
        return inspections14;
    }

    public void setInspections14(final String inspections14) {
        this.inspections14 = inspections14;
    }

    public String getInspections15() {
        return inspections15;
    }

    public void setInspections15(final String inspections15) {
        this.inspections15 = inspections15;
    }

    public String getRummage1() {
        return rummage1;
    }

    public void setRummage1(final String rummage1) {
        this.rummage1 = rummage1;
    }

    public String getRummage2() {
        return rummage2;
    }

    public void setRummage2(final String rummage2) {
        this.rummage2 = rummage2;
    }

    public String getRummage3() {
        return rummage3;
    }

    public void setRummage3(final String rummage3) {
        this.rummage3 = rummage3;
    }

    public String getRummage4() {
        return rummage4;
    }

    public void setRummage4(final String rummage4) {
        this.rummage4 = rummage4;
    }

    public String getRummage5() {
        return rummage5;
    }

    public void setRummage5(final String rummage5) {
        this.rummage5 = rummage5;
    }

    public String getRummage6() {
        return rummage6;
    }

    public void setRummage6(final String rummage6) {
        this.rummage6 = rummage6;
    }

    public String getRummage7() {
        return rummage7;
    }

    public void setRummage7(final String rummage7) {
        this.rummage7 = rummage7;
    }

    public String getRummage8() {
        return rummage8;
    }

    public void setRummage8(final String rummage8) {
        this.rummage8 = rummage8;
    }

    public String getRummage9() {
        return rummage9;
    }

    public void setRummage9(final String rummage9) {
        this.rummage9 = rummage9;
    }

    public String getRummage10() {
        return rummage10;
    }

    public void setRummage10(final String rummage10) {
        this.rummage10 = rummage10;
    }

    public String getRummage11() {
        return rummage11;
    }

    public void setRummage11(final String rummage11) {
        this.rummage11 = rummage11;
    }

    public String getRummage12() {
        return rummage12;
    }

    public void setRummage12(final String rummage12) {
        this.rummage12 = rummage12;
    }

    public String getRummage13() {
        return rummage13;
    }

    public void setRummage13(final String rummage13) {
        this.rummage13 = rummage13;
    }

    public String getRummage14() {
        return rummage14;
    }

    public void setRummage14(final String rummage14) {
        this.rummage14 = rummage14;
    }

    public String getRummage15() {
        return rummage15;
    }

    public void setRummage15(final String rummage15) {
        this.rummage15 = rummage15;
    }

    public String getSum1() {
        return sum1;
    }

    public void setSum1(final String sum1) {
        this.sum1 = sum1;
    }

    public String getSum2() {
        return sum2;
    }

    public void setSum2(final String sum2) {
        this.sum2 = sum2;
    }

    public String getSum3() {
        return sum3;
    }

    public void setSum3(final String sum3) {
        this.sum3 = sum3;
    }

    public String getSum4() {
        return sum4;
    }

    public void setSum4(final String sum4) {
        this.sum4 = sum4;
    }

    public String getSum5() {
        return sum5;
    }

    public void setSum5(final String sum5) {
        this.sum5 = sum5;
    }

    public String getSum6() {
        return sum6;
    }

    public void setSum6(final String sum6) {
        this.sum6 = sum6;
    }

    public String getSum7() {
        return sum7;
    }

    public void setSum7(final String sum7) {
        this.sum7 = sum7;
    }

    public String getSum8() {
        return sum8;
    }

    public void setSum8(final String sum8) {
        this.sum8 = sum8;
    }

    public String getSum9() {
        return sum9;
    }

    public void setSum9(final String sum9) {
        this.sum9 = sum9;
    }

    public String getSum10() {
        return sum10;
    }

    public void setSum10(final String sum10) {
        this.sum10 = sum10;
    }

    public String getSum11() {
        return sum11;
    }

    public void setSum11(final String sum11) {
        this.sum11 = sum11;
    }

    public String getSum12() {
        return sum12;
    }

    public void setSum12(final String sum12) {
        this.sum12 = sum12;
    }

    public String getSum13() {
        return sum13;
    }

    public void setSum13(final String sum13) {
        this.sum13 = sum13;
    }

    public String getSum14() {
        return sum14;
    }

    public void setSum14(final String sum14) {
        this.sum14 = sum14;
    }

    public String getSum15() {
        return sum15;
    }

    public void setSum15(final String sum15) {
        this.sum15 = sum15;
    }

}