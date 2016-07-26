package com.iisigroup.ude.test;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UdeStringUtilsTest {

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

	@Test
	public void testLength() throws Exception {
		final String str = "123";
		Assert.assertEquals(3, UdeStringUtils.length(str));
	}

	@Test
	public void testToCodePointArray() throws Exception {
		final int[] code = UdeStringUtils.toCodePointArray("A");
		Assert.assertEquals("A", new String(code, 0, code.length));
	}

	@Test
	public void testFromCodePointIntArray() throws Exception {
		Assert.assertEquals("A", UdeStringUtils.fromCodePoint(UdeStringUtils.toCodePointArray("A")));

	}

	@Test
	public void testFromCodePointIntArrayIntInt() throws Exception {
		final int[] code = UdeStringUtils.toCodePointArray("AB");
		Assert.assertEquals("B", UdeStringUtils.fromCodePoint(code, code.length / 2, code.length - 1));
	}

	@Test
	public void testToStringIntArray() throws Exception {
		final int[] code = UdeStringUtils.toCodePointArray("B");
		Assert.assertEquals("B", UdeStringUtils.toString(code));
	}

	@Test
	public void testToStringIntArrayIntInt() throws Exception {
		final int[] code = UdeStringUtils.toCodePointArray("AB");
		Assert.assertEquals("B", UdeStringUtils.toString(code, code.length / 2, code.length - 1));
	}

	@Test
	public void testToFullChar() throws Exception {
		Assert.assertEquals("Ａ", UdeStringUtils.toFullChar("A"));
	}

	@Test
	public void testToHelfChar() throws Exception {
		Assert.assertEquals("A", UdeStringUtils.toHelfChar("Ａ"));
	}

	@Test
	public void testIndexOfStringInt() throws Exception {
		Assert.assertEquals("A", UdeStringUtils.indexOf("ABCD", 1));
	}

	@Test
	public void testIndexOfStringString() throws Exception {
		Assert.assertEquals(0, UdeStringUtils.indexOf("ABCD", "A"));
	}

	@Test
	public void testIndexOfStringIntInt() throws Exception {
		Assert.assertEquals("A", UdeStringUtils.indexOf("ABCD", 0, 0));
	}

	@Test
	public void testIndexOfStringStringInt() throws Exception {
		Assert.assertEquals(1, UdeStringUtils.indexOf("ABCD", "B", 1));
	}

	@Test
	public void testLastIndexOfStringInt() throws Exception {
		Assert.assertEquals("A", UdeStringUtils.lastIndexOf("ABCD", 1));
	}

	@Test
	public void testLastIndexOfStringString() throws Exception {
		Assert.assertEquals(0, UdeStringUtils.lastIndexOf("ABCD", "A"));
	}

	@Test
	public void testLastIndexOfStringIntInt() throws Exception {
		Assert.assertEquals(1, UdeStringUtils.lastIndexOf("ABCD", "B", 3));
	}

	@Test
	public void testLastIndexOfStringStringInt() throws Exception {
		Assert.assertEquals(0, UdeStringUtils.lastIndexOf("ABCD", "A", 3));
	}

	@Test
	public void testTrim() throws Exception {
		Assert.assertEquals("ABCD", UdeStringUtils.trim(" ABCD "));
	}

	@Test
	public void testRemoveBOM() throws Exception {
		Assert.assertEquals("ABCD", UdeStringUtils.removeBOM("ABCD"));
	}

	@Test
	public void testDivide() throws Exception {
		Assert.assertEquals("[ABCD]", Arrays.toString(UdeStringUtils.divide("ABCD", 8)));
	}

	@Test
	public void testSubstringStringInt() throws Exception {
		Assert.assertEquals("BCD", UdeStringUtils.substring("ABCD", 1));
	}

	@Test
	public void testSubstringStringIntInt() throws Exception {
		Assert.assertEquals("BC", UdeStringUtils.substring("ABCD", 1, 3));
	}
}
