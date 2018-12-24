package examples.demo5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Test1Java8Lambda {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroly", 23),
				new Person("Thomas", "Crolylu", 33),
				new Person("Ceca", "Boskovic", 22),
				new Person("Marko", "Antnoic", 26));
		
	
		System.out.println("<===Sve osobe sortirane po lastName===>");
		//1. sort po lastname preko Java 8 lambda
		//Collections.sort(people, (Person p1, Person p2) -> p1.getLastname().compareTo(p2.getLastname()));
		people.sort( (p1, p2) -> p1.getLastname().compareToIgnoreCase(p2.getLastname()));
		
		
		//2. kreiraj metodu koja stampa sve elemente preko Java 8 lambda
		people.forEach(System.out::println);
		
		
		System.out.println("<===Svi koji se prezivaju na D===>");
		//3. kreiraj metodu koja stampa sve koji se prezivaju na c preko Java 8 lambda
		people.stream().filter(person -> person.getLastname().startsWith("D")).forEach(System.out::println);
		
	}
}
