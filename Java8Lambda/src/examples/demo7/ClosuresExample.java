package examples.demo7;

public class ClosuresExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//ovo nije lambda java!
		doProcess(a, new Process() {
			
			@Override
			public void process(int i) {
				//ne mozemo da menjamo promenjivu b jer je ona definisana u bloku iznad!
				//b = 30;
				System.out.println(i + b);
			}
		});
		
		//ovo je nacin preko lambda zapisa!
		doProcess(a,  i -> System.out.println(i + b));
		
	}
	
	public static void doProcess(int i, Process process) {
		process.process(i);
	}

}

interface Process {
	void process(int i);
}