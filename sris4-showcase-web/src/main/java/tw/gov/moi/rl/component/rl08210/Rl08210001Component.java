package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210001Component {

    void doWork(DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

}
