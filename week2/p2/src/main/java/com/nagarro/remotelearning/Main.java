package main.java.com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) throws Exception {
        Tank tank = new Tank();

        Student student1 = new Student("Mark", 8);
        Student student2 = new Student("Karen", 4);
        Student student3 = new Student("Peter", 5);

        tank.push(student1);
        tank.push(student2);
        tank.push(student3);tank.display();
        System.out.println(tank.peek());
        System.out.println(tank.isEmpty());
        tank.finalize();

    }
}
