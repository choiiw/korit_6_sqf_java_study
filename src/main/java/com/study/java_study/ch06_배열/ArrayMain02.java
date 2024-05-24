package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {

        String a = "김";
        String b = new String("김");

        System.out.println(a == "김");
        System.out.println(b == "김");

        String[] names = new String[2];
        names[0] = "김";
        names[1] = new String("김");

        String[] name2 = /* new String[] (생략 가능)*/ {"김", new String("김")};

        System.out.println(names[0] == name2[0]);
        System.out.println(names[1] == name2[1]);

        System.out.println(names == name2);

        System.out.println(new String[2]);
        System.out.println(new String[] {"a","b"});


    }

}
//  배열에 들어가는 값의 중복을 허용한다.
//  0 부터 시작
//  배열의 공간, 크기는 늘리거나 줄일 수 없다.