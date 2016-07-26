/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.test;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import org.apache.commons.lang3.StringUtils;

/**
 * 常用檔案元件.
 */
@UtilityClassAssertion
public final class UdeFileUtils {

	/** constructor. */
	private UdeFileUtils() {
		throw new AssertionError();
	}

	/**
	 * 建立 BufferedWriter 供使用, 編碼一律為 UTF-8.
	 *
	 * @param file
	 *            the file
	 * @return BufferedWriter
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static BufferedWriter createWriter(File file) throws IOException {
		final Writer out = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
		return new BufferedWriter(out);
	}

	/**
	 * 建立 BufferedReader 供使用, 編碼一律為 UTF-8.
	 *
	 * @param file
	 *            the file
	 * @return the buffered reader
	 * @throws UnsupportedEncodingException
	 *             the unsupported encoding exception
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	public static BufferedReader createReader(File file) throws UnsupportedEncodingException, FileNotFoundException {
		return createReader(file, "UTF-8");
	}

	/**
	 * Creates the reader.
	 *
	 * @param file
	 *            the file
	 * @param encoding
	 *            the encoding
	 * @return the buffered reader
	 * @throws UnsupportedEncodingException
	 *             the unsupported encoding exception
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	public static BufferedReader createReader(File file, String encoding)
			throws UnsupportedEncodingException, FileNotFoundException {
		if (encoding == null) {
			final Reader in = new InputStreamReader(new FileInputStream(file));
			return new BufferedReader(in);
		} else {
			final Reader in = new InputStreamReader(new FileInputStream(file), encoding);
			return new BufferedReader(in);
		}
	}

	/**
	 * 建立 BufferedInputStream 供使用
	 * 
	 * @param file
	 *            the file
	 * @return the buffered reader
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static BufferedInputStream createInputStream(File file) throws IOException {
		return new BufferedInputStream(new FileInputStream(file));
	}

	/**
	 * 建立 BufferedInputStream 供使用
	 * 
	 * @param file
	 *            the file
	 * @return the buffered reader
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static BufferedOutputStream createOutputStream(File file) throws IOException {
		return new BufferedOutputStream(new FileOutputStream(file));
	}

	/**
	 * AsSuffix.
	 *
	 * @param file
	 *            the file
	 * @param suffix
	 *            the suffix
	 * @return the risFile
	 */
	public static File asSuffix(File file, String suffix) {
		final File parentFile = file.getParentFile();
		final String fileName = file.getName();
		final StringBuilder tmpName = new StringBuilder(fileName);
		final int lastIndexOf = tmpName.lastIndexOf(".");
		if (lastIndexOf > 0) {
			tmpName.insert(lastIndexOf, suffix);
		} else {
			tmpName.append(suffix);
		}
		return new File(parentFile, tmpName.toString());
	}

	/**
	 * AsExtName.
	 *
	 * @param file
	 *            the file
	 * @param extName
	 *            the extName
	 * @return the risFile
	 */
	public static File asExtName(File file, String extName) {
		final File parentFile = file.getParentFile();
		final String fileName = file.getName();
		final StringBuilder tmpName = new StringBuilder(fileName);
		final int lastIndexOf = tmpName.lastIndexOf(".");
		if (lastIndexOf > 0) {
			tmpName.delete(lastIndexOf, tmpName.length());
		}
		if (StringUtils.isNotBlank(extName)) {
			tmpName.append(".").append(extName);
		}
		return new File(parentFile, tmpName.toString());
	}

	/**
	 * 刪除單檔或空目錄.
	 * 
	 * @param file
	 *            the file
	 * @return true, 當檔案已刪除，或本來就不存在時 (含file==NULL). <br>
	 *         false, 檔案無法刪除，若此檔對業務流程有意義，應設法處理.
	 */
	public static boolean quiteDelete(File file) {
		if (file == null) {
			return true;
		}
		try {
			return file.delete();
		} catch (final Exception ignored) {
			return false;
		}
	}

}
