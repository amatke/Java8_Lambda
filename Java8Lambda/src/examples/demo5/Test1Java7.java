package examples.demo5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1Java7 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroly", 23),
				new Person("Thomas", "Crolylu", 33),
				new Person("Ceca", "Boskovic", 22),
				new Person("Marko", "Antnoic", 26));
		
	
		
		System.out.println("<===Sve osobe sortirane po lastName===>");
		//1. sort po lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastname().compareTo(p2.getLastname());
			}
		});
		
		
		//2. kreiraj metodu koja stampa sve elemente
		for (Person person : people) {
			System.out.println(person.toString());
		}
		
		
		System.out.println("<===Svi koji se prezivaju na D===>");
		//3. kreiraj metodu koja stampa sve koji se prezivaju na c
		for (Person person : people) {
			if(person.getLastname().startsWith("D"))
				System.out.println(person.toString());
		}
		
	}

}
