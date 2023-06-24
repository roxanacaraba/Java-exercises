package main.java.com.nagarro.remotelearning;

public class Main {

    public static void main(String[] args) throws Exception {
        try {
            Person person1 = new Person("John-Black", "Alvin-Carry");
            Person person2 = new Person("John-Black Marvel Alvin-Carry");
            Person person3 = new Person("   John @Black", "Alvin Carry");
            Person person4 = new Person("    John  Black Alvin @Carry  ");

            System.out.println("Person 1 firstname is: " + person1.getFirstname());
            System.out.println("Person 1 surname is: " + person1.getSurname());
            System.out.println("Person 2 firstname is: " + person2.getFirstname());
            System.out.println("Person 2 surname is: " + person2.getSurname());
            System.out.println("Person 3 firstname is: " + person3.getFirstname());
            System.out.println("Person 3 surname is: " + person3.getSurname());
            System.out.println("Person 4 firstname is: " + person4.getFirstname());
            System.out.println("Person 4 surname is: " + person4.getSurname());
        }
        catch (Exception e) {
            System.out.println("Error when creating a new person.");
        }

    }
}
