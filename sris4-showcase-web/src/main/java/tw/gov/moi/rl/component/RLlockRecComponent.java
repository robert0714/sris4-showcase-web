package tw.gov.moi.rl.component;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.RlunlockrecType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RlunlockrecDto;

public interface RLlockRecComponent {
    public void recordLock(final Object dataEntity, final ExecutantType info)throws RisBusinessException;;
    public void recordLock(final String personId ,  final String dataSiteId , final ExecutantType info)throws RisBusinessException; ;
    
    public String getContentId(final Object dataEntity)throws RisBusinessException;;
    
    public List<String> getKeysByClass(final Class<?> hibernateEntityClazz);
    
    public  void recordDeletingLock(final String transactionId, final String dataSiteId, final ExecutantType executantType)throws RisBusinessException; 
    
    public  void removeRecordMuchLock( final ExecutantType executant,final RlunlockrecDto... rlunlockDtos );
    
    public Map<String, String> getMapKeys(final RlunlockrecType aRlunlockrecType)throws RisBusinessException;;
    public void recordLock(final String sessionId, final String queryClassTypeCanonicalName, final String contentId, final String dataSiteId,
	    final ExecutantType info) throws ClassNotFoundException;
    
    // 拿鎖定紀錄作為tokn鎖定快取
    public Set<String> getToknLockCachePool(final ExecutantType executantType)throws RisBusinessException;;
    
    public String[] getContentIds(final List<?> objList, final Map<String, InputStream> classXMLmessage, final Map<String, List<String>> classkeyMap) throws RisBusinessException;
    
    public  void recordDeletingLockNoDelCache(final String transactionId, final String dataSiteId, final ExecutantType executant) ;
    
    public void processRlunlockrecDataBySeesionId(final String sessionId, final String dataSiteId, final ExecutantType executant);
    
    public void recordLockByDB(final Object dataEntity, final ExecutantType info) ;
    
    public void recordLockByDB(final String sessionId, final String queryClassTypeCanonicalName, final String contentId, final String dataSiteId,
	    final ExecutantType info)throws ClassNotFoundException;
    
    public void recordMuchLock(final ExecutantType info,final String[]...  personIdDataSiteIdArray);
    public  void recordDeletingLockNoDelCacheWithTx(final String transactionId, final String dataSiteId, final ExecutantType executant) ;
}
