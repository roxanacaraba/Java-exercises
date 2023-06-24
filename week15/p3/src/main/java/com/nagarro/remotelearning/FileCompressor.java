package com.nagarro.remotelearning;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class FileCompressor {
    public static void compressFile(String inputFile, String compressedFile) throws IOException {

        FileInputStream in = new FileInputStream(inputFile);
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(compressedFile));

        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.finish();
        out.close();
    }
    public static void printCompressionDetails(String inputFile, String compressedFile) {

        File input = new File(inputFile);
        File compressed = new File(compressedFile);
        double ratio = (double) compressed.length() / input.length();
        System.out.printf("File length: %d%n", input.length());
        System.out.printf("Archive length: %d%n", compressed.length());
        System.out.printf("Compression ratio: %.2f%n", ratio);
    }
}
