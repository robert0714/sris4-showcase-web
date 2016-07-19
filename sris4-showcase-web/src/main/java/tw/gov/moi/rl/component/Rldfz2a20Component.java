/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf001eType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf022dType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02a20DTO;

/**
 * 轉入Rldfz2a20資料介面.
 * 
 * @author CK Lin
 * 
 */
public interface Rldfz2a20Component {

	/**
	 * 執行SQL SCRIPT.
	 * 
	 * @param startYyymmdd
	 *            起始民國年月日
	 * @param endYyymmdd
	 *            迄止民國年月日
	 * @param acceptType
	 *            辦理類別
	 * @param executantType
	 *            使用者資訊
	 */
	void executeRLSql(final String startYyymmdd, final String endYyymmdd, final String acceptType,
			final ExecutantType executantType) throws RisBusinessException;

    /**
     * 修改製作國民身分證送件聯單
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doSave(final Rl02a20DTO rl02a20DTO, final ExecutantType executantType)
    		throws RisBusinessException;

	/**
     * 取得號碼控制檔
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getRldf001e(final Rl02a20DTO rl02a20DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 修改本所新式國民身分證請領記錄檔
     * 
     * @param rldf002dTypeList
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf002d(final List<Rldf002dType> rldf002dTypeList, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 修改他所新式國民身分證請領記錄檔
     * 
     * @param rldf022dTypeList
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf022d(final List<Rldf022dType> rldf022dTypeList, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 修改號碼控制檔
     * 
     * @param rldf001eType
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void modifyRldf001eType(final Rldf001eType rldf001eType, final ExecutantType executantType)
            throws RisBusinessException;
}
