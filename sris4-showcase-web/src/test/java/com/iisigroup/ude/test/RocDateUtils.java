/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.test;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.lang.ChineseNumberType;
import com.iisigroup.ude.util.lang.UdeChineseNumberUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * 日期格式輸出(民國年)
 */
@UtilityClassAssertion
public final class RocDateUtils {

	// ================================================
	// == [Enumeration types] Block Start
	// == [Enumeration types] Block End
	// ================================================
	// == [static variables] Block Start
	// == [static variables] Block Stop
	// ================================================
	// == [static Constructor] Block Start

	/**
	 * constructor.
	 */
	private RocDateUtils() {
		throw new AssertionError();
	}

	// == [static Constructor] Block Stop
	// ================================================
	// == [Static Method] Block Start

	// ####################################################################
	// ## [Static Method] FORMAT : LocalDateTime
	// ####################################################################

	/**
	 * 以民國年格式化日期, 數值部分以阿拉伯數字呈現.
	 * 
	 * @param date
	 *            日期
	 * @param pattern
	 *            民國年月日格式
	 * @return 格式化日期
	 */
	public static String format(final LocalDateTime datetime, final String pattern) {
		return format(datetime, pattern, null);
	}

	/**
	 * 以民國年格式化日期.
	 *
	 * @param date
	 *            日期
	 * @param pattern
	 *            民國年月日格式
	 * @param numberType
	 *            中文數字格式
	 * @return 格式化日期
	 */
	public static String format(final LocalDateTime datetime, final String pattern,
			final ChineseNumberType numberType) {
		final int year = datetime.getYear();
		final int yy = (year > 1911) ? (year - 1911) : (year - 1912);
		final int mm = datetime.getMonth().getValue();
		final int dd = datetime.getDayOfMonth();
		final String newPattern = transPattern(numberType, pattern, yy, mm, dd);
		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(newPattern).withLocale(Locale.TAIWAN);
		return formatter.format(datetime);
	}

	// ####################################################################
	// ## [Static Method] FORMAT : Date
	// ####################################################################

	/**
	 * 以民國年格式化日期, 數值部分以阿拉伯數字呈現.
	 * 
	 * @param date
	 *            日期
	 * @param pattern
	 *            民國年月日格式
	 * @return 格式化日期
	 */
	public static String format(Date date, String pattern) {
		return format(date, pattern, null);
	}

	/**
	 * 以民國年格式化日期.
	 *
	 * @param date
	 *            日期
	 * @param pattern
	 *            民國年月日格式
	 * @param numberType
	 *            中文數字格式
	 * @return 格式化日期
	 */
	public static String format(Date date, String pattern, final ChineseNumberType numberType) {
		final Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		final int year = cal.get(Calendar.YEAR);
		final int yy = (year > 1911) ? (year - 1911) : (year - 1912);
		final int mm = cal.get(Calendar.MONTH) + 1;
		final int dd = cal.get(Calendar.DAY_OF_MONTH);
		final String newPattern = transPattern(numberType, pattern, yy, mm, dd);
		return DateFormatUtils.format(date, newPattern);
	}

	private static String transPattern(final ChineseNumberType numberType, String pattern, final int yy, int mm,
			int dd) {
		final String newPattern;
		if (numberType == null) {
			if (yy < 0 && pattern.contains("民國")) {
				newPattern = pattern //
						.replaceAll("民國", "民國前")//
						.replaceAll("twy", String.format("%03d", -yy)) //
						.replaceAll("(?i)y+", String.valueOf(-yy));
			} else {
				newPattern = pattern //
						.replaceAll("twy", String.format("%03d", yy)) //
						.replaceAll("(?i)y+", String.valueOf(yy));
			}
		} else {

			if (yy < 0 && pattern.contains("民國")) {
				newPattern = pattern //
						.replaceAll("民國", "民國前")//
						.replaceAll("(?i)y+", UdeChineseNumberUtils.format(numberType, -yy))//
						.replaceAll("M+", UdeChineseNumberUtils.format(numberType, mm)) //
						.replaceAll("d+", UdeChineseNumberUtils.format(numberType, dd)); //
			} else {
				newPattern = pattern //
						.replaceAll("(?i)y+", UdeChineseNumberUtils.format(numberType, yy))//
						.replaceAll("M+", UdeChineseNumberUtils.format(numberType, mm)) //
						.replaceAll("d+", UdeChineseNumberUtils.format(numberType, dd)); //

			}
		}
		return newPattern;
	}

	// == [Static Method] Block Stop
	// ================================================

}