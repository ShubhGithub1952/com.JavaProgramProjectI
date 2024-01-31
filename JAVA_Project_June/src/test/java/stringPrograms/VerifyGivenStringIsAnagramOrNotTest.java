package stringPrograms;

public class VerifyGivenStringIsAnagramOrNotTest {
	public static void main(String[] args) {
		String str1="I am Lord Voldemort";
		String str2="Tom Marvolo Riddle";
		String input1 = str1.replace(" ", "").toLowerCase();
		String input2 = str2.replace(" ", "").toLowerCase();
		char[] temp1 = input1.toCharArray();
		char[] temp2 = input2.toCharArray();
		
		for (int i = 0; i < temp1.length; i++) {
			for (int j = i+1; j < temp1.length; j++) {
				if (temp1[i]>temp1[j]) {
					char temp=temp1[i];
					temp1[i]=temp1[j];
					temp1[j]=temp;
				}
			}
		}
		//for temp2 array
		for (int i = 0; i < temp2.length; i++) {
			for (int j = i+1; j < temp2.length; j++) {
				if (temp2[i]>temp2[j]) {
					char temp=temp2[i];
					temp2[i]=temp2[j];
					temp2[j]=temp;
				}
			}
		}
		
		int count=0;
		if (temp1.length==temp2.length) {
			for (int i = 0; i < temp1.length; i++) {
				if (temp1[i]==temp2[i]) {
					//System.out.println(temp1[i]+",");
					count++;
				}
			}
		}
		if (count==temp1.length) {
			System.out.println("Given String is Anagram !");
		}else {
			System.out.println("Given String isnot Anagram !");
		}
		
	}
}
