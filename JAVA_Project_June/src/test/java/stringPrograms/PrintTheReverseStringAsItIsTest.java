package stringPrograms;

import org.testng.annotations.Test;

public class PrintTheReverseStringAsItIsTest {
	@Test
	public void printReverseString() {
		String str="My Name is Shubham";
		for (int i = str.length()-1 ; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
