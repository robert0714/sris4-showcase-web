package com.iisigroup.ude.util;

import java.util.Map;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/applicationContext2.xml")
public class SpringContextUtilsTest {

	@Autowired
	private ApplicationContext context;

	@Before
	public void setUp() throws Exception {
		SpringContextUtils.setApplicationContextStatic(context);
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

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetApplicationContextStatic() throws Exception {
		System.out.println("context = null ? ");
		System.out.println(context == null);
		System.out.println(context.getBean("testBean"));
		Assert.assertEquals(false, Optional.empty() == SpringContextUtils.getBean("testBean"));

	}

	@Test
	public void testClear() throws Exception {
		System.out.println("before call  clear" + SpringContextUtils.getBean("testBean"));
		SpringContextUtils.clear();
		System.out.println("after call  clear" + SpringContextUtils.getBean("testBean"));
		Assert.assertTrue(Optional.empty() == SpringContextUtils.getBean("testBean"));
	}

	@Test
	public void testGetBeans() throws Exception {
		Assert.assertTrue(SpringContextUtils.getBeans(SpringContextUtilsTest.class).isPresent());
	}

	@Test
	public void testGetBeanString() throws Exception {

		Assert.assertTrue(SpringContextUtils.getBean("testBean").isPresent());
	}

}
