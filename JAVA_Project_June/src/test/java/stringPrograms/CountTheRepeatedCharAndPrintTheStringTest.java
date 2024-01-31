package stringPrograms;
/**
 * 
 * @author SHUBH
 *
 */
public class CountTheRepeatedCharAndPrintTheStringTest {
	public static void main(String[] args) {
		String str="aabcccddddabb";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count=1;
			try {
				while (ch[i]==ch[i+1]) {
					count++;
					i++;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.print(""+ch[i]+count);
		}
	}
}
