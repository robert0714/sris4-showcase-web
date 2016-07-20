package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfs080Type;
import tw.gov.moi.domain.Rldft080Type;
import tw.gov.moi.domain.Rldfw080Type;

public class Rl08210080DTO {
    /** 未成年子女權利義務行使負擔登記申請書資料檔 */
    @XmlElement(name = "Rldfs080Types")
    @FieldName("未成年子女權利義務行使負擔登記申請書資料檔")
    private List<Rldfs080Type> rldfs080Types = new ArrayList<Rldfs080Type>();

    /** 未成年子女權利義務行使負擔登記申請書歷史資料檔 */
    @XmlElement(name = "Rldft080Types")
    @FieldName("未成年子女權利義務行使負擔登記申請書歷史資料檔")
    private List<Rldft080Type> rldft080Types = new ArrayList<Rldft080Type>();

    /** 辦理他所未成年子女權利義務行使負擔登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw080Types")
    @FieldName("辦理他所未成年子女權利義務行使負擔登記申請書歷史資料檔")
    private List<Rldfw080Type> rldfw080Types = new ArrayList<Rldfw080Type>();
}
