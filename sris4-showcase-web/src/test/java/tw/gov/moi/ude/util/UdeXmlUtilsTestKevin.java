package tw.gov.moi.ude.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class UdeXmlUtilsTestKevin {

	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();

	@Test
	public void testToXml() throws Exception {

		final String xml1 = "<root><node>Test</node></root>";
		final Object obj = "[testStr]";

		String xml1Expected = xml1.replace("<", "&lt;");
		xml1Expected = xml1Expected.replace(">", "&gt;");

		Assert.assertEquals("<string>" + obj + "</string>", UdeXmlUtils.toXml(obj));
		Assert.assertEquals("<string>" + xml1Expected + "</string>", UdeXmlUtils.toXml(xml1));

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
	public void testToFile() throws Exception {

		// final TemporaryFolder tempFolder = new TemporaryFolder();
		final File tempFile = tempFolder.newFile("file.txt");

		FileUtils.writeStringToFile(tempFile, "testToFile");

		final String s = FileUtils.readFileToString(tempFile);

		// Verify the content
		Assert.assertEquals("testToFile", s);
	}

	@Test
	public void testFromXml() throws Exception {

		final String expectedXml = "<tw.gov.moi.ude.util.Person><firstname>Joe</firstname><lastname>Walnes</lastname></tw.gov.moi.ude.util.Person>";

		Assert.assertNotNull(UdeXmlUtils.fromXml(Person.class, expectedXml));
	}

	@Test
	public void testListFromXml() throws Exception {

		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testFromFile() throws Exception {

		final File tempFile = tempFolder.newFile("file.txt");

		FileUtils.writeStringToFile(tempFile,
				"<tw.gov.moi.ude.util.Person><firstname>Joe</firstname><lastname>Walnes</lastname></tw.gov.moi.ude.util.Person>");

		Assert.assertNotNull(UdeXmlUtils.fromFile(Person.class, tempFile));
	}

	@Test
	public void testListFromFile() throws Exception {
		final List<Object> list = new ArrayList<Object>();

		list.add(new Person("Hsieh", "kevin"));
		list.add(new Person2("111", "2222"));

		// final TemporaryFolder tempFolder = new TemporaryFolder();
		final File tempFile = tempFolder.newFile("file.txt");

		FileUtils.writeStringToFile(tempFile, UdeXmlUtils.toXml(list));

		Assert.assertNotNull(UdeXmlUtils.listFromFile(tempFile));
		System.err.println("====" + UdeXmlUtils.listFromFile(tempFile));
	}

	@Test
	public void testMapFromFile() throws Exception {

		final Map<String, Person2> person2 = new HashMap<String, Person2>();

		person2.put("Person1", new Person2("111", "2222"));
		person2.put("Person2", new Person2("333", "4444"));

		final File tempFile = tempFolder.newFile("file.txt");

		FileUtils.writeStringToFile(tempFile, UdeXmlUtils.toXml(person2));

		Assert.assertNotNull(UdeXmlUtils.mapFromFile(tempFile));

		System.err.println("====" + ((Person2) UdeXmlUtils.mapFromFile(tempFile).get("Person1")).getFirstname());
	}

	public class Person2 {
		private final String firstname;
		private final String lastname;

		// ... constructors and methods
		public Person2(String string, String string2) {
			firstname = string;
			lastname = string2;
		}

		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return this.firstname;
		}

		/**
		 * @return the lastname
		 */
		public String getLastname() {
			return this.lastname;
		}

	}
}
