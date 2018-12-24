package examples.demo9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import examples.demo5.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroly", 23),
				new Person("Thomas", "Crolylu", 33),
				new Person("Ceca", "Boskovic", 22),
				new Person("Marko", "Antnoic", 26));

		//2. kreiraj metodu koja stampa sve elemente preko Java 8 lambda
		
		System.out.println("Printing all persons.");
		performConditionally(people, p -> true, System.out::println);
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person person : people) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
		
	}


}
