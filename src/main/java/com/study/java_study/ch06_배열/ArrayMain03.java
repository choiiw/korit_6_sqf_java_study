package com.study.java_study.ch06_배열;

public class ArrayMain03 {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30, 40, 50, 60};

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        String[] str = new String[5];
        str[0] = "1";
        str[1] = "2";
        str[2] = "3";
        str[3] = "4";
        str[4] = "5";

        for(int num : nums){
            System.out.println(num);
        }

        for(String s : str){
            System.out.println(s);
        }

        double[] db = new double[3];
        db[0] = 3.1;
        db[1] = 3.2;
        db[2] = 3.3;

        for(double d : db){
            System.out.println(d);
        }

        Computer[] computers = new Computer[3];
        computers[0] = new Computer("i3","8GB");
        computers[1] = new Computer("i5","16GB");
        computers[2] = new Computer("i7","32GB");

        for(Computer computer : computers){
            System.out.println(computer.toString());
        }
    }
}
