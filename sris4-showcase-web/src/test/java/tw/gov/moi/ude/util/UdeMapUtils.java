/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.ude.util;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.functors.PrototypeFactory;
import org.apache.commons.collections4.map.LazyMap;

/**
 * Java Map 擴充元件.
 */
@UtilityClassAssertion
public final class UdeMapUtils {

	/**
	 * private.
	 */
	private UdeMapUtils() {
		throw new AssertionError();
	}

	// ####################################################################
	// ## [Method] sub-block : EnumMap
	// ####################################################################

	public static <K extends Enum<K>, V> Map<K, V> enumMap(Class<K> keyType) {
		return new EnumMap<K, V>(keyType);
	}

	// ####################################################################
	// ## [Method] sub-block : lazyMap
	// ####################################################################

	/**
	 * Create lazyMap To Prototype.
	 */
	public static <K, P> Map<K, P> lazyMap(final Map<K, P> srcMap, final P prototype) {
		return LazyMap.lazyMap(srcMap, PrototypeFactory.prototypeFactory(prototype));
	}

	// ####################################################################
	// ## [Method] sub-block : lazyMap to Set
	// ####################################################################

	/**
	 * Create lazyMap To Set. 產出的 MAP NOT THREAD-SAFE
	 */
	public static <K, E> Map<K, Set<E>> lazyMapToSet() {
		return lazyMap(new HashMap<K, Set<E>>(), new HashSet<E>());
	}

	// ####################################################################
	// ## [Method] sub-block : lazyMap to List
	// ####################################################################

	/**
	 * Create lazyMap To List. 產出的 MAP NOT THREAD-SAFE
	 */
	public static <K, E> Map<K, List<E>> lazyMapToList() {
		return lazyMap(new HashMap<K, List<E>>(), new ArrayList<E>());
	}

	/**
	 * Create lazyMap To List. 產出的 MAP NOT THREAD-SAFE
	 */
	public static <K, E> Map<K, List<E>> lazyMapToList(final Map<K, List<E>> srcMap) {
		return lazyMap(srcMap, new ArrayList<E>());
	}

	// ####################################################################
	// ## [Method] sub-block : MAP Utilities
	// ####################################################################

	/**
	 * 反轉 {@code Map<key,List<value>>} 為 {@code Map<value, Set<key>>} .
	 *
	 * @param <K>
	 *            The key type
	 * @param <V>
	 *            The value type
	 * @param map
	 *            原始資料
	 * @return 反轉結果
	 */
	public static <K, V> Map<V, Set<K>> reverseMap(final Map<K, ? extends Collection<V>> map) {
		final Map<V, Set<K>> result = lazyMap(new HashMap<V, Set<K>>(), new LinkedHashSet<K>());
		for (final Map.Entry<K, ? extends Collection<V>> entry : map.entrySet()) {
			final K key = entry.getKey();
			final Collection<V> values = entry.getValue();
			for (final V value : values) {
				result.get(value).add(key);

			}
		}
		return result;
	}
}
