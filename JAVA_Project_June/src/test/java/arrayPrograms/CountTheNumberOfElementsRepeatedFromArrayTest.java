package arrayPrograms;

import org.testng.annotations.Test;

public class CountTheNumberOfElementsRepeatedFromArrayTest {
	@Test
	public void countElementsRepeated() {
		int [] temp= {2,1,4,3,5,2,4,1,4,5,2,1,5,2};
		int size = temp.length;
		for (int i = 0; i < size ; i++) {
			int count=1;
			for (int j = i+1 ; j < size ; j++) {
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
			System.out.println(temp[i]+" :- "+ count);
		}
	}
}
