/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl00003.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.BooleanUtils;
import org.springframework.transaction.annotation.Transactional;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.RlunlockrecType;
import tw.gov.moi.domain.XldftxnoprType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.ForceUnlockRecDTO;
import tw.gov.moi.rl.domain.PaginationDTO;
import tw.gov.moi.rl.domain.PersonDataDTO;
import tw.gov.moi.rl.domain.UnlockInfoDTO;
import tw.gov.moi.rs.domain.RsLockInforDTO;

/**
 * The Interface UnlockMaintainService.
 * 
 * @author Jay Kan
 */
public interface UnlockMaintainService {

    
    /**
     * Gets the page unlock data.
     * 
     * @param pPaginationDTO
     *            the pagination dto
     * @param pExecutantType
     *            the executant type
     * @return the page unlock data
     */
    @RisServiceMethod(MethodType.QUERY)
    List<UnlockInfoDTO> getPageUnlockData(final PaginationDTO pPaginationDTO, final ExecutantType pExecutantType);

   
    
    @RisServiceMethod(MethodType.CONFIRM)
    public void unlockByTransactionId(final String specificTxId, final ExecutantType executantType);
    
    @RisServiceMethod(MethodType.QUERY)
    public List<UnlockInfoDTO>  getRemoteLockInfo(final String txnDate, final ExecutantType pExecutantType) ;
    
    @RisServiceMethod(MethodType.CONFIRM)
    public void unlockByUnlockInfoDTO(final UnlockInfoDTO unitObject, final ExecutantType executantType) ;
    
    public List<RlunlockrecType> findRlunlockrecTypeList(final String specificTxId, final ExecutantType executantType);
    
    
    @Transactional(timeout = RlConstant.TIMEOUT, readOnly = true)
    public   List<XldftxnoprType>  findTListBySQL( final String txId,final ExecutantType pExecutantType);
    
    public List<UnlockInfoDTO>  getAbnormalTimeOutTokenList(final ExecutantType pExecutantType);
    
    /***
     * 回傳被職權更正鎖定戶籍資料的統號清單
     * **/
    public List<UnlockInfoDTO>  getNormalManualTokenList(final ExecutantType pExecutantType);
    
    /****
     * 回傳交易序號索引檔不存在的統號
     * ***/
    public List<String>  getAbnormalTokenList(final ExecutantType pExecutantType);
    /****
     * 刪除交易序號索引檔不存在的統號
     * ***/
    public void unlockAbnormalTokenLock(final String personId , final ExecutantType pExecutantType);
    
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void forceUnlockPeraonData(final PersonDataDTO personDataDTO  ,final ExecutantType pExecutantType);
    
    public Map<String, List<UnlockInfoDTO>>  getAllTableLockInfo(final ExecutantType pExecutantType);


    public RsLockInforDTO checkLockStatusByPersonId(final PersonDataDTO personDataDTO, final ExecutantType executant);
    
    void unlockTableLock(UnlockInfoDTO target, ExecutantType executantType);
    public   void forceUnlockPeraonData(final RsLockInforDTO rsLockInforDTO  ,final ExecutantType pExecutantType);
    /***
     * 減少使用者重複執行起解鎖程序,以避免不必要的資源浪費:
     * 在RlActiveUnlockGlobalListener當中對tmpcontext做出判對flag
     * ,啟動時檢查有無標記,如果有標記表示上一筆程序尚未執行完畢,unlock程序不允許執行 unlock 程序結束(finally)要將標記清除
     * **/
    public boolean  knowIfItHappened(final ExecutantType executantType);
    
    /***
     * 減少左邊選單喚起解鎖程序,以避免不必要的資源浪費:
     * 在RlActiveUnlockGlobalListener當中對tmpcontext做出判對flag
     * ,啟動時檢查有無標記,如果有標記表示上一筆程序尚未執行完畢,unlock程序不允許執行 unlock 程序結束(finally)要將標記清除
     * **/
    public void storeFlag(final Boolean flag,final ExecutantType executantType) throws RisBusinessException ;



    public  List<ForceUnlockRecDTO> loadForceUnlockRecord(ExecutantType executantType);
}
