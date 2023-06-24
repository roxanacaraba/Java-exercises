package com.nagarro.remotelearning;

public class Client {
    private String username;
    private String fullName;
    private double balance;

    public Client(String username, String fullName, double balance) {
        this.username = username;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }
}

