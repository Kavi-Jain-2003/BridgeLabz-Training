package addressbookproblem.repository;

import java.util.List;

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

}
