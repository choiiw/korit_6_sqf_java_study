package com.study.java_study.ch10_추상화;

public class Animal {
    private String name;
    private int age;


    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name,int age) {
        this.age = age;
        this.name = name;
    }

    public void move(){
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return " Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
