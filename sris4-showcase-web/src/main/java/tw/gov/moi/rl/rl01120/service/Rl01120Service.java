package tw.gov.moi.rl.rl01120.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfd003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01120DTO;

/**
 * 更正全戶動態記事服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl01120Service {

    /** 補填 */
    String CHANGE_TITLE_0C8 = "0C8";

    /** 更正 */
    String CHANGE_TITLE_0AG = "0AG";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param Rl01120DTO
     *            the rl01120 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initLoadPage(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 第一次呼叫狀態時載入補填、更正個人記事DTO.
     * 
     * @param Rl01120DTO
     *            the rl01120 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initOperationDTO(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 編輯狀態時載入補填、更正個人記事DTO.
     * 
     * @param rl01120DTO
     * @param executantType
     * @return Rl01120DTO
     * @throws RisBusinessException
     */
    public Rl01120DTO loadOperationDTO(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入補填、更正個人記事DTO.
     * 
     * @param rl01120DTO
     * @param executantType
     * @return Rl01120DTO
     * @throws RisBusinessException
     */
    public Rl01120DTO reviewOperationDTO(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除補填、更正個人記事資料.
     * 
     * @param Rl01120DTO
     *            the rl01120 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證.
     * 
     * @param Rl01120DTO
     *            the rl01120 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyAppData(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存補填、更正個人記事申請資料至XLDF Table.
     * 
     * @param Rl01120DTO
     *            the rl01120 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢 RLDFD003 製作 auto complete
     * 
     * @param Rl01120DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfd003Type> doQueryRLDFD003(final Rl01120DTO rl01120DTO, final ExecutantType executantType) throws RisBusinessException;

}
