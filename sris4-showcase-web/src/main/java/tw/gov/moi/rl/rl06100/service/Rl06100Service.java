package tw.gov.moi.rl.rl06100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06100DTO;

public interface Rl06100Service {

    /**
     * 統號自動展開
     * 
     * @param rl06100dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doExpand(final Rl06100DTO rl06100dto, final ExecutantType executantType) throws RisBusinessException;

}
