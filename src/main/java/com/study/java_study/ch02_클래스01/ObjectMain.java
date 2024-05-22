package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10; //
        ObjectA objectA1 = new ObjectA(); // 새로 자료형 데이터를 만든다. 자료형에 맞게 데이터 할당 , 100번
        ObjectA objectA2 = new ObjectA(); // 200번  할때마다 데이터 할당

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);
        System.out.println(objectA1.name); // String 은 클래스임. 데이터 값뿐 아니라 함수도 포함 가능

    }

}
