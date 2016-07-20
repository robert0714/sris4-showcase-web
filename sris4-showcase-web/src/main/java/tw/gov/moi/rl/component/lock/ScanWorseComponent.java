package tw.gov.moi.rl.component.lock;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.InvalidException;
import tw.gov.moi.rl.domain.UnlockInfoDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;

public interface ScanWorseComponent extends Serializable {
    /***
     * 統號token存在,可是交易序號.idx不存在
     * 回傳的是統號清單
     * ***/
    public List<String> getAbnormalTokenLock();

    /**
     * 得到異常逾時解鎖統號的索引檔資料(key是交易序號,List<String>是統號清單)
     * 
     * @return
     * @throws InvalidException
     * @throws IOException
     */
    public Map<String, List<String>> getTimeOutUnlockTokens() throws InvalidException, IOException;

    public  Map<String , List<String>>   getAbnormalTimeOutUnlockTokens()throws InvalidException, IOException;
    /***
     * 解除 統號token存在,可是交易序號.idx不存在的鎖定情形 ps.此方法要小心使用
     * ***/
    public void unlockAbnormalTokenLock(final String personId);
    
    /***
     * 得到不自動解鎖統號的索引檔資料(key是交易序號,List<String>是統號清單) 
     * @return
     * @throws InvalidException
     * @throws IOException
     * ***/
     public  Map<String , List<String>>  getManualUnlockTokens()throws InvalidException, IOException;
     
     /***
      * 清除統號token存在,可是交易序號.idx不存在的person lock
      * 
      * ***/
     public void clearAbnormalTokenLock();
     
     
     /***
      * 得到不自動解鎖統號的詳細資料 
      * @return
      * @throws InvalidException
      * @throws IOException
      * ***/
     public List<UnlockInfoDTO> getManualUnlockTokenInfoNotFromCfTsai() throws InvalidException, IOException;
     
     
    
     /***
      * 得到(key為交易序號,value為統號list的自動解鎖tokn lock資料)
      * **/ 
     public Map<String, List<UnlockInfoDTO>> getAutoUnlockTokenMap() throws InvalidException, IOException;
     
     /*****
      * 清除不是職權更正的異常table lock
      * ***/
    public void clearTimeOutLocksIndex(final ExecutantType executantType)throws InvalidException;
     
    public Set<String>  getTxIdAbnormalRlx10TokenLok(final ExecutantType executantType) throws InvalidException, IOException;
     
    public List<UnlockInfoDTO> getAllUnlockInfoDTO() throws InvalidException ;

    public Set<String> getTxIdSetByPersonId(final String personId);
    
    public List<RsLockInforDTO> getRllockInfoDtoByPersonId(final String personId);
    
    public List<RsLockInforDTO> getRllockInfoDtoByTableLock(final Object dataEntity) ;

    /**
     * @param personId
     * @return
     */
    public  Set<String> getTxIdTableLockByPersonId(final String personId);
    
    /**
     * @return
     */
    public Map<String ,File[]>  getAllTableLock();
    
    /**
     * @param personId
     * @return
     */
    public  File getTokenLockFileByPersonId(final String personId);
    
    /**
     * @param personId
     * @return
     */
    public Set<File> getFileTableLockByPersonId(final String personId);
    /***
     *使用NIO取得統號被鎖住的相關資訊
     *@param  personId
     *@return RsLockInforDTO
     * **/
    public RsLockInforDTO getRsLockInfoById(final String personId);

    /**
     * @param object
     * @return
     */
    public RsLockInforDTO getRsLockInfoByObject(Object object);
    
    /**
     * Convert. lockInfo
     *
     * @param line the line
     * @param isToken the is token
     * @return the rs lock infor dto
     */
    public RsLockInforDTO convert(final String line, boolean isToken) ;
    
}
