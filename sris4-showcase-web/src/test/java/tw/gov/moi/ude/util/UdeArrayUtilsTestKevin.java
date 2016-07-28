package tw.gov.moi.ude.util;

import org.junit.Assert;
import org.junit.Test;

public class UdeArrayUtilsTestKevin {

	@Test
	public void testGet() throws Exception {

		final String[] testStrArr = { "test1", "test2", "test3" };
		final Object[] objArr = null;

		Assert.assertEquals("test2", UdeArrayUtils.get(testStrArr, 1));
		Assert.assertNull(UdeArrayUtils.get(objArr, 0));
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

	@Test
	public void testIndexOf() throws Exception {
		final int[] testOne = { 10, 20, 30, 40 };
		final int[] testTwo = { 20 };

		Assert.assertEquals(1, UdeArrayUtils.indexOf(testOne, testTwo, 0));
	}

	@Test
	public void testLastIndexOfIntArrayIntArray() throws Exception {
		final int[] testOne = { 10, 20, 30, 40 };
		final int[] testTwo = { 20 };

		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(testOne, testTwo));
	}

	@Test
	public void testLastIndexOfIntArrayIntArrayInt() throws Exception {
		final int[] testOne = { 10, 20, 30, 40 };
		final int[] testTwo = { 20 };

		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(testOne, testTwo, 2));
	}
}
