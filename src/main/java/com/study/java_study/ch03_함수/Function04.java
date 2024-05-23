package com.study.java_study.ch03_함수;

public class Function04 {

    void add(int a, int b){
        System.out.println(a + b);
    }

    void add(int a, int b , int c){
        System.out.println(a + b + c);
    }


    void  add(int a, String b){
        int c = Integer.parseInt(b);        //오버로딩  동일한 함수를 호출 할 때 어떤 자료형을 가진 변수를 호출할지
        System.out.println(a + c);                  // 매개변수 개수가 다르거나 자료형이 다르거나 순서가 다르거나
    }
                                            // 리턴이 있으면 오버로딩 사용 불가 ,
}
