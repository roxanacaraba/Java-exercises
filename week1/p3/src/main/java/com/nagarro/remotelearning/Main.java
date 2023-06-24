package main.java.com.nagarro.remotelearning;

public class Main {

    public static void main(String[] args) {
        System.out.println(intToBinaryManually(Integer.parseInt(args[0])));
        System.out.println(intToBinaryUsingLibraries(Integer.parseInt(args[0])));
    }
    public static String intToBinaryManually(int num) {
        StringBuilder binaryRepresentation = new StringBuilder();
        StringBuilder reverseBinaryRepresentation;
        while (num > 0) {
            int remainder = num % 2;
            binaryRepresentation.append(remainder);
            num = num / 2;
        }
        reverseBinaryRepresentation = binaryRepresentation.reverse();
        return reverseBinaryRepresentation.toString();
    }
    public static String intToBinaryUsingLibraries (int num) {
        return Integer.toBinaryString(num);
    }
}

