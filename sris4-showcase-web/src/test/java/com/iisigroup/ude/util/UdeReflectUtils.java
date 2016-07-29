/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.lang8.reflect.UdeClassUtils;
import com.iisigroup.ude.util.lang8.reflect.UdeFieldReadUtils;
import com.iisigroup.ude.util.lang8.reflect.UdeFieldWriteUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.beans.BeanUtils;

/**
 * 提供除 FieldUtils 外的常用 Reflection 功能.
 * 
 * @see org.apache.commons.lang3.reflect.FieldUtils
 */
@UtilityClassAssertion
public final class UdeReflectUtils {

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
	/**
	 * constructor.
	 */
	private UdeReflectUtils() {
		throw new AssertionError();
	}

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
	// ## [Method] sub-block : 屬性
	// ####################################################################

	public static boolean isStatic(final Field field) {
		return Modifier.isStatic(field.getModifiers());
	}

	// ####################################################################
	// ## [Method] sub-block : 比較
	// ####################################################################

	public static <T> T diff(final T oldObj, final T newObj)
			throws InstantiationException, IllegalAccessException {

		final Class<T> class1 = UdeClassUtils.getClass(oldObj);
		final T dest = class1.newInstance();
		final Field[] fields = FieldUtils.getAllFields(class1);
		for (final Field aField : fields) {
			final int modifiers = aField.getModifiers();
			if (Modifier.isStatic(modifiers)) {
				continue;
			}
			final Object value1 = UdeFieldReadUtils.read(aField, oldObj);
			final Object value2 = UdeFieldReadUtils.read(aField, newObj);
			if (!Objects.equals(value1, value2)) {
				UdeFieldWriteUtils.write(aField, dest, value2);
			} else {
				if (!aField.getType().isPrimitive()) {
					UdeFieldWriteUtils.write(aField, dest, null);
				}
			}
		}
		return dest;
	}

	// ####################################################################
	// ## [Method] sub-block : copy
	// ####################################################################

	/**
	 * shallow copy for JavaBean.
	 *
	 * @param source
	 *            the source
	 * @param target
	 *            the target
	 * @param ignoreProperties
	 *            the ignore properties
	 */
	public static void copyProperties(final Object source, final Object target,
			final String... ignoreProperties) {
		BeanUtils.copyProperties(source, target, ignoreProperties);
	}

	public static void copyFields(final Object source, final Object target,
			final String... ignoreFields) {

		final List<Field> sourceFields = FieldUtils.getAllFieldsList(source
				.getClass()); // 包含繼承父類別
		final List<Field> targetFields = FieldUtils.getAllFieldsList(target
				.getClass());
		final Map<String, Field> sourceFieldsMap = new HashMap<String, Field>();
		sourceFields.forEach(field -> {
			final int modifiers = field.getModifiers();
			if (!Modifier.isFinal(modifiers) //
					&& !Modifier.isStatic(modifiers) //
					&& !Object.class.equals(field.getDeclaringClass())) {
				sourceFieldsMap.put(field.getName(), field);
			}
		});
		for (final String ignoreFieldName : ignoreFields) {
			sourceFieldsMap.remove(ignoreFieldName);
		}
		targetFields.forEach(targetField -> {
			final String name = targetField.getName();
			final Field srcField = sourceFieldsMap.get(name);
			if (srcField != null) {
				final Object value = UdeFieldReadUtils.read(srcField, source);
				UdeFieldWriteUtils.write(targetField, target, value);
			}
		});
	}

	// == [Method] Block Stop
	// ================================================
	// == [Inner Class] Block Start
	// == [Inner Class] Block Stop
	// ================================================

}
