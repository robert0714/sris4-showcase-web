package tw.gov.moi.rl.rl04930.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04930DTO;

/**
 * Rl4930跨行政區域調整登錄資料更正
 * 
 * @author Jason Huang
 */
public interface Rl04930Service {
    /**
     * 登錄載入畫面資料
     * 
     * @param Rl04930DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：資料驗證失敗(TX-6387-E) 載入資料登錄跨區行政區域調整
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initQueryData(Rl04930DTO rl04930DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入編輯資料
     * 
     * @param Rl04930DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：資料驗證失敗(TX-6387-E) 載入編輯資料登錄跨區行政區域調整
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void editQueryData(Rl04930DTO rl04930DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除選取資料
     * 
     * @param Rl04930DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行存檔失敗(TX-6363-E) 刪除跨行政區域調整登錄資料
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteData(Rl04930DTO rl04930DTO, ExecutantType executantType) throws RisBusinessException;

}
