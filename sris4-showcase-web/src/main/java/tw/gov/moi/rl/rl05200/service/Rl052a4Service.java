package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052a4DTO;

public interface Rl052a4Service {

    /**
     * 查詢出生通報查核結果
     * 
     * @param rl052a4dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl052a4DTO rl052a4dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存並發送出生通報查核結果
     * 
     * @param rl052a4dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(final Rl052a4DTO rl052a4dto, final ExecutantType executantType) throws RisBusinessException;

}
