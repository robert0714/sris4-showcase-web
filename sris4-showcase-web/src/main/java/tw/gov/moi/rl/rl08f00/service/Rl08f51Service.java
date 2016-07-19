package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f51DTO;

/**
 * 他往工投資料查詢服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f51Service {

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f51DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl08f51DTO rl08f51DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化
     * 
     * @param executantType
     * @param rl08f51DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f51DTO rl08f51DTO, final ExecutantType executantType) throws RisBusinessException;

}
