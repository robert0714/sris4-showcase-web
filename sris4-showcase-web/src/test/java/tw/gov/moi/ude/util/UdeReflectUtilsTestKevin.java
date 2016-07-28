package tw.gov.moi.ude.util;

import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
// @RunWith(MockitoJUnitRunner.class)
@ContextConfiguration("file:src/main/resources/applicationContextTest.xml")
public class UdeReflectUtilsTestKevin {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void testIsStatic() throws Exception {

		final Person2 per2 = new Person2();
		final Class<?> secretClass = per2.getClass();

		final Field fields = secretClass.getDeclaredField("FNAME");

		Assert.assertEquals(true, UdeReflectUtils.isStatic(fields));
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
	public void testDiff() throws Exception {

		SpringContextUtils.setApplicationContextStatic(applicationContext);

		final Person per1 = new Person();
		final Person per2 = new Person();

		Assert.assertSame(SpringContextUtils.getBean("Rl0171cVO").get(), SpringContextUtils.getBean("Rl0171cVO").get());
		Assert.assertEquals(per1, UdeReflectUtils.diff(per1, per1)); // TODO

	}

	@Test
	public void testCopyProperties() throws Exception {

		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testCopyFields() throws Exception {

		final Person per = new Person();
		final Person2 per2 = new Person2();

		per.setFirstname("1111");
		per.setLastname("2222");

		final String[] ignoreFields = {};
		UdeReflectUtils.copyFields(per, per2, ignoreFields);
		Assert.assertSame(per.getFirstname(), per2.getFirstname());
		Assert.assertEquals(per.getFirstname(), per2.getFirstname());
	}

	public class Person2 {
		private static final String FNAME = "111";
		private static final String LNAME = "222";

		private String firstname;
		private String lastname;

		/**
		 * @return the firstname
		 */
		public String getFirstname() {
			return this.firstname;
		}

		/**
		 * @param firstname
		 *            the firstname to set
		 */
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		/**
		 * @return the lastname
		 */
		public String getLastname() {
			return this.lastname;
		}

		/**
		 * @param lastname
		 *            the lastname to set
		 */
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	}
}
