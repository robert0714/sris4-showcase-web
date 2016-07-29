/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import com.iisigroup.ude.util.codec.xmlconverter.XmlConverter;
import com.iisigroup.ude.util.codec.xmlconverter.XstreamConverter;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

/**
 * XML轉換介面，可進行Object與String的互相轉換動作.
 */
public final class UdeXmlUtils {

	/** The Constant DEFAULT_ENCODING. */
	private static final String DEFAULT_ENCODING = "UTF-8";

	/** The converter. */
	private static XmlConverter CONVERTER = new XstreamConverter();

	/**
	 * 物件轉字串.
	 *
	 * @param obj
	 *            欲轉換的物件
	 * @return 轉換結果字串
	 */
	public static String toXml(Object obj) {
		return CONVERTER.toXml(obj);
	};

	/**
	 * To file.
	 *
	 * @param obj
	 *            the obj
	 * @param file
	 *            the file
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void toFile(Object obj, File file) throws IOException {
		final String xml = toXml(obj);
		FileUtils.writeStringToFile(file, xml, DEFAULT_ENCODING);
	}

	/**
	 * 字串轉物件.
	 *
	 * @param <T>
	 *            the generic type
	 * @param classT
	 *            the class t
	 * @param xml
	 *            the xml
	 * @return 轉換結果物件
	 */
	public static <T> T fromXml(Class<T> classT, String xml) {
		return CONVERTER.fromXml(classT, xml);
	};

	/**
	 * 字串轉LIST.
	 *
	 * @param <T>
	 *            the generic type
	 * @param xml
	 *            the xml
	 * @return 轉換結果物件
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> listFromXml(String xml) {
		return (List<T>) fromXml(Object.class, xml);
	}

	/**
	 * From file.
	 *
	 * @param <T>
	 *            the generic type
	 * @param classT
	 *            the class t
	 * @param file
	 *            the file
	 * @return the t
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static <T> T fromFile(Class<T> classT, File file) throws IOException {
		final String xml = FileUtils.readFileToString(file, DEFAULT_ENCODING);
		return fromXml(classT, xml);
	}

	/**
	 * List from file.
	 *
	 * @param <T>
	 *            the generic type
	 * @param file
	 *            the file
	 * @return the list
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> listFromFile(File file) throws IOException {
		final String xml = FileUtils.readFileToString(file, DEFAULT_ENCODING);
		return (List<T>) fromXml(Object.class, xml);
	}

	/**
	 * Map from file.
	 *
	 * @param <K>
	 *            the key type
	 * @param <V>
	 *            the value type
	 * @param file
	 *            the file
	 * @return the map
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@SuppressWarnings("unchecked")
	public static <K, V> Map<K, V> mapFromFile(File file) throws IOException {
		final String xml = FileUtils.readFileToString(file, DEFAULT_ENCODING);
		return (Map<K, V>) fromXml(Object.class, xml);
	}

}
