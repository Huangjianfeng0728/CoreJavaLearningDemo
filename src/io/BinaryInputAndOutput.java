package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

public class BinaryInputAndOutput {
    public static void main(String[] args)throws IOException {
//        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("D:\\CoreJavaLearningDemo\\resources\\binary.txt"));
//        dataOutputStream.write(1999);
//        dataOutputStream.close();
        //randomAccessFile
        RandomAccessFile accessFile = new RandomAccessFile("D:\\CoreJavaLearningDemo\\resources\\FileInputStream.txt", "r");
        System.out.println(accessFile.length());
    }

}
