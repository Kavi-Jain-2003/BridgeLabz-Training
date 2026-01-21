package addressbookproblem.repository;

import java.util.*;

import addressbookproblem.model.AddressBook;
import addressbookproblem.model.Contact;

public class ContactRepository {

    private AddressBook addressBook = new AddressBook();

    public void addContact(Contact contact) {
        addressBook.addContact(contact);
    }

    public AddressBook getAddressBook() {
        return addressBook;
    }

    public Contact findByFirstName(String firstName) {
        for (Contact c : addressBook.getContacts()) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                return c;
            }
        }
        return null;
    }

    public boolean deleteContactByFirstName(String firstName) {

        // Get all contacts
        List<Contact> contacts = addressBook.getContacts();

        // Traverse list to find matching contact
        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(contact); // delete contact
                return true; // deletion successful
            }
        }

        // If no contact found
        return false;
    }

    public boolean isDuplicate(Contact contact) {
        for (Contact c : addressBook.getContacts()) {
            if (c.equals(contact)) { // uses overridden equals()
                return true; // duplicate found
            }
        }
        return false; // no duplicate
    }

    public List<Contact> searchByCityOrState(String cityOrState) {
        List<Contact> result = new ArrayList<>();

        for (Contact contact : addressBook.getContacts()) {
            if (contact.getCity().equalsIgnoreCase(cityOrState) ||
                    contact.getState().equalsIgnoreCase(cityOrState)) {
                result.add(contact);
            }
        }

        return result;
    }

    public Map<String, List<Contact>> getPersonsByCity() {

        Map<String, List<Contact>> cityMap = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String city = contact.getCity();

            // If city not present, create empty list
            cityMap.putIfAbsent(city, new ArrayList<>());

            // Add contact to city list
            cityMap.get(city).add(contact);
        }
        return cityMap;
    }

    public Map<String, List<Contact>> getPersonsByState() {

        Map<String, List<Contact>> stateMap = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String state = contact.getState();

            stateMap.putIfAbsent(state, new ArrayList<>());
            stateMap.get(state).add(contact);
        }
        return stateMap;
    }
//usecase10
    public Map<String, Integer> countByCity() {

        Map<String, Integer> cityCount = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String city = contact.getCity();

            // Increase count
            cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
        }
        return cityCount;
    }

    public Map<String, Integer> countByState() {

    Map<String, Integer> stateCount = new HashMap<>();

    for (Contact contact : addressBook.getContacts()) {
        String state = contact.getState();

        stateCount.put(state, stateCount.getOrDefault(state, 0) + 1);
    }
    return stateCount;
}


}
