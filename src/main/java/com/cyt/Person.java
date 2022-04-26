package com.cyt;

public class Person {
    String name;
    float weight;
    float height;
    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    public Person (String name, float weight, float height) {
        this(weight, height);
        // 上面為子建構呼叫子建構方式，並需要在建構子第一行。
        this.name = name;
/*        this.weight = weight;
        this.height = height;*/
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }
}
