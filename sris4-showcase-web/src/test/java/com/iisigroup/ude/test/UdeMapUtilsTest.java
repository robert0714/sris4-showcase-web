package com.iisigroup.ude.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UdeMapUtilsTest {

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
	public void testEnumMap() throws Exception {
		enum kk ={111,222,333};
		UdeMapUtils.enumMap(K.class);
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLazyMap() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLazyMapToSet() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testLazyMapToList() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testReverseMap() throws Exception {
		throw new RuntimeException("not yet implemented");
	}
}
