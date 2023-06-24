package main.java.com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) {
         if (args.length >= 2) {
            long intervalLimit = Long.parseLong(args[0]);
            int number = Integer.parseInt(args[1]);
            int numberOfMultiples = (int) (intervalLimit / number);
            int count = 0;
            for (int i = 1; i <= numberOfMultiples; i++) {
                if (isPalindrome(number * i)) {
                    count++;
                }
            }
            System.out.println(count);
        }
        else {
            System.out.println("The number of arguments provided is insufficient");
        }
    }
    public static Boolean isPalindrome(Integer checkedNumber) {
        String stringNumber = checkedNumber.toString();
        StringBuilder reverseNumber = new StringBuilder()
                .append(checkedNumber).reverse();

        return stringNumber.equals(reverseNumber.toString());
    }
}
