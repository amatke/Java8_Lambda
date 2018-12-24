package examples.demo2;

class TypeInferenceExample {

	public static void main(String[] args) {

		//ILambda mojFun = (String s) -> s.length();		//primer 1
		//ILambda mojFun = (s) -> s.length();				//primer 2
		ILambda mojFun = s -> s.length();					//primer 3 (samo ako imamo jednu promenjivu)
		System.out.println("Primer 1 " + mojFun.getLength("Hello lambda."));	//ovo je prvi primer poziva
		
		//ovo je drugi primer poziva
		printLambda(s -> s.length());
	}
	
	public static void printLambda(ILambda l) {
		System.out.println(l.getLength("Hello hello hello"));
	}
	
	interface ILambda {
		int getLength(String s);
	}

}
