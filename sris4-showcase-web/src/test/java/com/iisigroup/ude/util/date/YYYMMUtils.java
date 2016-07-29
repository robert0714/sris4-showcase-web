/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.date;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.lang8.date.RocDateUtils;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.chrono.MinguoDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 民國年月(YYYMM)格式工具程式.
 * 
 * ! *暫未支援民國前記年*
 */
@UtilityClassAssertion
public final class YYYMMUtils {

	// ================================================
	// == [static variables] Block Start

	/** The Constant patternYYYMM. */
	final static private Pattern patternYYYMM = Pattern
			.compile("(\\d{3})(0[1-9]|1[012])");

	// == [static variables] Block Stop
	// ================================================
	// == [Constructors] Block Start (含init method)

	/**
	 * 公用函式類別, 無外部建構子.
	 */
	private YYYMMUtils() {
		throw new AssertionError();
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start

	// ####################################################################
	// ## [Static Method] sub-block : 基本年度月份資訊解析
	// ####################################################################

	/**
	 * 傳回年度純值.
	 *
	 * @return the yy
	 */
	public static Integer getYy(String yyymm) {
		final Matcher matcher = patternYYYMM.matcher(yyymm);
		if (matcher.matches()) {
			return Integer.valueOf(matcher.group(1));
		}
		throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymm);
	}

	/**
	 * 傳回月份純值 (1~12).
	 *
	 * @return the mm
	 */
	public static Integer getMm(String yyymm) {
		final Matcher matcher = patternYYYMM.matcher(yyymm);
		if (matcher.matches()) {
			return Integer.valueOf(matcher.group(2));
		}
		throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymm);
	}

	/**
	 * 取得當月日數.
	 *
	 * @return the totalDays}
	 */
	public static int getTotalDays(String yyymm) {
		final int yy = getYy(yyymm).intValue() + 1911;
		final int mm = getMm(yyymm).intValue();
		final Calendar c = Calendar.getInstance();
		c.set(yy, (mm - 1), 1, 0, 0, 0);
		return c.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 取得相依日期物件(Java Date)
	// ####################################################################

	/**
	 * 取得此年月的最初日期(當月一號零點零分零秒).
	 *
	 * @return the headDate}
	 */
	public static Date getHeadDate(String yyymm) {
		final MinguoDate minguoDate = MinguoDate.of(getYy(yyymm), getMm(yyymm),
				1);
		final ChronoLocalDateTime<MinguoDate> atTime = minguoDate
				.atTime(LocalTime.of(0, 0, 0));
		final ChronoZonedDateTime<MinguoDate> atZone = atTime.atZone(ZoneId
				.systemDefault());
		return Date.from(atZone.toInstant());
	}

	/**
	 * 取得此年月的第幾天(零點零分零秒).
	 *
	 * @param days
	 *            the days
	 * @return the headDate}
	 */
	public static Date getHeadDate(String yyymm, int days) {
		final MinguoDate minguoDate = MinguoDate.of(getYy(yyymm), getMm(yyymm),
				days);
		final ChronoLocalDateTime<MinguoDate> atTime = minguoDate
				.atTime(LocalTime.of(0, 0, 0));
		final ChronoZonedDateTime<MinguoDate> atZone = atTime.atZone(ZoneId
				.systemDefault());
		return Date.from(atZone.toInstant());
	}

	/**
	 * 取得此年月的最後一天 00:00:00
	 * 
	 * @return the tailDate}
	 */
	public static Date getTailDate(String yyymm) {
		final MinguoDate minguoDate = MinguoDate
				.of(getYy(yyymm), getMm(yyymm), 1)//
				.plus(1, ChronoUnit.MONTHS)//
				.plus(-1, ChronoUnit.DAYS);
		final ChronoLocalDateTime<MinguoDate> atTime = minguoDate
				.atTime(LocalTime.of(0, 0, 0));
		final ChronoZonedDateTime<MinguoDate> atZone = atTime.atZone(ZoneId
				.systemDefault());
		return Date.from(atZone.toInstant());
	}

	/**
	 * 取得此年月的最後X天 ex:前1天 9月 回傳 9/30 00:00:00 8月 回傳 8/31 00:00:00.
	 *
	 * @param forward
	 *            往前的天數
	 * @return the forwardTailDate}
	 */
	public static Date getTailDate(String yyymm, int forward) {
		final MinguoDate minguoDate = MinguoDate
				.of(getYy(yyymm), getMm(yyymm), 1)//
				.plus(1, ChronoUnit.MONTHS)//
				.plus(-forward, ChronoUnit.DAYS);
		final ChronoLocalDateTime<MinguoDate> atTime = minguoDate
				.atTime(LocalTime.of(0, 0, 0));
		final ChronoZonedDateTime<MinguoDate> atZone = atTime.atZone(ZoneId
				.systemDefault());
		return Date.from(atZone.toInstant());
	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期物件比對
	// ####################################################################

	/**
	 * 判斷傳入值是否為同一月份.
	 *
	 * @param aDate
	 *            the aDate
	 * @param bDate
	 *            the bDate
	 * @return true, if is sameMonth
	 */
	public static boolean isSameMonth(Date aDate, Date bDate) {
		if (aDate == null || bDate == null) {
			throw new IllegalArgumentException("輸入比較年月不應含空值(" + aDate + ","
					+ bDate + ")");
		}
		final String aDateStr = RocDateUtils.format(aDate, "twyMM"); // DateFormater.formatDate(aDate,
																		// DateFormater.YYYMM);
		final String bDateStr = RocDateUtils.format(bDate, "twyMM"); // DateFormater.formatDate(bDate,
																		// DateFormater.YYYMM);
		return StringUtils.equals(aDateStr, bDateStr);
	}

	/**
	 * 判斷傳入值是否為同一月份.
	 *
	 * @param aDateStr
	 *            the aDateStr
	 * @param bDateStr
	 *            the bDateStr
	 * @return true, if is sameMonth
	 */
	public static boolean isSameMonth(String aDateStr, String bDateStr) {
		if (aDateStr == null || bDateStr == null) {
			throw new IllegalArgumentException("輸入比較年月不應含空值(" + aDateStr + ","
					+ bDateStr + ")");
		}
		if (check(aDateStr) && check(bDateStr)) {
			return aDateStr.equals(bDateStr);
		} else {
			throw new IllegalArgumentException("輸入比較年月格式有誤(" + aDateStr + ","
					+ bDateStr + ")");
		}
	}

	/**
	 * 是否傳入的第一個月份比第二個月份早.
	 *
	 * @param aDateStr
	 *            the aDateStr
	 * @param bDateStr
	 *            the bDateStr
	 * @return true, if is beforeAnotherMonth
	 */
	public static boolean isBeforeThan(String aDateStr, String bDateStr) {
		if (StringUtils.isBlank(aDateStr) || StringUtils.isBlank(bDateStr)) {
			throw new IllegalArgumentException("輸入比較年月不應含空值(" + aDateStr + ","
					+ bDateStr + ")");
		}
		if (check(aDateStr) && check(bDateStr)) {
			final Date aDate = getHeadDate(aDateStr);
			final Date bDate = getHeadDate(bDateStr);
			return aDate.before(bDate);
		} else {
			throw new IllegalArgumentException("輸入比較年月格式有誤(" + aDateStr + ","
					+ bDateStr + ")");
		}
	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期文字格式轉換(String -> String)
	// ####################################################################

	/**
	 * Insert splitter.
	 *
	 * @param splitter
	 *            the splitter
	 * @return the string
	 */
	public static String insertSplitter(String yyymm, String splitter) {
		if (StringUtils.isBlank(yyymm)) {
			return "";
		}
		{
			final Matcher matcher = patternYYYMM.matcher(yyymm);
			if (matcher.matches()) {
				return matcher.group(1) + splitter + matcher.group(2);
			}
		}
		// {
		// final Matcher matcher = patternYYMM.matcher(yyymm);
		// if (matcher.matches()) {
		// return matcher.group(1) + splitter + matcher.group(2);
		// }
		// }
		throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymm);
	}

	/**
	 * Format to.
	 *
	 * @param format
	 *            the format
	 * @return the string
	 */
	public static String toFormat(String yyymm, String format) {
		{
			final Matcher matcher = patternYYYMM.matcher(yyymm);
			if (matcher.matches()) {
				final Date headDate = getHeadDate(yyymm);
				return RocDateUtils.format(headDate, format);
			}
		}
		// {
		// final Matcher matcher = patternYYMM.matcher(yyymm);
		// if (matcher.matches()) {
		// return format.replaceAll("twy", matcher.group(1)).replaceAll("MM",
		// matcher.group(2));
		// }
		// }
		throw new IllegalArgumentException("輸入民國年月格式有誤:" + yyymm);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 日期YYYMM文字格式資料取得 (String).
	// ####################################################################

	/**
	 * 取得上個月的字串.
	 *
	 * @param yyymm
	 *            the date
	 * @return the lastMonthStr}
	 */
	public static String getPreviousMonthStr(String yyymm) {
		return getPreviousMonthStr(getHeadDate(yyymm));
	}

	/**
	 * 取得下個月的字串.
	 *
	 * @return the nextMonthStr}
	 */
	public static String getNextMonthStr(String yyymm) {
		return getNextMonthStr(getHeadDate(yyymm));
	}

	/**
	 * 取得上個月的字串.
	 *
	 * @param date
	 *            the date
	 * @return the lastMonthStr}
	 */
	public static String getPreviousMonthStr(Date date) {
		final Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH) - 1, 1);
		final Date outDate = c.getTime();
		return format(outDate);
	}

	/**
	 * 取得下個月的字串.
	 *
	 * @param date
	 *            the date
	 * @return the nextMonthStr}
	 */
	public static String getNextMonthStr(Date date) {
		final Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, 1);
		final Date outDate = c.getTime();
		return format(outDate);
	}

	/**
	 * 取得現在時間的YYYMM格式字串.
	 *
	 * @return the now month str
	 */
	public static String getNowMonthStr() {
		return format(new Date());
	}

	/**
	 * 取得傳入值所囊括時間內的yyymm.
	 *
	 * @param startMonth
	 *            the startMonth
	 * @param stopMonth
	 *            the stopMonth
	 * @return the betweenTimes
	 */
	public static String[] getBetweenTimes(String startMonth, String stopMonth) {

		final List<String> times = new ArrayList<String>();
		if (check(startMonth) && check(stopMonth)) {
			if (isSameMonth(startMonth, stopMonth)) {
				times.add(startMonth);
			} else if (isBeforeThan(startMonth, stopMonth)) {
				String tmpYYYMM = startMonth;
				do {
					times.add(tmpYYYMM);
					tmpYYYMM = getNextMonthStr(tmpYYYMM);
				} while (isBeforeThan(tmpYYYMM, stopMonth)
						|| isSameMonth(tmpYYYMM, stopMonth));
			} else {
				throw new IllegalArgumentException("輸入的迄月早於起月:參數1="
						+ startMonth + ",參數2=" + stopMonth);
			}
		} else {
			throw new IllegalArgumentException("輸入民國年月格式有誤:參數1=" + startMonth
					+ ",參數2=" + stopMonth);
		}
		return times.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
	}

	/**
	 * 將Date轉字串
	 * <p>
	 * 字串格式:YYYMM.
	 *
	 * @param date
	 *            要轉換的日期物件
	 * @return 將Date轉字串
	 */
	public static final String format(final Date date) {
		if (date == null) {
			throw new IllegalArgumentException("日期不得為空");
		}
		final Calendar c = Calendar.getInstance();
		c.setTime(date);
		final String dateStr = StringUtils.leftPad(
				String.valueOf(c.get(Calendar.YEAR) - 1911), 3, "0") //
				+ StringUtils.leftPad(
						String.valueOf(c.get(Calendar.MONTH) + 1), 2, "0");
		return dateStr;
	}

	/**
	 * 是否符合格式. YYYMM OR YYMM
	 *
	 * @return true, if is match
	 */
	public static boolean check(final String yyymm) {
		return patternYYYMM.matcher(yyymm).matches();
		// || patternYYMM.matcher(yyymm).matches()
	}

	// ####################################################################
	// ## [Static Method] sub-block : 基本年度月份資訊區間比對
	// ####################################################################

	/**
	 * 傳回指定年月(YYYMM) 是否包含於 區間(startDate~endDate).
	 *
	 * @param startDate
	 *            the sd
	 * @param endDate
	 *            the ed
	 * @return true, if is between
	 */
	public static boolean isBetween(Date startDate, Date endDate, String yyymm) {
		final boolean a = !endDate.before(getHeadDate(yyymm));
		final boolean b = !startDate.after(getTailDate(yyymm, 0));
		return a && b;
	}

	// /**
	// * 傳回指定日期是否包含於此區間(YYYMM).
	// *
	// // * @param d the d
	// * @return true, if successful
	// */
	// public static boolean includes(String yyymm, Date d) {
	// d = RocDateUtils.truncate(d, Calendar.DAY_OF_MONTH);
	// boolean a = !d.before(getHeadDate(yyymm));
	// boolean b = !d.after(getTailDate(yyymm));
	// return a && b;
	// }

	// == [Static Method] Block Stop
	// ================================================

}