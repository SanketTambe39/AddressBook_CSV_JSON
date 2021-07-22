package addressbookmanagementsystem;

import java.util.Comparator;

public class SortByZip implements Comparator<Person> {

	  @Override
	    public int compare(Person person1, Person person2) {

	        return (person1.zip).compareTo(person2.zip);

	    }
}
