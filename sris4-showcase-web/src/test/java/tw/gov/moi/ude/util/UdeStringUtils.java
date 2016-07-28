/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.ude.util;

import com.iisigroup.ude.test.assertion.UtilityClassAssertion;
import com.iisigroup.ude.trace.annotation.FunctionCode;
import com.iisigroup.ude.util.collections.UdeArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Unicode 字串元件.
 */
@UtilityClassAssertion
public final class UdeStringUtils {

	// ================================================
	// == [Enumeration types] Block Start
	// == [Enumeration types] Block End
	// ================================================
	// == [static variables] Block Start

	/**
	 * The Constant All_Space.
	 * 
	 * 
	 * JDK SE7 與 SE8 在下面定義有落差。
	 * 
	 * SE8 才 SUPPORT \v \h
	 * 
	 * \h A horizontal whitespace character:
	 * [\t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000] \v A vertical
	 * whitespace character: [\n\x0B\f\r\x85\u2028\u2029]
	 * 
	 * \s [ \t\n\x0B\f\r]
	 */
	private static final String All_Space = "[" //
			+ "\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000" //
			+ "\\x85\\u2028\\u2029" //
			+ "\\s\\u200b-\\u200d\\u2060\\ufeff\\ufffe]+"; //

	/** The Constant HEAD_TAIL_SPACE. */
	private static final String HEAD_TAIL_SPACE = "(^" + All_Space + "|" + All_Space + "$)";

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
	 * private.
	 */
	private UdeStringUtils() {
		throw new AssertionError();
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start

	// ####################################################################
	// ## [Static Method] sub-block : 資訊
	// ####################################################################

	/**
	 * 計算字串長度.
	 *
	 * @return 字串長度
	 */
	@FunctionCode("字串資訊")
	public static int length(final String str) {
		if (str == null) {
			return 0;
		}
		return str.codePointCount(0, str.length());
	}

	// ####################################################################
	// ## [Static Method] sub-block : 正反轉換
	// ####################################################################

	/**
	 * 將字串轉換成 UNICODE-Integer 陣列.
	 *
	 * @return UNICODE-Integer 陣列 若輸入為 null，便回傳 null.
	 */
	@FunctionCode("字碼陣列轉換")
	public static int[] toCodePointArray(final String str) {
		if (str == null) {
			return null;
		}
		final char[] ach = str.toCharArray(); // a char array copied from str
		final int len = ach.length; // the length of ach
		final int[] acp = new int[Character.codePointCount(ach, 0, len)];
		int j = 0; // an index for acp
		int cp = 0;
		for (int i = 0; i < len; i += Character.charCount(cp)) {
			cp = Character.codePointAt(ach, i);
			acp[j++] = cp;
		}
		return acp;
	}

	/**
	 * 將 UNICODE-Integer 陣列轉換為字串.
	 *
	 * @param codePointArray
	 *            UNICODE-Integer 陣列
	 * @return 字串
	 */
	@FunctionCode("字碼陣列轉換")
	public static String fromCodePoint(final int[] codePointArray) {
		return new String(codePointArray, 0, codePointArray.length);
	}

	/**
	 * 將UNICODE-Integer 陣列依所選之範圍轉換為字串.
	 *
	 * @param codePoints
	 *            Array that is the source of Unicode code points
	 * @param offset
	 *            The initial offset
	 * @param count
	 *            The length
	 * @return 字串
	 */
	@FunctionCode("字碼陣列轉換")
	public static String fromCodePoint(final int[] codePointArray, final int offset, final int length) {
		return new String(codePointArray, offset, length);
	}

	/**
	 * Alias of fromCodePoint.
	 */
	@FunctionCode("字碼陣列轉換")
	public static String toString(final int[] codePointArray) {
		return fromCodePoint(codePointArray);
	}

	/**
	 * Alias of fromCodePoint.
	 */
	@FunctionCode("字碼陣列轉換")
	public static String toString(final int[] codePointArray, final int offset, final int length) {
		return new String(codePointArray, offset, length);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 全半型轉換
	// ####################################################################

	enum Full2HelfMapping {

		U3000(0x3000, ' '), // 空白
		U3001(0x3001, ','), // 、
		U3002(0x3002, '.'), // 。
		U3003(0x3003, '"'), // 〃
		U3008(0x3008, '<'), // 〈
		U3009(0x3009, '>'), // 〉
		U300a(0x300a, '<'), // 《
		U300b(0x300b, '>'), // 》
		U3010(0x3010, '{'), // 【
		U3011(0x3011, '}'), // 】
		U3014(0x3014, '['), // 〔
		U3015(0x3015, ']'), // 〕
		U301c(0x301c, '~'), // ～
		U301d(0x301d, '"'), // 〝
		U301e(0x301e, '"'), // 〞

		// TODO 改用MAP
		// http://www.fileformat.info/info/unicode/block/index.htm
		// General Punctuation
		// U+2000 U+206F

		// U+2010 HYPHEN (U+2010) ‐ arial_unicode_ms
		// U+2011 NON-BREAKING HYPHEN (U+2011) ‑ arial_unicode_ms
		// U+2012 FIGURE DASH (U+2012) ‒ arial_unicode_ms
		// U+2013 EN DASH (U+2013) – arial_unicode_ms
		// U+2014 EM DASH (U+2014) — arial_unicode_ms
		// U+2015 HORIZONTAL BAR (U+2015) ― arial_unicode_ms
		// U+2016 DOUBLE VERTICAL LINE (U+2016) ‖ arial_unicode_ms
		// U+2017 DOUBLE LOW LINE (U+2017) ‗ arial_unicode_ms
		// U+2018 LEFT SINGLE QUOTATION MARK (U+2018) ‘ arial_unicode_ms
		// U+2019 RIGHT SINGLE QUOTATION MARK (U+2019) ’ arial_unicode_ms
		// U+201A SINGLE LOW-9 QUOTATION MARK (U+201A) ‚ arial_unicode_ms
		// U+201B SINGLE HIGH-REVERSED-9 QUOTATION MARK (U+201B) ‛
		// arial_unicode_ms
		// U+201C LEFT DOUBLE QUOTATION MARK (U+201C) “ arial_unicode_ms
		// U+201D RIGHT DOUBLE QUOTATION MARK (U+201D) ” arial_unicode_ms
		// U+201E DOUBLE LOW-9 QUOTATION MARK (U+201E) „ arial_unicode_ms
		// U+201F DOUBLE HIGH-REVERSED-9 QUOTATION MARK (U+201F) ‟
		// arial_unicode_ms
		// U+2020 DAGGER (U+2020) † arial_unicode_ms
		// U+2021 DOUBLE DAGGER (U+2021) ‡ arial_unicode_ms
		// U+2022 BULLET (U+2022) • arial_unicode_ms
		// U+2023 TRIANGULAR BULLET (U+2023) ‣ arial_unicode_ms
		// U+2024 ONE DOT LEADER (U+2024) ․ arial_unicode_ms
		// U+2025 TWO DOT LEADER (U+2025) ‥ arial_unicode_ms
		// U+2026 HORIZONTAL ELLIPSIS (U+2026) … arial_unicode_ms
		// U+2027 HYPHENATION POINT (U+2027) ‧ arial_unicode_ms
		// U+2028 LINE SEPARATOR (U+2028) arial_unicode_ms
		// U+2029 PARAGRAPH SEPARATOR (U+2029) arial_unicode_ms
		// U+202A LEFT-TO-RIGHT EMBEDDING (U+202A) ‪ arial_unicode_ms
		// U+202B RIGHT-TO-LEFT EMBEDDING (U+202B) ‫ arial_unicode_ms
		// U+202C POP DIRECTIONAL FORMATTING (U+202C) ‬ arial_unicode_ms
		// U+202D LEFT-TO-RIGHT OVERRIDE (U+202D) ‭ arial_unicode_ms
		// U+202E RIGHT-TO-LEFT OVERRIDE (U+202E) ‮ arial_unicode_ms
		// U+202F NARROW NO-BREAK SPACE (U+202F)   code2000
		// U+2030 PER MILLE SIGN (U+2030) ‰ arial_unicode_ms
		// U+2031 PER TEN THOUSAND SIGN (U+2031) ‱ arial_unicode_ms
		// U+2032 PRIME (U+2032) ′ arial_unicode_ms
		// U+2033 DOUBLE PRIME (U+2033) ″ arial_unicode_ms
		// U+2034 TRIPLE PRIME (U+2034) ‴ arial_unicode_ms
		// U+2035 REVERSED PRIME (U+2035) ‵ arial_unicode_ms
		// U+2036 REVERSED DOUBLE PRIME (U+2036) ‶ arial_unicode_ms
		// U+2037 REVERSED TRIPLE PRIME (U+2037) ‷ arial_unicode_ms
		// U+2038 CARET (U+2038) ‸ arial_unicode_ms
		// U+2039 SINGLE LEFT-POINTING ANGLE QUOTATION MARK (U+2039) ‹
		// arial_unicode_ms
		// U+203A SINGLE RIGHT-POINTING ANGLE QUOTATION MARK (U+203A) ›
		// arial_unicode_ms
		// U+203B REFERENCE MARK (U+203B) ※ arial_unicode_ms
		// U+203C DOUBLE EXCLAMATION MARK (U+203C) ‼ arial_unicode_ms
		// U+203D INTERROBANG (U+203D) ‽ arial_unicode_ms
		// U+203E OVERLINE (U+203E) ‾ arial_unicode_ms
		// U+203F UNDERTIE (U+203F) ‿ arial_unicode_ms
		// U+2040 CHARACTER TIE (U+2040) ⁀ arial_unicode_ms
		// U+2041 CARET INSERTION POINT (U+2041) ⁁ arial_unicode_ms
		// U+2042 ASTERISM (U+2042) ⁂ arial_unicode_ms
		// U+2043 HYPHEN BULLET (U+2043) ⁃ arial_unicode_ms
		// U+2044 FRACTION SLASH (U+2044) ⁄ arial_unicode_ms
		// U+2045 LEFT SQUARE BRACKET WITH QUILL (U+2045) ⁅ arial_unicode_ms
		// U+2046 RIGHT SQUARE BRACKET WITH QUILL (U+2046) ⁆ arial_unicode_ms
		// U+2047 DOUBLE QUESTION MARK (U+2047) ⁇ code2000
		// U+2048 QUESTION EXCLAMATION MARK (U+2048) ⁈ code2000
		// U+2049 EXCLAMATION QUESTION MARK (U+2049) ⁉ code2000
		// U+204A TIRONIAN SIGN ET (U+204A) ⁊ code2000
		// U+204B REVERSED PILCROW SIGN (U+204B) ⁋ code2000
		// U+204C BLACK LEFTWARDS BULLET (U+204C) ⁌ code2000
		// U+204D BLACK RIGHTWARDS BULLET (U+204D) ⁍ code2000
		// U+204E LOW ASTERISK (U+204E) ⁎ code2000
		// U+204F REVERSED SEMICOLON (U+204F) ⁏ code2000
		// U+2050 CLOSE UP (U+2050) ⁐ code2000
		// U+2051 TWO ASTERISKS ALIGNED VERTICALLY (U+2051) ⁑ code2000
		// U+2052 COMMERCIAL MINUS SIGN (U+2052) ⁒ code2000
		// U+2053 SWUNG DASH (U+2053) ⁓ code2000
		// U+2054 INVERTED UNDERTIE (U+2054) ⁔ code2000
		// U+2055 FLOWER PUNCTUATION MARK (U+2055) ⁕ dejavu_sans
		// U+2056 THREE DOT PUNCTUATION (U+2056) ⁖ code2000
		// U+2057 QUADRUPLE PRIME (U+2057) ⁗ code2000
		// U+2058 FOUR DOT PUNCTUATION (U+2058) ⁘ code2000
		// U+2059 FIVE DOT PUNCTUATION (U+2059) ⁙ code2000
		// U+205A TWO DOT PUNCTUATION (U+205A) ⁚ code2000
		// U+205B FOUR DOT MARK (U+205B) ⁛ code2000
		// U+205C DOTTED CROSS (U+205C) ⁜ code2000
		// U+205D TRICOLON (U+205D) ⁝ code2000
		// U+205E VERTICAL FOUR DOTS (U+205E) ⁞ code2000
		// U+205F MEDIUM MATHEMATICAL SPACE (U+205F) code2000
		;
		final int fullCode;
		final int helfCode;
		static int[] CJK_Symbols_MAPPING = new int[0x40];
		static {
			final Full2HelfMapping[] values = values();
			for (int i = 0; i < CJK_Symbols_MAPPING.length; i++) {
				CJK_Symbols_MAPPING[i] = i + 0x3000; // TODO ? OR ' ' OR
														// originalCode
			}
			for (final Full2HelfMapping mapping : values) {
				CJK_Symbols_MAPPING[mapping.fullCode - 0x3000] = mapping.helfCode;
			}
		}

		private Full2HelfMapping(int fullCode, int helfCode) {
			this.fullCode = fullCode;
			this.helfCode = helfCode;
		}

		static boolean inCJKSymbolsRange(int code) {
			return (code >= 0x3000 && code <= 0x303F);
		}

		static int trans(int code) {
			if (inCJKSymbolsRange(code)) {
				return CJK_Symbols_MAPPING[code - 0x3000];
			}
			return code;
		}

	}

	/**
	 * 半型字串轉全型.
	 * 
	 * @return 全型文字
	 */
	@FunctionCode("全半型轉換")
	public static String toFullChar(final String str) {
		final int[] buf = toCodePointArray(str);
		for (int i = 0; i < buf.length; i++) {
			final int original = buf[i];
			if (original == 32) {
				buf[i] = 12288;
			} else if (original > 32 && original < 127) {
				buf[i] += 65248;
			}
		}
		return fromCodePoint(buf);
	}

	/**
	 * 全型字串轉半型.
	 *
	 * ! 情境還不夠完整，其它特殊字碼區如何對應，相關需求沒有收集完整。 ! TODO 也許未來會定義相關設定檔給開發者自行決定。
	 *
	 * @return 半型文字
	 */
	@FunctionCode("全半型轉換")
	public static String toHelfChar(final String str) {

		// } else if (original == '〔') {
		// } else if (original == '〕') {
		// } else if (original == '’') {

		final int[] buf = toCodePointArray(str);
		for (int i = 0; i < buf.length; i++) {
			final int original = buf[i];
			if (original == 12288) {
				buf[i] = 32;
			} else if (original > 65280 && original < 65375) {
				buf[i] -= 65248;
			} else if (Full2HelfMapping.inCJKSymbolsRange(original)) {
				buf[i] = Full2HelfMapping.trans(original);
			}
		}
		return fromCodePoint(buf);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 正向 Search
	// ####################################################################

	/**
	 * 始前頭找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字元
	 * @param ch
	 *            搜尋字元
	 * @return 搜尋字串位置
	 */
	@FunctionCode("搜尋")
	public static int indexOf(final String string, final int ch) {
		return indexOf(string, ch, 0);
	}

	/**
	 * 始前頭找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param str
	 *            搜尋字串
	 * @return 搜尋字串位置
	 */
	@FunctionCode("搜尋")
	public static int indexOf(final String string, final String str) {
		return indexOf(string, str, 0);
	}

	/**
	 * 始前頭找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param ch
	 *            搜尋字元
	 * @param startPos
	 *            起始點
	 * @return 搜尋字串位置
	 */
	@FunctionCode("搜尋")
	public static int indexOf(final String string, final int ch, final int startPos) {
		return indexOf(string, new int[] { ch }, startPos);
	}

	/**
	 * 始前頭找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param str
	 *            搜尋字串
	 * @param startPos
	 *            起始點
	 * @return 搜尋字串位置
	 */
	@FunctionCode("搜尋")
	public static int indexOf(final String string, final String str, final int startPos) {
		return indexOf(string, toCodePointArray(str), startPos);
	}

	/**
	 * 始前頭找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param ch
	 *            搜尋字串
	 * @param startPos
	 *            the start pos
	 * @return 搜尋字串位置
	 */
	@FunctionCode("搜尋")
	private static int indexOf(final String string, final int[] ch, final int startPos) {
		final int[] bytes = toCodePointArray(string);
		return UdeArrayUtils.indexOf(bytes, ch, startPos);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 反向 Search
	// ####################################################################

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param ch
	 *            搜尋字元
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	public static int lastIndexOf(final String string, final int ch) {
		return lastIndexOf(string, new int[] { ch });
	}

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param toFind
	 *            搜尋字串
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	public static int lastIndexOf(final String string, final String toFind) {
		return lastIndexOf(string, toCodePointArray(toFind));
	}

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param toFind
	 *            搜尋字元
	 * @param startPos
	 *            起始點
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	public static int lastIndexOf(final String string, final int toFind, final int startPos) {
		return lastIndexOf(string, new int[] { toFind }, startPos);
	}

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param toFind
	 *            搜尋字串
	 * @param startPos
	 *            起始點
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	public static int lastIndexOf(final String string, final String toFind, final int startPos) {
		return lastIndexOf(string, toCodePointArray(toFind), startPos);
	}

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param toFind
	 *            搜尋字串
	 * @param startPos
	 *            起始點
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	private static int lastIndexOf(final String string, final int[] toFind, final int startPos) {
		final int[] bytes = toCodePointArray(string);
		return UdeArrayUtils.lastIndexOf(bytes, toFind, startPos);
	}

	/**
	 * 從後面找出第一個出現搜尋字串的位置.
	 *
	 * @param string
	 *            被搜尋的字串
	 * @param toFind
	 *            搜尋字串
	 * @return 搜尋字串的位置
	 */
	@FunctionCode("反向搜尋")
	private static int lastIndexOf(final String string, final int[] toFind) {
		final int[] bytes = toCodePointArray(string);
		return UdeArrayUtils.lastIndexOf(bytes, toFind);
	}

	// ####################################################################
	// ## [Static Method] sub-block : Trim / Remove
	// ####################################################################

	/**
	 * 刪除所有字串前後定義的空白字元(含換行).
	 *
	 * @param str
	 *            the str
	 * @return the string
	 */
	@FunctionCode("刪減")
	public static String trim(final String str) {
		return str.replaceAll(HEAD_TAIL_SPACE, "");
	}

	/**
	 * 刪除所有 Unicode的(BOM字元) <br>
	 *
	 * U+ FEFF ZERO WIDTH NO-BREAK SPACE <br>
	 * U+ FFFE 不存在 Unicode中. U+ 2060 Unicode 3.2 新增，以代替 U+FEFF 字元廢止之零寬不換行空格功能
	 *
	 * @param srcString
	 *            原始資料
	 * @return 清除後的資料
	 */
	@FunctionCode("刪減")
	public static String removeBOM(final String srcString) {
		final int[] src = toCodePointArray(srcString);
		final int[] dest = new int[src.length];
		int destLen = 0;
		boolean isHead = true;
		for (int i = 0; i < src.length; i++) {
			if (src[i] == 0x0FEFF || src[i] == 0x0FFFE) {
				continue;
			}
			if (isHead && src[i] == 0x02060) {
				continue;
			}
			isHead = false;
			dest[destLen++] = src[i];
		}
		return toString(dest, 0, destLen);
	}

	// ####################################################################
	// ## [Static Method] sub-block : 切割
	// ####################################################################

	/**
	 * 將字串依輸入長度等份切割.
	 *
	 * @param str
	 *            欲切割之字串
	 * @param width
	 *            每一段字串的長度
	 * @return 切割完成之字串陣例
	 */
	@FunctionCode("子字串")
	public static String[] divide(final String str, final int width) {

		final int length = length(str);
		if (length <= width) {
			return new String[] { str };
		}

		final int[] codePointArray = toCodePointArray(str);
		final List<String> divide = new ArrayList<>();
		int pos = 0;
		while (pos < codePointArray.length) {
			final int subWidth = Math.min(width, codePointArray.length - pos);
			divide.add(toString(codePointArray, pos, subWidth));
			pos += subWidth;
		}
		return divide.toArray(new String[divide.size()]);
	}

	/**
	 * 回傳原始字串之開始點到結束之內容.
	 *
	 * @param string
	 *            原始字串
	 * @param beginIndex
	 *            開始點
	 * @return 範圍內的字串
	 */
	@FunctionCode("子字串")
	public static String substring(final String string, final int beginIndex) {
		final int[] unicode = toCodePointArray(string);
		final int endIndex = unicode.length;
		if (beginIndex > endIndex) {
			return "";
		}
		return toString(unicode, beginIndex, endIndex - beginIndex);
	}

	/**
	 * 回傳原始字串之開始點到結束點間的內容.
	 *
	 * @param string
	 *            原始字串
	 * @param beginIndex
	 *            開始點
	 * @param endIndexInput
	 *            結束點
	 * @return 範圍內的字串
	 */
	@FunctionCode("")
	public static String substring(final String string, final int beginIndex, final int endIndexInput) {
		final int[] unicode = toCodePointArray(string);
		final int endIndex;
		if (endIndexInput > unicode.length) {
			endIndex = unicode.length;
		} else {
			endIndex = endIndexInput;
		}
		if (beginIndex > endIndex) {
			return "";
		}
		return toString(unicode, beginIndex, endIndex - beginIndex);
	}

	// == [Static Method] Block Stop
	// ================================================
	// == [Accessor] Block Start
	// == [Accessor] Block Stop
	// ================================================
	// == [Overrided Method] Block Start (Ex. toString/equals+hashCode)
	// == [Overrided Method] Block Stop
	// ================================================
	// == [Method] Block Start
	// == [Method] Block Stop
	// ================================================
	// == [Inner Class] Block Start
	// == [Inner Class] Block Stop
	// ================================================
}
