package digitPatternProgram;

public class DigitPatternProgramTest {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n ; j++) {
				if (i>=j) {
					if (j%2==0) {
						System.out.print("* ");
					}
					else {
						System.out.print(count+++" ");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
