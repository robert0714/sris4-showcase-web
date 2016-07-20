package tw.gov.moi.rl.rl01500.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01520DTO;

public interface Rl01520Service {
	final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－印鑑變更登記申請書歷史資料」至XLDF4T失敗";
	final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
	final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
	final String OPERATION_CODE = RlConstant.OPERATION_CODE_01510;
	final String APPLY_CODE = "019";
	
    /**
     * 設定第一次新增登記畫面初始值
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initOperationDTO(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void loadOperationDTO(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void reviewOperationDTO(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyAppData(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 由輸入資料轉換衍生資料
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void convertData(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 驗證印鑑登記申請資料
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 執行自動組合記事
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void autoNotes(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 刪除印鑑登記資料
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    // public void doDelete(final Rl01520DTO dto, final ExecutantType type)
    // throws RisBusinessException;
    public void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType exe)
            throws RisBusinessException;

    /**
     * 取得罰鍰清單資料
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getFineList(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 編輯罰鍰處分書
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void editFine(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 刪除罰鍰處分書
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteFine(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 暫存「印鑑登記資料」至XLDFTable
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 取得印登字號
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSealNumber(final Rl01520DTO dto, final ExecutantType type) throws RisBusinessException;

}
