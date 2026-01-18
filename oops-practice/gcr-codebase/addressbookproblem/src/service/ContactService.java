package addressbookproblem.service;
import addressbookproblem.model.Contact;
import addressbookproblem.repository.ContactRepository;
public class ContactService {
    private ContactRepository repository=new ContactRepository();
    public void createContact(COntact contact)
    {
    repository.addContact(contact);
    }
    
}
