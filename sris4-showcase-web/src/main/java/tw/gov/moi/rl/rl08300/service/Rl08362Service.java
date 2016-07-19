package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08362DTO;

/**
 * 戶下個人年終靜態統計資料新增處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl08362Service {

    /**
     * 驗証查詢輸入的資料是否重複
     * 
     * @param rl08362DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl08362DTO rl08362DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存戶下個人年終靜態統計資料新增
     * 
     * @param rl08362DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl08362DTO rl08362DTO, final ExecutantType executantType) throws RisBusinessException;

}
