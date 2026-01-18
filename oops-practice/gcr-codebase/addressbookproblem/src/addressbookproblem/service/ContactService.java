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
}
