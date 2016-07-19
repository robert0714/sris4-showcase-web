package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.dbo.operator.DBSMain;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0xApplyDTO", propOrder = { "dbs", "dto", "rl0x001DTO", "rec" })
@XmlRootElement(name = "Rl0xApplyDTO")
public class Rl0xApplyDTO<DTO, Record> {
    @XmlElement(name = "dbs")
    @FieldName("職權更正類別")
    private DBSMain dbs;

    @XmlElement(name = "dto")
    @FieldName("dto")
    private DTO dto;

    @XmlElement(name = "rl0x001DTO")
    @FieldName("mainDTO")
    private Rl0x001DTO rl0x001DTO;

    @XmlElement(name = "rec")
    @FieldName("紀錄")
    private Record rec;

    public DBSMain getDbs() {
        return dbs;
    }

    public void setDbs(DBSMain dbs) {
        this.dbs = dbs;
    }

    public DTO getDto() {
        return dto;
    }

    public void setDto(DTO dto) {
        this.dto = dto;
    }

    public Rl0x001DTO getRl0x001DTO() {
        return rl0x001DTO;
    }

    public void setRl0x001DTO(Rl0x001DTO rl0x001dto) {
        rl0x001DTO = rl0x001dto;
    }

    public Record getRec() {
        return rec;
    }

    public void setRec(Record rec) {
        this.rec = rec;

    }
}
