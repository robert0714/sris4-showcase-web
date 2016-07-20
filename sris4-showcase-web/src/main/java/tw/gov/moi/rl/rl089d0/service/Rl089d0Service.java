package tw.gov.moi.rl.rl089d0.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089d0DTO;

public interface Rl089d0Service {
    public void doExpand(final Rl089d0DTO rl089d0DTO, final ExecutantType executantType) throws RisBusinessException;
}
