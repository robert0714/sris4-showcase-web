package tw.gov.moi.rl.rl02a00.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02a10DTO;

/**
 * 國民身分證請領服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02a10Service {

    String APPLY_CODE_1 = "041";

    String APPLY_CODE_2 = "042";

    String APPLY_CODE_3 = "043";

    String FEE_UNIT = "張";

    /** 掛失類別 */
    String TR_MODE = "02";

    /** 特殊註記正則表示 */
    String SPECIAL_CODE_REG = "H|I|J|K";

    final String OTHER_CERTIFICATE_CODE = "21";

    /** 初、換領 */
    final String CATEGORY_1 = "02A11";

    /** 補領 */
    final String CATEGORY_2 = "02A12";

    /**
     * 初始化國民身分證請領
     * 
     * @param Rl02a10DTO
     *            初始化國民身分證請領
     * @throws RisBusinessException
     *             「初始化國民身分證請領」失敗
     */
    // @RisServiceMethod(MethodType.QUERY)
    public void initOperationDTO(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得申請人 XLDF 資料
     * 
     * @param rl02a10DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void getPersonalXldf(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 驗證國民身分證請領申請資料
     * 
     * @param Rl02A10DTO
     *            結離婚證明書核發
     * @throws RisBusinessException
     *             「驗證國民身分證請領申請資料」失敗
     */
    public void verifyData(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存國民身分證請領申請資料至XLDF Table
     * 
     * @param Rl02A10DTO
     *            結離婚證明書核發
     * @throws RisBusinessException
     *             「儲存國民身分證請領申請資料至XLDF Table」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印國民身分證請領申請書
     * 
     * @param Rl02A10DTO
     *            ,ExecutantType
     * @throws RisBusinessException
     *             「列印國民身分證申請書」失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(List<String> rl02a10dtoList, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 關閉國民身分證請領視窗
     * 
     * @param Rl02A10DTO
     *            ,ExecutantType
     * @throws RisBusinessException
     *             「關閉國民身分證請領視窗」失敗
     */
    public void closeWindow(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 兄弟/姊妹影像資料
     * 
     * @param rl02a10DTO
     * @param executantType
     * @throws RisBusinessException
     */
    // @RisServiceMethod(MethodType.QUERY)
    public void familyMemberImage(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 寄發國民身分證掛失 email
     * 
     * @param rl02a10DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void sendMail(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得規費
     * 
     * @param rl02a10DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void getFee(final Rl02a10DTO rl02a10DTO, final ExecutantType executantType) throws RisBusinessException;

}
