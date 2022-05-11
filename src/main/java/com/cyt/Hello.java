package com.cyt;

public class Hello {
    public static void main(String[] args) {
    //    System.out.println("Hello Wrold");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        Person p = new Person("Chris", 74.3f, 1.7f);
/*    p.weight = 74.3f;
    p.height = 1.7f;*/
        System.out.println(p.bmi());

/*    int age = 21;
    char c = '我';
    byte b = 120;
    float weight = 70.3f;
    float height = 1.7f;
    boolean adult = true;
    boolean enroll = false;
    String name = "Chris";*/

    }
}

