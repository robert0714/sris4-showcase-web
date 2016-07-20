package tw.gov.moi.rl.job;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052e1DTO;

public interface Rl052e1JobInterface {
    public void doProcess(final Rl052e1DTO rl052e1DTO, final ExecutantType executantType) throws RisBusinessException;

}
