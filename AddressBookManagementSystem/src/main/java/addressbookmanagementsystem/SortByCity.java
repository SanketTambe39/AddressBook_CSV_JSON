package addressbookmanagementsystem;

import java.util.Comparator;

public class SortByCity implements Comparator<Person>{

	 @Override
	    public int compare(Person person1, Person person2) {

	        return (person1.city).compareTo(person2.city);

	    }
}
