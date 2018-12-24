package examples.demo9;

public class MethodReferenceExample {

	public static void main(String[] args) {

		//Thread t = new Thread( () -> printMessage());
		Thread t = new Thread(MethodReferenceExample::printMessage);	//ovo je isto kao i poziv iznad!

		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
