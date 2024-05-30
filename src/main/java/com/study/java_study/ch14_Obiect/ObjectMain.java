package com.study.java_study.ch14_Obiect;

/*
    Object 클래스 (최상위 클래스)
 */

import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
       Object object = new Object();
       Student student = new Student("rwd", 33);
       Student student2 = new Student("rwd", 33);

       Object[] objects = new Object[3];
        // object 는 최상위 클래스라 업캐스팅이 가능하다
       objects[0] = new Object();
       objects[1] = "test";
       objects[2] = new Student("rwd",33);

        System.out.println(student);
        String str = new String("데이터");
        System.out.println(str.toString());

        String studentData = student.toString();

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("asd"));
        System.out.println(Objects.hash("asd"));
    }
}
