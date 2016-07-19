package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 相差日數共用元件
 * 
 * @author JeremyChen
 * 
 */
public interface Rl08210GenderComponent {

    void doBornAllocateGender(final DBSMain dbi, Rl08210DTO rl08210dto, ExecutantType executantType)
            throws RisBusinessException;

    void doDeadAllocateGender(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doWardAllocateGender(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doChargeAllocateGender(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;
}
