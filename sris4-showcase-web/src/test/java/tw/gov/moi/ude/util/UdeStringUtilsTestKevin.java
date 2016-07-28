package tw.gov.moi.ude.util;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class UdeStringUtilsTestKevin {

	final String testStr = "ABCDEFGH國字";

	final String testStrError = "ABCDEFGX國字";

	@Test
	public void testLength() throws Exception {

		final String sample = "Je t'aime";

		Assert.assertEquals(9, UdeStringUtils.length(sample));
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

	private int[] getTestIntArrays(String str) {

		final int[] acp = new int[str.length()];

		for (int i = 0; i < str.length(); i++) {
			acp[i] = str.charAt(i);
		}

		return acp;
	}

	@Test
	public void testToCodePointArray() throws Exception {

		Assert.assertEquals(true, Arrays.equals(getTestIntArrays(testStr), //
				UdeStringUtils.toCodePointArray(testStr)));
	}

	@Test
	public void testFromCodePointIntArray() throws Exception {

		Assert.assertEquals(true, testStr.equals(UdeStringUtils.fromCodePoint(getTestIntArrays(testStr))));
	}

	@Test
	public void testFromCodePointIntArrayIntInt() throws Exception {

		Assert.assertEquals(true, testStr.equals(UdeStringUtils.fromCodePoint(getTestIntArrays(testStr), //
				0, getTestIntArrays(testStr).length)));
	}

	@Test
	public void testToStringIntArray() throws Exception {

		Assert.assertEquals(true, testStr.equals(UdeStringUtils.toString(getTestIntArrays(testStr))));

	}

	@Test
	public void testToStringIntArrayIntInt() throws Exception {

		Assert.assertEquals(true, testStr.equals(UdeStringUtils.toString(getTestIntArrays(testStr), //
				0, getTestIntArrays(testStr).length)));
	}

	@Test
	public void testToFullChar() throws Exception {

		Assert.assertEquals(true, "：".equals(UdeStringUtils.toFullChar(":")));
	}

	@Test
	public void testToHelfChar() throws Exception {

		// TODO
		// 未轉型
		System.err.println("==helf==." + UdeStringUtils.toFullChar("）"));

		Assert.assertEquals(true, ":".equals(UdeStringUtils.toFullChar("）")));
	}

	@Test
	public void testIndexOfStringInt() throws Exception {

		final int find = "B".charAt(0);
		// System.err.println(UdeStringUtils.indexOf(testStr, find));
		Assert.assertEquals(true, testStr.indexOf("B") == UdeStringUtils.indexOf(testStr, find));
	}

	@Test
	public void testIndexOfStringString() throws Exception {

		Assert.assertEquals(true, testStr.indexOf("B") == UdeStringUtils.indexOf(testStr, "B"));
	}

	@Test
	public void testIndexOfStringIntInt() throws Exception {

		final int find = "B".charAt(0);
		System.err.println(UdeStringUtils.indexOf(testStr, find, 1));
		Assert.assertEquals(true, testStr.indexOf("B") == UdeStringUtils.indexOf(testStr, find, 1));

	}

	@Test
	public void testIndexOfStringStringInt() throws Exception {
		Assert.assertEquals(true, testStr.indexOf("B") == UdeStringUtils.indexOf(testStr, "B", 1));
	}

	@Test
	public void testLastIndexOfStringInt() throws Exception {
		final int find = "B".charAt(0);
		Assert.assertEquals(true, testStr.lastIndexOf("B") == UdeStringUtils.lastIndexOf(testStr, find));
		System.err.println(UdeStringUtils.lastIndexOf(testStr, find));
	}

	@Test
	public void testLastIndexOfStringString() throws Exception {
		Assert.assertEquals(true, testStr.lastIndexOf("B") == UdeStringUtils.lastIndexOf(testStr, "B"));
		System.err.println(UdeStringUtils.lastIndexOf(testStr, "B"));
	}

	@Test
	public void testLastIndexOfStringIntInt() throws Exception {
		final int find = "B".charAt(0);
		Assert.assertEquals(true, testStr.lastIndexOf("B") == UdeStringUtils.lastIndexOf(testStr, find, 3));
		System.err.println(UdeStringUtils.lastIndexOf(testStr, find, 3));
	}

	@Test
	public void testLastIndexOfStringStringInt() throws Exception {
		Assert.assertEquals(true, testStr.lastIndexOf("B") == UdeStringUtils.lastIndexOf(testStr, "B", 3));
		System.err.println(UdeStringUtils.lastIndexOf(testStr, "B", 3));
	}

	@Test
	public void testTrim() throws Exception {
		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testRemoveBOM() throws Exception {
		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testDivide() throws Exception {
		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSubstringStringInt() throws Exception {
		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSubstringStringIntInt() throws Exception {
		// throw new RuntimeException("not yet implemented");
	}
}
