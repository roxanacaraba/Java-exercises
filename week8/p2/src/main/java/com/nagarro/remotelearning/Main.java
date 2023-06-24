package main.java.com.nagarro.remotelearning;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();

        CalculatorInterface calculator = (CalculatorInterface) Proxy.newProxyInstance(
                MyInvocationHandler.class.getClassLoader(),
                new Class[]{CalculatorInterface.class}, handler);

        calculator.add(4, 8);
        calculator.subtract(10, 2);
        calculator.multiply(2, 3);
        calculator.divide(5, 2);
    }
}
