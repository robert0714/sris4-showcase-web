/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.date;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.trace.annotation.FunctionCode;
import com.iisigroup.ude.util.lang8.date.RocDateUtils;
import com.iisigroup.ude.util.lang8.date.UdeTimeUtils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.MinguoDate;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 民國年月日(YYYMMDD)格式工具程式.
 * 
 * ! 處理 ROC YYYMMDD 日期格式的相關工具。 ! 處理格式為七碼的民國日期：yyymmdd、民國前為 -yymmdd。 !
 * 原則上傳入的日期字串必須符合 patternYYYMMDD 定義的日期格式 : YYYMMDD。
 */
@UtilityClassAssertion
public final class YYYMMDDUtils {

	// ================================================
	// == [static variables] Block Start

	/** 日期格式:YYYMMDD , Example:0970601. */
	private static final Pattern patternYYYMMDD = Pattern
			.compile("(-\\d{2}|\\d{3})(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])");

	/** The Constant patternYYMMDD. */
	private static final Pattern patternYYMMDD = Pattern
			.compile("(\\d{2})(0[1-9]|1[012])(0[1-9]|1[0-9]|2[0-9]|3[01])");

	// == [static variables] Block Stop
	// ================================================
	// == [Constructors] Block Start (含init method)

	/**
	 * 公用函式類別, 無外部建構子.
	 */
	private YYYMMDDUtils() {
		throw new AssertionError();
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start

	/**
	 * 判斷日期是否合法。
	 * 
	 * @param yyymmdd
	 *            七碼民國年月日。
	 * @return <code>true</code> 代表日期合法; 否則回傳 <code>false</code>。
	 */
	@FunctionCode("格式檢核")
	public static boolean check(final String yyymmdd) {
		return innerCheck(yyymmdd) != null;
	}

	/**
	 * 判斷日期是否合法，可傳入特殊例外日期字串。.
	 *
	 * @param yyymmdd
	 *            七碼民國年月日。
	 * @param ignores
	 *            例外日期字串。 如 "0000000", "", "-------"
	 * @return <code>true</code> 代表日期合法; 否則回傳 <code>false</code>。
	 */
	@FunctionCode("格式檢核")
	public static boolean checkWithIgnores(final String yyymmdd,
			final String... ignores) {
		if (ignores != null) {
			for (final String ignore : ignores) {
				if (StringUtils.equals(yyymmdd, ignore)) {
					return true;
				}
			}
		}
		return innerCheck(yyymmdd) != null;
	}

	/**
	 * Inner check.
	 */
	private static MinguoDate innerCheck(final String yyymmdd) {
		if (StringUtils.length(yyymmdd) != 7) {
			return null;
		}
		final Pattern pattern1 = Pattern.compile("^-[0-9]{6}$");
		final Pattern pattern2 = Pattern.compile("^[0-9]{7}$");
		final Matcher isNum1 = pattern1.matcher(yyymmdd);
		final Matcher isNum2 = pattern2.matcher(yyymmdd);
		if (!isNum1.matches() && !isNum2.matches()) {
			return null;
		}
		final String strY = yyymmdd.substring(0, 3);
		final String strM = yyymmdd.substring(3, 5);
		final String strD = yyymmdd.substring(5);
		return innerCheck(strY, strM, strD);
	}

	/**
	 * Inner check.
	 */
	private static MinguoDate innerCheck(final String strY, final String strM,
			final String strD) {
		final int year = Integer.parseInt(strY);
		final int month = Integer.parseInt(strM);
		final int dayOfMonth = Integer.parseInt(strD);
		try {
			if (year == 0) {
				// 0年為錯誤輸入
				return null;
			} else if (year < 0) {
				return MinguoDate.of(year + 1, month, dayOfMonth);
			} else {
				return MinguoDate.of(year, month, dayOfMonth);
			}
		} catch (final DateTimeException e) {
			return null;
		}
	}

	// ####################################################################
	// ## [Static Method] sub-block : 基本年度月份資訊解析
	// ####################################################################

	/**
	 * 取得數值格式的民國年份。
	 */
	@FunctionCode("基本年度月份資訊解析")
	public static Integer getYyy(String yyymmdd) {
		if (check(yyymmdd)) {
			return Integer.valueOf(yyymmdd.substring(0, 3));
		} else {
			throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymmdd);
		}
	}

	/**
	 * 取得「民國年月」字串.
	 * 
	 * @return 「民國年月」字串，格式為YYYMM
	 */
	@FunctionCode("基本年度月份資訊解析")
	public static String getYyymm(String yyymmdd) {
		if (check(yyymmdd)) {
			return yyymmdd.substring(0, 5);
		} else {
			throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymmdd);
		}
	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期計算
	// ####################################################################

	/**
	 * 計算涵蓋日數, 同日則算一天.
	 *
	 * @param start
	 *            起日
	 * @param stop
	 *            訖日
	 * 
	 * @return 涵蓋日數 = stop.Date - start.Date + 1
	 * @throws IllegalArgumentException
	 *             起日不得晚於訖日
	 */
	@FunctionCode("日期計算")
	public static long countDays(final Date start, final Date stop) {

		final Date startTmp = DateUtils.truncate(start, Calendar.DATE);
		final Date stopTmp = DateUtils.truncate(stop, Calendar.DATE);
		if (stopTmp.before(startTmp)) {
			throw new IllegalArgumentException("起日不得晚於訖日");
		}
		final long days = (stopTmp.getTime() - startTmp.getTime())
				/ (60 * 60 * 1000 * 24) + 1;
		return days;
	}

	/**
	 * 計算涵蓋日數, 同日則算一天.
	 *
	 * @param startYYYMMDD
	 *            起日
	 * @param stopYYYMMDD
	 *            訖日
	 * @return 涵蓋日數 = stop.Date - start.Date + 1
	 * @throws IllegalArgumentException
	 *             起日不得晚於訖日
	 */
	@FunctionCode("日期計算")
	public static long countDays(final String startYYYMMDD,
			final String stopYYYMMDD) {

		final Date startTmp = DateUtils.truncate(parse(startYYYMMDD),
				Calendar.DATE);
		final Date stopTmp = DateUtils.truncate(parse(stopYYYMMDD),
				Calendar.DATE);
		if (stopTmp.before(startTmp)) {
			throw new IllegalArgumentException("起日不得晚於訖日");
		}
		final long days = (stopTmp.getTime() - startTmp.getTime())
				/ (60 * 60 * 1000 * 24) + 1;
		return days;
	}

	// ####################################################################
	// ## [Static Method] sub-block : JAVA Date 物件轉換
	// ####################################################################

	/**
	 * 將日期字串轉為 Date 物件
	 * 
	 * ! 可接受的日期格式： !! 字串格式:YYYMMDD !! 字串格式:YYY/MM/DD. !! 字串格式:Y/M/D.
	 * 
	 * @param yyymmdd
	 *            要轉換的字串物件
	 * @return 對應的 JAVA Date 物件
	 */
	@FunctionCode("JAVA Date 物件轉換")
	public static Date parse(final String yyymmdd) {
		final MinguoDate innerCheck;
		if (StringUtils.contains(yyymmdd, "/")) {
			// slash mode
			final String[] split = yyymmdd.split("/");
			if (split.length != 3) {
				throw new IllegalArgumentException("輸入民國日期格式有誤:" + yyymmdd);
			}
			innerCheck = innerCheck(split[0], split[1], split[2]);
		} else {
			innerCheck = innerCheck(yyymmdd);
		}
		if (innerCheck != null) {
			final LocalDate from = LocalDate.from(innerCheck);
			return UdeTimeUtils.toDate(from.atTime(0, 0, 0));
		} else {
			throw new IllegalArgumentException("輸入民國日期格式有誤:" + yyymmdd);
		}
	}

	/**
	 * 取得系統日期
	 * 
	 * @return 系統日期
	 */
	@FunctionCode("JAVA Date 物件轉換")
	public static String now() {
		return format(Now.localDateTime());
	}

	/**
	 * 將 Date 轉 YYYMMDD 字串
	 * 
	 * @param date
	 *            要轉換的日期物件
	 * @return 對應的日期字串，格式:YYYMMDD
	 * 
	 * @throws IllegalArgumentException
	 *             日期不得為 null.
	 */
	@FunctionCode("JAVA Date 物件轉換")
	public static String format(final Date date) {
		if (date == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		return RocDateUtils.format(date, "twyMMdd");
	}

	/**
	 * 將 LocalDateTime 轉 YYYMMDD字串
	 * <p>
	 * 字串格式:YYYMMDD.
	 * 
	 * @param datetime
	 *            要轉換的日期物件
	 * @return 對應的日期字串，格式:YYYMMDD
	 * 
	 * @throws IllegalArgumentException
	 *             日期不得為 null.
	 */
	@FunctionCode("JAVA Date 物件轉換")
	public static String format(final LocalDateTime datetime) {
		if (datetime == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		return RocDateUtils.format(datetime, "twyMMdd");
	}

	/**
	 * 將 Date 轉 YYY/MM/DD 字串
	 *
	 * @param date
	 *            要轉換的日期物件
	 * @return 對應的日期字串，格式:YYY/MM/DD
	 */
	@FunctionCode("JAVA Date 物件轉換")
	public static String formatWithSlash(final Date date) {
		if (date == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		return RocDateUtils.format(date, "twy/MM/dd");
	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期文字格式轉換(String -> String)
	// ####################################################################

	/**
	 * 為 YYYMMDD 格式字串插入分隔字元.
	 * 
	 * ! 為用做資料顯示時用，所以 !! NULL / 空，回傳 "" !! 提供 ignoreLength6Format 模式，可以直接輸出只有 6碼
	 * 的日期資料。 ! 但當轉換目的是用作其它函式輸入時，格式正確性就應該是必要條件，應另行檢核。
	 *
	 * @param splitter
	 *            要插入的分隔字元.
	 * @param ignoreLength6Format
	 *            可接受6碼的 YYMMDD 日期格式，若無法解析，則回傳原字串
	 * @return 對應的日期字串，格式:YYY/MM/DD
	 */
	@FunctionCode("日期文字格式轉換(String -> String)")
	public static String insertSplitter(String yyymmdd, String splitter,
			boolean ignoreLength6Format) {
		if (StringUtils.isBlank(yyymmdd)) {
			return "";
		}
		final Matcher matcher1 = patternYYYMMDD.matcher(yyymmdd);
		if (matcher1.matches()) {
			return matcher1.group(1) + splitter + matcher1.group(2) + splitter
					+ matcher1.group(3);
		}
		if (ignoreLength6Format) {
			final Matcher matcher2 = patternYYMMDD.matcher(yyymmdd);
			if (matcher2.matches()) {
				return matcher2.group(1) + splitter + matcher2.group(2)
						+ splitter + matcher2.group(3);
			}
			return yyymmdd;
		}
		throw new IllegalArgumentException("輸入民國年月日格式有誤:" + yyymmdd);
	}

	/**
	 * 為 YYYMMDD 格式字串轉換為西元年，並插入分隔字元。
	 * 
	 * ! ignoreLength6Format 模式，可以直接輸出只有 6碼 的日期資料。
	 * 
	 * @return 對應的日期字串，格式:YYYY/MM/DD
	 */
	@FunctionCode("日期文字格式轉換(String -> String)")
	public static String toAdFormat(final String yyymmdd, final String splitter) {
		return toAdFormat(yyymmdd, splitter, true);
	}

	/**
	 * 為 YYYMMDD 格式字串轉換為西元年，並插入分隔字元
	 * 
	 * ! 為用做資料顯示時用，所以 !! NULL / 空，回傳 "" !! 提供 ignoreLength6Format 模式，可以直接輸出只有 6碼
	 * 的日期資料。 ! 但當轉換目的是用作其它函式輸入時，格式正確性就應該是必要條件，應另行檢核。
	 * 
	 * @return 對應的日期字串，格式:YYYY/MM/DD
	 */
	@FunctionCode("日期文字格式轉換(String -> String)")
	public static String toAdFormat(final String yyymmdd,
			final String splitter, final boolean ignoreLength6Format) {
		if (StringUtils.isBlank(yyymmdd)) {
			return "";
		}
		try {
			return DateFormatUtils.format(parse(yyymmdd), "yyyy" + splitter
					+ "MM" + splitter + "dd");
		} catch (final RuntimeException e) {
			if (ignoreLength6Format) {
				return yyymmdd;
			} else {
				return "";
			}
		}
	}

	// ####################################################################
	// ## [Static Method] sub-block : 目前時間比對
	// ####################################################################

	/**
	 * 傳入日期是否比系統日早.
	 *
	 * @param includeToday
	 *            TRUE, 可為同一日
	 */
	@FunctionCode("與目前系統時間比對 ")
	public static boolean isBeforeToday(boolean includeToday, String yyymmdd) {
		if (yyymmdd == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		final Calendar calendar;
		try {
			calendar = Calendar.getInstance();
			calendar.setTime(parse(yyymmdd));
		} catch (final Exception e) {
			throw new IllegalArgumentException("輸入日期格式有誤(" + yyymmdd + ")");
		}
		final LocalDateTime localDateTime = Now.localDateTime();
		final int comparison = new CompareToBuilder()//
				.append(calendar.get(Calendar.YEAR), localDateTime.getYear())//
				.append(calendar.get(Calendar.MONTH) + 1,
						localDateTime.getMonthValue())//
				.append(calendar.get(Calendar.DATE),
						localDateTime.getDayOfMonth())//
				.toComparison();

		// 輸入日期較小
		return includeToday ? comparison <= 0 : comparison < 0;
	}

	/**
	 * 傳入日期是否比系統日晚.
	 *
	 * @param yyymmdd
	 *            the date str
	 * @param includeToday
	 *            TRUE, 可為同一日
	 */
	@FunctionCode("與目前系統時間比對 ")
	public static boolean isAfterToday(boolean includeToday, String yyymmdd) {

		if (yyymmdd == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		final Calendar calendar;
		try {
			calendar = Calendar.getInstance();
			calendar.setTime(parse(yyymmdd));
		} catch (final Exception e) {
			throw new IllegalArgumentException("輸入日期格式有誤(" + yyymmdd + ")");
		}
		final LocalDateTime localDateTime = Now.localDateTime();
		final int comparison = new CompareToBuilder()//
				.append(calendar.get(Calendar.YEAR), localDateTime.getYear())//
				.append(calendar.get(Calendar.MONTH) + 1,
						localDateTime.getMonthValue())//
				.append(calendar.get(Calendar.DATE),
						localDateTime.getDayOfMonth())//
				.toComparison();

		// 輸入日期較小
		return includeToday ? comparison >= 0 : comparison > 0;

	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期相互比對
	// ####################################################################

	/**
	 * 判斷傳入值是否為同日.
	 * 
	 * @param date1
	 *            日期字串一
	 * @param date2
	 *            日期字串二
	 * @return true, 同一天
	 */
	@FunctionCode("日期相互比對 ")
	public static boolean isSame(final String date1, final String date2) {
		if (date1 == null || date2 == null) {
			throw new IllegalArgumentException("輸入比較年月不應含空值(" + date1 + ","
					+ date2 + ")");
		}
		if (check(date1) && check(date2)) {
			return date1.equals(date2);
		} else {
			throw new IllegalArgumentException("輸入比較年月格式有誤(" + date1 + ","
					+ date2 + ")");
		}
	}

	/**
	 * 是否依順序傳入日期.
	 *
	 * @param allowOverlap
	 *            日期相同是否結果為 TRUE.
	 * @param date1
	 *            the a date
	 * @param date2
	 *            the b date
	 * @return true, if is orderly
	 */
	@FunctionCode("日期相互比對 ")
	public static boolean isOrderly(final boolean allowOverlap,
			final String date1, final String date2) {
		if (allowOverlap && isSame(date1, date2)) {
			return true;
		}
		return isOrderly(date1, date2);
	}

	/**
	 * 是否依順序傳入日期，日期不得相同.
	 *
	 * @param date1
	 *            日期字串一
	 * @param date2
	 *            日期字串二
	 */
	@FunctionCode("日期相互比對 ")
	public static boolean isOrderly(final String date1, final String date2) {
		if (date1 == null || date2 == null) {
			throw new IllegalArgumentException("輸入比較日期不應含空值(" + date1 + ","
					+ date2 + ")");
		}
		if (!check(date1) || !check(date2)) {
			throw new IllegalArgumentException("輸入比較日期格式有誤(" + date1 + ","
					+ date2 + ")");
		}
		final Date a = parse(date1);
		final Date b = parse(date2);
		return a.before(b);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 取得相依日期
	// ####################################################################

	/**
	 * 取得相對日期的表示字串. <br>
	 * 
	 * @param field
	 *            the calendar field. 使用 Calendar 中的常數定義.
	 * @param amount
	 *            the amount
	 * @return 相依日期字串
	 * @see Calendar
	 */
	@FunctionCode("取得相依日期")
	public static String getRelativeDateStr(final String yyymmdd, int field,
			int amount) {
		final Date d = parse(yyymmdd);
		final Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(field, amount);
		final Date lastDate = c.getTime();
		return format(lastDate);
	}

	/**
	 * 取得前一天
	 *
	 * @param dateStr
	 *            日期字串
	 * @return 前一天日期字串
	 */
	@FunctionCode("取得相依日期")
	public static String getPreviousDateStr(final String yyymmdd) {
		final Date d = parse(yyymmdd);
		final Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DATE, -1);
		final Date lastDate = c.getTime();
		return format(lastDate);
	}

	/**
	 * 取得後一天
	 *
	 * @param dateStr
	 *            日期字串
	 * @return 後一天日期字串
	 */
	@FunctionCode("取得相依日期")
	public static String getNextDateStr(final String yyymmdd) {
		final Date d = parse(yyymmdd);
		final Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.DATE, 1);
		final Date lastDate = c.getTime();
		return format(lastDate);
	}

	// == [Static Method] Block Stop
	// ================================================
}
