package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl089a0DTO", propOrder = { "rl089a0ResultList", "queryRl089a0Result" })
@XmlRootElement(name = "Rl089a0DTO")
public class Rl089a0DTO implements Serializable {

   
    private static final long serialVersionUID = -1454669559732376758L;

    /** 資料清單 */    
    @XmlElement(name = "Rl089a0ResultList", required = false)
    @FieldName("資料清單")
    private List<Rl089a0ResultDTO> rl089a0ResultList = new ArrayList<Rl089a0ResultDTO>();

    /** 查詢資料 */    
    @XmlElement(name = "QueryRl089a0Result", required = false)
    @FieldName("查詢資料")
    private Rl089a0ResultDTO queryRl089a0Result = new Rl089a0ResultDTO();

    public List<Rl089a0ResultDTO> getRl089a0ResultList() {
        return rl089a0ResultList;
    }

    public void setRl089a0ResultList(List<Rl089a0ResultDTO> rl089a0ResultList) {
        this.rl089a0ResultList = rl089a0ResultList;
    }

    public Rl089a0ResultDTO getQueryRl089a0Result() {
        return queryRl089a0Result;
    }

    public void setQueryRl089a0Result(Rl089a0ResultDTO queryRl089a0Result) {
        this.queryRl089a0Result = queryRl089a0Result;
    }

}
