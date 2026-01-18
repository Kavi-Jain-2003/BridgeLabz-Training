package addressbookproblem.service;

import addressbookproblem.model.AddressBook;
import addressbookproblem.model.Contact;
import addressbookproblem.repository.ContactRepository;

public class ContactService {

    private ContactRepository repository = new ContactRepository();

    public void addNewContact(Contact contact) {
        repository.addContact(contact);
    }

    public AddressBook getAddressBook() {
        return repository.getAddressBook();
    }
    public void displayContacts() {
    repository.getAddressBook()
              .getContacts()
              .forEach(System.out::println);
}
public boolean editContact(String name, Contact updatedContact) {

    Contact existing = repository.findByFirstName(name);

    if (existing != null) {
        existing.setLastName(updatedContact.getLastName());
        existing.setAddress(updatedContact.getAddress());
        existing.setCity(updatedContact.getCity());
        existing.setState(updatedContact.getState());
        existing.setZip(updatedContact.getZip());
        existing.setPhoneNumber(updatedContact.getPhoneNumber());
        existing.setEmail(updatedContact.getEmail());
        return true;
    }
    return false;
}


}
