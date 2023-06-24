package main.java.com.nagarro.remotelearning;

@LoggerAnnotation
public interface CalculatorInterface {

    @LoggerAnnotation
    public int add(int num1, int num2);
    public int subtract(int num1, int num2);
    public int multiply(int num1, int num2);
    public int divide(int num1, int num2);
}
