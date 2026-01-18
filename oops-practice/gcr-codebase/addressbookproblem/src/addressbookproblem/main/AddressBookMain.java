package addressbookproblem.main;
import addressbookproblem.controller.ContactController;
import addressbookproblem.model.Contact;

import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
         Scanner sc = new Scanner(System.in);
        ContactController controller = new ContactController();

        System.out.println("Enter Contact Details");

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

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(
                firstName, lastName, address,
                city, state, zip, phone, email
        );

        controller.addContact(contact);

        System.out.println("Contact added to Address Book");
        sc.close();
    }
}
