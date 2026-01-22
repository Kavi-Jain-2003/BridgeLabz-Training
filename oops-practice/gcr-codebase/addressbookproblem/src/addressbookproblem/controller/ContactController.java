package addressbookproblem.controller;

import addressbookproblem.model.Contact;

import java.util.List;
import java.util.Map;

import addressbookproblem.model.AddressBook;
import addressbookproblem.service.ContactService;

public class ContactController {

    private ContactService service = new ContactService();
//usecase1, 2
    public AddressBook getAddressBook() {
        return service.getAddressBook();
    }

    public void displayContacts() {
        service.displayContacts();
    }
//usecase3
    public boolean editContact(String name, Contact updatedContact) {
        return service.editContact(name, updatedContact);
    }
//usecase4
    public boolean deleteContact(String firstName) {
        return service.deleteContact(firstName);
    }
//usecase5
    public boolean addContact(Contact contact) {
        return service.addNewContact(contact);
    }
//usecase8
    public List<Contact> searchPerson(String cityOrState) {
        return service.searchPerson(cityOrState);

    }
//usecase9
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
//usecase11
    public List<Contact> sortContactsByName() {
        return service.sortContactsByName();
    }
    //usecase12
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
