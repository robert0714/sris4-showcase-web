package tw.gov.moi.rl.rl01900.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01900MemoryIdDTO;
import tw.gov.moi.rl.domain.Rl01920DTO;

public interface Rl01920Service {

    String FUNC_REG_TYPE_19201 = "19201";

    String FUNC_REG_TYPE_19202 = "19202";

    String ERROR_MSG_1 = "初始化失敗";

    String ERROR_MSG_2 = "「查詢預設資料」失敗";

    String ERROR_MSG_3 = "「新增編輯資料」失敗";

    String ERROR_MSG_4 = "「儲存補登資料」失敗";

    /** 執行「全國個人概要資料查詢紀錄」服務失敗 */
    String DO_QUERY_ERROR = "執行「全國個人概要資料查詢紀錄」服務失敗";

    String Y100000000 = "Y100000000";

    /**
     * 做初始化
     * 
     * @param rl01920Main1dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl01920DTO rl01920dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢預設資料
     * 
     * @param rl01920Main1dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryDefaultData(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 送出新增編輯資料
     * 
     * @param rl01920Main1dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doSubmitToEditData(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存所有補登資料
     * 
     * @param rl01920Main1dto
     * @param rl01920Main2dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveEditRowDataList(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 產生統號
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void generateNewPersonId(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * RL辦理出生登記通報至親等建立親等關係
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SEND)
    public void doBirthRegister(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * RL辦理出生登記通報至親等建立親等關係
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doGetTldf004m(final Rl01920DTO rl01920dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void loadMemoryIds(final Rl01900MemoryIdDTO rl01900MomeryIdDTO, final ExecutantType executantType)
            throws RisBusinessException;
}
