package com.nagarro.remotelearning;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

public class FileCompressorTest {
    private String inputFile;
    private String compressedFile;

    @BeforeEach
    public void setup() {
        inputFile = "example.txt";
        compressedFile = "example_compressed.gz";
    }

    @Test
    public void testCompressFile() {
        try {
            FileCompressor.compressFile(inputFile, compressedFile);

            File compressed = new File(compressedFile);
            Assertions.assertTrue(compressed.exists());
        } catch (IOException e) {
            Assertions.fail("An exception occurred during compression: " + e.getMessage());
        }
    }

    @Test
    public void testPrintCompressionDetails() {
        Assertions.assertDoesNotThrow(() -> FileCompressor.printCompressionDetails(inputFile, compressedFile));
    }
}
