package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08970DTO;
import tw.gov.moi.rl.domain.Rl08970DTOResuls;

/**
 * 製作姓名更改記錄及特殊註記名冊服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl08970Service {

    /**
     * 
     * 製作姓名更改記錄及特殊註記名冊
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08970DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 下載
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08970DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢查個人基本資料
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void validateCurrent(final Rl08970DTOResuls dto, final ExecutantType executantType)
            throws RisBusinessException;
}
