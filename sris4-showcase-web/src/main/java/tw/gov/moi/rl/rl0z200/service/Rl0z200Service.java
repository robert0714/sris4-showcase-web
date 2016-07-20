/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0z200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0z000DTO;

/**
 * 另存電子檔審核作業服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl0z200Service {

    String DS_NAME = "rl0z200.getRedfrptf";
    /** 執行「送通知訊息告知戶籍員，主管已簽核另存電子檔下載申請」服務失敗 */
    String INSERT_REMINDER_ERROR = "執行「送通知訊息告知戶籍員，主管已簽核電子檔案下載申請」服務失敗";

    String rscdFile = "RSCD3322";
    String reminderType = "電子檔案下載核准";
    String approveStr = "您有一筆電子檔案下載申請已被核准。";
    String rejectStr = "您有一筆電子檔案下載申請已被核退。";
    String reportNameStr = "報表為：";
    String rejectReasonStr = "核退原因為：";
    String periodStr = "。";

    /**
     * 執行
     * 
     * @param executantType
     * @param rl0z000DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl0z000DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存
     * 
     * @param executantType
     * @param rl0z000DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(Rl0z000DTO dto, ExecutantType executantType) throws RisBusinessException;

}