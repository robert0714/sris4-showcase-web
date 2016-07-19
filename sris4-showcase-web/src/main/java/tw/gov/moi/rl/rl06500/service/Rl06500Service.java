package tw.gov.moi.rl.rl06500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06500DTO;

/**
 * 列印配賦國民身分證統一編號統計表處理服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl06500Service {

    /**
     * 列印配賦國民身分證統一編號統計表
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl06500DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 下載配賦國民身分證統一編號統計表
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doDownload(final Rl06500DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doArrange(Rl06500DTO dto, ExecutantType executantType);
}
