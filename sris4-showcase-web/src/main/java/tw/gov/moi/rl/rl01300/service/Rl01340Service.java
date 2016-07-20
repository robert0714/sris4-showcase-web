package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01340DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 分合登記服務
 * 
 * @author Andy
 * 
 */
public interface Rl01340Service {

    final static String HOUSEHOLD_HEAD_NAME = "戶長";

    final static String OUT_REMARK = "遷出地";

    final static String IN_REMARK = "遷入地";

    Rl01340DTO loadOperationDTO(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    Rl01340DTO reviewOperationDTO(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化分合登記
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01340DTO initOperationDTO(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增分合人員
     */
    void doReomveMoveOutMember(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 移除分合人員
     */
    void doAddMoveOutMember(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 自立新戶
     */
    void doNewHouseHold(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     */
    void verifyAppData(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 組合記事
     */
    void autoNotes(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢查「國民身分證掛失註記」
     */
    void checkCardLost(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢查「教育程度」
     */
    void cehckEducation(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 建立「分合遷出地資料」相關資料
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void buildOutHouseholdData(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢核是否已完成資料驗證
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    String checkIsVerifyData(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得戶長姓名
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void getHouseHoldName(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldfs(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除分合出登記資料
     * 
     * @param dto
     * @param exe
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl01340DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 將DTO檔案反序列化成DTO物件。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     */
    public Rl01340DTO loadTempFile(final Rl01340DTO dto, final ExecutantType exec);

    /**
     * 將DTO物件序列化成檔案。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01340DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 取得多個當事人個人資料(大戶)
     * 
     * @param Rl01340DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryPeopleBigHousehold(final Rl01340DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 預設當事人資料與戶內成員清單(大戶)
     * 
     * 
     * @param Rl01340DTO
     * @param executantType
     * @throws RisBusinessException
     * 
     */
    @RisServiceMethod(MethodType.QUERY)
    void procApplyKind_BigHousehold(Rl01340DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO
     * 
     * @param Rl01340DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    void clearBigHouseholdQryDTO(final Rl01340DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
