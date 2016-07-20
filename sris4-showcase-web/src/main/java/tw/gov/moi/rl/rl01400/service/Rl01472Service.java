package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01472DTO;

/**
 * 刪除遷出人口特殊註記資料
 * 
 * @author 1109001
 * 
 */
public interface Rl01472Service {
    /**
     * 取得特殊註記資料
     * 
     * @param rl01472DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuerySpecialCode(final Rl01472DTO rl01472dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 撤銷特殊註記列表
     * 
     * @param rl01472DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void doDeleteSpecialCode(final Rl01472DTO rl01472dto, final ExecutantType executantType)
            throws RisBusinessException;
}
