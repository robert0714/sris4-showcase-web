package tw.gov.moi.rl.rl02f00.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02f10DTO;

/**
 * 受理大宗戶籍謄本申請介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02f10Service {

    /**
     * RL02F10 初始化
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    public void initPage(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 執行查詢大宗戶籍謄本案件檔
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 新增大宗戶籍謄本案件檔
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 修改大宗戶籍謄本案件檔
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    public void doModify(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 取得個人資料
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getPersonData(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 取得個人資料(修改視窗)
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    public void getModifyPersonData(final Rl02f10DTO pRl02f10DTO, final ExecutantType pExecutantType);

}
