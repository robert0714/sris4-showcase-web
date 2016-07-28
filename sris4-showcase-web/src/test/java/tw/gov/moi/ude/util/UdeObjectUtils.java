/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.ude.util;

import com.iisigroup.ude.exception.EventCode;
import com.iisigroup.ude.exception.URTException;
import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.internal.QuietSupplier;
import com.iisigroup.ude.util.lang8.reflect.UdeReflectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

import org.springframework.beans.BeanUtils;

/**
 * 在 Objects、ObjectUtils 之前的共用函式.
 */
@UtilityClassAssertion
public final class UdeObjectUtils {

	/**
	 * Instantiates a new aeObjectUtil.
	 */
	private UdeObjectUtils() {
		throw new AssertionError();
	}

	/**
	 * 由傳入物件內容建立指定類別實例.
	 *
	 * @param <T>
	 *            指定類別
	 * @param destClass
	 *            指定類別，需有 default constructor
	 * @param source
	 *            原始資料，相同 property 的欄位會複製到新建立的 instance 中.
	 * @return 新建立的 instance
	 * 
	 * @throws InstantiationException
	 *             the instantiation exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 * @throws InvocationTargetException
	 *             the invocation target exception
	 */
	public static <T> T createFrom(final Class<T> destClass, final Object source) //
			throws InstantiationException, IllegalAccessException, InvocationTargetException { //
		final T target = BeanUtils.instantiate(destClass);
		UdeReflectUtils.copyFields(source, target);
		return target;
	};

	public static <T> T handleExceptionRun(EventCode code, String errMsg, QuietSupplier<T> r) {
		try {
			return r.get();
		} catch (final URTException e) {
			throw e;
		} catch (final Exception e) {
			throw new URTException(code, errMsg, e);
		}
	}

	/**
	 * 避免重構改寫時，不小心用了不同的類別物件下 equals.
	 * 
	 * <PRE>
	 * 如原先 用 equals("S1", S1)，S1 為 String 
	 * 但若一次把 S1 改為 ENUM，則編譯不會 Error，但非預期結果，用此函式可得到  Warning 提醒。
	 * </PRE>
	 * 
	 * @param <T>
	 *            the generic type
	 * @param o1
	 *            the o1
	 * @param o2
	 *            the o2
	 * @return true, if successful
	 */
	public static <T> boolean equals(T o1, T o2) {
		return Objects.equals(o1, o2);
	}
}
