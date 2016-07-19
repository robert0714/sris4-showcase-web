package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f52DTO;

/**
 * 他往工投資料新增服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f52Service {

    final String QUERY_RLDE809W_DS_NAME = "rl08f52_1.getRlde809w";

    final String QUERY_RLDE806W_DS_NAME = "rl08f52_1.getRlde806w";

    /**
     * 初始化頁面
     * 
     * @param rl08f52DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl08f52DTO rl08f52DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f52DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl08f52DTO rl08f52DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增
     * 
     * @param executantType
     * @param rl08f52DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl08f52DTO rl08f52DTO, final ExecutantType executantType) throws RisBusinessException;

}
