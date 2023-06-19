package arrayPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class SwapTheElementFromArrayAndSortElementTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindy define size of Array..");
		int size = scanner.nextInt();
		int [] ele= new int[size];
		System.out.println("Define elements need to store inside Array...!");
		for (int i = 0; i < ele.length; i++) {
			ele[i]=scanner.nextInt();
		}
		System.out.println("Sort the following array....");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i]+",");
		}
		for (int i = 0; i < ele.length; i++) {
			for (int j = i+1; j < ele.length; j++) {
				if (ele[i]>=ele[j]) {
					int temp=ele[i];
					ele[i]=ele[j];
					ele[j]=temp;
				}
			}
		}
		
		System.out.println("Sort the following array....");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i]+",");
		}
	}
}
