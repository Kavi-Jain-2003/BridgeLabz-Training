package addressbookproblem.controller;

import addressbookproblem.model.Contact;

import java.util.List;
import java.util.Map;

import addressbookproblem.model.AddressBook;
import addressbookproblem.service.ContactService;

public class ContactController {

    private ContactService service = new ContactService();

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

    public boolean addContact(Contact contact) {
        return service.addNewContact(contact);
    }

    public List<Contact> searchPerson(String cityOrState) {
        return service.searchPerson(cityOrState);

    }

    public Map<String, List<Contact>> viewPersonsByCity() {
        return service.viewPersonsByCity();
    }

    public Map<String, List<Contact>> viewPersonsByState() {
        return service.viewPersonsByState();
    }

    // usecase10
    public Map<String, Integer> countByCity() {
        return service.countContactsByCity();
    }

    public Map<String, Integer> countByState() {
        return service.countContactsByState();
    }

    public List<Contact> sortContactsByName() {
        return service.sortContactsByName();
    }
public List<Contact> sortByCity() {
    return service.sortContactsByCity();
}

public List<Contact> sortByState() {
    return service.sortContactsByState();
}

public List<Contact> sortByZip() {
    return service.sortContactsByZip();
}

}
