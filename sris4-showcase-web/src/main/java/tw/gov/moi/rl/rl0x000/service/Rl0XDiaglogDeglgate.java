package tw.gov.moi.rl.rl0x000.service;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;
import tw.gov.moi.rl.domain.Rl0x001DTOResult;

public interface Rl0XDiaglogDeglgate {
    public void putMessage(Rl0x001DTOResult selectUi, Rl0x001DTO mainDto) throws RisBusinessException;
}
