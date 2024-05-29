package com.study.java_study.ch10_추상화;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("1",1,"77");
        Animal tiger = new Tiger("1",1,1);


        dog.move();
        tiger.move();
        ((Tiger) tiger).hunt();
        dog.bark();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 10,"말티즈");
        animals[2] = new Tiger("옹이",5,100);

        for(Animal animal : animals){
            animal.move();
        }

        System.out.println();

        for(Animal animal : animals){
            if (animal instanceof Tiger){
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
        System.out.println();

        for(Animal animal : animals){
            String s = "test";
            int a = 10;
            System.out.println();

            if (animal.getClass() == Tiger.class){
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }
    }
}
