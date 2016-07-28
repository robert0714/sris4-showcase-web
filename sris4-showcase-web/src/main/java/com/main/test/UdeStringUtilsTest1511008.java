package com.main.test;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UdeStringUtilsTest1511008 {

	@Before
	public void setUp() throws Exception {
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

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLength() throws Exception {
		final String str = "GOGOGO";
		Assert.assertEquals(6, UdeStringUtils.length(str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToCodePointArray() throws Exception {
		final String str = "AB";
		final int[] string = { 65, 66 };

		Assert.assertSame(true, Arrays.equals(string, UdeStringUtils.toCodePointArray(str)));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testFromCodePointIntArray() throws Exception {
		final int[] str = { 65, 66, 67, 68, 69, 70 };
		Assert.assertEquals("ABCDEF", UdeStringUtils.fromCodePoint(str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testFromCodePointIntArrayIntInt() throws Exception {
		final int[] str = { 65, 66, 67, 68, 69, 70 };
		Assert.assertEquals("ABC", UdeStringUtils.fromCodePoint(str, 0, 3));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToStringIntArray() throws Exception {
		final int[] str = { 65, 66, 67, 68, 69, 70 };
		Assert.assertEquals("ABCDEF", UdeStringUtils.toString(str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToStringIntArrayIntInt() throws Exception {
		final int[] str = { 65, 66, 67, 68, 69, 70 };
		Assert.assertEquals("ABC", UdeStringUtils.toString(str, 0, 3));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToFullChar() throws Exception {
		final String str = "ABCDEF";
		Assert.assertEquals("ＡＢＣＤＥＦ", UdeStringUtils.toFullChar(str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testToHelfChar() throws Exception {
		final String str = "ＡＢＣＤＥＦ";
		Assert.assertEquals("ABCDEF", UdeStringUtils.toHelfChar(str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testIndexOfStringInt() throws Exception {
		final String str = "ABCDEF";
		Assert.assertEquals(3, UdeStringUtils.indexOf(str, 'D'));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testIndexOfStringString() throws Exception {
		final String string = "ABCDEF";
		final String str = "BCD";
		Assert.assertEquals(1, UdeStringUtils.indexOf(string, str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testIndexOfStringIntInt() throws Exception {
		final String string = "ABCDEF";
		final int ch = 'D';
		Assert.assertEquals(3, UdeStringUtils.indexOf(string, ch, 1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testIndexOfStringStringInt() throws Exception {
		final String string = "ABCDEF";
		final String str = "DE";
		Assert.assertEquals(3, UdeStringUtils.indexOf(string, str, 1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLastIndexOfStringInt() throws Exception {
		final String string = "ABCDEF";
		final int ch = 'D';
		Assert.assertEquals(3, UdeStringUtils.lastIndexOf(string, ch));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLastIndexOfStringString() throws Exception {
		final String string = "ABCDEF";
		final String str = "DE";
		Assert.assertEquals(3, UdeStringUtils.lastIndexOf(string, str));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLastIndexOfStringIntInt() throws Exception {
		final String string = "ABCDEF";
		final int ch = 'E';
		Assert.assertEquals(4, UdeStringUtils.lastIndexOf(string, ch, 5));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testLastIndexOfStringStringInt() throws Exception {
		final String string = "ABCDEF";
		final String str = "BC";
		Assert.assertEquals(1, UdeStringUtils.lastIndexOf(string, str, 5));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testTrim() throws Exception {
		final String string = "   A BC DEF  ";
		Assert.assertEquals("A BC DEF", UdeStringUtils.trim(string));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testRemoveBOM() throws Exception {
		final String string = "ABC";
		Assert.assertEquals("ABC", UdeStringUtils.removeBOM(string));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDivide() throws Exception {
		final String string = "ABCDEFGHIJK";
		Assert.assertEquals(6, UdeStringUtils.divide(string, 2).length);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSubstringStringInt() throws Exception {
		final String string = "ABCDEFGHIJK";
		Assert.assertEquals("DEFGHIJK", UdeStringUtils.substring(string, 3));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSubstringStringIntInt() throws Exception {
		final String string = "ABCDEFGHIJK";
		Assert.assertEquals("CD", UdeStringUtils.substring(string, 2, 4));
	}
}
