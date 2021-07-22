package addressbookmanagementsystem;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {

		if ((person1.firstName).compareTo(person2.firstName) == 0) {
			return (person1.lastName).compareTo(person2.lastName);
		}
		else
			return (person1.firstName).compareTo(person2.firstName);

	}

}
