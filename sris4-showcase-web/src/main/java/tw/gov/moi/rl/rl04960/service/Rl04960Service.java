package tw.gov.moi.rl.rl04960.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04960DTO;

public interface Rl04960Service {
    /**
     * 清檔
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    public void cleanData(final Rl04960DTO dto, ExecutantType executantType) throws RisBusinessException;
}
