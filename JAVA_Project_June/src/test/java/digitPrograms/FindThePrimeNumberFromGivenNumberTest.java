package digitPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class FindThePrimeNumberFromGivenNumberTest {
	@Test
	public void primeNumberMethod() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Kindly enter the number to verify Prime ...");
		int numb = scanner.nextInt();
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
			System.out.println("Given Numb :- "+numb+" is not Prime Number");
		} else {
			System.out.println("Given Numb :- "+numb+" is Prime Number");
		}
	}
}
