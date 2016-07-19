package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 死亡
 * 
 * @author Andy
 * 
 */
public interface Rl08210002Component {

    /**
     * 轉錄
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doWork(DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;
}
