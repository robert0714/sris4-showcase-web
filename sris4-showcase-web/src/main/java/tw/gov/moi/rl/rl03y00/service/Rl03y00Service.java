package tw.gov.moi.rl.rl03y00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03y00DTO;

/**
 * 國民身分證查詢掛失紀錄服務介面
 * 
 * @author Alan Lo
 */
public interface Rl03y00Service {

    // String DS_NAME_RCDFM06M_OFFLINE =
    // "RcQueryIdCardLossWS.getRcdfm06mOffLine";
    //
    // String DS_NAME_RCDFM06M_UNHANDLED =
    // "RcQueryIdCardLossWS.getRcdfm06mUnhandled";

    String DS_NAME_RCDFM06M_OFFLINE = "rl03y00.getRcdfm06mOffLine";

    String DS_NAME_RCDFM06M_UNHANDLED = "rl03y00.getRcdfm06mUnhandled";

    String RL03Y00_GET_RLDFM06M = "rl03y00.getRldfm06m";

    /**
     * 查詢輸入條件內容
     * 
     * @param rl03y00DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl03y00DTO rl03y00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 離線查詢輸入條件內容
     * 
     * @param rl03y00DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryOffLine(final Rl03y00DTO rl03y00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 查詢未處理紀錄
     * 
     * @param rl03y00DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryUnhandled(final Rl03y00DTO rl03y00DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * DataTable 確認按鈕
     * 
     * @param rl03y00DTO
     *            ,executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doConfirm(final Rl03y00DTO rl03y00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢 RLDFM06M
     * 
     * @param rl03y00DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldfm06m(final Rl03y00DTO rl03y00DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
