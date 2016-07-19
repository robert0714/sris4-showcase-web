package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07250DTO;

/**
 * 戶口校正/補校正成果統計資料登錄查詢服務介面.
 * 
 * @author 劉嘉煒
 * 
 */
public interface Rl07250Service {
	
	/**
     * Verify data.
     * 
     * @param rl07250DTO
     *            the rl07250 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl07250DTO rl07250DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Save data.
     * 
     * @param rl07250DTO
     *            the rl07250 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    public void saveData(final Rl07250DTO rl07250DTO, final ExecutantType executantType) throws RisBusinessException;
	
}
