package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f53DTO;

/**
 * 他往工投資料修改服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f53Service {

    /**
     * 初始化頁面
     * 
     * @param rl08f53DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl08f53DTO rl08f53DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f53DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl08f53DTO rl08f53DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 修改
     * 
     * @param executantType
     * @param rl08f53DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doUpdate(final Rl08f53DTO rl08f53DTO, final ExecutantType executantType) throws RisBusinessException;

}
