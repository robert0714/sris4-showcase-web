package com.iisigroup.ude.util.lang;

import com.iisigroup.ude.util.collections.UdeArrayUtils;
import com.iisigroup.ude.util.internal.QuietSupplier;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.primefaces.validate.bean.DigitsClientValidationConstraint;

public class UdeStringUtilsTestWild {

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
		Assert.assertEquals(3, UdeStringUtils.length("123"));
	}

	@Test
	public void testToCodePointArray() throws Exception {
		Assert.assertEquals(65, UdeStringUtils.toCodePointArray("A")[0]);
	}

	@Test
	public void testFromCodePointIntArray() throws Exception {
		int[] codeArrayInt = { 65 };
		Assert.assertEquals("A", UdeStringUtils.fromCodePoint(codeArrayInt));
	}

	@Test
	public void testFromCodePointIntArrayIntInt() throws Exception {
		int[] codeArrayInt = { 65, 66, 67 };
		// UdeStringUtils.fromCodePoint(codePointArray, offset, length)
		// <--length超過會arrayIndexOutOfBond
		// function 本身沒有做錯誤檢查
		Assert.assertEquals("BC", UdeStringUtils.fromCodePoint(codeArrayInt, 1, 2));
	}

	@Test
	public void testToStringIntArray() throws Exception {
		int[] codeArrayInt = { 65, 66, 67 };
		// function 背地裡還是call fromCodePoint(array) ....
		Assert.assertEquals("ABC", UdeStringUtils.toString(codeArrayInt));
	}

	@Test
	public void testToStringIntArrayIntInt() throws Exception {
		int[] codeArrayInt = { 65, 66, 67 };
		// toString系列跟fromCodePoint系列背地裡幹的事都一樣
		Assert.assertEquals("BC", UdeStringUtils.toString(codeArrayInt, 1, 2));
	}

	@Test
	public void testToFullChar() throws Exception {
		// System.out.println("ABC call toFullChar will turn into =
		// "+UdeStringUtils.toFullChar("ABC"));
		Assert.assertEquals("ＡＢＣ", UdeStringUtils.toFullChar("ABC"));
	}

	@Test
	public void testToHelfChar() throws Exception {
		Assert.assertEquals("ABC", UdeStringUtils.toHelfChar("ＡＢＣ"));
	}

	@Test
	public void testIndexOfStringInt() throws Exception {
		String testString = "ABC";
		// UdeArrayUtils.innerBasicMatching() <-最後call這個method 沒找到回傳-1
		Assert.assertEquals(1, UdeStringUtils.indexOf(testString, 66));
	}

	@Test
	public void testIndexOfStringString() throws Exception {
		String testString = "ABC";
		Assert.assertEquals(1, UdeStringUtils.indexOf(testString, "B"));
	}

	@Test
	public void testIndexOfStringIntInt() throws Exception {
		String testString = "ABC";
		Assert.assertEquals(-1, UdeStringUtils.indexOf(testString, 65, 1));
	}

	@Test
	public void testIndexOfStringStringInt() throws Exception {
		String testString = "ABC";
		Assert.assertEquals(0, UdeStringUtils.indexOf(testString, "A", 0));
	}

	@Test
	public void testLastIndexOfStringInt() throws Exception {
		String testString = "AAC";
		// find the last index of A is 1
		Assert.assertEquals(1, UdeStringUtils.lastIndexOf(testString, 65));
	}

	@Test
	public void testLastIndexOfStringString() throws Exception {
		String testString = "AAC";
		Assert.assertEquals(1, UdeStringUtils.lastIndexOf(testString, "A"));
	}

	@Test
	public void testLastIndexOfStringIntInt() throws Exception {
		String testString = "AAC";
		// from 0 index find back
		Assert.assertEquals(0, UdeStringUtils.lastIndexOf(testString, 65, 0));
	}

	@Test
	public void testLastIndexOfStringStringInt() throws Exception {
		String testString = "AAC";
		// from 0 index find back
		Assert.assertEquals(0, UdeStringUtils.lastIndexOf(testString, "A", 0));
	}

	@Test
	public void testTrim() throws Exception {
		String testString = " AAC ";
		Assert.assertEquals("AAC", UdeStringUtils.trim(testString));
	}

	@Test
	public void testRemoveBOM() throws Exception {
		int[] testInt = { 0x02060, 65, 66, 67, 0x0FEFF, 0x0FFFE, 65 };
		int[] testIntNoSpace = { 0x02060, 65, 66, 67, 65 };
		String testString = UdeStringUtils.toString(testInt);
		String testStringNoSpace = UdeStringUtils.toString(testIntNoSpace);
		System.out.println("is testString equals testStringNoSpace ? -> " + testString.equals(testStringNoSpace));
		System.out.println("origen is =" + testString);
		System.out.println("new    is =" + UdeStringUtils.removeBOM(testString));
		Assert.assertEquals("ABCA", UdeStringUtils.removeBOM(testString));
	}

	@Test
	public void testDivide() throws Exception {
		String origenString = "ABCABCABC";
		String[] dividedString = UdeStringUtils.divide(origenString, 3);
		System.out.println("origenString is => " + origenString);
		for (int i = 0; i < dividedString.length; i++) {
			System.out.println("dividedString is => " + dividedString[i]);
		}
		Assert.assertEquals("ABC", dividedString[0]);
	}

	@Test
	public void testSubstringStringInt() throws Exception {
		String origenString = "ABCABCABC";
		Assert.assertEquals("ABC", UdeStringUtils.substring(origenString,6));
	}

	@Test
	public void testSubstringStringIntInt() throws Exception {
		
		String origenString = "ABCABCABC";
		Assert.assertEquals("ABC", UdeStringUtils.substring(origenString, 3, 6));
	}
}
