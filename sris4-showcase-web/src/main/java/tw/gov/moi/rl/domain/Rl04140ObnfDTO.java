package tw.gov.moi.rl.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde401wType;
import tw.gov.moi.rs.dto.ObnfDTO;

public class Rl04140ObnfDTO {
    @XmlElement(name = "ObnfsMaps")
    @FieldName("通報紀錄")
    private Map<String, List<ObnfDTO>> ObnfsMaps = new HashMap<String, List<ObnfDTO>>();

    /**
     * 塞通報資料進去
     * 
     * @param obnf
     */
    public void putObnfDTO(ObnfDTO obnf, Rlde401wType type) {
        final List<ObnfDTO> obnfDTOs = ObnfsMaps.get(this.getKeyValue(type));
        if (obnfDTOs == null) {
            final List<ObnfDTO> newObnfDTOs = new ArrayList<ObnfDTO>();
            newObnfDTOs.add(obnf);
            ObnfsMaps.put(this.getKeyValue(type), newObnfDTOs);
        } else {
            obnfDTOs.add(obnf);
        }
    }

    public void putObnfDTO(List<ObnfDTO> obnfs, Rlde401wType type) {
        final List<ObnfDTO> obnfDTOs = ObnfsMaps.get(this.getKeyValue(type));
        if (obnfDTOs == null) {
            final List<ObnfDTO> newObnfDTOs = new ArrayList<ObnfDTO>();
            newObnfDTOs.addAll(obnfs);
            ObnfsMaps.put(this.getKeyValue(type), newObnfDTOs);
        } else {
            obnfDTOs.addAll(obnfs);
        }
    }

    public String getKeyValue(Rlde401wType type) {
        final StringBuffer bur = new StringBuffer();

        bur.append(type.getAreaCode());
        bur.append(type.getOldVillage());
        bur.append(type.getOldNeighbor());
        bur.append(type.getStreetDoorplate());
        return bur.toString();
    }

}
