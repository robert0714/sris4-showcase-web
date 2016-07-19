package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01440DTO;

public interface Rl01440Service {

    /**
     * 取得特殊註記資料
     * 
     * @param rl01440DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuerySpecialCode(final Rl01440DTO rl01440dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 撤銷特殊註記列表
     * 
     * @param rl01440DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void doDeleteSpecialCode(final Rl01440DTO rl01440dto, final ExecutantType executantType)
            throws RisBusinessException;

}
