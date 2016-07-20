package tw.gov.moi.rl.rl05250.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05250DTO;


/**
 * 製作統號重複通報表服務介面
 * 
 * @author Alan Lo
 *
 */
public interface Rl05250Service {

    /**
     * 列印逕遷至戶政事務所人數統計表
     * 
     * @param rl08942DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl05250DTO rl05250DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載逕遷至戶政事務所人數統計表
     * 
     * @param rl08942DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl05250DTO rl05250DTO, final ExecutantType executantType)
            throws RisBusinessException;
	
}
