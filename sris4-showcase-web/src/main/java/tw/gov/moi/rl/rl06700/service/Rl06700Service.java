package tw.gov.moi.rl.rl06700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06700DTO;

/**
 * 整檔刪除已配賦戶號處理服務
 * 
 * @author 1109001
 * 
 */
public interface Rl06700Service {
    /**
     * 整檔刪除已配賦戶號
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    public void doDelete(Rl06700DTO dto, ExecutantType executantType) throws RisBusinessException;

    // public int toSend(Rl06700DTO dto, ExecutantType executantType) throws
    // RisBusinessException;
}
