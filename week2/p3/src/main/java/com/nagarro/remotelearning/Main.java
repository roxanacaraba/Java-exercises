package main.java.com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(13, "Al");
        System.out.println("The car1 object has been created");
        //car1.setEngineVersion(-100);
        car1.setEngineVersion(14);
        car1.getSkeletonAlloy();
        car1.increaseEngineVersion(2);
        System.out.println("Engine version for car1 is " + car1.getEngineVersion());
        Car car2 = new Renault(200, 5);
        System.out.println("The skeletonAlloy for car2 is " + car2.getSkeletonAlloy());
        car2.increaseEngineVersion(2);
        System.out.println("Engine version for car2 is " + car2.getEngineVersion());
    }

}
