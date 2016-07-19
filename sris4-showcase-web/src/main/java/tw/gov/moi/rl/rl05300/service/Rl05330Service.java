package tw.gov.moi.rl.rl05300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05330DTO;

public interface Rl05330Service {

    String ERROR_MSG = "「查詢通報處理狀況」失敗";
    String ERROR_MSG_RESEND = "「重送通報」失敗";

    /**
     * 查詢通報執行記錄
     * 
     * @param rl05330dto
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl05330DTO rl05330dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得message content
     * 
     * @param rl05330dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getMessageContent(final Rl05330DTO rl05330dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * reSend message
     * 
     * @param rl05330dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.NOTICE)
    public void reSend(final Rl05330DTO rl05300dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 更新通報執行記錄檔.
     * 
     * @param rl05330dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    void updateRedfnttl(final Rl05330DTO rl05330dto, final ExecutantType executantType) throws RisBusinessException;

}
