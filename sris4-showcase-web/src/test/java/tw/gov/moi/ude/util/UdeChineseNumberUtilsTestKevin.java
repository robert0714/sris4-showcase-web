package tw.gov.moi.ude.util;

import com.iisigroup.ude.util.lang.ChineseNumberType;

import org.junit.Assert;
import org.junit.Test;

public class UdeChineseNumberUtilsTestKevin {

	final String numberStr = "987654";

	@Test
	public void testFormatChineseNumberTypeLong() throws Exception {

		final long numberlong = 987654;

		Assert.assertEquals("玖拾捌萬柒仟陸佰伍拾肆", UdeChineseNumberUtils.format(ChineseNumberType.Money, numberlong));

		System.err.println("test==11==" + UdeChineseNumberUtils.format(ChineseNumberType.Money, numberlong));

		// throw new RuntimeException("not yet implemented");
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
	public void testFormatChineseNumberTypeString() throws Exception {

		Assert.assertEquals("玖拾捌萬柒仟陸佰伍拾肆", UdeChineseNumberUtils.format(ChineseNumberType.Money, numberStr));

		System.err.println("test==22==" + UdeChineseNumberUtils.format(ChineseNumberType.Money, numberStr));
		// throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testFormatChineseNumberTypeStringInt() throws Exception {

		Assert.assertEquals("玖拾捌萬柒仟陸佰伍拾肆", UdeChineseNumberUtils.format(ChineseNumberType.Money, numberStr, 10));

		System.err.println("test==33==" + UdeChineseNumberUtils.format(ChineseNumberType.Money, numberStr, 10));

		// throw new RuntimeException("not yet implemented");
	}

	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	// final String numberStr = "987654";
	//
	// System.err.println("test==00==" + Long.parseLong(numberStr, 8));
	// }

}
