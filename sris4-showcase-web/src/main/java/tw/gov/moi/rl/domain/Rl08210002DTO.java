package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfs002Type;
import tw.gov.moi.domain.Rldft002Type;
import tw.gov.moi.domain.Rldfw002Type;

public class Rl08210002DTO {
    /** 死亡登記申請書資料檔 */
    @XmlElement(name = "Rldfs002Types")
    @FieldName("死亡登記申請書資料檔")
    private List<Rldfs002Type> rldfs002Types = new ArrayList<Rldfs002Type>();

    /** 死亡登記申請書歷史資料檔 */
    @XmlElement(name = "Rldft002Types")
    @FieldName("死亡登記申請書歷史資料檔")
    private List<Rldft002Type> rldft002Types = new ArrayList<Rldft002Type>();

    /** 辦理他所死亡登記申請書歷史資料檔 */
    @XmlElement(name = "Rldfw002Types")
    @FieldName("辦理他所死亡登記申請書歷史資料檔")
    private List<Rldfw002Type> rldfw002Types = new ArrayList<Rldfw002Type>();

    public List<Rldfs002Type> getRldfs002Types() {
        return rldfs002Types;
    }

    public void setRldfs002Types(List<Rldfs002Type> rldfs002Types) {
        this.rldfs002Types = rldfs002Types;
    }

    public List<Rldft002Type> getRldft002Types() {
        return rldft002Types;
    }

    public void setRldft002Types(List<Rldft002Type> rldft002Types) {
        this.rldft002Types = rldft002Types;
    }

    public List<Rldfw002Type> getRldfw002Types() {
        return rldfw002Types;
    }

    public void setRldfw002Types(List<Rldfw002Type> rldfw002Types) {
        this.rldfw002Types = rldfw002Types;
    }

    @Override
    public String toString() {
        return "Rl08210002DTO [rldfs002Types=" + rldfs002Types + ", rldft002Types=" + rldft002Types
                + ", rldfw002Types=" + rldfw002Types + "]";
    }

}
