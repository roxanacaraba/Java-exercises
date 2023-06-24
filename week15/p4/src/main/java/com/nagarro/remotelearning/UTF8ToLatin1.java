package com.nagarro.remotelearning;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UTF8ToLatin1 {
    public static void execute(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(inputFile), "UTF-8"));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                     new FileOutputStream(outputFile), "ISO-8859-1"))) {
            int character;
            while ((character = br.read()) != -1) {
                bw.write((char)character);
                UTF8ToLatin1.isLatinCharacter(character);
            }
            System.out.println("File " + inputFile + " transcoded successfully!");

        } catch (IOException e) {
            System.out.println("UTF8ToLatin1: File exception: " + e.getMessage());
        }
    }
    // TODO: Fix isLatinCharacter method. I don't know why it doesn't catch the UTF8 Characters..
    //          I tried multiple characters over 128 bits and I know UTF is using 2 bytes to represent them
    //          whereas latin is using 1 byte. I can try something low level, but I'm curious if there isn't a java
    //          built-in function for this. Please advise.
    public static void isLatinCharacter(int character) {
        byte[] utf8Bytes = String.valueOf(character).getBytes(StandardCharsets.UTF_8);
        boolean canWriteToLatin1 = true;
        for (byte b : utf8Bytes) {
            if (!StandardCharsets.ISO_8859_1.newEncoder().canEncode((char) b)) {
                canWriteToLatin1 = false;
                break;
            }
        }
        if (!canWriteToLatin1) {
            System.out.println("UTF8ToLatin1: Cannot transcode character: " + Integer.toHexString(character));
        }
    }
}
