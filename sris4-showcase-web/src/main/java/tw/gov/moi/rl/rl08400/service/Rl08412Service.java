package tw.gov.moi.rl.rl08400.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08412DTO;

/**
 * 國民小學學區清單列印處理服務介面
 * 
 * @author Alan Lo
 * 
 */
public interface Rl08412Service {

    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl08412DTO rl08412DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印國民小學學區清單
     * 
     * @param rl08412DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08412DTO rl08412DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載國民小學學區清單
     * 
     * @param rl08412DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08412DTO rl08412DTO, final ExecutantType executantType) throws RisBusinessException;

}
