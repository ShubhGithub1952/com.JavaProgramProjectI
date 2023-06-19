package arrayPrograms;

import org.testng.annotations.Test;

public class FindMaximumAndMinimumDigitFromArrayTest {
	@Test
	public void maximumDigitFromArrayTest() {
		int [] ele= {50,20,30,40,10};
		
		for (int i = 0; i < ele.length; i++) {
			for (int j = i+1 ; j < ele.length; j++) {
				if (ele[i]<=ele[j]) {
					int temp=ele[i];
					ele[i]=ele[j];
					ele[j]=temp;
				}
			}
		}
		System.out.println("Sorted array as followed...");
		for (int i = 0; i < ele.length; i++) {
			System.out.print(ele[i]+",");
		}
		System.out.println();
		System.out.println("Maximum Digit from given array is ....");
		System.out.println(ele[0]);
		System.out.println("Minimum Digit from given Array is.....");
		System.out.println(ele.length-1);
		System.out.println(ele[ele.length-1]);
		System.out.println(ele[1]);
		System.out.println("Second Minimum value from the array is....");
		System.out.println(ele.length-2);
		System.out.println(ele[ele.length-2]);
		System.out.println("Third minimum value from the array is...");
		System.out.println(ele[ele.length-3]);
	}
}
