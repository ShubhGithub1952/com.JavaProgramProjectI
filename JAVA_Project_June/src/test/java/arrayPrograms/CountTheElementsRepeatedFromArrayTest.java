package arrayPrograms;

import org.testng.annotations.Test;

public class CountTheElementsRepeatedFromArrayTest {
	@Test
	public void countTheElementRepeatedFromArray() {
		int [] temp= {2,5,3,2,4,3,5,1,4,2,6,2};
		int size = temp.length;
		for (int i = 0; i < size ; i++) {
			int count=1;
			for (int j = i+1; j < size ; j++) {
				if (temp[i]==temp[j]) {
					count++;
					int k=j;
					while (k<size-1) {
						temp[k]=temp[k+1];
						k++;
					}
					j--;
					size--;
				}
			}
			System.out.println("given elelment :- "+temp[i]+" reapeated "+count+" times !");
		}
	}
}
