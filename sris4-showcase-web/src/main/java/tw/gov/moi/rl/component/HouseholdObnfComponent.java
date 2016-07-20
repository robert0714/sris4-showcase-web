package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rs.dto.ObnfDTO;


/**
 * Obnf產生元件介面.
 * 
 * @author Data.Cheng
 * 
 */
public interface HouseholdObnfComponent {

    public List<ObnfDTO> getObnfList(String opertionSequence, final ExecutantType exeType) throws RisBusinessException;

}
