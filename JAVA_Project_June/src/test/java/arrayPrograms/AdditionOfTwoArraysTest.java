package arrayPrograms;

import java.util.Scanner;

public class AdditionOfTwoArraysTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre Size of Demo1 Array..");
		int size1 = scanner.nextInt();
		int [] demo1= new int[size1];
		System.out.println("Entre the elements need to store in Demo1 array");
		for (int i = 0; i < demo1.length; i++) {
			demo1[i]=scanner.nextInt();
		}
		System.out.println("Entre size of Demo2 Array..");
		int size2 = scanner.nextInt();
		int [] demo2= new int[size2];
		System.out.println("Entre the elements need to store in Demo2 array");
		for (int i = 0; i < demo2.length; i++) {
			demo2[i]=scanner.nextInt();
		}
		
		if (demo1.length>=demo2.length) {
			for (int i = 0; i < demo1.length; i++) {
				try {
					demo1[i]=demo1[i]+demo2[i];
				} catch (Exception e) {
					// TODO: handle exception
					if (demo1.length<=demo2.length) {
						demo1[i]=demo2[i];
					}
				}
			}
		}
		for (int i = 0; i < demo1.length; i++) {
			System.out.print(demo1[i]+",");
		}
	}
}
