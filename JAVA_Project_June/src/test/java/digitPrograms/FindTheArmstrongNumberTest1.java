package digitPrograms;

public class FindTheArmstrongNumberTest1 {
	public static void main(String[] args) {
		int numb=153 , temp=numb, temp1=temp, sum=0, count=0;
		while(numb>0) {
			numb=numb/10;
			count++;
		}
		//System.out.println(count);
		while (temp>0) {
			int rem=temp%10, power=count, mul=1;
			while (power>0) {
				mul=mul*rem;
				power--;
			}
			sum=sum+mul;
			temp=temp/10;
		}
		if (sum==temp1) {
			System.out.println("Given Number is a Armstrong Number !");
		} else {
			System.out.println("Given Number isnot a Armstrong Number !");
		}
	}
}
