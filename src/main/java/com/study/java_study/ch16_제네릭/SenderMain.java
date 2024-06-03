package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {
         // 일반 자료형은 못쓰고 객체만 가능

        // [ wrapper 자료형 ]
        // Integer                  int
        // Boolean    --(언박싱)-->  boolean
        // Character  <--(박싱)---   char
        // Double                   double
        // Long                     long
        // Float                    float
        // 제네릭을 사용할 때 이 자료형들 사용


        Integer num = new Integer(10);    // 박싱
        int num2 = num.intValue();        // 언박싱

        Integer num3 = 20;   // 자동 박싱
        int num4 = num3;     // 자동 언박싱

        Sender<Integer, String , Double> sender = new Sender<>(3, "2", 3.41);

        System.out.println(sender);
    }
}
