package tw.gov.moi.rl.rl06200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06200DTO;

public interface Rl06200Service {

    /**
     * 戶號自動展開
     * 
     * @param rl06200dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doExpand(final Rl06200DTO rl06200dto, final ExecutantType executantType) throws RisBusinessException;

}
