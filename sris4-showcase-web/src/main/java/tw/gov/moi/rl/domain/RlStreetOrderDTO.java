package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlStreetResultDTO", propOrder = { "start", "last" })
@XmlRootElement(name = "rlStreetResultDTO")
public class RlStreetOrderDTO {

    @XmlElement(name = "Start")
    @FieldName("起頭")
    private Integer start;

    @XmlElement(name = "Last")
    @FieldName("尾巴")
    private Integer last;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

}
