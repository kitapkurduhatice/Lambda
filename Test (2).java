import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Test {
	private static void printPerson(List<Person> person, Consumer<Person> consumer) {
		for (Person p : person) {
			consumer.accept(p);
		}

	}

	interface Condition {
		boolean test(Person p);
	}

	interface Consumer1 {
		boolean test(Person p);
	}
	
	public static void main(String[] args) {
		
		List<Person> people=Arrays.asList(
				new Person ("Omer","Karakas",42)
				,new Person ("Furkan","Karagöz",25)
				,new Person ("Sude","Mercan",22)
				,new Person ("Semir","Kurt",26)
				,new Person ("Ayþe","Oymuþ",31));
	
		
		
		
		Collections.sort(people, (p1,p2)->p1.getAge()-p2.getAge() );
		System.out.println("\nListe 1\n");
		printPerson(people, p -> System.out.println(p.getAge() + " , " + p.getFirstName() + " " + p.getLastName()));
		System.out.println("\nListe 2\n");
		printPerson(people, p -> System.out.println(p.getFirstName() + " " + p.getLastName() + " , " + p.getAge()));

		
		
	


		
	}

}
