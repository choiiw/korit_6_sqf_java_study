package com.study.java_study.ch10_추상화;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();    // Animal 객체 생성자 호출    기본적으로 생략되어있음;
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name,int age, String breed) {
        super(name,age);
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }


    public void bark(){
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
