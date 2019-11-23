package io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestHowBinaryInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\CoreJavaLearningDemo\\resources\\alice.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\CoreJavaLearningDemo\\resources\\alice_copy.txt");
        int read;
        byte[] bytes = new byte[1024];
        while ((read = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes, 0, read);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
