package addressbookproblem.service;

import java.util.List;

import addressbookproblem.model.AddressBook;
import addressbookproblem.model.Contact;
import addressbookproblem.repository.ContactRepository;

public class ContactService {

    private ContactRepository repository = new ContactRepository();
    public boolean addNewContact(Contact contact) {
    // Check for duplicate first
    if (repository.isDuplicate(contact)) {
        return false; // duplicate, do not add
    }

    // Not duplicate, safe to add
    repository.addContact(contact);
    return true;
}


    public AddressBook getAddressBook() {
        return repository.getAddressBook();
    }
    public void displayContacts() {

    // Get all contacts from address book
    List<Contact> contacts = repository.getAddressBook().getContacts();

    // Check if address book is empty
    if (contacts.isEmpty()) {
        System.out.println("No contacts found");
        return;
    }

    // Print each contact one by one
    for (Contact contact : contacts) {
        System.out.println(contact);
    }
}

public boolean editContact(String name, Contact updatedContact) {

    // Step 1: Find existing contact using name
    Contact existingContact = repository.findByFirstName(name);

    // Step 2: If contact not found
    if (existingContact == null) {
        return false;
    }

    // Step 3: Update contact details one by one
    existingContact.setLastName(updatedContact.getLastName());
    existingContact.setAddress(updatedContact.getAddress());
    existingContact.setCity(updatedContact.getCity());
    existingContact.setState(updatedContact.getState());
    existingContact.setZip(updatedContact.getZip());
    existingContact.setPhoneNumber(updatedContact.getPhoneNumber());
    existingContact.setEmail(updatedContact.getEmail());

    // Step 4: Return success
    return true;
}
public boolean deleteContact(String firstName) {
    return repository.deleteContactByFirstName(firstName);
}

public List<Contact> searchPerson(String cityOrState) {
    return repository.searchByCityOrState(cityOrState);
}

}
