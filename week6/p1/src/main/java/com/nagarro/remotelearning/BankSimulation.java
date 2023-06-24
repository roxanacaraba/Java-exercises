package com.nagarro.remotelearning;
import com.nagarro.remotelearning.Account;

public class BankSimulation {

    public static void main(String[] args) {
        Account account = new Account("George", 1L, 100); // name = George, account = 1L, balance = 100

        account.withdraw(10, 0.2f); // amount = 10, fee = 0.2f , amount >= 0 true, fee >= 0 true, amount <= balance true => balance = balance - (amount + fee) => balance = balance - 10.2 => balance = 100 - 10.2 => balance = 89.8

        System.out.println("Your balance: "+account.getBalance()); // Your balance: 89.8

        account.withdraw(10, 0.2f); // balance = balance - (amount + fee) => balance = 89.8 - 10.2  => balance = 79.6

        System.out.println("Your balance: "+account.getBalance()); // Your balance = 79.6
    }
}
