
//importing scanner class
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//custom exception
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Contact {
    private String phnoneNumber;
    private String name;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phnoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phnoneNumber;
    }

    @Override
    public String toString() {
        return name + " : " + phnoneNumber;
    }
}

public class PhoneContactOrganizer {

    // scanner object
    static Scanner sc = new Scanner(System.in);
    static List<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Enter no. of contacts:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("enter name for " + (i + 1) + " contact:");
                String name = sc.nextLine();
                System.out.println("enter 10digit phone for " + (i + 1) + " contact:");
                String phone = sc.nextLine();
                addPhoneNumber(name, phone);
            } catch (InvalidPhoneNumberException e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.println("\nAll Contacts:");
        for (Contact c : contacts) {
            System.out.println(c);
        }

        // Example search
        System.out.println("\nEnter phone number to search:");
        String searchPhone = sc.nextLine();
        searchphoneNumber(searchPhone);

        // Example delete
        System.out.println("\nEnter phone number to delete:");
        String deletePhone = sc.nextLine();
        deletePhoneNumber(deletePhone);

        System.out.println("\nContacts after deletion:");
        for (Contact c : contacts) {
            System.out.println(c);
        }
        // closing scanner
        sc.close();

    }

    public static void addPhoneNumber(String name, String phone) throws InvalidPhoneNumberException {
        if (!isvalidPhoneNumber(phone)) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phone)) {
                throw new InvalidPhoneNumberException("Duplicate phone number");
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added:" + name + ":" + phone);
    }

    public static boolean isvalidPhoneNumber(String phone) {
        if (phone.length() != 10)
            return false;
        for (char c : phone.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public static void searchphoneNumber(String phone) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phone)) {
                System.out.println("COntact found:" + c);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void deletePhoneNumber(String phone) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPhoneNumber().equals(phone)) {
                System.out.println("Deleted contact:" + contacts.get(i));
                contacts.remove(i);
                return;
            }
        }
        System.out.println("Contact not found");
    }

}
