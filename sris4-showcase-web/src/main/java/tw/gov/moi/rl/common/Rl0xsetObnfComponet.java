package tw.gov.moi.rl.common;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;

public interface Rl0xsetObnfComponet {
    public void doSendObbfs(Rl0x001DTO dto, ExecutantType exe) throws RisBusinessException;
}
