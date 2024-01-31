package stringPrograms;

import org.testng.annotations.Test;
/**
 * 
 * @author SHUBH
 *
 */
public class FindTheLengthOfLongestSubstringWithoutRepeatingCharacterStringTest {
	@Test
	public void test() {
		String str="abcabcbb";
		//aaabbccaabc
		char[] input = str.toCharArray();
		String output="";
		int max=0;
		for (int i = 0; i < input.length; i++) {
			int count=0;
			for (int j = i+1; j < input.length; j++) {
				if (input[i]!=input[j]) {
					count++;
					output+=input[i];
					j++;
				}
			}
			
			if(count>max) {
				max=count;
			}
		}
		System.out.println(max);
		System.out.println(output);
	}
}
