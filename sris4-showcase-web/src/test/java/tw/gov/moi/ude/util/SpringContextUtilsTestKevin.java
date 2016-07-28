package tw.gov.moi.ude.util;

import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import tw.gov.moi.aeweb.showcase.common.Rl0171cVO;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration("file:src/main/resources/applicationContextTest.xml")
public class SpringContextUtilsTestKevin {

	@Mock
	ApplicationContext applicationContext;

	@Before
	public void initObjects() {
		applicationContext = Mockito.mock(ApplicationContext.class);

		SpringContextUtils.setApplicationContextStatic(applicationContext);
	}

	@Test
	public void testSetApplicationContextStatic() throws Exception {
		Assert.assertEquals(false, Optional.empty().equals(SpringContextUtils.getBean("Rl0171cVO")));
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

	@Test
	public void testClear() throws Exception {

		SpringContextUtils.clear();
		Assert.assertEquals(true, SpringContextUtils.getBeans(Object.class).equals(Optional.empty()));
	}

	@Test
	public void testGetBeans() throws Exception {
		Assert.assertNotNull(((Map) SpringContextUtils.getBeans(Object.class).get()).get("Rl0171cVO"));
	}

	@Test
	public void testGetBeanString() throws Exception {
		Assert.assertEquals(false, Optional.empty().equals(SpringContextUtils.getBean("Rl0171cVO")));
		Assert.assertEquals(false, Optional.empty().equals(SpringContextUtils.getBean(Rl0171cVO.class)));
		Assert.assertEquals(false, Optional.empty().equals(SpringContextUtils.getBean("Rl0171cVO", Object.class)));
	}
}
