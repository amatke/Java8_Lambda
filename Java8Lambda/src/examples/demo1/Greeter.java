package examples.demo1;

public class Greeter {

	public static void main(String[] args) {
		
		// kreiramo lambda fju(izraz)
		ILambda myLambdaFunction = () -> System.out.println("Ovo je lambda vezbanje!");
		myLambdaFunction.example();		 		//poziv f-je
	}
}

/*Moramo da imamo neki interfejs koji ima potpis koji odgovara nasoj lambda f-ji tj izrazu.*/
interface ILambda {
	void example();
}
