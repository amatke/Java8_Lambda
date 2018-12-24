package examples.demo4;

public class FunctionalInterface {

	public static void main(String[] args) {

		ILambda mojFun = s -> s.length();					
		System.out.println(mojFun.getLength("Hello lambda."));	
		
	}

}
