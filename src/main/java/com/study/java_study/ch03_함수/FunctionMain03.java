package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();

       fx.fx01(1234, "최성원", 29, "01050183710");

        Student s = new Student();
        s.studentCode = 1234;
        s.name = "최성원";
        s.age = 29;
        s.phone = "01000000000";
        fx.fx02(s);


    }
}
