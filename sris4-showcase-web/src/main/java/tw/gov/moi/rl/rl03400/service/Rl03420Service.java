package tw.gov.moi.rl.rl03400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03420DTO;

public interface Rl03420Service {

    String DS_NAME = "rl03420.getRldfj001";

    /**
     * 查詢批次作業設定
     * 
     * @param rl03420dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl03420DTO rl03420dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除批次作業設定
     * 
     * @param rl03420dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doDelete(final Rl03420DTO rl03420dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 加入排程
     * 
     * @param rl03420dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void doAddToSchedule(final Rl03420DTO rl03420dto, final ExecutantType executantType)
            throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doVerifyData(final Rl03420DTO rl03420dto, final ExecutantType executantType)
            throws RisBusinessException;

}
