package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("D:\\CoreJavaLearningDemo\\resources\\FileInputStream.txt"));
        System.out.println(scanner.nextLine());
        Scanner sc = new Scanner(System.in);
        sc.next();
    }
}
