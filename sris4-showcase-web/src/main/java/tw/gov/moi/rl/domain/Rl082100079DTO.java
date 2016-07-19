package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfs079Type;
import tw.gov.moi.domain.Rldft079Type;
import tw.gov.moi.domain.Rldfw079Type;

public class Rl082100079DTO {
    /** 監護登記申請書資料檔 */
    @XmlElement(name = "Rldfs079Types")
    @FieldName("監護登記申請書資料檔")
    private List<Rldfs079Type> rldfs079Types = new ArrayList<Rldfs079Type>();

    /** 監護登記申請書歷史資料檔 */
    @XmlElement(name = "Rldft079Types")
    @FieldName("監護登記申請書歷史資料檔")
    private List<Rldft079Type> rldft079Types = new ArrayList<Rldft079Type>();

    /** 辦理他所監護登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw079Types")
    @FieldName("rldft079Types")
    private List<Rldfw079Type> rldfw079Types = new ArrayList<Rldfw079Type>();
}
