/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public Book searchBookByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // Enforces one active loan per book
    public void lendBook(Book book, Member member,
                         String borrowDate,
                         String dueDate) {

        if (!book.isAvailable()) {
            System.out.println("Loan rejected: Book already on loan.");
            return;
        }

        Loan loan = new Loan(book, member,
                             borrowDate, dueDate);

        member.addLoan(loan);
        book.setAvailable(false);

        System.out.println("Book lent successfully.");
    }

    public void returnBook(Book book, Member member) {

        Loan loanToRemove = null;

        for (Loan loan : member.getLoans()) {
            if (loan.getBook().equals(book)) {
                loanToRemove = loan;
                break;
            }
        }

        if (loanToRemove != null) {
            member.removeLoan(loanToRemove);
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("No matching loan found.");
        }
    }

    @Override
    public String toString() {

        String result = "\nLIBRARY STATUS\n";

        result += "\nBooks:\n";
        for (Book b : books) {
            result += b + "\n";
        }

        result += "\nMembers:\n";
        for (Member m : members) {
            result += m + "\n";
        }

        return result;
    }
}