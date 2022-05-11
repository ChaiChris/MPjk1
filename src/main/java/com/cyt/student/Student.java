package com.cyt.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
/*        int max = (english > math) ? english : math;
        return max;*/
/*        if (english > math) {
            max = english;
        } else {
            max = math;
        }*/
        return (english > math) ? english : math;
    }

    public void print() {
        System.out.println(name + "\t英文分數" + english + "\t數學分數" +math +
                "\t平均" + (english+math)/2);
    }
}
