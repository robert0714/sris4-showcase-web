package tw.gov.moi.rl.rl06600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06600DTO;

/**
 * 整檔刪除已配賦統號處理服務
 * 
 * @author 1109001
 * 
 */
public interface Rl06600Service {
    /**
     * 整檔刪除已配賦統號
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doDelete(Rl06600DTO dto, ExecutantType executantType) throws RisBusinessException;
}
