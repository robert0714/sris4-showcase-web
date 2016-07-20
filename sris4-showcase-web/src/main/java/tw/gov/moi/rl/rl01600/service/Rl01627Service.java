package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01627DTO;

public interface Rl01627Service {

    /**
     * 驗證查詢處理
     * 
     * @param rl01627dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl01627DTO rl01627dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行處理
     * 
     * @param rl01627dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01627DTO rl01627dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 門牌查詢處理
     * 
     * @param rl01627dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryDoor(final Rl01627DTO rl01627dto, final ExecutantType executantType) throws RisBusinessException;

}
