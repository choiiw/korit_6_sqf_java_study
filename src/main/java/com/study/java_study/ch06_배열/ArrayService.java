package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selectedMenu = scanner.nextLine();

            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    //  newNames = null;  // 안 해도 상관 X
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");

                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("등록 된 이름: ");
                    String reName = scanner.nextLine();
                    for (int i = 0; i < names.length; i++){
                       if(names[i].equals(reName)){
                           System.out.print("수정 할 이름: ");
                           names[i] = scanner.nextLine();
                           System.out.println("수정되었습니다.");
                           break;
                       }
                        System.out.println("등록된 이름이 없습니다.");
                    }
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String delName = scanner.nextLine();
                    for (int i = 0; i < names.length; i++){
                        if(names[i].equals(delName)){
                            names[i] = names[i + 1];

                            System.out.println("삭제가 완료되었습니다.");
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String result = null;
                    String findName = scanner.nextLine();
                    for (String name : names) {                  //
                        if (name.equals(findName)) {
                            result = name;
                            break;
                        }
                    }
                    if (result == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
    }
}
