package tw.gov.moi.rl.rl07400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07430DTO;

/**
 * 催告個案資料查詢與列印處理服務介面
 * 
 * @author Alan Lo
 * 
 */
public interface Rl07430Service {

    /**
     * 查詢輸入條件內容
     * 
     * @param rl07430DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl07430DTO rl07430DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢催告書明細資料
     * 
     * @param rl07430DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public Rl07430DTO doView(final Rl07430DTO rl07430DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
