/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 轉入Rldfz2aa0資料介面.
 * 
 * @author CK Lin
 * 
 */
public interface Rldfz2aa0Component {

	/**
	 * 執行SQL SCRIPT.
	 * 
	 * @param sendYyymmddStart
	 *            送件日期起
	 * @param sendYyymmddEnd
	 *            送件日期迄
	 * @param sendLotNo
	 *            列印序號
	 * @param acceptType
	 *            辦理類別
	 * @param executantType
	 *            使用者資訊
	 */
	void executeRLSql(final String sendYyymmddStart, final String sendYyymmddEnd,
			final String sendLotNo, final String acceptType,
			final ExecutantType executantType) throws RisBusinessException;

}
