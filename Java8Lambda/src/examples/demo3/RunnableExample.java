package examples.demo3;

public class RunnableExample {

	public static void main(String[] args) {
		
		//bez koriscenje lambde
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable.");
			}
		});
		
		t1.start();
		
		
		//ovo je koriscenje lambde
		Thread runnableLambda = new Thread( () -> System.out.println("Runnable Lambda.") );
		runnableLambda.start();
	}

}
