package com.edu.sena.controller;

import com.edu.sena.entits.*;
import java.util.ArrayList;
import java.util.List;

public class gestion {

    public List<contacto> contacto;

    public gestion() {
        contacto = new ArrayList<>();
    }

    public void addContact(String name, Long phone, String email) {
        contacto newContact = new contacto(name, phone, email);
        contacto.add(newContact);
        System.out.println("Contact  Name :" + name + " Phone :" + phone + " Email : " + email + "added successfully!");
    }

    public void searchContact(String query) {
        List<contacto> results = new ArrayList<>();
        for (contacto book : contacto) {
            if (book.getName().contains(query) || String.valueOf(book.getPhone()).contains(query)) {
                results.add(book);
            }
        }
        if (!results.isEmpty()) {
            System.out.println("Search results:");
            for (contacto book : results) {
                System.out.println("Title: " + book.getName() + ", Phone: " + book.getPhone() + ", Email : "
                        + book.getEmail());
            }
        } else {
            System.out.println("No contact found.");
        }
    }

    public void displayAllContact() {
        if (!contacto.isEmpty()) {
            System.out.println("All contact:");
            for (contacto book : contacto) {
                System.out.println("Title: " + book.getName() + ", Phone: " + book.getPhone() + ", Email: "
                        + book.getEmail());
            }
        } else {
            System.out.println("No contact available.");
        }
    }

    public void deleteContact(String name) {
        for (contacto contact : contacto) {
            if (contact.getName().equals(name)) {
                contacto.remove(contact);
                System.out.println("Contact " + name + " deleted successfully!");
                return;
            }
        }
    }
}
