package tw.gov.moi.rl.rl01j00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01j00DTO;

/**
 * 國民身分證新增掛失紀錄服務介面.
 */
public interface Rl01j00Service {

    final String REPORT_NAME = "RLRP01J00";

    final Integer SEQUENCE_ID = 1;

    final Integer SERIAL_NO = 1;

    /**
     * 查詢國民身分證掛失紀錄.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl01j00DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增國民身分證掛失紀錄.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01j00DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印掛失/撤銷掛失國民身分證申請紀錄表.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl01j00DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.DELETE)
    public void doDeleteXldfm06m(final Rl01j00DTO pRl01j00DTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE2TEMP)
    public void doSaveXldfm06m(final Rl01j00DTO pRl01j00DTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

}
