package com.study.java_study.ch10_추상화;

public class Tiger extends Animal {
    private int power;

    public Tiger() {
        super();    // Animal 객체 생성자 호출    기본적으로 생략되어있음;
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name,int age, int power) {
        super(name,age);
        this.power = power;
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥합니다.");
    }


    // 재정의 -> 상속관계에서만 가능
    @Override  //@ <- 어노테이션 (없어도 동작함) 재정의 한 것을 표시하기 위함 , 업캐스팅을 해도 재정의 된 것이 실행됨.
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }


    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                '}' + super.toString();
    }

}
