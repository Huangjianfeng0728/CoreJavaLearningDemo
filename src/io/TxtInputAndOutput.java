package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TxtInputAndOutput {
    public static void main(String[] args) throws IOException {
        //input();
        output();
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("小明",6000, 1996, 1, 1);
        staff[1] = new Employee("小红",7000, 1997, 2, 1);
        staff[2] = new Employee("小天",8000, 1998, 3, 1);
        saveAsTxt(staff);
        Employee[] employees = readFromTxt();
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    public static void input() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter printWriter = new PrintWriter("D:\\CoreJavaLearningDemo\\resources\\FileInputStream.txt", "UTF-8");
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        printWriter.print(list);
        printWriter.close();
    }
    public static void output() throws IOException {
        //方法一：直接把文本读取为字符串
//        String content = new String(Files.readAllBytes(Paths.get("D:\\CoreJavaLearningDemo\\resources\\alice.txt")), Charset.defaultCharset());
//        System.out.println(content);
        //方法二：文件太大时，处理为流
        Stream<String> lines = Files.lines(Paths.get("D:\\CoreJavaLearningDemo\\resources\\FileInputStream.txt"));
        System.out.println(lines.collect(Collectors.toList()).size());
    }
    public static void saveAsTxt(Employee[] staff) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("D:\\CoreJavaLearningDemo\\resources\\employee.txt");
        for (Employee employee : staff){
            printWriter.println(employee.getName() + "|" + employee.getSalary() + "|" + employee.getYear() + "-" +
                                employee.getMonth() + "-" + employee.getDay());
        }
        printWriter.close();
    }
    public static Employee[] readFromTxt() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("D:\\CoreJavaLearningDemo\\resources\\employee.txt"));
        Employee[] results = new Employee[lines.size()];
        int i = 0;
        for (String string : lines){
            String[] split = string.split("\\||-");
            results[i++] = formEmployeeInfo(split);
        }

        return results;
    }
    private static Employee formEmployeeInfo(String[] split){
        return new Employee(split[0], Integer.valueOf(split[1]), Integer.valueOf(split[2]), Integer.valueOf(split[3]), Integer.valueOf(split[4]));
    }
}
class Employee implements Serializable {
    private String name;
    private int salary;
    private int year;
    private int month;
    private int day;

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
