package main.java.com.nagarro.remotelearning;

import main.java.com.nagarro.remotelearning.exception.NoRoomsAvailableException;

public class Main {
    public static void main(String[] args) throws NoRoomsAvailableException {
        try {
            Hotel hotel = new Hotel("Continental", 5);
            Guest guest1 = new Guest("A. Popescu", 35, 2, 4);
            hotel.checkIn(guest1);
            Guest guest2 = new Guest("C. Marinescu", 27, 3, 5);
            hotel.checkIn(guest2);
            hotel.checkOut(guest1);
            Guest guest3 = new Guest("S. Ionescu", 56, 4, 4);
            hotel.checkIn(guest3);
        }
        catch (NoRoomsAvailableException e) {
            System.out.println(e);
        }
    }
}
