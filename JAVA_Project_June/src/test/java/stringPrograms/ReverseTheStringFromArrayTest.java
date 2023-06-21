package stringPrograms;

import org.testng.annotations.Test;

public class ReverseTheStringFromArrayTest {
	@Test
	public void ReverseTheStringFromStringArrayMethod() {
		String str= "My Name is Shubham";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) {
			String str2 = str1[i];
			for (int j = str2.length()-1 ; j >=0 ; j--) {
				System.out.print(str2.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
