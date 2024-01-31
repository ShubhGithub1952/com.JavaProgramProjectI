package oopsPriciples;
/**
 * 
 * @author SHUBH
 *
 */
public class MethodOverrideTest extends MethodTest {
	public void print() {
		System.out.println("Good Afternoon");
	}
	public void xerox() {
		System.out.println("good Print");
	}
	public static void main(String[] args) {
		MethodOverrideTest override = new MethodOverrideTest();
		override.print();
		MethodTest method = new MethodTest();
		method.print();
		override.xerox();
	}
}
