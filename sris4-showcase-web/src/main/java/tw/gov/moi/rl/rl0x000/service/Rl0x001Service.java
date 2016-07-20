package tw.gov.moi.rl.rl0x000.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTO;

/**
 * 職權更正申請服務介面.
 */
public interface Rl0x001Service {

    String TEMPLATE = " select * from %s where transaction_id = ? ";

    String QUERY_TABLE_SQL = " select * from rldfv001 where table_code <> ? order by table_type, main_type, func_code";

    String QUERY_RECORD_SQL = " select * from rldfv003 where update_site_id = ? and registrar_id = ? and status <> 'P' and table_type = ? order by apply_date desc, apply_time desc";

    String DOMAIN_TYPE_HBM = "tw/gov/moi/domain/%sType.hbm.xml";

    /**
     * 查詢取得職權更正資料檔列表及職權更正記錄列表.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0x001DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 顯示已經申請之職權更正內容.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public String doShowView(final Rl0x001DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢取得職權更正記錄列表.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */

    public void doQueryRecord(final Rl0x001DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除職權更正索引資料及職權更正記錄.
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
    public void doDelete(final Rl0x001DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
