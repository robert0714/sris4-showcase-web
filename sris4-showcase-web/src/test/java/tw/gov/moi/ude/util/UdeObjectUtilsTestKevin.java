package tw.gov.moi.ude.util;

import com.iisigroup.ude.exception.EventCode;

import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;

public class UdeObjectUtilsTestKevin {

	@Test
	public void testCreateFrom() throws Exception {

		final Person per = new Person();
		per.setFirstname("1111");
		per.setLastname("2222");

		final Person per2 = UdeObjectUtils.createFrom(Person.class, per);

		Assert.assertSame(per.getFirstname(), per2.getFirstname());
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
	public void testHandleExceptionRun() throws Exception {

		final Supplier<Person> i = Person::new;// () -> "java2s.com";

		System.out.println(i.get());

		final com.iisigroup.ude.util.internal.QuietSupplier<Person> test = Person::new;// ()->"456";

		System.out.println("====" + test.get());
		System.err.println(UdeObjectUtils.handleExceptionRun(EventCode.UNDEFINED.as("test"), "123", test));
	}

	enum S1 {
		S1, S2
	};

	@Test
	public void testEquals() throws Exception {
		Assert.assertEquals(false, UdeObjectUtils.equals("S1", S1.valueOf("S1")));
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
