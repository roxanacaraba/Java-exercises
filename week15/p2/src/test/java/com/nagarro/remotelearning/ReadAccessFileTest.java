package com.nagarro.remotelearning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadAccessFileTest {
    private static final String FILE_PATH = "example.txt";
    private File file;

    @BeforeEach
    public void setup() {
        file = new File(FILE_PATH);
    }

    @Test
    public void testReadInt() throws IOException {
        ReadAccessFile.writeInt();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");

        ReadAccessFile.readInt(randomAccessFile);

        long expectedThirdIntPosition = 8;
        long expectedFourthIntPosition = 12;

        randomAccessFile.seek(expectedThirdIntPosition);
        int thirdInt = randomAccessFile.readInt();
        Assertions.assertEquals(3, thirdInt, "Incorrect third integer value");

        randomAccessFile.seek(expectedFourthIntPosition);
        int fourthInt = randomAccessFile.readInt();
        Assertions.assertEquals(4, fourthInt, "Incorrect fourth integer value");
    }

    @Test
    public void testReadInt_FileNotExists() {
        File nonExistingFile = new File("non_existing.txt");

        Assertions.assertThrows(IOException.class, () -> {
            RandomAccessFile randomAccessFile = new RandomAccessFile(nonExistingFile, "r");
            ReadAccessFile.readInt(randomAccessFile);
        }, "Should throw IOException when file does not exist");
    }

    @Test
    public void testReadInt_EmptyFile() {
        // Arrange
        File emptyFile = new File("empty.txt");

        // Act and Assert
        Assertions.assertThrows(IOException.class, () -> {
            RandomAccessFile randomAccessFile = new RandomAccessFile(emptyFile, "r");
            ReadAccessFile.readInt(randomAccessFile);
        }, "Should throw IOException when file is empty");
    }
}
