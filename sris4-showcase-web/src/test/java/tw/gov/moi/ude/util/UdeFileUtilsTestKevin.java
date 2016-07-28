package tw.gov.moi.ude.util;

import java.io.BufferedOutputStream;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class UdeFileUtilsTestKevin {

	@Rule
	public TemporaryFolder tempFolder = new TemporaryFolder();

	@Test
	public void testCreateWriter() throws Exception {

		final File tempFile = tempFolder.newFile("file.txt");
		FileUtils.writeStringToFile(tempFile, "testToFile");
		final String s = FileUtils.readFileToString(tempFile);

		Assert.assertEquals(s, "testToFile");
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
	public void testCreateReaderFile() throws Exception {

		final File tempFile = tempFolder.newFile("file.txt");
		final File tempFileNull = null;
		FileUtils.writeStringToFile(tempFile, "testToFile");
		final String s = FileUtils.readFileToString(tempFile);

		Assert.assertNotNull(UdeFileUtils.createReader(tempFile));
		Assert.assertNull(tempFileNull);
		Assert.assertEquals(false, "".equals(s));
	}

	@Test
	public void testCreateReaderFileString() throws Exception {

		final File tempFile = tempFolder.newFile("file.txt");

		Assert.assertNotNull(UdeFileUtils.createReader(tempFile, "UTF-8"));
	}

	@Test
	public void testCreateInputStream() throws Exception {

		final File tempFile = tempFolder.newFile("file.txt");

		Assert.assertNotNull(UdeFileUtils.createInputStream(tempFile));
	}

	@Test
	public void testCreateOutputStream() throws Exception {
		final File tempFile = tempFolder.newFile("file.txt");
		FileUtils.writeStringToFile(tempFile, "testToFile");
		System.err.println("===" + UdeFileUtils.createOutputStream(tempFile));

		final BufferedOutputStream outputStream = UdeFileUtils.createOutputStream(tempFile);

		// final outputStream

		Assert.assertNotNull(UdeFileUtils.createOutputStream(tempFile));
	}

	@Test
	public void testAsSuffix() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testAsExtName() throws Exception {
		throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testQuiteDelete() throws Exception {
		throw new RuntimeException("not yet implemented");
	}
}
