package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetInterfaceTest {
	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Sanket");
		hset.add("Sushant");
		hset.add("Sanjay");
		hset.add("Sakett");
		hset.add("Sunil");
		System.out.println(hset);
		
		//Using Foreach Loop
		for (String string : hset) {
			System.out.print(string+",");
			
		}
		System.out.println();
		
		//remove the element from collection
		hset.remove("Sakett");
		System.out.println(hset);
		
		//
		LinkedList<String> linkedhSet = new LinkedList<String>();
		for (String string : hset) {
			linkedhSet.add(string);
		}
		
		System.out.println(linkedhSet);
		//access element by using index
		System.out.println(linkedhSet.size());
	}
}
