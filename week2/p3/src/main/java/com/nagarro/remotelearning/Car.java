package main.java.com.nagarro.remotelearning;

public class Car {
    private int engineVersion;
    private String skeletonAlloy;
    public Car(int engineVersion, String skeletonAlloy) {
        System.out.println("The constructor Car() was called");
        this.engineVersion = engineVersion;
        System.out.println("The engineVersion property from Car class has been assigned a value in the constructor Car()");
        this.skeletonAlloy = skeletonAlloy;
        System.out.println("The skeletonAlloy property from Car class has been assigned a value in the constructor Car()");
    }
    public int getEngineVersion() {
        System.out.println("The getEngineVersion method was called");
        return this.engineVersion;
    }
    public void setEngineVersion(int value) throws Exception {
        System.out.println("The setEngineVersion method was called");
        if(value > 0) {
            this.engineVersion = value;
            System.out.println("The engineVersion property was assigned a value in the setEngineVersion method");
        }
        else {
            System.out.println("An error will be thrown because the engineVersion property was assigned a negative value in the setEngineVersion method");
            throw new Exception("Negative Engine Version");
        }
    }
    public String getSkeletonAlloy() {
        System.out.println("The getSkeletonAlloy method was called");
        return this.skeletonAlloy;
    }
    public void setSkeletonAlloy(String alloy) {
        this.skeletonAlloy = alloy;
    }
    public void increaseEngineVersion(int valueOfIncrease) throws Exception {
        System.out.println("The increaseEngineVersion method from Car class was called");
        this.engineVersion = this.engineVersion + valueOfIncrease;
    }
}

