package io;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CompareBufferAndNone {
    public static void main(String[] args) throws IOException {
        //filesRead();
        //bufferedReader();
        channelReader();

    }
    public static void filesRead() throws IOException {
        long startFiles = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            List<String> lists = Files.readAllLines(Paths.get("D:\\CoreJavaLearningDemo\\resources\\alice.txt"));
            for(String str : lists){
                System.out.println(str);
            }
        }
        long endFiles = System.nanoTime();
        double time = (endFiles - startFiles)/1000000000.0;
        System.out.println(time);
    }
    public static void bufferedReader() throws IOException {
        long startFiles = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\CoreJavaLearningDemo\\resources\\alice.txt")));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }

        long endFiles = System.nanoTime();
        double time = (endFiles - startFiles)/1000000000.0;
        System.out.println(time);
    }
    public static void channelReader() throws IOException {
        long startFiles = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            FileChannel fileChannel = FileChannel.open(Paths.get("D:\\CoreJavaLearningDemo\\resources\\alice.txt"));
            MappedByteBuffer mbb = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());
            while (mbb.hasRemaining()){
                System.out.println((char)mbb.get());
            }
            mbb.clear();
            fileChannel.close();
        }
        long endFiles = System.nanoTime();
        double time = (endFiles - startFiles)/1000000000.0;
        System.out.println(time);

    }


}
