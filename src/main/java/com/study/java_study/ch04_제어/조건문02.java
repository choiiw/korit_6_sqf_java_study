package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {

        String text = new String("");
        String name = "가";   // 값의 자료형 String
        String phone = "00000000";  // 값의 자료형 null

        StringUtils stringUtils = new StringUtils();

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비었습니다.");
            return;  // 함수의 리턴 자료형이 void 일때 사용, 함수의 끝을 의미;
        }
        if (stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비었습니다.");
            return;
        }
        if (stringUtils.isEmpty(text)) {
            System.out.println("text가 비었습니다.");
            return;
        }

    }
}
