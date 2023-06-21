package stringPrograms;

import org.testng.annotations.Test;

public class PreserveTheSpaceAndPrintReverseStringTest {
	@Test
	public void preserveTheSpaceStringMethod() {
		String inputString="My Name is Shubham From Maharashtra";
		char[] inputArray = inputString.toCharArray();
		char [] outputArray= new char[inputArray.length];
		
		//Store the inputArray space as it is in Output array
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]==' ') {
				outputArray[i]=inputArray[i];
			}
		}
		
		//Create the veriable to store first value last
		int size=outputArray.length-1;
		
		//Store the input array inside the output array without Space
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i]!=' ') {
				if(outputArray[size]==' ') {
					size--;
				}
				outputArray[size]=inputArray[i];
				size--;
			}
		}
		
	// Print the Output Array
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]);
		}
		System.out.println();
	}
}
