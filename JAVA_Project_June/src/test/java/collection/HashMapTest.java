package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Santosh");
		hMap.put(104, "Sanjay");
		hMap.put(103, "Sushant");
		hMap.put(102, "Saket");
		
		System.out.println(hMap);
		System.out.println(hMap.get(103));
		hMap.put(107, "Shubham");
		System.out.println(hMap);
		hMap.remove(103);
		System.out.println(hMap);
		System.out.println(hMap.keySet());
		
		for (Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey()+" :- "+ entry.getValue());
		}
	}
}
