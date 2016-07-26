package com.iisigroup.ude.test;

import com.iisigroup.ude.util.lang.ChineseNumberType;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class RocDateUtilsTest {

	@Before
	public void setUp() throws Exception {
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
	public void testFormatLocalDateTimeString() throws Exception {
		final Date date = new Date();
		final LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		Assert.assertEquals("105/07/25", RocDateUtils.format(ldt, "yyy/MM/dd"));
	}

	@Test
	public void testFormatLocalDateTimeStringChineseNumberType() throws Exception {
		final Date date = new Date();
		final LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		Assert.assertEquals("105/07/25", RocDateUtils.format(ldt, "yyy/MM/dd", null));
	}

	@Test
	public void testFormatDateString() throws Exception {
		Assert.assertEquals("105/07/25", RocDateUtils.format(new Date(), "yyy/MM/dd"));
	}

	@Test
	public void testFormatDateStringChineseNumberType() throws Exception {
		final ChineseNumberType ch = null;
		final Date date = new Date();
		final LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		Assert.assertEquals("105/07/25", RocDateUtils.format(new Date(), "yyy/MM/dd", null));
	}
}
