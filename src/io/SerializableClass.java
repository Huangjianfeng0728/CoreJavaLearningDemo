package io;

import java.io.*;

public class SerializableClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("小明", 6000, 1996, 1, 1);
        Manager manager = new Manager("小红", 12000, 1980, 1, 1, employee);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\\\CoreJavaLearningDemo\\\\resources\\\\Serializable.txt"));
        objectOutputStream.writeObject(employee);
        objectOutputStream.writeObject(manager);
        objectOutputStream.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\\\CoreJavaLearningDemo\\\\resources\\\\Serializable.txt"));
        Object o1 = objectInputStream.readObject();
        Object o2 = objectInputStream.readObject();
        System.out.println(o1);
        System.out.println(o2);
    }
}
class Manager implements Serializable {
    private String name;
    private int salary;
    private int year;
    private int month;
    private int day;
    private Employee secretary;

    public Manager(String name, int salary, int year, int month, int day, Employee secretary) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
        this.secretary = secretary;
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

    public Employee getSecretary() {
        return secretary;
    }

    public void setSecretary(Employee secretary) {
        this.secretary = secretary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", secretary=" + secretary +
                '}';
    }
}