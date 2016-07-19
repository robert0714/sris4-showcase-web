package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08363DTO;

/**
 * 年終靜態個人資料修改處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl08363Service {

    /**
     * 驗証查詢輸入的資料是否重複
     * 
     * @param rl08363DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl08363DTO rl08363DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存年終靜態個人資料修改
     * 
     * @param rl08363DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl08363DTO rl08363DTO, final ExecutantType executantType) throws RisBusinessException;

}
