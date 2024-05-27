package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selectedBook = scanner.nextLine();
            String[] newNames = null;
            int findIndex = -1;

            switch (selectedBook) {
                case "1":
                    System.out.println("[도서 등록]");
                    newNames = new String[names.length + 1];
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 도서: ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("수정 할 이름: ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, modifyName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 등록되지 않았습니다.");
                        break;
                    }
                    System.out.print("새로운 도서 이름 : ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 도서 : ");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, removeName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 등록되지 않았습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for (int i = 0; i < newNames.length; i++) {
                        if (i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println("삭제 완료!");
                    break;
                case "4":
                    System.out.println("[도서 찾기]");
                    System.out.print("조회 할 도서: ");
                    String findName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByName(names, findName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 등록되지 않았습니다.");
                        break;
                    }
                    System.out.println(findName + "은(는) 등록된 도서입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    if (names.length == 0) {
                        System.out.println("등록된 도서가 없습니다.");
                        break;
                    }
                    break;
                case "q":
                    isRun = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("다시 입력하세요.");

            }
        }
    }

}
