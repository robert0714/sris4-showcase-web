package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f90DTO;

/**
 * 未滿選舉居住期間者遷徙記錄表服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f90Service {

    /**
     * 送出(批次列印)
     * 
     * @param executantType
     * @param rl08f90DTO
     * @throws RisBusinessException
     */
    public void doBatchPrint(Rl08f90DTO rl08f90DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印
     * 
     * @param executantType
     * @param rl08f90DTO
     * @throws RisBusinessException
     */
    public String doPreview(Rl08f90DTO rl08f90DTO, ExecutantType executantType) throws RisBusinessException;

}
