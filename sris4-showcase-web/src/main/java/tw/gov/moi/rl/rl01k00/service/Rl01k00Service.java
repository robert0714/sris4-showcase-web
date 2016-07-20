package tw.gov.moi.rl.rl01k00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01k00DTO;

/**
 * 登錄一次告知單處理服務介面.
 */
public interface Rl01k00Service {

    /** The Constant DS_NAME_1. */
    String DS_NAME_1 = "Rl01k00.getRldf004m";

    String RLDF001E = "rldf001e";
    String RLDFG001 = "rldfg001";
    String RLDFG002 = "rldfg002";

    String QUESTION_MARK = "=?";

    String AND_CONDITION = " and ";

    /** 新增一次告知單 */
    @RisServiceMethod(MethodType.VERIFY)
    public Rl01k00DTO addData(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 資料驗證並儲存、修改資料 */
    @RisServiceMethod(MethodType.VERIFY)
    public void confirmInsertModifyData(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 儲存一次告知單 */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void insertData(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 修改一次告知單 */
    @RisServiceMethod(MethodType.QUERY)
    public void modifyData(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 確定儲存一次告知單 */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void sureToSaveData(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 查詢一次告知單應付繳書件 */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 列印一次告知單報表檔 */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 儲存一次告知單 */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldfg002(final Rl01k00DTO rl01k00DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
