package tw.gov.moi.ude.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class UdeMapUtilsTestKevin {

	private enum Number {
		ONE, TWO, THREE, FOUR, FIVE;
	}

	@Test
	public void testEnumMap() throws Exception {

		Assert.assertNotNull(UdeMapUtils.enumMap(Number.class));
		final Map<Number, Object> map2 = UdeMapUtils.enumMap(Number.class);
		map2.put(Number.ONE, "111");

		Assert.assertEquals("111", map2.get(Number.ONE));
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

	@SuppressWarnings("unchecked")
	@Test
	public void testLazyMap() throws Exception {

		final Map<?, String> resultMap = UdeMapUtils.lazyMap(new HashMap(), new String());

		Assert.assertEquals(true, (resultMap.get("111") instanceof String));

	}

	@Test
	public void testLazyMapToSet() throws Exception {

		final Map setMap = UdeMapUtils.lazyMapToSet();

		Assert.assertEquals(true, ((HashSet<?>) setMap.get("123")).isEmpty());
	}

	@Test
	public void testLazyMapToList() throws Exception {

		final Map<String, List<String>> map = new HashMap<String, List<String>>();

		final List<String> list1 = new ArrayList<String>();
		list1.add("test1");
		final List<String> list2 = new ArrayList<String>();
		list2.add("test2");
		final List<String> list3 = new ArrayList<String>();
		list3.add("test3");

		map.put("1", list1);
		map.put("2", list2);
		map.put("3", list3);

		Assert.assertEquals(true, (UdeMapUtils.lazyMapToList(map).get("1") instanceof ArrayList));
	}

	@Test
	public void testReverseMap() throws Exception {

		final Map<String, List<String>> map = new HashMap<String, List<String>>();

		final List<String> list1 = new ArrayList<String>();
		list1.add("test1");
		final List<String> list2 = new ArrayList<String>();
		list2.add("test2");
		final List<String> list3 = new ArrayList<String>();
		list3.add("test3");

		map.put("1", list1);
		map.put("2", list2);
		map.put("3", list3);

		Assert.assertEquals("1", ((HashSet<?>) UdeMapUtils.reverseMap(map).get("test1")).toArray()[0]);
	}
}
