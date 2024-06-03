package com.study.java_study.연습용;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayMain {
    public static void main(String[] args) {
        /*
         프로그램 시작
         도서명 : 도서 1
         저자명 : 저자 1
         new Book("도서1,저자1")
         BookList에 추가

         도서명 : 도서 2
         저자명 : 저자 2
         new Book("도서1,저자1")
         BookList에 추가

         도서명 : 도서 3
         저자명 : 저자 3
         new Book("도서1,저자1")
         BookList에 추가

         도서 전체 조회
         도서명 >> 도서1 ~ 3
         저자명 >> 저자1 ~ 3

         삭제 할 도서명 : 도서2

         도서 전체 조회
         도서명 >> 도서1, 3
         저자명 >> 저자1. 3
         */
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        // 등록
        for(int i = 0; i < 3; i++){
            String name;
            String author;
            System.out.print("도서명: ");
            name = scanner.nextLine();
            System.out.print("저자명: ");
            author = scanner.nextLine();

            bookList.add(new Book(name,author));
        }

        // 조회
        for(Book book : bookList){
            System.out.println("도서명: " + book.getName());
            System.out.println("저자명: " + book.getAuthor());
            System.out.println();
        }

        System.out.print("삭제할 도서명: ");
        String removeBookName = scanner.nextLine();
//        for(Book book : bookList){
//            if(book.getName().equals(removeBookName)){
//                bookList.remove(book);
//                break;
//            }
//        }
        for(int i =0; i< bookList.size(); i++){
            if(bookList.get(i).getName().equals(removeBookName)){
                Book removeBook = bookList.remove(i);
                System.out.println("삭제할 도서 정보: " + removeBook);
                break;
            }
        }
        for(int i= 0; i< bookList.size(); i++){
            System.out.println("도서명: " + bookList.get(i).getName());
            System.out.println("저자명: " + bookList.get(i).getAuthor());
        }

    }
}
