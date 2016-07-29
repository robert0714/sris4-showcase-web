/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.date;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.lang8.date.RocDateTime;

import java.sql.Timestamp;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 取得目前系統時間日期
 * 
 * 欲取得系統時間時，應使用本類別提供 METHOD。 這樣在非正式(TESTING)環境下，可允許使用假造時間進行測試。
 * 
 * ! 單元測試時可以用 MOCK 方式指定系統時間。 !! 例外：與檔案系統的檔案修改時間作時間比較時。
 */
@UtilityClassAssertion
public final class Now {

	// ================================================
	// == [Enumeration types] Block Start
	// == [Enumeration types] Block End
	// ================================================
	// == [static variables] Block Start

	/** Logger Object. */
	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory
			.getLogger(Now.class);

	/** The fixed clock. */
	private static Clock fixedClock = null;

	// == [static variables] Block Stop
	// ================================================
	// == [instance variables] Block Start
	// == [instance variables] Block Stop
	// ================================================
	// == [static Constructor] Block Start
	// == [static Constructor] Block Stop
	// ================================================
	// == [Constructors] Block Start (含init method)

	/**
	 * constructor.
	 */
	private Now() {
		throw new AssertionError();
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start

	/**
	 * setDateTimeBase
	 * 
	 * 需由 DateTimeUtilsConfig 經由 reflect 呼叫.
	 *
	 * @param zonedDateTime
	 *            the zoned date time
	 */
	protected static synchronized void resetSystemTime(
			final ZonedDateTime zonedDateTime) {
		LOGGER.info("reset system datetime:{}", zonedDateTime);
		final Duration offsetDuration = Duration.between(Instant.now(),
				zonedDateTime.toInstant());
		fixedClock = Clock.offset(Clock.systemDefaultZone(), offsetDuration);
	}

	/**
	 * Reset.
	 */
	protected static synchronized void reset() {
		fixedClock = null;
	}

	// ####################################################################
	// ## [Method] sub-block : 現在時間.
	// ####################################################################

	/**
	 * 取得目前系統時間
	 *
	 * @return 目前系統時間
	 */
	public static Date date() {
		return Date.from(instant());
	}

	/**
	 * 取得目前系統時間
	 *
	 * @return 目前系統時間
	 */
	public static Timestamp timestamp() {
		return Timestamp.from(instant());
	}

	// ####################################################################
	// ## [Method] sub-block : 現在時間 : JDK8
	// ####################################################################

	/**
	 * 取得目前系統時間
	 *
	 * @return 目前系統時間
	 */
	public static Instant instant() {
		if (fixedClock == null) {
			return Instant.now();
		} else {
			return Instant.now(fixedClock);
		}
	}

	/**
	 * 取得目前系統時間
	 *
	 * @return 目前系統時間
	 */
	public static ZonedDateTime zonedDateTime() {
		if (fixedClock == null) {
			return ZonedDateTime.now();
		} else {
			return ZonedDateTime.now(fixedClock);
		}
	}

	/**
	 * 取得目前系統時間
	 *
	 * @return 目前系統時間
	 */
	public static LocalDateTime localDateTime() {
		if (fixedClock == null) {
			return LocalDateTime.now();
		} else {
			return LocalDateTime.now(fixedClock);
		}
	}

	/**
	 * 取得目前系統時間
	 * 
	 * @return 目前系統時間
	 */
	public static RocDateTime rocDateTime() {
		return new RocDateTime(localDateTime());
	}

	/**
	 * 取得目前系統時間
	 * 
	 * @param datePattern
	 * @param timePattern
	 * @return 目前系統時間
	 */
	public static RocDateTime rocDateTime(String datePattern, String timePattern) {
		return new RocDateTime(localDateTime(), datePattern, timePattern);
	}

	// == [Static Method] Block Stop
	// ================================================

}
