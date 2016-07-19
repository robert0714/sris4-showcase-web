package tw.gov.moi.rl.component.rl08210;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.domain.Rldf011sType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 相差日數共用元件
 * 
 * @author JeremyChen
 * 
 */
public interface Rl08210AgeComponent {

    void doBornAllocateFatherAge(final DBSMain dbi, Rl08210DTO rl08210dto, ExecutantType executantType)
            throws RisBusinessException;

    void doBornAllocateMotherAge(final DBSMain dbi, Rl08210DTO rl08210dto, ExecutantType executantType)
            throws RisBusinessException;

    void doBornCountFatMotAge(final DBSMain dbi, Rl08210DTO rl08210dto, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 出生登記(出生、結婚日期)與父母出生日期比較正確/錯誤
     * 
     * @param rl08210dto
     * @param columeName
     *            (比較欄位)
     * @param errorMsg
     * @param otherCondition
     *            (其他Where條件)
     * @param executantType
     * @param isRight
     *            (正確true/錯誤false)
     * @return
     */
    public List<Rldf011sType> getBornWrongRightFatMotBirDate(final DBSMain dbi, Rl08210DTO rl08210dto,
            String columeName, String errorMsg, String otherCondition, ExecutantType executantType, Boolean isRight);

    void doDeadAllocateAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doDeadCountAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doMRGAllocateHusbandAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doMRGAllocateWifeAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doMRGCountHusbandWifeAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doDEVAllocateHusbandAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doDEVAllocateWifeAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doDEVCountHusbandWifeAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doChargeAllocateFatherAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doChargeAllocateMotherAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    void doChargeCountFatMotAge(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;
}
