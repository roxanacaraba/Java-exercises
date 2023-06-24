package main.java.com.nagarro.remotelearning;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String firstname;
    private String surname;

    public Person(String firstname, String surname) throws Exception {
        if (nameIsValid(firstname)) {
            this.firstname = firstname;
        }
        else {
            throw new Exception("Invalid firstname");
        }

        if (!nameIsValid(surname) || surname.contains(" ")) {
            throw new Exception("Invalid surname");
        }
        else {
            this.surname = surname;
        }
    }
    public Person(String fullName) throws Exception {
        if (nameIsValid(fullName)) {
            this.firstname = "";
            String[] wordsInFullName = fullName.split("\\s+");
            for (int i = 0; i < wordsInFullName.length - 1; i++) {
                this.firstname = this.firstname.concat(wordsInFullName[i]);
                this.firstname = this.firstname.concat(" ");
            }
            this.surname = wordsInFullName[wordsInFullName.length - 1];
        }
        else {
            throw new Exception("Invalid fullname");
        }
    }
        public String getFirstname() {
            return this.firstname;
        }
        public void setFirstname (String firstname) {
            this.firstname = firstname;
        }
        public String getSurname() {
            return this.surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }

        public boolean nameIsValid(String name) {
            if (name.charAt(0) == ' ' || name.charAt(0) == '-' || name.charAt(name.length() - 1) == ' '
                    || name.charAt(name.length() - 1) == '-' || name.contains("  ")) {
                return false;
            }
            Pattern stringPattern = Pattern.compile("[^a-zA-Z\\- ]");
            Matcher matcher = stringPattern.matcher(name);
            return !matcher.find();
        }
}


