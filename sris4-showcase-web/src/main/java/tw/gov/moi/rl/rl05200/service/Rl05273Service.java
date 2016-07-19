package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05273DTO;

/**
 * 重製出境滿二年未入境人口通報表處理服務介面
 * 
 * @author Andy
 * 
 */
public interface Rl05273Service {
    /**
     * 列印出境滿二年未入境人口通報表
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl05273DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載出境滿二年未入境人口通報表
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doDownload(final Rl05273DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
