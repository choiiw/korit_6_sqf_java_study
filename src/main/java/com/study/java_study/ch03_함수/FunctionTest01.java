package com.study.java_study.ch03_함수;

public class FunctionTest01 {

        int fx01_1(){
            return 10;
        }

        int fx01_2(){
            return 20;
        }

        void printResult(){
            FunctionTest02 functionTest02 = new FunctionTest02();

            System.out.println(functionTest02.getAddData(fx01_1(),fx01_2()));  // 02의 정수 값 a,b에 위에서 정한 리턴 값을 대입한다.
        }
}
