package arrayPrograms;

import org.testng.annotations.Test;

public class SortingArrayTest {
	@Test
	public void sortInAscendingOrderTest() {
		int [] element= {50,20,30,10,40};
		for (int i = 0; i < element.length; i++) {
			for (int j = i+1 ; j < element.length; j++) {
				if (element[i]>=element[j]) {
					int temp=element[i];
					element[i]=element[j];
					element[j]=temp;
				} 
			}
		}
		System.out.println("Elements are Sorted in Following order....");
		for (int i = 0; i < element.length; i++) {
			System.out.print(element[i]+",");
		}
		System.out.println();
	}
	
	@Test
	public void sortInDescendingOrderTest() {
		int [] element= {50,20,30,10,40};
		for (int i = 0; i < element.length; i++) {
			for (int j = i+1 ; j < element.length; j++) {
				if (element[i]<=element[j]) {
					int temp=element[i];
					element[i]=element[j];
					element[j]=temp;
				} 
			}
		}
		System.out.println("Elements are Sorted in Following order....");
		for (int i = 0; i < element.length; i++) {
			System.out.print(element[i]+",");
		}
		System.out.println();
	}

}
