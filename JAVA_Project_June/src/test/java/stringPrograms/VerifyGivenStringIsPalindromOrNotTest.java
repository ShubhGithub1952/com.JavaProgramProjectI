package stringPrograms;

import org.testng.annotations.Test;

public class VerifyGivenStringIsPalindromOrNotTest {
	@Test
	public void palindromMethod() {
		String str="MALAYALAM";
		String str1="";
		for (int i = str.length()-1 ; i >= 0 ; i--) {
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
		if (str.equals(str1)) {
			System.out.println("Palindrom !");
		} else {
			System.out.println("Not Palindrom !");
		}
	}
}
