package addressbookproblem.repository;
import addressbookproblem.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactRepository {
    private List<Contact> contactList=new Arraylist<>();
    public void addContact(Contact contact)
    {
        contactList.add(contact);
    }
    public List<Contact> getAllContacts()
    {
        return contactList;
    }

    
}
