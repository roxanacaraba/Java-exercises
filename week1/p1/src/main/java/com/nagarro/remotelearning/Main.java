package main.java.com.nagarro.remotelearning;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main extends ReadFromFile {

    public static void main(String[] args) throws IOException {
        String[] contentOfFile = readLinesFromTextFile(args[0]);
        Set<Person> personsSet = (getPersons(contentOfFile));
        personsSet.forEach(Person::toString);
        }

     public static Set<Person> getPersons(String[] fileLines) {
        Set<Person> persons = new LinkedHashSet<>();
        String[] personInfo;
        int dateOfBirth;
        String dateOfDeath;

         for (String fileLine : fileLines) {
             personInfo = fileLine.split(", ");
             dateOfBirth = Integer.parseInt(personInfo[2].replaceAll("[^0-9]", ""));
             if (personInfo.length == 3) {
                 dateOfDeath = "/";
             } else {
                 dateOfDeath = personInfo[3];
             }
             Person person = new Person();
             person.setFirstname(personInfo[0]);
             person.setLastname(personInfo[1]);
             person.setDateOfBirth(dateOfBirth);
             person.setDateOfDeath(dateOfDeath);
             persons.add(person);
         }
        return persons;
     }
}

