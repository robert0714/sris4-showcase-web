package tw.gov.moi.rl.rl04910.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04910DTO;

/**
 * Rl4910登錄跨行政區域調整
 * 
 * @author Jason Huang
 */
public interface Rl04910Service {

    /**
     * 驗証查詢畫面輸入資料
     * 
     * @param Rl04910DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：資料驗證失敗(TX-6387-E) 資料驗證登錄跨區行政區域調整
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyAppData(Rl04910DTO rl04910DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存登錄跨行政區域調整
     * 
     * @param Rl04910DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行存檔失敗(TX-6363-E) 儲存登錄跨行政區域調整
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl04910DTO rl04910DTO, ExecutantType executantType) throws RisBusinessException;
}