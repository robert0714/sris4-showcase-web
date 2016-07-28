package com.iisigroup.ude.util.lang;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UdeStringUtilsTest {

	@Before
	public void setUp() throws Exception {
	}
	//================================================
	//== [Enumeration types] Block Start
	//== [Enumeration types] Block End 
	//================================================
	//== [static variables] Block Start
	//== [static variables] Block Stop 
	//================================================
	//== [instance variables] Block Start
	//== [instance variables] Block Stop 
	//================================================
	//== [static Constructor] Block Start
	//== [static Constructor] Block Stop 
	//================================================
	//== [Constructors] Block Start (含init method)
	//== [Constructors] Block Stop 
	//================================================
	//== [Static Method] Block Start
	//== [Static Method] Block Stop 
	//================================================
	//== [Accessor] Block Start
	//== [Accessor] Block Stop 
	//================================================
	//== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
	//== [Overrided Method] Block Stop 
	//================================================
	//== [Method] Block Start
	//####################################################################
	//## [Method] sub-block : 
	//####################################################################    
	//== [Method] Block Stop 
	//================================================
	//== [Inner Class] Block Start
	//== [Inner Class] Block Stop 
	//================================================

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
		int[] codeArrayInt={65};
		Assert.assertEquals("A", UdeStringUtils.fromCodePoint(codeArrayInt));
	}

	@Test
	public void testFromCodePointIntArrayIntInt() throws Exception {
		int[] codeArrayInt={65,66,67};
		//UdeStringUtils.fromCodePoint(codePointArray, offset, length) <--length超過會arrayIndexOutOfBond 
		//function 本身沒有做錯誤檢查 
		Assert.assertEquals("BC", UdeStringUtils.fromCodePoint(codeArrayInt, 1, 2));
	}

	@Test
	public void testToStringIntArray() throws Exception {
		int[] codeArrayInt={65,66,67};
		//function 背地裡還是call fromCodePoint(array) ....
		Assert.assertEquals("ABC", UdeStringUtils.toString(codeArrayInt));
	}

	@Test
	public void testToStringIntArrayIntInt() throws Exception {
		int[] codeArrayInt={65,66,67};
		//toString系列跟fromCodePoint系列背地裡幹的事都一樣
		Assert.assertEquals("BC", UdeStringUtils.toString(codeArrayInt, 1, 2));
	}

	@Test
	public void testToFullChar() throws Exception {
//		System.out.println("ABC call toFullChar will turn into = "+UdeStringUtils.toFullChar("ABC"));
		Assert.assertEquals("ＡＢＣ", UdeStringUtils.toFullChar("ABC"));
	}

	@Test
	public void testToHelfChar() throws Exception {
		Assert.assertEquals("ABC", UdeStringUtils.toHelfChar("ＡＢＣ"));
	}

	@Test
	public void testIndexOfStringInt() throws Exception {
		String testString="ABC";
		//foot mark . not yet to understand how it work 
		Assert.assertEquals(1, UdeStringUtils.indexOf(testString, 66));
	}

	@Test
	public void testIndexOfStringString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testIndexOfStringIntInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testIndexOfStringStringInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLastIndexOfStringInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLastIndexOfStringString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLastIndexOfStringIntInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLastIndexOfStringStringInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testTrim() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testRemoveBOM() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDivide() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSubstringStringInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSubstringStringIntInt() throws Exception {
		throw new RuntimeException("not yet implemented");
	}
}
