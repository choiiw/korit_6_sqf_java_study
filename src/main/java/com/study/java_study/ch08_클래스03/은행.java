package com.study.java_study.ch08_클래스03;

public class 은행 {
    private int 잔액;

    public void set잔액(int 금액){
        this.잔액 += 금액;
    }

    public int get잔액(){
        return 잔액;

    }
}
