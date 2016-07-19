package tw.gov.moi.rl.component.mutltiDataPocess;


import java.io.Serializable;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.dto.PairEntry;

public interface RlRemoteCommandLogic {
    
    abstract public Serializable run()throws RisBusinessException ;
    
    void setExecutantType(final tw.gov.moi.ae.domain.ExecutantType ExecutantType);
    
    void setParamaters(final  PairEntry paramaters );
    
    void setExecSiteId(final  String execSiteId );
}
