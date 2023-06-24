package main.java.com.nagarro.remotelearning;

public class Guest {
    private String name;
    private int age;
    private int numberOfRequiredRooms;
    private int numberOfGuestsGroup;

    public Guest(String name, int age, int numberOfRequiredRooms, int numberOfGuestsGroup) {
        this.name = name;
        this.age = age;
        this.numberOfRequiredRooms = numberOfRequiredRooms;
        this.numberOfGuestsGroup = numberOfGuestsGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfRequiredRooms() {
        return numberOfRequiredRooms;
    }

    public void setNumberOfRequiredRooms(int numberOfRequiredRooms) {
        this.numberOfRequiredRooms = numberOfRequiredRooms;
    }

    public int getNumberOfGuestsGroup() {
        return numberOfGuestsGroup;
    }

    public void setNumberOfGuestsGroup(int numberOfGuestsGroup) {
        this.numberOfGuestsGroup = numberOfGuestsGroup;
    }
}
