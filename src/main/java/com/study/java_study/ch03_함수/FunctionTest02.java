package com.study.java_study.ch03_함수;

public class FunctionTest02 {

    int getAddData(int a, int b){
        FunctionTest03 functionTest03 =new FunctionTest03();

        return  functionTest03.add(a,b);  // 03의 add라는 함수에 정수값인 a,b를 넣겠다.
    }
}
