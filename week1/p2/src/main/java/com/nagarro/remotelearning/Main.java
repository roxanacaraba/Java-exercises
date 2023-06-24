package main.java.com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(Integer.parseInt(args[0])));
    }
    public static String findPrimeNumbers(Integer n) {
        Integer number;
        StringBuilder solution = new StringBuilder();
        for (number = 1; number <= n; number++) {
            solution.append(number);
            if (isPrime(number)) {
                if (number.equals(n)) {
                    solution.append("-PRIME");
                }
                else {
                    solution.append("-PRIME, ");
                }
            }
            else {
                if (!number.equals(n)) {
                    solution.append(", ");
                }
            }
        }
        return solution.toString();
    }
    public static Boolean isPrime(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
