package com.instanceofcake.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestDrive {

	public static void main(String[] args) {

		Map<String, Map<String, String>> outterMap = new HashMap<>();
		Map<String, String> innerMap1 = new HashMap<>();

		innerMap1.put("1", "test1");
		innerMap1.put("2", "test2"); // <-- assume this as pcode con-ncd7s-1
		innerMap1.put("3", "test3");
		innerMap1.put("4", "test4");

		Map<String, String> innerMap2 = new HashMap<>();

		innerMap2.put("5", "test5");
		innerMap2.put("6", "test6"); // <--assume this as desc- reinstatement fee
		innerMap2.put("3", "test7");

		outterMap.put("TEXT", innerMap1);
		outterMap.put("INTEGER", innerMap2);

		System.out.println(outterMap);

		Iterator<String> iteratorOuter = outterMap.keySet().iterator();
		boolean found = false;
		while (iteratorOuter.hasNext()) {
			String keyOuter = iteratorOuter.next();
			Map<String, String> innerMap = outterMap.get(keyOuter);
			Iterator<String> iteratorInner = innerMap.keySet().iterator();
			while (iteratorInner.hasNext()) {
				String keyInner = iteratorInner.next();
				if (keyInner.equals("6")) {
					if (innerMap.get(keyInner).equals("test6")) {
						found = true;
						break;
					}
				}
			}

		}

		Map<String, String> outputMap = new HashMap<String, String>();
		iteratorOuter = outterMap.keySet().iterator();
		while (iteratorOuter.hasNext()) {
			String keyOuter = iteratorOuter.next();
			Map<String, String> innerMap = outterMap.get(keyOuter);
			Iterator<String> iteratorInner = innerMap.keySet().iterator();
			while (iteratorInner.hasNext()) {
				String keyInner = iteratorInner.next();
				if (keyInner.equals("2")) {
					if (innerMap.get(keyInner).equals("test2")) {
						outputMap.put("2", "test2");
					}
				}
			}

		}
		
		System.out.println(outputMap);

	}

}
