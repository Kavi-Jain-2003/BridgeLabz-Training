package com.example.mysql_demo.presentation;

import java.time.LocalDate;
import java.util.Scanner;

import com.example.mysql_demo.model.Patient;
import com.example.mysql_demo.service.PatientService;

public class ClinicApp {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        PatientService service = new PatientService();

        while (true) {
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();

                    System.out.println("Enter DOB (yyyy-mm-dd):");
                    LocalDate dob = LocalDate.parse(sc.nextLine());

                    System.out.println("Enter Phone:");
                    String phone = sc.nextLine();

                    System.out.println("Enter Email:");
                    String email = sc.nextLine();

                    System.out.println("Enter Address:");
                    String address = sc.nextLine();

                    System.out.println("Enter Blood Group:");
                    String blood = sc.nextLine();

                    Patient patient = new Patient(name, dob, phone, email, address, blood);
                    service.register(patient);
                    break;

                case 2:
                    System.out.println("Enter Name or Phone:");
                    String keyword = sc.nextLine();
                    service.search(keyword);
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
