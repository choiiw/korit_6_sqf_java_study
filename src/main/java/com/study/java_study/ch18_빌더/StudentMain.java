package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {

        Student student = Student.builder()
                .studentCode(1)
                .name("kwe")
                .age(20)
                .build();

        Student student2 = Student.builder()
                .studentCode(2)
                .name("kwr")
                .age(21)
                .build();
    }
}

