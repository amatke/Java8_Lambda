package examples.demo10;

import java.util.Arrays;
import java.util.List;

import examples.demo5.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroly", 23),
				new Person("Thomas", "Crolylu", 33),
				new Person("Ceca", "Boskovic", 22),
				new Person("Marko", "Antnoic", 26));
		
		System.out.println("------using lambda forEach with if clouse------------");
		people.forEach( (p) -> {
			if (p.getAge() > 26)
				System.out.println(p);
		});
		
		
		System.out.println("\n-------using lambda forEach printing all-----------");
		people.forEach( System.out::println);  // ili p -> System.out.println(p)
		
		
		System.out.println("\n-------using forEach printing all-----------");
		for (Person p : people) {
			System.out.println(p);
		}
		
		
		System.out.println("\n-------using for loop printing all-----------");
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}
	}



}
