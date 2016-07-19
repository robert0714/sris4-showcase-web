package tw.gov.moi.rl.rl01900.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldfd003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01910DTO;

public interface Rl01910Service {

    // 自國外遷入
    String FUNC_REG_TYPE_19101 = "19101";

    // 初設戶籍
    String FUNC_REG_TYPE_19102 = "19102";

    // 死亡撤銷
    String FUNC_REG_TYPE_19103 = "19103";

    // 中斷遷入補登
    // String FUNC_REG_TYPE_19104 = "19104";

    // 再次申請核準定居/撤銷處分回復定居許可
    String FUNC_REG_TYPE_19105 = "19105";

    String Y100000000 = "Y100000000";

    String ERROR_TEMPLATE = "「統號：%s」在「作業點：%s」%s";

    /**
     * 做初始化
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl01910DTO rl01910dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 產生統號
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void generateNewPersonId(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 查詢預設資料
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryDefaultData(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 送出新增編輯資料
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doSubmitToEditData(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存所有補登資料
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSaveEditList(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 檢查save List中tldf004m資料, 姓名和生日是否一致
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkNameAndBirthdayForSaveList(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 檢查modify Object中tldf004m資料, 姓名和生日是否一致
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void checkNameAndBirthdayForModifyObj(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 以登入的操作者ID 取得今日補登的統號姓名
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    // @RisServiceMethod(MethodType.QUERY)
    // public void loadMemoryIds(final Rl01900MemoryIdDTO rl01900MomeryIdDTO,
    // final ExecutantType executantType)
    // throws RisBusinessException;

    /**
     * 產生識別統號
     * 
     * @param rl01910dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void fiveGenerateNewPersonId(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doQueryFamilyRelationFather(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doQueryFamilyRelationMother(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfd003Type> doQueryRLDFD003(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doGetTldf004m(final Rl01910DTO rl01910dto, final ExecutantType executantType)
            throws RisBusinessException;
}
