package arrayPrograms;

public class AdditionOfTwoUnequalArrayTest {
	public static void main(String[] args) {
		int [] temp1= {10,20,60,50,40,30};
		int [] temp2= {10,20,40,30};       //20,40,100,80,40,30
		if (temp1.length>=temp2.length) {
			for (int i = 0; i < temp1.length; i++) {
				try {
					temp1[i]=temp1[i]+temp2[i];
				} catch (Exception e) {
					// TODO: handle exception
					if (temp1.length<=temp2.length) {
						temp1[i]=temp2[1];
					}
				}
			}
		}
		for (int i = 0; i < temp1.length; i++) {
			System.out.print(temp1[i]+",");
		}
	}
}
