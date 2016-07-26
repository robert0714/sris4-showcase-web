package com.iisigroup.ude.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UdeArrayUtilsTest {

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
	public void testGet() throws Exception {
		final String[] array = { "AAA", "BBB" };
		Assert.assertEquals("BBB", UdeArrayUtils.get(array, 1));
	}

	@Test
	public void testIndexOf() throws Exception {
		final int[] array = { 11, 22, 33 };
		Assert.assertEquals(1, UdeArrayUtils.indexOf(array, new int[] { 22 }, 0));
	}

	@Test
	public void testLastIndexOfIntArrayIntArray() throws Exception {
		final int[] array = { 11, 22, 33 };
		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(array, new int[] { 22 }));
	}

	@Test
	public void testLastIndexOfIntArrayIntArrayInt() throws Exception {
		final int[] array = { 11, 22, 33 };
		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(array, new int[] { 22 }, 2));
	}
}
