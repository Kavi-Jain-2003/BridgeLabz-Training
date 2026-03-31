package addressbookproblem.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import addressbookproblem.model.AddressBook;
import addressbookproblem.model.Contact;

public class DBRepository {

    private String url = "jdbc:mysql://localhost:3306/addressbook";
    private String username = "root";
    private String password = "ckjain1166"; 

    public void saveToDB(AddressBook addressBook) {

        String sql = "INSERT INTO contacts " +
                     "(firstName,lastName,address,city,state,zip,phone,email) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            for (Contact contact : addressBook.getContacts()) {

                ps.setString(1, contact.getFirstName());
                ps.setString(2, contact.getLastName());
                ps.setString(3, contact.getAddress());
                ps.setString(4, contact.getCity());
                ps.setString(5, contact.getState());
                ps.setString(6, contact.getZip());
                ps.setString(7, contact.getPhoneNumber());
                ps.setString(8, contact.getEmail());

                ps.executeUpdate();
            }

            System.out.println("Data Saved To Database Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
