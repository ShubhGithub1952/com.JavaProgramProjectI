package stringPrograms;

public class PrintOddDigitCharacterFromStringTest {
		public static void main(String[] args) {
			String str="Shubham";
			char[] tl = str.toCharArray();
			//String str1 = str.toUpperCase();
			for (int i = 0; i < tl.length; i++) {
				if (i%2!=0) {
					String str2=""+tl[i];
					System.out.println(str2.toUpperCase());
				}
			}
			
		}
}
