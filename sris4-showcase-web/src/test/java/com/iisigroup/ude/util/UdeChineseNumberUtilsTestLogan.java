/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import static org.junit.Assert.*;

import com.iisigroup.ude.util.lang.ChineseNumberType;

import org.junit.Test;

/**
 *
 */
public class UdeChineseNumberUtilsTestLogan {

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.UdeChineseNumberUtils#format(com.iisigroup.ude.util.lang.ChineseNumberType, long)}
	 * .
	 */
	@Test
	public void testFormatChineseNumberTypeLong() {

		assertEquals("負一二三四五六零七八九", UdeChineseNumberUtils.format(
				ChineseNumberType.DirectTrans, -1234560789));
		assertEquals("負壹拾貳億參仟肆佰伍拾陸萬零柒佰捌拾玖", UdeChineseNumberUtils.format(
				ChineseNumberType.Full, -1234560789));
		assertEquals("一０五", UdeChineseNumberUtils.format(
				ChineseNumberType.MixedForROCYear, 105));
		assertEquals("負一二三四五六０七八九", UdeChineseNumberUtils.format(
				ChineseNumberType.MixedTrans, -1234560789));
		assertEquals("負壹拾貳億參仟肆佰伍拾陸萬零仟柒佰捌拾玖", UdeChineseNumberUtils.format(
				ChineseNumberType.Money, -1234560789));
		assertEquals("負十二億三千四百五十六萬零七百八十九", UdeChineseNumberUtils.format(
				ChineseNumberType.Simple, -1234560789));
		assertEquals("負十二億三千四百五十六萬零七百八十九", UdeChineseNumberUtils.format(
				ChineseNumberType.Spoken, -1234560789));

	}

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
	// == [Inner Class] Block Start
	// == [Inner Class] Block Stop
	// ================================================

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.UdeChineseNumberUtils#format(com.iisigroup.ude.util.lang.ChineseNumberType, java.lang.String)}
	 * .
	 */
	@Test
	public void testFormatChineseNumberTypeString() {

		assertEquals("負一二三四五六零七八九", UdeChineseNumberUtils.format(
				ChineseNumberType.DirectTrans, "-1234560789"));
		assertEquals("負壹拾貳億參仟肆佰伍拾陸萬零柒佰捌拾玖", UdeChineseNumberUtils.format(
				ChineseNumberType.Full, "-1234560789"));
		assertEquals("一０五", UdeChineseNumberUtils.format(
				ChineseNumberType.MixedForROCYear, "105"));
		assertEquals("負一二三四五六０七八九", UdeChineseNumberUtils.format(
				ChineseNumberType.MixedTrans, "-1234560789"));
		assertEquals("負壹拾貳億參仟肆佰伍拾陸萬零仟柒佰捌拾玖", UdeChineseNumberUtils.format(
				ChineseNumberType.Money, "-1234560789"));
		assertEquals("負十二億三千四百五十六萬零七百八十九", UdeChineseNumberUtils.format(
				ChineseNumberType.Simple, "-1234560789"));
		assertEquals("負十二億三千四百五十六萬零七百八十九", UdeChineseNumberUtils.format(
				ChineseNumberType.Spoken, "-1234560789"));

	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.UdeChineseNumberUtils#format(com.iisigroup.ude.util.lang.ChineseNumberType, java.lang.String, int)}
	 * .
	 */
	@Test
	public void testFormatChineseNumberTypeStringInt() {
		fail("not yet implement");
	}
}
