package addressbookmanagementsystem;

public interface IAddressBook {
	
	void createPerson(String addressBookName);
	void editPerson();
	void deletePerson();
	void sortAlphabetically();
	void sortByCityStateZip();
	void viewPersonByCityOrState();
	void searchPeopleInCityOrState();

}
