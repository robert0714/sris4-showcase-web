package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05271DTO;

/**
 * 出境滿二年未入境人口通報表處理服務介面
 * 
 * @author 1109001
 * 
 */
public interface Rl05271Service {
    /**
     * 處理出境滿二年未入境人口通報表
     * 
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doExecute(final Rl05271DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doBatch(final Rl05271DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doPrint(final Rl05271DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
