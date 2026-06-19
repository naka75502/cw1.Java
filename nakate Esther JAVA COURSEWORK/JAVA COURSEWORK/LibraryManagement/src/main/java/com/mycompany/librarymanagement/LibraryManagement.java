/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagement;

/**
 *
 * @author kulum
 */

public class LibraryManagement {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("101", "Java Programming", "James");
        Book b2 = new Book("102", "Database Systems", "Elmasri");
        Book b3 = new Book("103", "Software Engineering", "Pressman");

        Member m1 = new Member("M001", "Denis");
        Member m2 = new Member("M002", "Sarah");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        library.registerMember(m1);
        library.registerMember(m2);

        System.out.println("BEFORE OPERATIONS");
        System.out.println(library);

        library.lendBook(b1, m1, "10/06/2026", "20/06/2026");
        library.lendBook(b2, m2, "10/06/2026", "20/06/2026");

        library.lendBook(b1, m2, "11/06/2026", "21/06/2026");

        library.returnBook(b1, m1);

        library.lendBook(b1, m2, "12/06/2026", "22/06/2026");

        System.out.println("\nAFTER OPERATIONS");
        System.out.println(library);
    }
}