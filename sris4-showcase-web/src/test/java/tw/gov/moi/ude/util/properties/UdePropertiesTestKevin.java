package tw.gov.moi.ude.util.properties;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class UdePropertiesTestKevin {
	final UdeProperties test = new UdeProperties();

	@Test
	public void testPut() throws Exception {

		test.put("location.XX", "1");
		test.put("location.YY", "2");
		test.put("location.ZZ", "3");

		// throw new RuntimeException("not yet implemented");
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
	public void testStringPropertyNames() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetPropertyMap() throws Exception {

		this.testPut();
		System.err.println("=========" + test.getPropertyMap("location"));

		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetPropertyListString() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetPropertyListStringString() throws Exception {

		final List testList = new ArrayList(); // TODO
		testList.add("location=XX");
		testList.add("location.1=A");
		testList.add("location.1=2");

		System.err.println(new UdeProperties().getPropertyList("location"));
		// throw new RuntimeException("not yet implemented");
	}
}
