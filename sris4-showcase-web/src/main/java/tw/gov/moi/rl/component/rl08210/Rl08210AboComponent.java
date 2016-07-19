package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

public interface Rl08210AboComponent {

    /** 分配出生登記申請書資料(出生者原住民身分) */
    void doBornAllocateBabyAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配出生登記申請書資料(父原住民身分) */
    void doBornAllocateFatAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配出生登記申請書資料(母原住民身分) */
    void doBornAllocateMotAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配死亡登記申請書資料(死亡者原住民身分) */
    void doDeadAllocateAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    /** 分配結婚登記申請書資料(夫原住民身分) */
    void doMRGAllocateFatAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配結婚登記申請書資料(妻原住民身分) */
    void doMRGAllocateMotAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配離婚登記申請書資料(夫原住民身分) */
    void doDEVAllocateHusbandAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配離婚登記申請書資料(妻原住民身分) */
    void doDEVAllocateWifeAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

    /** 分配監護登記申請書資料(原住民身分) */
    void doWardAllocateAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    /** 分配未成年子女權利義務行使負擔登記申請書資料(原住民身分) */
    void doChargeAllocateAbo(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType)
            throws RisBusinessException;

}
