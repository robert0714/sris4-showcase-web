package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.xldf.dto.XLDF001M;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rs.dto.ObnfDTO;

public interface IdChangeObnfComponent {

    public List<ObnfDTO> makeHouseholdDataObnfDTO(XLDF001M xldf001m, String oldHouseholdHeadId,
            ExecutantType executantType) throws RisBusinessException;

    public List<ObnfDTO> makePersonDataObnfDTO(boolean isSameHost, XLDF004M xldf004m, XLDF001M xldf001m,
            String oldPersonId, ExecutantType executantType) throws RisBusinessException;

    public List<ObnfDTO> makeRelatedAndMemberDataObnfDTO(String personId, Integer operationSequenceId,
            ExecutantType executantType) throws RisBusinessException;

}
