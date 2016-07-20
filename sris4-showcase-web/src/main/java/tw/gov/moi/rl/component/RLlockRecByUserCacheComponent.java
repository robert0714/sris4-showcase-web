package tw.gov.moi.rl.component;

import java.io.IOException;
import java.util.List;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.InvalidException;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RlunlockrecDto;

/**
 * 使用者專屬的資料鎖定與解除鎖定服務記錄快取
 * ***/
public interface RLlockRecByUserCacheComponent {
    public void unlockIfLocked(final ExecutantType info) ;
    public void storeMuchCache(final ExecutantType info ,final RlunlockrecDto... rlunlockrecDtoArray) throws RisBusinessException;
    /**
     * 放棄原有索引檔進行重建
     * @param info     AE環境物件{@link #ExecutantType}
     * @throws InvalidException 
     * @throws IOException 
     * **/
    public void rebuildIndex(final ExecutantType info) throws RisBusinessException;
    
    /**
     * Attempts to store lock record cache .（用於儲存RL 鎖定紀錄快取）
     * 
     * @param rlunlockrecDto
     *            鎖定紀錄DTO {@link #RlunlockrecDto}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * 
     * @throws Exception
     *             if obtain() throws RisBusinessException
     */
    public void storeCache(final RlunlockrecDto rlunlockrecDto, final ExecutantType executantType) throws RisBusinessException;
    
    
    
    /**
     * Attempts to query lock record cache .（用於查詢RL 鎖定紀錄快取）
     * 
     * @param rlunlockrecDto
     *            鎖定紀錄DTO {@link #RlunlockrecDto}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return List<RlunlockrecDto>
     * 
     * @throws Exception
     *             if obtain() throws RisBusinessException
     */
    public List<RlunlockrecDto> queryCacheByObject(final RlunlockrecDto rlunlockrecDto, final ExecutantType executantType) throws RisBusinessException;
    
    
    
    
    /**
     * Attempts to clear lock record cache .（用於清除RL 鎖定紀錄快取）
     * 
     * @param rlunlockrecType
     *            鎖定紀錄DTO {@link #RlunlockrecDto}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return List<RlunlockrecDto>
     * 
     * @throws Exception
     *             if obtain() throws RisBusinessException
     */
    public void clearCacheByObject(final RlunlockrecDto rlunlockrecType, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * Attempts to query lock record cache .（用於查詢RL 鎖定紀錄快取）
     * 
     * @param beginTxId
     *            起始交易序號 {@link #String} * @param endTxId 終止交易序號 {@link #String}
     * @param executantType
     *            執行環境參數 {@link #ExecutantType}
     * @return List<RlunlockrecDto>
     * 
     * @throws Exception
     *             if obtain() throws RisBusinessException
     */
    public List<RlunlockrecDto> selectCacheTxIdRange(final String beginTxId, final String endTxId, final ExecutantType info) throws RisBusinessException;
    
}
