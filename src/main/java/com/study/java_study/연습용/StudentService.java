package com.study.java_study.연습용;

import java.util.Scanner;

public class StudentService {
    private Scanner scanner;
    private StudentRepository studentRepository;

    public StudentService(){
        scanner = new Scanner(System.in);
        studentRepository = new StudentRepository();
    }

    private String selectMenu() {
        String menu = "1234q";
        String selectedMenu = null;

        while (true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();
            if (menu.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다.");
        }
        return selectedMenu;
    }

    public boolean isRun() {
        boolean isRun = true;

        System.out.println("[학생 관리 프로그램]");
        System.out.println("1. 학생 등록");
        System.out.println("2. 학생 정보 검색");
        System.out.println("3. 학생 정보 수정");
        System.out.println("4. 학생 정보 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();
        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                System.out.println("[학생 등록]");
            case "2":
            case "3":
            case "4":
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }
    //  학생등록    (중복 검사(이름), 공백 여부)
    private void registerStudent(){
        System.out.println("[학생 등록]");

    }


}
