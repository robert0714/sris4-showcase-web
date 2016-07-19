package tw.gov.moi.rl.component;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RlunlockrecDto;
import tw.gov.moi.rl.domain.UnlockInfoDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;
import tw.gov.moi.rs.domain.RsLockTypeDTO;

public interface RlLockTableComponent {
    
    /**
     * @param executantType
     */
     void unLocalLock( final ExecutantType executantType);


    /**
     * @param sessionId
     * @param info
     * @throws RisBusinessException
     */
     void activeUnlockGlobaBySessionId(final String sessionId, ExecutantType info) throws RisBusinessException;



    /**
     * 除了回傳鎖定型態，0 表示未有相同的鎖定資料，1 被自己鎖定，2 被其他人鎖定 有這些資訊外....還順便回傳被鎖定資訊
     * @param object
     * @param userId
     * @param siteId
     * @param transactionId
     * @return
     * @throws RisBusinessException
     */
     RsLockTypeDTO checkLocalSiteLockType(final Object object,  final String userId, final String siteId, final String transactionId)
	    throws RisBusinessException;

    /**
     * @param personIdList
     * @param siteIds
     * @param executantType
     * @throws RisBusinessException
     */
     void lockMultiPersons(final List<String> personIdList, final List<String> siteIds, final ExecutantType executantType) throws RisBusinessException;

    /**
     * @param transactionId
     * @param siteId
     * @param systemExecutantType
     */
     void recordDeletingLock(String transactionId, String siteId,  ExecutantType systemExecutantType);

    

    /**
     * @param txIdList
     * @param executantType
     */
      void deleteLocalLockByTxIds(final List<String> txIdList,  final ExecutantType executantType);
    
    /**
     * @param executantType
     */
     void unlock(ExecutantType executantType);  
    
    /**
     * @param list
     * @param executantType
     */
     void unlockByRlunlockrecCollection(final Collection<RlunlockrecDto> list, final ExecutantType executantType);
    
    /**
     * @param info
     * @throws RisBusinessException
     */
     void activeUnlockLocalGlobaByExecutantType(final ExecutantType info)throws RisBusinessException;


     /**
      * Unlock by person id.
      * 效能比兩個參數的unlockByPersonId來的差,但是會清除同筆交易序號的token lock 與table entity lock
      * @param personId the person id
      */ 
      void unlockByPersonId(final String personId);
    
      /**
       * Unlock by person id.
       * 效能比一個參數的unlockByPersonId來的要好,而且不會清除其他的peronId的tokenlock
       * @param personId the person id
       * @param transactionId the transaction id
       */
      void unlockByPersonId(final String personId, final String transactionId); 
    /**
     * @return
     */
     Map<String, List<UnlockInfoDTO>>  getAllTableLockInfo();
    
    /**
     * @param personId
     * @param siteId
     * @param exec
     * @return
     */
     RsLockInforDTO checkLockStatusByPersonId(final String personId ,final String siteId ,final ExecutantType exec);
    
    
     RsLockTypeDTO checkLockType(final Object object,final ExecutantType executantType)
	    throws RisBusinessException;
    /**
     * 透過統號..檢查可能包含table lock,token lock 的鎖住資訊
     * **/
     RsLockInforDTO checkAllLockTypeByPersonId(final String personId, String siteId, final ExecutantType exec);
     RsLockInforDTO checkLocalAllLocksById(final String personId, String siteId);
    
}
