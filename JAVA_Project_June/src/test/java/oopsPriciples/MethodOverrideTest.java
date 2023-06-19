package oopsPriciples;

public class MethodOverrideTest extends MethodTest {
	public void print() {
		System.out.println("Good Afternoon");
	}
	public static void main(String[] args) {
		MethodOverrideTest override = new MethodOverrideTest();
		override.print();
		MethodTest method = new MethodTest();
		method.print();
	}
}
