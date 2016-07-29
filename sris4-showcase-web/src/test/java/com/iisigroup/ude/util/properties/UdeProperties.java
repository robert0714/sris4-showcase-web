/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util.properties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.collections4.functors.PrototypeFactory;
import org.apache.commons.collections4.map.LazyMap;
import org.apache.commons.lang3.StringUtils;

/**
 * Java Properties 擴充功能
 * 
 * @see Properties
 */
public class UdeProperties extends Properties {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** 有序的KEY值. */
	private final Set<String> keys = new LinkedHashSet<>();

	/** 同名多值的儲存區. */
	private final Map<String, List<String>> multiValuesPropertiesMap = LazyMap
			.lazyMap(new ConcurrentHashMap<String, List<String>>(),
					PrototypeFactory.prototypeFactory(new ArrayList<String>()));

	@Override
	public synchronized Object put(Object key, Object value) {
		final Object oldValue = super.put(key, value);
		if (key instanceof String) {
			this.keys.add((String) key);
			if (oldValue instanceof String) {
				this.multiValuesPropertiesMap.get(key).add((String) oldValue);
			}
		}
		return oldValue;
	}

	// @Override
	// public synchronized Object putIfAbsent(Object key, Object value) {
	// final Object oldValue = super.putIfAbsent(key, value);
	// if (oldValue == null) {
	// if (key instanceof String) {
	// this.keys.add((String) key);
	// }
	// }
	// return oldValue;
	// }

	@Override
	public synchronized Set<String> stringPropertyNames() {
		return Collections.unmodifiableSet(this.keys);
	}

	/**
	 * 以MAP取得屬性內容.<br>
	 * 
	 * <pre>
	 * 例如檔案內容為：
	 * location.XX=1
	 * location.YY=2
	 * location.ZZ=2A
	 * location.ZZ=3A
	 * 則  getPropertyMap("location") 結果為 {XX=1, YY=2, ZZ=3A}
	 * </pre>
	 * 
	 * @param propertyKey
	 *            the property key.
	 * @return the properties map
	 */
	public Map<String, String> getPropertyMap(String propertyKey) {
		final List<String> usedKeys = new ArrayList<String>();
		final int pos = propertyKey.length();
		for (final String k : this.keys) {
			if (k.startsWith(propertyKey)) {
				final String subKey = k.substring(pos);
				if (StringUtils.isEmpty(subKey) || subKey.matches("(\\.\\w+)+")) {
					usedKeys.add(k);
				}
			}
		}
		final Map<String, String> map = new LinkedHashMap<String, String>();
		for (final String key : usedKeys) {
			final String property = super.getProperty(key);
			if (property == null) {
				continue;
			}
			final String subKey = key.substring(pos);
			if (subKey.startsWith(".")) {
				map.put(subKey.substring(1), property);
			} else {
				map.put(subKey, property);
			}
		}
		return map;
	}

	/**
	 * 以 List 取得同名的屬性內容.<br>
	 * 
	 * <pre>
	 * 例如檔案內容為：
	 * location=XX
	 * location.1=A
	 * location.2=B
	 * location.3=C
	 * 則  getPropertyList("location") 結果為 [XX,A,B,C]
	 * </pre>
	 * 
	 * @param propertyKey
	 *            the property key.
	 * @return the property list
	 */
	public List<String> getPropertyList(String propertyKey) {
		return getPropertyList(propertyKey, null);
	}

	/**
	 * Gets the property list.
	 *
	 * @param propertyKey
	 *            the property key
	 * @param separatorChars
	 *            the separator chars
	 * @return the property list
	 */
	public List<String> getPropertyList(String propertyKey,
			String separatorChars) {
		if (StringUtils.isBlank(propertyKey)) {
			return Collections.emptyList();
		}
		final List<String> usedKeys = new ArrayList<String>();
		final int pos = propertyKey.length();
		for (final String k : this.keys) {
			if (k.startsWith(propertyKey)) {
				final String subKey = k.substring(pos);
				if (StringUtils.isEmpty(subKey) || subKey.matches("\\.\\d+")) {
					usedKeys.add(k);
				}
			}
		}
		if (usedKeys.isEmpty()) {
			return Collections.emptyList();
		}
		final List<String> values = new ArrayList<String>();
		for (final String key : usedKeys) {
			if (this.multiValuesPropertiesMap.containsKey(key)) {
				final List<String> srcList = this.multiValuesPropertiesMap
						.get(key);
				for (final String property : srcList) {
					if (StringUtils.isNotBlank(separatorChars)) {
						Collections.addAll(values,
								StringUtils.split(property, separatorChars));
					} else {
						values.add(property);
					}
				}
			}
			final String property = super.getProperty(key);
			if (property != null) {
				if (StringUtils.isNotBlank(separatorChars)) {
					Collections.addAll(values,
							StringUtils.split(property, separatorChars));
				} else {
					values.add(property);
				}
			}
		}
		return values;
	}
}
