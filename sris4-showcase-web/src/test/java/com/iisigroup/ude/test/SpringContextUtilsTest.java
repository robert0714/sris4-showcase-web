package com.iisigroup.ude.test;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class SpringContextUtilsTest {
	@Mock
	private ApplicationContext applicationContextStatic;
	@InjectMocks
	private SpringContextUtils springContextUtils;

	@Before
	public void setUp() throws Exception {
		final ApplicationContext app = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		SpringContextUtils.setApplicationContextStatic(app);
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
	public void testGetBeans() throws Exception {
		Assert.assertEquals(true, Optional.empty() != SpringContextUtils.getBean("udeBaseConfig"));
	}

	@Test
	public void testGetBeanString() throws Exception {
		Assert.assertEquals(true, Optional.empty() != SpringContextUtils.getBean("udeBaseConfig", Object.class));
	}
}
