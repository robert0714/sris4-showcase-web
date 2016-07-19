/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;

/**
 * 轉入Rldfz8130資料介面.
 * 
 * @author Derlin
 * 
 */
public interface Rldfz8130Component {

	/**
	 * 執行SQL SCRIPT.
	 * 
	 * @param yyyMm
	 *            民國年月
	 * @param executantType
	 *            使用者資訊
	 */
	void executeSql(final String yyyMm, final ExecutantType executantType);
}
