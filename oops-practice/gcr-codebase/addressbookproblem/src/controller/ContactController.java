package addressbookproblem.controller;

import addressbookproblem.model.Contact;
import addressbookproblem.service.ContactService;
import java.util.Scanner;

public class ContactController {

    private ContactService service = new ContactService();
    private Scanner sc = new Scanner(System.in);

    public void addContact() {

        System.out.print("First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Address: ");
        String address = sc.nextLine();

        System.out.print("City: ");
        String city = sc.nextLine();

        System.out.print("State: ");
        String state = sc.nextLine();

        System.out.print("Zip: ");
        String zip = sc.nextLine();

        System.out.print("Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(
                firstName, lastName, address,
                city, state, zip, phone, email
        );

        service.createContact(contact);

        System.out.println(" Contact added successfully!");
    }
}
