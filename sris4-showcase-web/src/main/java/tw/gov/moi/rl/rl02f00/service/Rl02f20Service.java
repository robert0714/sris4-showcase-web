package tw.gov.moi.rl.rl02f00.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02f20DTO;

/**
 * 製作大宗戶籍謄本介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02f20Service {

    /**
     * 
     * @param pRl02f20DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl02f20DTO pRl02f20DTO, final ExecutantType pExecutantType);

    /**
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(final Rl02f20DTO pRl02f10DTO, final ExecutantType pExecutantType);

    /**
     * 
     * @param pRl02f10DTO
     * @param pExecutantType
     */
    public void doCheck(final Rl02f20DTO pRl02f10DTO, final ExecutantType pExecutantType);
}
