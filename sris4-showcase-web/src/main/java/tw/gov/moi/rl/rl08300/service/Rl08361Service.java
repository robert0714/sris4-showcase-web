package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08361DTO;

/**
 * 一戶年終靜態統計資料新增處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl08361Service {

    /**
     * 驗証查詢輸入的資料是否重複
     * 
     * @param rl08361DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl08361DTO rl08361DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存一戶年終靜態統計資料
     * 
     * @param rl08361DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl08361DTO rl08361DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢個人資料
     * 
     * @param rl08361DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void queryData(final Rl08361DTO rl08361DTO, final ExecutantType executantType) throws RisBusinessException;

}
