package examples.demo11;

import java.util.Arrays;
import java.util.List;

import examples.demo5.Person;

public class StreamsExample1 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroly", 23),
				new Person("Thomas", "Crolylu", 33),
				new Person("Ceca", "Boskovic", 22),
				new Person("Marko", "Antnoic", 26));
		
		//Od Jave 8 svaka kolekcija ima stream metode (npr forEach, ..)
		//pretvaramo listu u stream, zatim filtriramo po prezimenu i na kraju ispisujemo za svakog prvo ime
		people.stream()
		.filter(p -> p.getLastname().startsWith("C"))
		.forEach( p -> System.out.println(p.getFirstName()));
		
		
		//prebrojava listu - count je terminalna operacija - posle nje ne mozemo pozvati neke druge operacije!
		long count = people.stream()
				.filter( p -> p.getFirstName().startsWith("M"))
				.count();
		System.out.println("Broj onih koje ime pocinje sa M: " + count);
	}

}
