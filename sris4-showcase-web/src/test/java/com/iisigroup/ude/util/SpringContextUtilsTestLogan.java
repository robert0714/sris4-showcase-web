/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package com.iisigroup.ude.util;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testApplicationContext.xml")
public class SpringContextUtilsTestLogan {

	@Autowired
	ApplicationContext context;

	@Before
	public void setUp() {

		SpringContextUtils.setApplicationContextStatic(context);
	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.SpringContextUtils#setApplicationContextStatic(org.springframework.context.ApplicationContext)}
	 * .
	 */
	@Test
	public void testSetApplicationContextStatic() {

		assertTrue(SpringContextUtils.getBean("BeanForTest") != Optional
				.empty());

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

	/**
	 * Test method for {@link com.iisigroup.ude.util.SpringContextUtils#clear()}
	 * .
	 */
	@Test
	public void testClear() {

		SpringContextUtils.clear();

		assertTrue(SpringContextUtils.getBean("BeanForTest1") == Optional
				.empty());
	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.SpringContextUtils#getBean(java.lang.Class)}
	 * .
	 */
	@Test
	public void testGetBeanClassOfT() {

		assertTrue(SpringContextUtils.getBean(SpringContextBeanForTest.class)
				.isPresent());

		assertFalse(SpringContextUtils.getBean(SpringContextBeanForTest1.class)
				.isPresent());

	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.SpringContextUtils#getBeans(java.lang.Class)}
	 * .
	 */
	@Test
	public void testGetBeans() {

		assertTrue(SpringContextUtils.getBeans(SpringContextBeanForTest.class)
				.isPresent());

		assertTrue(SpringContextUtils.getBeans(SpringContextBeanForTest1.class)
				.isPresent());

	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.SpringContextUtils#getBean(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetBeanString() {

		assertTrue(SpringContextUtils.getBean("BeanForTest1") != Optional
				.empty());

	}

	/**
	 * Test method for
	 * {@link com.iisigroup.ude.util.SpringContextUtils#getBean(java.lang.String, java.lang.Class)}
	 * .
	 */
	@Test
	public void testGetBeanStringClassOfT() {

		assertSame(
				SpringContextUtils.getBean("BeanForTest1").get(),
				SpringContextUtils.getBean("BeanForTest1",
						SpringContextBeanForTest1.class).get());

	}
}
