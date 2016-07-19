package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde401wType;
import tw.gov.moi.domain.Rlde413wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.rl.component.dto.MassMoveVillageDTO;

public class Rl04140RestoreNewDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private int insertSeqNo = 0;

    /** 鎖定交易序號 **/
    @XmlElement(name = "restoreId")
    @FieldName("鎖定交易序號")
    private String restoreId;

    /** 處理的Rlde401w **/
    @XmlElement(name = "Rlde401wData")
    @FieldName("處理的Rlde401w")
    private Rlde401wType rlde401wData;

    /** 處理的Rlde413w **/
    @XmlElement(name = "rlde413wType")
    @FieldName("處理的rlde413w")
    private Rlde413wType rlde413wType;

    @XmlElement(name = "rldf001m")
    @FieldName("處理的rldf001m")
    private Rldf001mType rldf001m;

    @XmlElement(name = "rldf004m")
    @FieldName("處理的rldf004m")
    private Rldf004mType rldf004m;

    @XmlElement(name = "rldf019m")
    @FieldName("處理的rldf019m")
    private Rldf019mType rldf019m;

    @XmlElement(name = "rldf020m")
    @FieldName("處理的rldf020m")
    private Rldf020mType rldf020m;

    private Map<String, MassMoveVillageDTO> villageMap = new HashMap<String, MassMoveVillageDTO>();

    public Map<String, MassMoveVillageDTO> getVillageMap() {
        return villageMap;
    }

    public void setVillageMap(Map<String, MassMoveVillageDTO> villageMap) {
        this.villageMap = villageMap;
    }

    public String getRestoreId() {
        return restoreId;
    }

    public void setRestoreId(String restoreId) {
        this.restoreId = restoreId;
    }

    public Rldf020mType getRldf020m() {
        return rldf020m;
    }

    public void setRldf020m(Rldf020mType rldf020m) {
        this.rldf020m = rldf020m;
    }

    public Rldf019mType getRldf019m() {
        return rldf019m;
    }

    public void setRldf019m(Rldf019mType rldf019m) {
        this.rldf019m = rldf019m;
    }

    public Rldf001mType getRldf001m() {
        return rldf001m;
    }

    public void setRldf001m(Rldf001mType rldf001m) {
        this.rldf001m = rldf001m;
    }

    public Rlde413wType getRlde413wType() {
        return rlde413wType;
    }

    public void setRlde413wType(Rlde413wType rlde413wType) {
        this.rlde413wType = rlde413wType;
    }

    public int getInsertSeqNo() {
        return insertSeqNo;
    }

    public void setInsertSeqNo(int insertSeqNo) {
        this.insertSeqNo = insertSeqNo;
    }

    public Rlde401wType getRlde401wData() {
        return rlde401wData;
    }

    public void setRlde401wData(Rlde401wType rlde401wData) {
        this.rlde401wData = rlde401wData;
    }

    public Rldf004mType getRldf004m() {
        return rldf004m;
    }

    public void setRldf004m(Rldf004mType rldf004m) {
        this.rldf004m = rldf004m;
    }

}
