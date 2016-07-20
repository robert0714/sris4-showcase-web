package tw.gov.moi.rl.component.rl08210;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.operator.DBSMain;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 教育程度共用元件
 * 
 * @author Andy
 * 
 */
public interface Rl08210EduComponet {

    public <T> void exec(final DBSMain dbi, Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 31 分配出生登記申請書資料(父教育程度-本國籍)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocateTWNFatEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 32 分配出生登記申請書資料(父教育程度-大陸港澳)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocatePRCFatEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 33 分配出生登記申請書資料(父教育程度-外國籍)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocateOtherFatEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 34 分配出生登記申請書資料(母教育程度-本國籍)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocateTWNMotEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 35 分配出生登記申請書資料(母教育程度-大陸港澳)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocatePRCMotEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 36 分配出生登記申請書資料(母教育程度-外國籍)
     * 
     * @param rl08210DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void doBornAllocateOtherMotEdu(final DBSMain dbi, final Rl08210DTO rl08210DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配死亡登記申請書資料(教育程度)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDeadAllocateEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(夫教育程度-本國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocateTWNHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(夫教育程度-大陸港澳)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocatePRCHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(夫教育程度-外國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocateOtherHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(妻教育程度-本國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocateTWNWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(妻教育程度-大陸港澳)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocatePRCWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配結婚登記申請書資料(妻教育程度-外國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doMRGAllocateOtherWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(夫教育程度-本國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocateTWNHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(夫教育程度-大陸港澳)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocatePRCHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(夫教育程度-外國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocateOtherHusbandEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(妻教育程度-本國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocateTWNWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(妻教育程度-大陸港澳)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocatePRCWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配離婚登記申請書資料(妻教育程度-外國籍)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doDEVAllocateOtherWifeEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配未成年子女權利義務行使負擔登記申請書資料(父教育程度)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doChargeAllocateFatEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 分配未成年子女權利義務行使負擔登記申請書資料(母教育程度)
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    void doChargeAllocateMotEdu(final DBSMain dbi, final Rl08210DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

}
