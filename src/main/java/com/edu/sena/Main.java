package com.edu.sena;

import java.util.Scanner;

import com.edu.sena.controller.gestion;
import com.edu.sena.entits.contacto;

public class Main {
    public static void main(String[] args) {
        gestion gestion = new gestion();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Contacto");
            System.out.println("2. Search Contact");
            System.out.println("3. Display all Contact");
            System.out.println("4. Delete contact");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name Contact : ");
                    String name = scanner.next();
                    System.out.print("Enter Phone Contact : ");
                    Long phone = scanner.nextLong();
                    System.out.print("Enter Email Contact : ");
                    String email = scanner.next();
                    gestion.addContact(name, phone, email);
                    break;
                case 2:
                    System.out.print("Enter search query: ");
                    String query = scanner.next();
                    gestion.searchContact(query);
                    break;
                case 3:
                    gestion.displayAllContact();
                    break;
                case 4:
                    System.out.print("Enter Name to remove: ");
                    String deleteString = scanner.next();
                    gestion.deleteContact(deleteString);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}