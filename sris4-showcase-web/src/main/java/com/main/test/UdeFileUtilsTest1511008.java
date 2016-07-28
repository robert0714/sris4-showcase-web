package com.main.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UdeFileUtilsTest1511008 {

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
	public void testCreateWriter() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file.txt");
		final BufferedWriter out = UdeFileUtils.createWriter(f);
		out.write("2344");
		out.newLine();
		out.write("安安");
		out.close();
	}

	@Test
	public void testCreateReaderFile() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file.txt");
		final BufferedReader in = UdeFileUtils.createReader(f);
		String s;
		while ((s = in.readLine()) != null) {
			System.out.println("FFF---" + s);
		}
	}

	@Test
	public void testCreateReaderFileString() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file.txt");
		final BufferedReader in = UdeFileUtils.createReader(f, "BIG5");
		String s;
		while ((s = in.readLine()) != null) {
			System.out.println("SSS---" + s);
		}
	}

	@SuppressWarnings({ "deprecation", "null" })
	@Test
	public void testCreateInputStream() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file.txt");
		final BufferedInputStream bis = UdeFileUtils.createInputStream(f);
		final char[] buffer = new char[1024];
		final StringBuilder out = new StringBuilder();
		final Reader in = new InputStreamReader(bis);
		for (;;) {
			final int rsz = in.read(buffer, 0, buffer.length);
			if (rsz < 0) {
				break;
			}
			out.append(buffer, 0, rsz);
		}
		System.out.println(out);
	}

	@Test
	public void testCreateOutputStream() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file2.txt");
		final BufferedOutputStream bos = UdeFileUtils.createOutputStream(f);
		final byte[] arr = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };
		bos.write(arr, 0, 16);
		bos.close();
	}

	@Test
	public void testAsSuffix() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file2.txt");
		final File f2 = UdeFileUtils.asSuffix(f, "test123");
		final BufferedOutputStream bos = UdeFileUtils.createOutputStream(f2);
		final byte[] arr = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };
		bos.write(arr, 0, 10);
		bos.close();

	}

	@Test
	public void testAsExtName() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file2.txt");
		final File f2 = UdeFileUtils.asExtName(f, "test333");
		final BufferedOutputStream bos = UdeFileUtils.createOutputStream(f2);
		final byte[] arr = { 0x61, 0x62, 0x63, 0x64, 0x65, 0x66, 0x67, 0x68, 0x69, 0x6A, 0x6B, 0x6C, 0x6D, 0x6E, 0x6F,
				0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 0x78, 0x79, 0x7A };
		bos.write(arr, 0, 10);
		bos.close();
	}

	@Test
	public void testQuiteDelete() throws Exception {
		final File f = new File("c:\\Users\\1511008\\file2test123.txt");
		System.out.println("delete?" + UdeFileUtils.quiteDelete(f));
	}
}
