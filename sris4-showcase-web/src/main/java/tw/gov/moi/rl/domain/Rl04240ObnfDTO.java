package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.rs.dto.ObnfDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04240DataDTO", propOrder = { "Action", "Obj" })
@XmlRootElement(name = "Rl04240DataDTO")
public class Rl04240ObnfDTO {

    private List<ObnfDTO> obnfs = new ArrayList<ObnfDTO>();

    private String nowSeqNo = "000000";// seqNo

    private final static int SEQ_LENGTH = 10;

    public void initObnfs() {
        this.obnfs = null;
        this.obnfs = new ArrayList<ObnfDTO>();

    }

    /**
     * 更換序號
     */
    public void changeSeqNo() {
        int seqNo = Integer.parseInt(this.nowSeqNo);
        seqNo += 1;
        this.nowSeqNo = StringUtils.leftPad(seqNo + "", SEQ_LENGTH, "0");
    }

    public void putObnfDTO(ObnfDTO obnf) {
        obnf.setWkProcessSeqNo(this.nowSeqNo);
        this.obnfs.add(obnf);

    }

    public List<ObnfDTO> getObnfs() {
        return obnfs;
    }

}
