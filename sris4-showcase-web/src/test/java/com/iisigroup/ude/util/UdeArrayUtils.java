/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 *
 */
public class UdeArrayUtils {

	/** Logger Object. */
	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory
			.getLogger(UdeArrayUtils.class);

	/**
	 * Gets the.
	 *
	 * @param <T>
	 *            the generic type
	 * @param array
	 *            the array
	 * @param index
	 *            the index
	 * @return the t
	 */
	public static <T> T get(T[] array, int index) {
		if (array == null || array.length <= index) {
			return null;
		}
		return array[index];
	}

	public static int indexOf(int[] array, int[] toFind, int startPos) {
		if (array == null || array.length == 0) {
			return -1;
		}
		if (toFind == null || toFind.length == 0) {
			return -1;
		}
		if (array.length < toFind.length) {
			return -1;
		}
		return innerBasicMatching(array, toFind, Math.max(0, startPos));
	}

	public static int lastIndexOf(int[] array, int[] toFind) {
		if (array == null || array.length == 0) {
			return -1;
		}
		return lastIndexOf(array, toFind, array.length - 1);
	}

	/**
	 * Last index of.
	 *
	 * @param array
	 *            the array
	 * @param toFind
	 *            the to find
	 * @param lastStartPos
	 *            最後可接受的開始位置，意即 return 值不會大於 lastStartPos。
	 * @return the int
	 */
	public static int lastIndexOf(int[] array, int[] toFind, int lastStartPos) {
		if (array == null || array.length == 0) {
			return -1;
		}
		if (toFind == null || toFind.length == 0) {
			return -1;
		}
		if (array.length < toFind.length) {
			return -1;
		}
		if (lastStartPos < 0) {
			return -1;
		}
		// 只看 0~maxRange 間的元素
		final int maxRange = Math.min(lastStartPos + toFind.length,
				array.length);
		final int[] reverseArray = Arrays.copyOfRange(array, 0, maxRange);
		final int[] reverseToFind = ArrayUtils.clone(toFind);

		LOGGER.trace("reverseArray  : {}", Arrays.toString(reverseArray));
		LOGGER.trace("reverseToFind : {}", Arrays.toString(reverseToFind));
		ArrayUtils.reverse(reverseArray);
		ArrayUtils.reverse(reverseToFind);
		final int indexOf = innerBasicMatching(reverseArray, reverseToFind, 0);

		LOGGER.trace("reverse IndexOf : {}", indexOf);
		if (indexOf < 0) {
			return -1;
		} else {
			return reverseArray.length - indexOf - toFind.length;
		}

	}

	/**
	 * @param array
	 * @param toFind
	 * @return
	 */
	private static int innerBasicMatching(int[] array, int[] toFind,
			int fromIndex) {

		final int arrayLen = array.length;
		final int toFindLen = toFind.length;
		boolean found = false;
		// 6:0,1,2,3,4,5
		// 3:3,4,5
		// 0 1 2 3
		// ===> i <= (6-3)
		for (int i = fromIndex; i <= arrayLen - toFindLen; i++) {
			for (int j = 0; j < toFindLen; j++) {
				if (array[i + j] != toFind[j]) {
					found = false;
					break;
				}
				found = true;
			}
			if (found) {
				return i;
			}
		}
		return -1;
	}
}
