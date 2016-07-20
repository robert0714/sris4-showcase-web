package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RlunlockrecDto;

public interface RLlockRecCacheComponent {
    
    public void storeMuchCache(final ExecutantType info ,final RlunlockrecDto... rlunlockrecDtoArray) throws RisBusinessException;
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
