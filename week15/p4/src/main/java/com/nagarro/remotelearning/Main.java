package com.nagarro.remotelearning;

public class Main {
    public static void main(String[] args) {
        String latin1File = "latin1.txt";
        String utf1File = "utf1.txt";
        Latin1ToUTF8.execute(latin1File, utf1File);

        String latin2File = "latin2.txt";
        String utf2File = "utf2.txt";
        UTF8ToLatin1.execute(utf2File, latin2File);

//        char c = 'ü';
//        UTF8ToLatin1.isLatinCharacter(c);
    }
}
