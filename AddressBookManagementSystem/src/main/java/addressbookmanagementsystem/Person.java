package addressbookmanagementsystem;

public class Person {

	String firstName, lastName, address, city, state, zip, phoneNumber;

    Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber){

        this.firstName=firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;

    }

    public void display() {

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nAddress: " + address + "\nCity : " + city + "\nState : " + state + "\nZip: " + zip + "\nPhone number : " + phoneNumber);

    }
}
