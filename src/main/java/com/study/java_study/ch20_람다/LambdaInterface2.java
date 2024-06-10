package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("프로그램 시작");
                System.out.println("프로그램 종료");
            }
        };
        runnable.run();

        Function<String, Integer> fx = s -> Integer.parseInt(s);
        Integer num = fx.apply("10");
        System.out.println(num);
        Integer num2 = fx.andThen(result -> result + 100).apply("50");
        System.out.println(num2);

        Consumer<String> transform = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + "님 접속");
            }
        };
        transform.accept("김");

        Supplier<Integer> role = () -> {
            Integer result = num2 + num;
            return result;
        };
        System.out.println(role.get());

        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 4 == 0;
            }
        };
        System.out.println(even.test(num2));
    }
}
