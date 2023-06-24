package com.nagarro.remotelearning;

import java.io.*;

public class Latin1ToUTF8 {
    public static void execute(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputFile), "ISO-8859-1"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(outputFile), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File " + inputFile + " transcoded successfully!");
        }
        catch (IOException e) {
            System.out.println("Latin1ToUTF8: File exception: " + e.getMessage());
        }
    }
}
