package com.exercises;

class Account {
    // Variables
    int id;
    String name;
    double balance;

    // Constructor (optional)
    Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Methods (optional)
    void credit(double amount) {
        balance += amount;
    }

    void debit(double amount) {
        balance -= amount;
    }

    String info() {
        return "User %s with account ID %d has %f balance\n";
    }
}

public class Problem130 {
    public static void main(String[] args) {
        Account accOne = new Account(0, "Pesho", 300);
        System.out.println(accOne.balance);
        System.out.println(accOne.name);
        accOne.credit(500.67);
        accOne.name = "Ivan";
        System.out.println(accOne.balance);
        System.out.println(accOne.name);
        System.out.printf(accOne.info(), accOne.name, accOne.id, accOne.balance);
        accOne.debit(256.13);
        System.out.printf(accOne.info(), accOne.name, accOne.id, accOne.balance);
    }
}


