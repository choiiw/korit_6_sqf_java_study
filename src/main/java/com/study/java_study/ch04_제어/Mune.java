package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class Mune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        System.out.println("프로그램 시작");
        while (isRun){
            System.out.println("[메뉴 선택]");
            System.out.println("1. coffee");
            System.out.println("2. tea");
            System.out.println("3. dessert");
            System.out.println("4. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();
            switch (selectedMenu){
                case "1":
                    System.out.println("[coffee]");

                    boolean coffeeMenu = true;
                    while (coffeeMenu){
                        System.out.println("1. 아메리카노");
                        System.out.println("2. 카페라때");
                        System.out.println("3. 뒤로가기");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu){
                            case "1":
                                System.out.println("아메리카노를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "2":
                                System.out.println("카페라때를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "3":
                                System.out.println("상위 메뉴로 이동합니다.");
                                coffeeMenu = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                coffeeMenu = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.println("[tea]");

                    boolean teaMenu = true;
                    while (teaMenu) {
                        System.out.println("1. 자몽티");
                        System.out.println("2. 복숭아 아이스티");
                        System.out.println("3. 뒤로가기");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("자몽티를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "2":
                                System.out.println("복숭아 아이스티를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "3":
                                System.out.println("상위 메뉴로 이동합니다.");
                                teaMenu = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                teaMenu = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("[dessert]");

                    boolean dessertMenu = true;
                    while (dessertMenu) {
                        System.out.println("1. 케이크");
                        System.out.println("2. 마카롱");
                        System.out.println("3. 뒤로가기");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("케이크를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "2":
                                System.out.println("마카롱를 선택하셨습니다. 추가로 주문 하시겠습니까?");
                                break;
                            case "3":
                                System.out.println("상위 메뉴로 이동합니다.");
                                dessertMenu = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                dessertMenu = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다.");
                        }
                        System.out.println();
                    }
                    break;
                case "4":
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }

        System.out.println("프로그램 종료");
    }
}
