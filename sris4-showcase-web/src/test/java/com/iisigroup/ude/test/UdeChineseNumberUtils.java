package com.iisigroup.ude.test;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.util.lang.ChineseNumberType;

/**
 * 數值轉中文格式
 */
@UtilityClassAssertion
public final class UdeChineseNumberUtils {

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
	private UdeChineseNumberUtils() {
		throw new AssertionError();
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Overrided Java Object Method] Block Start (toString/equals+hashCode)
	// == [Overrided Java Object Method] Block Stop
	// ================================================
	// == [Accessor] Block Start
	// == [Accessor] Block Stop
	// ================================================
	// == [Static Method] Block Start
	// == [Static Method] Block Stop
	// ================================================
	// == [Method] Block Start
	// ##################################
	// ## sub-block : 數字處理公用函式
	// ##################################

	/**
	 * To ch format.
	 *
	 * @param format
	 *            the format
	 * @param digit
	 *            the digit
	 * @return 中文數字格式
	 */
	public static String format(final ChineseNumberType format, final long digit) {
		if (format == null) {
			return String.valueOf(digit);
		}
		return format.toChFormat(digit);
	}

	/**
	 * To ch format.
	 *
	 * @param format
	 *            the format
	 * @param numberString
	 *            the number string
	 * @return 中文數字格式
	 * @throws NumberFormatException
	 *             if the string does not contain a parsable {@code long}.
	 */
	public static String format(final ChineseNumberType format, final String numberString) {
		final long parseLong = Long.parseLong(numberString, 10);
		return format(format, parseLong);
	}

	/**
	 * To ch format.
	 *
	 * @param format
	 *            the format
	 * @param numberString
	 *            the number string
	 * @param radix
	 *            the radix
	 * @return 中文數字格式
	 * @throws NumberFormatException
	 *             if the string does not contain a parsable {@code long}.
	 */
	public static String format(final ChineseNumberType format, final String numberString, final int radix) {
		final long parseLong = Long.parseLong(numberString, radix);
		return format(format, parseLong);
	}

	// ====
	// == [Method] Block Stop
	// ================================================
	// == [Main Method] Block Start
	// == [Main Method] Block Stop
	// ================================================

}