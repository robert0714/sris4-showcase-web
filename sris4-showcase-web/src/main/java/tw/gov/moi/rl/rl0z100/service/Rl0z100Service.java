/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0z100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0z000DTO;

/**
 * 另存電子檔申請作業服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl0z100Service {

    String DS_NAME = "rl0z100.getRedfrptf";

    String INSERT_REMINDER_ERROR = "執行「發送通知訊息給主管簽核電子檔案下載申請」服務失敗";

    String reminderType = "電子檔案下載申請";
    String reminderContent = "您有電子檔案下載申請待核准。請進入電子檔案核准作業，進行核准/核退功能。";
    String roleId = "RL00011";

    /**
     * 查詢
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