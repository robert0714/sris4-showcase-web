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
public interface Rl08210ClassifyDayComponent {

    public <T> void doAllocateClassifyDay(DBSMain dbi, Rl08210DTO dto, Class<T> target, ExecutantType executantType)
            throws RisBusinessException;

    // public void doBornAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;

    // public void doDeadAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;
    //
    // public void doMRGAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;
    //
    // public void doDEVAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;
    //
    // public void doGAWardAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;
    //
    // public void doWardAllocateClassifyDay(Rl08210DTO dto, ExecutantType
    // executantType) throws RisBusinessException;
    //
    // public void doNoHouRegMGRAllocateClassifyDay(Rl08210DTO dto,
    // ExecutantType executantType);
    //
    // public void doNoHouRegDEVAllocateClassifyDay(Rl08210DTO dto,
    // ExecutantType executantType);

}
