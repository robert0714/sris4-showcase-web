package com.main.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UdeArrayUtilsTest1511008 {

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
		final String[] arr = { "A", "B", "C", "D" };
		Assert.assertEquals("D", UdeArrayUtils.<String> get(arr, 3));
	}

	@Test
	public void testIndexOf() throws Exception {
		final int[] arr = { 1, 2, 3, 4 };
		final int[] toFind = { 2, 3 };
		Assert.assertEquals(1, UdeArrayUtils.indexOf(arr, toFind, 0));
	}

	@Test
	public void testLastIndexOfIntArrayIntArray() throws Exception {
		final int[] arr = { 1, 2, 3, 4 };
		final int[] toFind = { 2, 3 };
		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(arr, toFind));
	}

	@Test
	public void testLastIndexOfIntArrayIntArrayInt() throws Exception {
		final int[] arr = { 1, 2, 3, 4 };
		final int[] toFind = { 2, 3 };
		Assert.assertEquals(1, UdeArrayUtils.lastIndexOf(arr, toFind, 3));
	}

}
