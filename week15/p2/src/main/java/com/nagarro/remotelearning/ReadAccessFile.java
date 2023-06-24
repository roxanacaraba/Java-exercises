package com.nagarro.remotelearning;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadAccessFile {
    public static void writeInt() throws IOException {
        try (RandomAccessFile file = new RandomAccessFile("example.txt", "rw")) {
            file.writeInt(1);
            file.writeInt(2);
            file.writeInt(3);
            file.writeInt(4);
        }
    }

    public static void readInt(RandomAccessFile fileToRead) throws IOException {
        final int position = 8;
        fileToRead.seek(position);
        int thirdInt = fileToRead.readInt();
        System.out.println("Third integer: " + thirdInt);
        int fourthInt = fileToRead.readInt();
        System.out.println("Fourth integer: " + fourthInt);
    }
}

