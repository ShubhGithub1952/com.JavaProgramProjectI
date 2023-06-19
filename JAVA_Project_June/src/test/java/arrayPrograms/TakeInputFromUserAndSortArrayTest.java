package arrayPrograms;

import java.util.Scanner;

public class TakeInputFromUserAndSortArrayTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kindly define size of Array...");
		int size = scanner.nextInt();
		int [] ele= new int[size];
		System.out.println("Entre the elements needs to store in array.....");
		for (int i = 0; i < ele.length; i++) {
			ele[i]=scanner.nextInt();
		}
		System.out.println("Elements in the arrays are ");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i]+",");
		}
	}
}
