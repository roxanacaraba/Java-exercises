package main.java.com.nagarro.remotelearning;

import main.java.com.nagarro.remotelearning.exception.GuestIsNotCheckedInException;
import main.java.com.nagarro.remotelearning.exception.NoRoomsAvailableException;

public class Hotel {
    private String name;
    private int numberOfRooms;
    private int numberOfAvailableRooms;
    private int numberOfGuests;

    public Hotel(String name, int numberOfRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfAvailableRooms = this.numberOfRooms;
        this.numberOfGuests = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfAvailableRooms() {
        return numberOfAvailableRooms;
    }

    public void setNumberOfAvailableRooms(int numberOfAvailableRooms) {
        this.numberOfAvailableRooms = numberOfAvailableRooms;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void checkIn(Guest guest) throws NoRoomsAvailableException {
        if (this.numberOfAvailableRooms >= guest.getNumberOfRequiredRooms()) {
            this.numberOfAvailableRooms = numberOfAvailableRooms - guest.getNumberOfRequiredRooms();
            this.numberOfGuests = this.numberOfGuests + guest.getNumberOfGuestsGroup();
            System.out.println(guest.getName() + " stayed in hotel " + this.getName() + " together with other " + (guest.getNumberOfGuestsGroup() - 1) + " person/s in " + guest.getNumberOfRequiredRooms() + " room/s.");
            System.out.println("Number of available rooms: " + this.getNumberOfAvailableRooms());
        }
        else {
            throw new NoRoomsAvailableException("The number of requested rooms exceeds the number of available rooms");
        }
    }

    public void checkOut(Guest guest) throws GuestIsNotCheckedInException {
        if (guest.getNumberOfRequiredRooms() > 0) {
            this.numberOfAvailableRooms = numberOfAvailableRooms + guest.getNumberOfRequiredRooms();
            this.numberOfGuests = this.numberOfGuests - guest.getNumberOfGuestsGroup();
            System.out.println(guest.getName() + " left the hotel");
            System.out.println("Number of available rooms: " + this.getNumberOfAvailableRooms());
        }
        else {
            throw new GuestIsNotCheckedInException("The guest cannot be checked out.");
        }
    }
}
