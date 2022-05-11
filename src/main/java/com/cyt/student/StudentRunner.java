package com.cyt.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name: ");
        String name = scanner.next();
        System.out.println("Please enter the English grades: ");
        int english = scanner.nextInt();
        System.out.println("Please enter the Math grades: ");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("high score: " + stu.highest());
    }
}
