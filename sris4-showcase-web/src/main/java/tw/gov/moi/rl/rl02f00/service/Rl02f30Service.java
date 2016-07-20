package tw.gov.moi.rl.rl02f00.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02f30DTO;

/**
 * 列印大宗戶籍謄本收據介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02f30Service {

    /**
     * 執行查詢
     * 
     * @param pRl02f30DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl02f30DTO pRl02f30DTO, final ExecutantType pExecutantType);

    /**
     * 收據存檔
     * 
     * @param pRl02f30DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(final Rl02f30DTO pRl02f30DTO, final ExecutantType pExecutantType);

    /**
     * 收據列印
     * 
     * @param pRl02f30DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl02f30DTO pRl02f30DTO, final ExecutantType pExecutantType);

    /**
     * 檢核是否已列印收據
     * 
     * @param pRl02f30DTO
     * @param pExecutantType
     */
    public void checkAlreadyPrint(final Rl02f30DTO pRl02f30DTO, final ExecutantType pExecutantType);

}
