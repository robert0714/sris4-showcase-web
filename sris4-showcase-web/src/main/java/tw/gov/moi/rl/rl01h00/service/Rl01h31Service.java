package tw.gov.moi.rl.rl01h00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01h31DTO;

/**
 * 英文拼音查詢資料服務介面
 * 
 * @author Alan Lo
 */
public interface Rl01h31Service {

    /**
     * 英文拼音查詢資料
     * 
     * @param dto
     *            、exec
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void querySpellData(final Rl01h31DTO dto, final ExecutantType exec) throws RisBusinessException;

}
