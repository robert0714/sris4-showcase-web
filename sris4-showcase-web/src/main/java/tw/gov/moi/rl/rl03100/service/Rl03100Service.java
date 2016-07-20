/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03100hDTO;
import tw.gov.moi.rl.dto.rl03100.Rl03100DTO;
import tw.gov.moi.rs.dto.Rc11000WsDTO;

/**
 * 明細戶籍資料查詢處理服務
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl03100Service {

    // private transient final String dsRldf047h = "rl03100.getRldf047h";
    // private transient final String dsRldf002h = "rl03100.getRldf002h";
    final String dsRldfm11h = "rl03100.getRldfm11h";
    // private transient final String dsRldf005h = "rl03100.getRldf005h";
    final String dsRldf008h = "rl03100.getRldf008h";
    final String dsRldf004hi = "rl03100.getRldf004hi";
    // private transient final String dsRldf004h = "rl03100.getRldf004h";
    // private transient final String dsRldf004hl = "rl03100.getRldf004hl";
    // private transient final String dsRldf001h = "rl03100.getRldf001h";
    final String dsRldfm01h = "rl03100.getRldfm01h";
    final String dsRldfm02h = "rl03100.getRldfm02h";
    final String dsRldfm05h = "rl03100.getRldfm05h";
    final String dsRldfm06h = "rl03100.getRldfm06h";

    // private transient final String dsRldf018d = "rl03100.getRldf018d";
    // private transient final String dsRldf028d = "rl03100.getRldf028d";

    /**
     * 戶籍大簿明細戶籍資料查詢
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    // @WorkStatus(FinalType.FINAL)
    // @RisServiceMethod(value = MethodType.QUERY)
    void doHouseHoldQuery(final Rl03100DTO rl03100DTO, final ExecutantType executantType);

    /**
     * 查詢明細戶籍資料－現戶簿頁
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(value = MethodType.QUERY)
    void doMQuery(final Rl03100DTO rl03100DTO, final ExecutantType executantType);

    /**
     * 查詢明細戶籍資料－除戶簿頁索引
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(value = MethodType.QUERY)
    void doHQueryIndex(final Rl03100DTO rl03100DTO, final ExecutantType executantType);

    /**
     * 查詢明細戶籍資料－除戶簿頁明細
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    // @WorkStatus(FinalType.FINAL)
    // @RisServiceMethod(value = MethodType.QUERY)
    void doHQueryDetail(final Rl03100DTO rl03100DTO, final ExecutantType executantType);

    /**
     * 戶籍簿冊資料查詢
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    // @WorkStatus(FinalType.FINAL)
    // @RisServiceMethod(value = MethodType.QUERY)
    Rc11000WsDTO doRIQuery(final Rl03100DTO rl03100DTO, final ExecutantType executantType);

    /**
     * 複製除戶日期時間
     * 
     * @param Rl03100hDTO
     * @param executantType
     */
    void copyRemoveDateTime(final Rl03100hDTO dto, final ExecutantType executantType);

    /**
     * 查詢戶口名簿領補換記錄的明細資料
     * 
     * @param rl03100DTO
     * @param executantType
     * @throws RisBusinessException
     */
    // @WorkStatus(FinalType.FINAL)
    // @RisServiceMethod(value = MethodType.QUERY)
    void doQueryRldf018dDetail(final Rl03100DTO rl03100DTO, final ExecutantType executantType);
}
