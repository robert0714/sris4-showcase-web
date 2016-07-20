package tw.gov.moi.rl.rl08y00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08y10DTO;

public interface Rl08y10Service {

    /**
     * 未處理通報自動查核作業
     * 
     * @param rl08y10DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doBatch(final Rl08y10DTO rl08y10dto, final ExecutantType executantType) throws RisBusinessException;

}
