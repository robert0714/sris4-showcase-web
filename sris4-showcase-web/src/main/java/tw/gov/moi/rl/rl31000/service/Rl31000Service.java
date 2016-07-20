package tw.gov.moi.rl.rl31000.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl31000DTO;

/**
 * Rl31000Service
 */
public interface Rl31000Service {

    /**
     * 列印親等關聯資料申請書
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(Rl31000DTO dto, final ExecutantType executantType);

    /**
     * 申辦類別：同一申請案件需重新查詢列印時，要查詢出舊核發案號資料
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl31000DTO dto, ExecutantType executantType);

    /**
     * 驗證己身(當事人)資料
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyPersonalData(Rl31000DTO dto, ExecutantType executantType);

    /**
     * 驗證申請書資料
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyApplyData(Rl31000DTO dto, final ExecutantType executantType);

    /**
     * 取得新的核發案號
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getNewApplyCaseNo(Rl31000DTO dto, ExecutantType executantType);

    /**
     * 儲存申請書及附繳證件資料
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveApplyDocAndAttachDocs(Rl31000DTO dto, final ExecutantType executantType);

    /**
     *刪除申請書及附繳證件資料
     * 
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    public void deleteApplyDocAndAttachDocs(Rl31000DTO dto, ExecutantType executantType);

    /**
     * 新增申請書資料至各個層級或資料庫中
     * @param dto Rl31000DTO
     * @param executantType ExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    public void sendDataToGoal(Rl31000DTO dto, ExecutantType executantType);
}
