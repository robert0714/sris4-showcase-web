package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.ForceUnlockRecDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;

public interface UnlockActRecComponent {

    void record(RsLockInforDTO rsLockInforDTO, ExecutantType pExecutantType);
    
    public List<ForceUnlockRecDTO> retrieveRecord(final  ExecutantType exec);
}
