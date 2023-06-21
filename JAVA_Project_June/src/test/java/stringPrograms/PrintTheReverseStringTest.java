package stringPrograms;

import org.testng.annotations.Test;

public class PrintTheReverseStringTest {
	@Test
	public void reverseStringMethod() {
		String str= "My Name is Shubham";
		String[] str1 = str.split(" ");
		for (int i =str1.length-1 ; i >= 0 ; i-- ) {
			System.out.print(str1[i]);
			System.out.print(" ");
		}
	}
}
