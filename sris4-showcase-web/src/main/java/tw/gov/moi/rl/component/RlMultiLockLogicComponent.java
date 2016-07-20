package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.PersonDataDTO;
import tw.gov.moi.rl.domain.RlCommitUnlockRecDTO;
import tw.gov.moi.rl.domain.RlMultiLockRequestDto;
import tw.gov.moi.rl.domain.RlMultiLockResponseDto;
import tw.gov.moi.rs.domain.RsLockInforDTO;

public interface RlMultiLockLogicComponent {
    /** WS 鎖定失敗. **/
    final static String ERR_MSG_1 = "WS 鎖定失敗";

    /** WS 解鎖失敗. **/
    final static String ERR_MSG_2 = "WS 解鎖失敗";

    /** WS 檢核鎖定失敗. **/
    final static String ERR_MSG_3 = "WS 檢核鎖定失敗";

    /** WS 檢核鎖定型態失敗. **/
    final static String ERR_MSG_4 = "WS 檢核鎖定型態失敗";
    
    final static String ERR_MSG_CommitUnlockRec = "commitUnlockRec: 「遠端解鎖記錄更新資料」失敗";
    public RlMultiLockResponseDto multiLockLogic(final RlMultiLockRequestDto requestDto)throws RisBusinessException;
    public void commitUnlockRecLogic(final RlCommitUnlockRecDTO rlCommitUnlockRecDTO, final ExecutantType executant) throws RisBusinessException;
    
    public void unlockByPersonDataDTOs(final PersonDataDTO... personDataDTO)throws RisBusinessException;
    public RsLockInforDTO checkLocalLockStatus(final String personId, final String siteId) throws RisBusinessException;
}
