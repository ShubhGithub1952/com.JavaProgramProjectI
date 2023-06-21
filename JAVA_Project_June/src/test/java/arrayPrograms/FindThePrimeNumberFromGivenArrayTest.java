package arrayPrograms;

import org.testng.annotations.Test;

public class FindThePrimeNumberFromGivenArrayTest {
	@Test
	public void findPrimeNumberMethod() {
		int [] input= {21,19,17,15,18,55,13,26,31,39};
		for (int i = 0; i < input.length; i++) {
			int numb= input[i];
			int temp=2;
			int count=0;
			while (temp<=numb/2) {
				if (numb%temp==0) {
					count++;
					break;
				}
				temp++;
			}
			if (count==1) {
				System.out.println("Given Number :- "+numb+" is not Prime Number");
			} else {
				System.out.println("Given Number :- "+numb+" is Prime Number");
			}
			count=0;
		}
	}
}
