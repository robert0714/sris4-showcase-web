package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f12DTO;

/**
 * 設定投票所地址資料服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f12Service {

    /**
     * 初始動作
     * 
     * @param executantType
     * @param rl08f12DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doInitPage(Rl08f12DTO rl08f12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f12DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doQuery(Rl08f12DTO rl08f12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存
     * 
     * @param executantType
     * @param rl08f12DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doSave(Rl08f12DTO rl08f12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl08f12DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doDelete(Rl08f12DTO rl08f12DTO, ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 修改
     * 
     * @param executantType
     * @param rl08f12DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doModify(Rl08f12DTO rl08f12DTO, ExecutantType executantType) throws RisBusinessException;
}
