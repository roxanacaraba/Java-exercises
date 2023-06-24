package com.nagarro.remotelearning;

import java.util.ArrayList;
import java.util.List;

public class FinancialInstitution {
    private static List<Client> clientDatabase = new ArrayList<>();

    public static void listAllClients() {
        System.out.println("List of all clients:");
        for (Client client : clientDatabase) {
            System.out.println("Username: " + client.getUsername() + ", Full Name: " + client.getFullName());
        }
    }

    public static double getBalanceByUsername(String username) {
        for (Client client : clientDatabase) {
            if (client.getUsername().equals(username)) {
                return client.getBalance();
            }
        }
        return 0.0;
    }

    public static void listClientsWithHighBalance(double threshold) {
        System.out.println("List of clients with balance over " + threshold + ":");
        for (Client client : clientDatabase) {
            if (client.getBalance() > threshold) {
                System.out.println("Username: " + client.getUsername() + ", Full Name: " + client.getFullName() +
                        ", Balance: " + client.getBalance());
            }
        }
    }
    public static void populateDatabase() {
        clientDatabase.add(new Client("john123", "John Doe", 50000.0));
        clientDatabase.add(new Client("jane456", "Jane Smith", 150000.0));
        clientDatabase.add(new Client("alex789", "Alex Johnson", 250000.0));
        clientDatabase.add(new Client("sarah321", "Sarah Davis", 75000.0));
    }
}
