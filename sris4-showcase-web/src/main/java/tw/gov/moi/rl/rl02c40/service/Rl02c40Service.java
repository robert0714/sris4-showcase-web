package tw.gov.moi.rl.rl02c40.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02c40DTO;

/**
 * 行政區域調整及門牌整編國民身分證換領服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02c40Service {

    String FEE_CODE = "0004";

    String REGISTRATION_ID = "02C40";

    String APPLY_CODE = "043";

    String FEE_ITEM = "初、換領國民身分證";

    String FEE_UNIT = "張";

    final String CATEGORY = "02A11";

    /**
     * 查詢行政區域調整及門牌整編國民身分證換領資料
     * 
     * @param rl02c40dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl02c40DTO rl02c40dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢行政區域調整及門牌整編國民身分證換領資料的申請人及受委託人資料
     * 
     * @param rl02c40dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryApplyAndComm(final Rl02c40DTO rl02c40dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存行政區域調整及門牌整編國民身分證換領資料
     * 
     * @param rl02c40dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl02c40DTO rl02c40dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印國民身分證換領申請書
     * 
     * @param rl02c40dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl02c40DTO rl02c40dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 將資料儲存至 XLDFS043
     * 
     * @param rl02c40dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public void doSaveTemp(final Rl02c40DTO rl02c40dto, final ExecutantType executantType) throws RisBusinessException;
}
