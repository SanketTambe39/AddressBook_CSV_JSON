package addressbookmanagementsystem;

import java.util.Comparator;

public class SortByState implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {

        return (person1.state).compareTo(person2.state);

    }

}