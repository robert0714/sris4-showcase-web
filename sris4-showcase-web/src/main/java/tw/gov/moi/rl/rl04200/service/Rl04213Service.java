package tw.gov.moi.rl.rl04200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04213DTO;

public interface Rl04213Service {

    /**
     * 查詢處理
     * 
     * @param rl04213dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl04213DTO rl04213dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 存檔處理
     * 
     * @param rl04213dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl04213DTO rl04213dto, final ExecutantType executantType) throws RisBusinessException;

}
