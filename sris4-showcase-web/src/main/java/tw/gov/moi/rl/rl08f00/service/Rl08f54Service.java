package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f54DTO;

/**
 * 他往工投資料刪除服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f54Service {

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f54DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl08f54DTO rl08f54DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl08f54DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    @WorkStatus(FinalType.FINAL)
    public void doDelete(final Rl08f54DTO rl08f54DTO, final ExecutantType executantType) throws RisBusinessException;

}
