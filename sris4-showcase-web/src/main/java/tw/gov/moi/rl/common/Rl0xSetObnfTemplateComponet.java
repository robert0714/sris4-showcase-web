package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfv003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.dto.ObnfDTO;

public interface Rl0xSetObnfTemplateComponet {

    // @Autowired
    // private transient DBFactory dbFactory;
    //
    // @Autowired
    // private transient RisCommon risCommon;
    //
    // @Autowired
    // private transient Rl0xSetComponent rl0xSetComponent;
    //
    // @Autowired
    // private transient Rl0xsetObnfComponet rl0xsetObnfComponet;

    public List<ObnfDTO> makeObnfs(Rldfv003Type tpye, Object rec, ExecutantType exe) throws RisBusinessException;
    // rl0xSetComponent.makeIndexObnfDTO(tpye, exe);
    // rl0xSetComponent.makeRecodeObnfDTO(rec, exe);
    //
    //
    // }
}
