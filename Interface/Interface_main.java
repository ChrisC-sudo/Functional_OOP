
package Interface;

public class Interface_main implements Interface_ex2{
	public static void main(String[] args) {
		Interface_ex2 object = new Interface_main();
		object.chMethod();
		object.chNewMethod();
		object.chInt(10);
		object.chString("GitHub");
		
	}

	@Override
	public void chMethod() {
	System.out.println("Calling Interface One");
		
	}

	@Override
	public void chNewMethod() {
		System.out.println("Calling Interface Two");
		
	}

	@Override
	public void chInt(int i) {
		System.out.println("Given number is: "+ i );
		
	}

	@Override
	public void chString(String a) {
		System.out.println("Given string is: " + a);
		
	}
}
