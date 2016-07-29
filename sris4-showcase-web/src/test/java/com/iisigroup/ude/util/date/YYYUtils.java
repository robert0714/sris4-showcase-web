/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.date;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * 
 * @author tsaicf
 */
public class YYYUtils {
	// ================================================
	// == [Enumeration types] Block Start
	// == [Enumeration types] Block End
	// ================================================
	// == [static variables] Block Start
	// == [static variables] Block Stop
	// ================================================
	// == [instance variables] Block Start
	// == [instance variables] Block Stop
	// ================================================
	// == [static Constructor] Block Start
	// == [static Constructor] Block Stop
	// ================================================
	// == [Constructors] Block Start (含init method)
	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start

	public static String format(int rocYear) {
		if (rocYear >= 100) {
			return String.valueOf(rocYear);
		} else if (rocYear >= 10) {
			return "0" + rocYear;
		} else if (rocYear >= 1) {
			return "00" + rocYear;
		} else if (rocYear == 0) {
			throw new IllegalArgumentException("民國無0年");
		} else if (rocYear < -99) {
			throw new IllegalArgumentException("三位表示最多至民前99年");
		} else {
			final NumberFormat nf = new DecimalFormat("00");
			return "-" + nf.format(0 - rocYear);
		}
	}

	// /**
	// * @param rocYear
	// * @return true 過去年度 false 本年度 / 未來年度
	// */
	// public static boolean isBeforeCurrent(String rocYear) {
	// return isBeforeCurrent(NumberUtils.toInt(rocYear));
	// }
	//
	// /**
	// * @param rocYear
	// * @return true 過去年度 false 本年度 / 未來年度
	// */
	// public static boolean isAfterCurrent(String rocYear) {
	// return isAfterCurrent(NumberUtils.toInt(rocYear));
	// }
	// /**
	// * @param rocYear
	// * @return true 過去年度 <br>
	// * false 本年度 / 未來年度
	// */
	// public static boolean isBeforeCurrent(int rocYear) {
	// return rocYear < DateUtil.getNowRisDate().getIRocYear();
	// }
	//
	// /**
	// * @param rocYear
	// * @return true 過去年度 <br>
	// * false 本年度 / 未來年度
	// */
	// public static boolean isAfterCurrent(int rocYear) {
	// return rocYear > DateUtil.getNowRisDate().getIRocYear();
	// }

	// == [Static Method] Block Stop
	// ================================================
	// == [Accessor] Block Start
	// == [Accessor] Block Stop
	// ================================================
	// == [Overrided Method] Block Start (Ex. toString/equals+hashCode)
	// == [Overrided Method] Block Stop
	// ================================================
	// == [Method] Block Start
	// ####################################################################
	// ## [Method] sub-block :
	// ####################################################################
	// == [Method] Block Stop
	// ================================================

}
