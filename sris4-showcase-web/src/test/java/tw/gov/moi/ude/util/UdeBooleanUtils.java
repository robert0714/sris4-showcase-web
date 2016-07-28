/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.ude.util;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 */
@UtilityClassAssertion
public final class UdeBooleanUtils {

	/**
	 * constructor.
	 */
	private UdeBooleanUtils() {
		throw new AssertionError();
	}

	public static boolean parse(final String str, boolean defaultValue) {
		if (StringUtils.isBlank(str)) {
			return defaultValue;
		}
		final String target = UdeStringUtils.trim(str);
		final Boolean testByCommons = BooleanUtils.toBooleanObject(target);
		if (testByCommons != null) {
			return testByCommons;
		}

		//
		// 轉半形處理.
		//
		final String helfTarget = UdeStringUtils.toHelfChar(target);
		final Boolean testFullByCommons = BooleanUtils.toBooleanObject(helfTarget);
		if (testFullByCommons != null) {
			return testFullByCommons;
		}
		if ("0".equals(helfTarget)) {
			return false;
		}
		if (helfTarget.matches("\\d+")) {
			return true;
		}
		return defaultValue;
	}
}
