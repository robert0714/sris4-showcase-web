/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 *
 */
public class UdeBooleanUtilsTestLogan {

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.UdeBooleanUtils#parse(java.lang.String, boolean)}
	 * .
	 */
	@Test
	public void testParse() {

		assertTrue(UdeBooleanUtils.parse(null, true));
		assertTrue(UdeBooleanUtils.parse("", true));
		assertTrue(UdeBooleanUtils.parse(" ", true));
		assertTrue(UdeBooleanUtils.parse("  a", true));
		assertFalse(UdeBooleanUtils.parse(null, false));
		assertFalse(UdeBooleanUtils.parse("", false));
		assertFalse(UdeBooleanUtils.parse(" ", false));
		assertFalse(UdeBooleanUtils.parse("  a b  ", false));

		assertTrue(UdeBooleanUtils.parse("true", true));
		assertTrue(UdeBooleanUtils.parse("On", true));
		assertTrue(UdeBooleanUtils.parse("y", true));
		assertTrue(UdeBooleanUtils.parse("Ｔ", true));
		assertTrue(UdeBooleanUtils.parse("Ｙｅｓ", true));

		assertFalse(UdeBooleanUtils.parse("ＦＡＬＳＥ", true));
		assertFalse(UdeBooleanUtils.parse("ｏｆｆ", true));
		assertFalse(UdeBooleanUtils.parse("N", true));
		assertFalse(UdeBooleanUtils.parse("f", true));
		assertFalse(UdeBooleanUtils.parse("no", true));

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
}
