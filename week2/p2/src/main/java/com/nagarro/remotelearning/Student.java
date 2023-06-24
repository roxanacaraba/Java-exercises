package main.java.com.nagarro.remotelearning;

public class Student {
    private String name;
    private int averageGrade;

    public Student(String name, int averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageGrade() {
        return this.averageGrade;
    }

    public void setAverageGrade(int averageGrade) throws Exception {
        if(averageGrade > 0 && averageGrade <= 10) {
            this.averageGrade = averageGrade;
        }
        else {
            throw new Exception("Invalid average grade");
        }
    }

    @Override
    public String toString() {
        return ("Name: " + getName() + ", " + "Average grade: " + getAverageGrade());
    }
}
