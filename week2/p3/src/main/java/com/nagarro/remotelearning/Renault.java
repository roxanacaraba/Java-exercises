package main.java.com.nagarro.remotelearning;

public class Renault extends Car {
    public int horsePower;
    public int numberOfCylinders;

    public Renault(Integer horsePower, Integer numberOfCylinders) {
        super(12, "Fe");
        System.out.println("The constructor Renault() was called");
        this.horsePower = horsePower;
        System.out.println("The horsePower property from Renault class has been assigned a value in the constructor Renault()");
        this.numberOfCylinders = numberOfCylinders;
        System.out.println("The numberOfCylinders property from Renault class has been assigned a value in the constructor Renault");
    }

    public int getHorsePower() {
        System.out.println("The getHorsePower method was called");
        return this.horsePower;
    }
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public int getNumberOfCylinders() {
        System.out.println("The getNumberOfCylinders method was called");
        return this.numberOfCylinders;
    }
    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
    @Override
    public void increaseEngineVersion(int valueOfIncrease) throws Exception {
        System.out.println("The increaseEngineVersion method from Renault class was called");
        this.setEngineVersion(getEngineVersion() + 10 * valueOfIncrease);
        super.increaseEngineVersion(1);
    }

}