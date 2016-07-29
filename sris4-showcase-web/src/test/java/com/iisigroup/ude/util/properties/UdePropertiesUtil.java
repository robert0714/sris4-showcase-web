/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.properties;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;

import java.io.File;
import java.io.IOException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * Java Properties 擴充功能 Utility.
 */
@UtilityClassAssertion
public final class UdePropertiesUtil {

	/**
	 * Instantiates a new aePropertiesUtil.
	 */
	private UdePropertiesUtil() {
		throw new AssertionError();
	}

	/**
	 * Load.
	 *
	 * @param resource
	 *            the resource
	 * @return the ude properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static UdeProperties load(Resource resource) throws IOException {
		return load(resource, "utf-8");
	}

	/**
	 * Load.
	 *
	 * @param file
	 *            the file
	 * @return the ude properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static UdeProperties load(File file) throws IOException {
		return load(file, "utf-8");
	}

	/**
	 * 以 擴充功能載入 properties 檔案.
	 *
	 * @param file
	 *            the properties file
	 * @param encoding
	 *            the encoding
	 * @return the properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static UdeProperties load(File file, String encoding)
			throws IOException {
		return load(new FileSystemResource(file), encoding);
	}

	/**
	 * Load.
	 *
	 * @param resource
	 *            the resource
	 * @param encoding
	 *            the encoding
	 * @return the ude properties
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static UdeProperties load(Resource resource, String encoding)
			throws IOException {
		final UdeProperties properties = new UdeProperties();
		if (encoding == null) {
			PropertiesLoaderUtils.fillProperties(properties, resource);
		} else {
			PropertiesLoaderUtils.fillProperties(properties,
					new EncodedResource(resource, encoding));
		}
		return properties;
	}

}
