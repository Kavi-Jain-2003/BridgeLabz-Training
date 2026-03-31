package addressbookproblem.repository;

import java.util.*;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import addressbookproblem.model.AddressBook;
import addressbookproblem.model.Contact;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ContactRepository {

	private AddressBook addressBook;

	public ContactRepository(AddressBook addressBook) {
	    this.addressBook = addressBook;
	}


    // usecase1,2
    public void addContact(Contact contact) {
        addressBook.addContact(contact);
    }

    public AddressBook getAddressBook() {
        return addressBook;
    }

    // usecase3
    public Contact findByFirstName(String firstName) {
        for (Contact c : addressBook.getContacts()) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                return c;
            }
        }
        return null;
    }

    // usecase4
    public boolean deleteContactByFirstName(String firstName) {

        // Get all contacts
        List<Contact> contacts = addressBook.getContacts();

        // Traverse list to find matching contact
        for (Contact contact : contacts) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contacts.remove(contact); // delete contact
                return true; // deletion successful
            }
        }

        // If no contact found
        return false;
    }

    // usecase7
    public boolean isDuplicate(Contact contact) {
        for (Contact c : addressBook.getContacts()) {
            if (c.equals(contact)) { // uses overridden equals()
                return true; // duplicate found
            }
        }
        return false; // no duplicate
    }

    // usecase8
    public List<Contact> searchByCityOrState(String cityOrState) {
        List<Contact> result = new ArrayList<>();

        for (Contact contact : addressBook.getContacts()) {
            if (contact.getCity().equalsIgnoreCase(cityOrState) ||
                    contact.getState().equalsIgnoreCase(cityOrState)) {
                result.add(contact);
            }
        }

        return result;
    }

    // usecase9
    public Map<String, List<Contact>> getPersonsByCity() {

        Map<String, List<Contact>> cityMap = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String city = contact.getCity();

            // If city not present, create empty list
            cityMap.putIfAbsent(city, new ArrayList<>());

            // Add contact to city list
            cityMap.get(city).add(contact);
        }
        return cityMap;
    }

    // usecase9
    public Map<String, List<Contact>> getPersonsByState() {

        Map<String, List<Contact>> stateMap = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String state = contact.getState();

            stateMap.putIfAbsent(state, new ArrayList<>());
            stateMap.get(state).add(contact);
        }
        return stateMap;
    }

    // usecase10
    public Map<String, Integer> countByCity() {

        Map<String, Integer> cityCount = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String city = contact.getCity();

            // Increase count
            cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
        }
        return cityCount;
    }

    public Map<String, Integer> countByState() {

        Map<String, Integer> stateCount = new HashMap<>();

        for (Contact contact : addressBook.getContacts()) {
            String state = contact.getState();

            stateCount.put(state, stateCount.getOrDefault(state, 0) + 1);
        }
        return stateCount;
    }

    // usecase11
    public List<Contact> getSortedContacts() {

        List<Contact> contacts = addressBook.getContacts();

        Collections.sort(contacts); // uses compareTo()

        return contacts;
    }

    // usecase12
    public List<Contact> sortByCity() {

        List<Contact> contacts = addressBook.getContacts();

        Collections.sort(contacts, Comparator.comparing(
                Contact::getCity, String.CASE_INSENSITIVE_ORDER));

        return contacts;
    }

    public List<Contact> sortByState() {

        List<Contact> contacts = addressBook.getContacts();

        Collections.sort(contacts, Comparator.comparing(
                Contact::getState, String.CASE_INSENSITIVE_ORDER));

        return contacts;
    }

    public List<Contact> sortByZip() {

        List<Contact> contacts = addressBook.getContacts();

        Collections.sort(contacts, Comparator.comparing(Contact::getZip));

        return contacts;
    }
    //usecase13
    public void writeToFile(String fileName) {

        try {
            FileWriter writer = new FileWriter(fileName);

            for (Contact contact : addressBook.getContacts()) {
                writer.write(contact.toString());
                writer.write("\n");
            }

            writer.close();
            System.out.println("Contacts saved successfully to file.");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
            e.printStackTrace();
        }
    }
    //usecase13
    public void readFromFile(String fileName) {

        try {
            File file = new File(fileName);
            Scanner sc = new Scanner(file);

            System.out.println("Reading contacts from file:\n");

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
    //usecase14 and 17
    public void writeToCSVAsync(String fileName) {

        Thread thread = new Thread(() -> {

            try {
                FileWriter writer = new FileWriter(fileName);

                writer.write("FirstName,LastName,Address,City,State,Zip,Phone,Email\n");

                for (Contact contact : addressBook.getContacts()) {

                    writer.write(contact.getFirstName() + "," +
                                 contact.getLastName() + "," +
                                 contact.getAddress() + "," +
                                 contact.getCity() + "," +
                                 contact.getState() + "," +
                                 contact.getZip() + "," +
                                 contact.getPhoneNumber() + "," +
                                 contact.getEmail() + "\n");
                }

                writer.close();
                System.out.println("CSV Writing Completed (Background Thread)");

            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        thread.start();   // Start new thread
    }
    public void readFromCSVAsync(String fileName) {

        Thread thread = new Thread(() -> {

            try {
                File file = new File(fileName);
                Scanner sc = new Scanner(file);

                if (sc.hasNextLine()) {
                    sc.nextLine(); // Skip header
                }

                while (sc.hasNextLine()) {

                    String line = sc.nextLine();
                    String[] data = line.split(",");

                    Contact contact = new Contact(
                            data[0], data[1], data[2],
                            data[3], data[4], data[5],
                            data[6], data[7]
                    );

                    addressBook.addContact(contact);
                }

                sc.close();
                System.out.println("CSV Reading Completed (Background Thread)");

            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        thread.start();   // Start new thread
    }
  
    }
