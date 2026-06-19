/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

public class Loan {
    private Book book;
    private Member member;
    private String borrowDate;
    private String dueDate;

    public Loan(Book book, Member member,
                String borrowDate, String dueDate) {
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Loan [Book=" + book.getTitle() +
               ", Member=" + member.getName() +
               ", Borrow Date=" + borrowDate +
               ", Due Date=" + dueDate + "]";
    }
}
