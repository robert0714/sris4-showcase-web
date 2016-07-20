package tw.gov.moi.rl.rl01900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01930DTO;

public interface Rl01930Service {

    /**
     * 查詢補登資料
     * 
     * @param rl01930dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryPersonData(final Rl01930DTO rl01930dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 移除所選取補登資料
     * 
     * @param rl01930dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void submitRemovePersonData(final Rl01930DTO rl01930dto, final ExecutantType executantType)
            throws RisBusinessException;

}
