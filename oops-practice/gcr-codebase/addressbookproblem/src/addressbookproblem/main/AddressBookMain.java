package addressbookproblem.main;

import addressbookproblem.controller.ContactController;

import addressbookproblem.model.Contact;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        // welcome message
        System.out.println("Welcome!!! to Address Book");

        Scanner sc = new Scanner(System.in);
        ContactController controller = new ContactController();

        String choice;
        // usecase1,2
        // ADD MULTIPLE CONTACTS
        do {
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

            boolean added = controller.addContact(contact);

            if (added) {
                System.out.println("Contact added to Address Book");
            } else {
                System.out.println("Duplicate contact! Not added.");
            }

            System.out.print("Do you want to add another contact? (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // DISPLAY CONTACTS
        System.out.println("\n--- Address Book Contacts ---");
        controller.displayContacts();
        // usecase3
        // EDIT CONTACT
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
        System.out.println(updated ? " Contact Updated" : " Contact Not Found");
        // usecase4
        // DELETE CONTACT
        System.out.print("\nEnter First Name to Delete: ");
        String nameToDelete = sc.nextLine();

        boolean deleted = controller.deleteContact(nameToDelete);

        System.out.println(deleted ? " Contact Deleted" : " Contact Not Found");
        // usecase9
        // SEARCH PERSON BY CITY OR STATE
        System.out.print("\nEnter City or State to search for persons: ");
        String cityOrState = sc.nextLine();

        List<Contact> foundContacts = controller.searchPerson(cityOrState);

        if (foundContacts.isEmpty()) {
            System.out.println(" No contacts found in " + cityOrState);
        } else {
            System.out.println(" Contacts found in " + cityOrState + ":");
            for (Contact contact : foundContacts) {
                System.out.println(contact);
            }
        }

        System.out.println("\n--- Persons Grouped By City ---");

        Map<String, List<Contact>> cityMap = controller.viewPersonsByCity();

        for (String city : cityMap.keySet()) {
            System.out.println("City: " + city);
            for (Contact contact : cityMap.get(city)) {
                System.out.println("  " + contact);
            }
        }

        System.out.println("\n--- Persons Grouped By State ---");

        Map<String, List<Contact>> stateMap = controller.viewPersonsByState();

        for (String state : stateMap.keySet()) {
            System.out.println("State: " + state);
            for (Contact contact : stateMap.get(state)) {
                System.out.println("  " + contact);
            }
        }
        // usecase10
        System.out.println("\n--- Contact Count By City ---");

        Map<String, Integer> cityCount = controller.countByCity();

        for (String city : cityCount.keySet()) {
            System.out.println(city + " : " + cityCount.get(city));
        }
        System.out.println("\n--- Contact Count By State ---");

        Map<String, Integer> stateCount = controller.countByState();

        for (String state : stateCount.keySet()) {
            System.out.println(state + " : " + stateCount.get(state));
        }
        // usecase11
        // SORT CONTACTS BY NAME
        System.out.println("\n--- Contacts Sorted Alphabetically by Name ---");

        List<Contact> sortedContacts = controller.sortContactsByName();

        for (Contact contact : sortedContacts) {
            System.out.println(contact); // calls toString
        }
        // usecase12
        // SORT BY CITY
        System.out.println("\n--- Contacts Sorted By City ---");
        for (Contact contact : controller.sortByCity()) {
            System.out.println(contact);
        }

        // SORT BY STATE
        System.out.println("\n--- Contacts Sorted By State ---");
        for (Contact contact : controller.sortByState()) {
            System.out.println(contact);
        }

        // SORT BY ZIP
        System.out.println("\n--- Contacts Sorted By Zip ---");
        for (Contact contact : controller.sortByZip()) {
            System.out.println(contact);
        }
        //usecase13
        System.out.print("Enter file name to save (example: contacts.txt): ");
        String fileName = sc.nextLine();

        controller.saveToFile(fileName);

        System.out.print("Enter file name to read: ");
        String readFile = sc.nextLine();

        controller.loadFromFile(readFile);
        //usecase14
        System.out.print("Enter CSV file name (example: contacts.csv): ");
        String csvfileName = sc.nextLine();

        controller.saveToCSV(csvfileName);

        System.out.print("Enter CSV file to read: ");
        String csvreadFile = sc.nextLine();

        controller.loadFromCSV(csvreadFile);
       


        sc.close();
    }
}
