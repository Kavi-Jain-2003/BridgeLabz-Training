package addressbookproblem.repository;

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

}
