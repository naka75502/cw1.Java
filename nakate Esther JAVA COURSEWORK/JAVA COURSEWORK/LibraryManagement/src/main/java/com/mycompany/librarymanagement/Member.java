/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagement;

import java.util.ArrayList;

public class Member {
    private String memberId;
    private String name;
    private ArrayList<Loan> loans;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        loans = new ArrayList<>();
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    public void removeLoan(Loan loan) {
        loans.remove(loan);
    }

    @Override
    public String toString() {
        return "Member [ID=" + memberId +
               ", Name=" + name +
               ", Loans=" + loans.size() + "]";
    }
}
