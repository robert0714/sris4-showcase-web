/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.test;

import java.util.Map;
import java.util.Optional;

import org.springframework.context.ApplicationContext;

/**
 * iisi-ude-util 中需要使用 ContextUtil 取得 Spring元件時，可利用此工具類別。.
 * 
 * 其初始化在 SpringContextUtilSetup 中一併完成，故需 include 「UDE/iisi-ude-utils.xml」載入
 * {@code <}bean class="com.iisigroup.ude.util.SpringContextUtilSetup"
 * {@code />}
 */
public final class SpringContextUtils {

	/** The context. */
	private static ApplicationContext CONTEXT;

	/**
	 * private constructor for utility class.
	 */
	private SpringContextUtils() {
	}

	/**
	 * Sets the application context static.
	 *
	 * @param applicationContext
	 *            the new application context static
	 */
	static void setApplicationContextStatic(final ApplicationContext applicationContext) {
		CONTEXT = applicationContext;
	}

	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	private static ApplicationContext getApplicationContext() {
		return CONTEXT;
	}

	/**
	 * 提供給 APP destroy 前呼叫.
	 */
	public static void clear() {
		CONTEXT = null;
	}

	/**
	 * 取得指定類別 Spring 元件.
	 *
	 * @param <T>
	 *            the generic type
	 * @param t
	 *            指定類別
	 * @return Spring 元件, or null 若查無符合項目.
	 */
	public static final <T> Optional<T> getBean(final Class<T> t) {
		try {
			return Optional.ofNullable(getApplicationContext().getBean(t));
		} catch (final Exception e) {
			return Optional.empty();
		}
	}

	public static final <T> Optional<Map<String, T>> getBeans(final Class<T> t) {
		try {
			return Optional.ofNullable(getApplicationContext().getBeansOfType(t));
		} catch (final Exception e) {
			return Optional.empty();
		}
	}

	/**
	 * 取得指定名稱 Spring 元件.
	 *
	 * @param beanName
	 *            the beanName
	 * @return Spring 元件, or null 若查無符合項目.
	 */
	public static final Optional<?> getBean(final String beanName) {
		try {
			return Optional.ofNullable(getApplicationContext().getBean(beanName));
		} catch (final Exception e) {
			return Optional.empty();
		}
	}

	/**
	 * 取得指定名稱、類別 Spring 元件.
	 *
	 * @param <T>
	 *            the generic type
	 * @param name
	 *            the name
	 * @param t
	 *            the t
	 * @return the bean
	 */
	public static final <T> Optional<T> getBean(final String name, final Class<T> t) {
		try {
			final T bean = getApplicationContext().getBean(name, t);
			return Optional.ofNullable(bean);
		} catch (final Exception e) {
			return Optional.empty();
		}
	}

}
