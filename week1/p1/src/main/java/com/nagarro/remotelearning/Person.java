package main.java.com.nagarro.remotelearning;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private Integer dateOfBirth;
    private String dateOfDeath;

    public Person() {
    }
    public String getFirstname() {
        return this.firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getDateOfBirth() {
        return this.dateOfBirth;
    }
    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfDeath() {
        return this.dateOfDeath;
    }
    public void setDateOfDeath(String dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }
    @Override
    public String toString() {
        System.out.println(getFirstname() + " " + getLastname() + " " + "(" + getDateOfBirth() + "-" + getDateOfDeath() + ")");
        return null;
    }
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Person person)) {
            return false;
        }
        return Objects.equals(getDateOfBirth(), person.dateOfBirth)
                && Objects.equals(getFirstname(), person.firstname)
                && Objects.equals(getLastname(), person.lastname)
                && Objects.equals(getDateOfDeath(), person.dateOfDeath);
        }
    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getDateOfBirth(), getDateOfDeath());
    }
}
