package main.java.com.nagarro.remotelearning;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromFile {

    public static String[] readLinesFromTextFile(String file) throws IOException {
        String[] result = new String[0];
        DataInputStream inputStream = new DataInputStream(new FileInputStream(file));
        try (inputStream) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String strLine;
            while ((strLine = bufferedReader.readLine()) != null) {
                result = addLineToArray(result, strLine);
            }
        }
        return result;
    }

    private static String[] addLineToArray(String[] input, String line) {
        String[] result = new String[input.length + 1];
        System.arraycopy(input, 0, result, 0, input.length);
        result[input.length] = line;
        return result;
    }
}
