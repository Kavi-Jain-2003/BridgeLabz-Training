package addressbookproblem.main;

import addressbookproblem.controller.ContactController;
import addressbookproblem.model.Contact;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");

        Scanner sc = new Scanner(System.in);
        ContactController controller = new ContactController();

        // -------- ADD CONTACT --------
        System.out.println("\nEnter Contact Details");

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
                city, state, zip, phone, email);

        controller.addContact(contact);
        System.out.println("✅ Contact added to Address Book");

        // -------- DISPLAY CONTACTS --------
        System.out.println("\n--- Address Book Contacts ---");
        controller.displayContacts();

        // -------- EDIT CONTACT --------
        System.out.print("\nEnter First Name to Edit: ");
        String nameToEdit = sc.nextLine();

        System.out.println("Enter New Details");

        System.out.print("New Last Name: ");
        String newLastName = sc.nextLine();

        System.out.print("New Address: ");
        String newAddress = sc.nextLine();

        System.out.print("New City: ");
        String newCity = sc.nextLine();

        System.out.print("New State: ");
        String newState = sc.nextLine();

        System.out.print("New Zip: ");
        String newZip = sc.nextLine();

        System.out.print("New Phone: ");
        String newPhone = sc.nextLine();

        System.out.print("New Email: ");
        String newEmail = sc.nextLine();

        Contact updatedContact = new Contact(
                nameToEdit, newLastName, newAddress,
                newCity, newState, newZip, newPhone, newEmail);

        boolean updated = controller.editContact(nameToEdit, updatedContact);

        System.out.println(updated ? "Contact Updated" : "Contact Not Found");

        System.out.print("\nEnter First Name to Delete: ");
        String nameToDelete = sc.nextLine();

        boolean deleted = controller.deleteContact(nameToDelete);

        if (deleted) {
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }

        sc.close();
    }
}
