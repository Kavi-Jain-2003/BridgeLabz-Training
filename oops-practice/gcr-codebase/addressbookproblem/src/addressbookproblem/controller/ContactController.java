package addressbookproblem.controller;

import addressbookproblem.model.Contact;
import addressbookproblem.model.AddressBook;
import addressbookproblem.service.ContactService;

public class ContactController {

    private ContactService service = new ContactService();

    public void addContact(Contact contact) {
        service.addNewContact(contact);
        
    }

    public AddressBook getAddressBook() {
        return service.getAddressBook();
    }
    public void displayContacts() {
    service.displayContacts();
}
public boolean editContact(String name, Contact updatedContact) {
    return service.editContact(name, updatedContact);
}
public boolean deleteContact(String firstName) {
    return service.deleteContact(firstName);
}

}
