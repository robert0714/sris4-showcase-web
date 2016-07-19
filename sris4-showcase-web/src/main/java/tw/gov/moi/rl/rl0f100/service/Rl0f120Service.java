package tw.gov.moi.rl.rl0f100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0f120DTO;

public interface Rl0f120Service {

    /**
     * 做初始化
     * 
     * @param rl0f120dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl0f120DTO rl0f120dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 遺失確認查詢處理
     * 
     * @param rl0f120dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doQuery(final Rl0f120DTO rl0f120dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 遺失確認存檔處理
     * 
     * @param rl0f120dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0f120DTO rl0f120dto, final ExecutantType executantType) throws RisBusinessException;
}
