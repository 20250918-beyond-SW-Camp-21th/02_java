package com.ohgiraffers.io.note.view;

import com.ohgiraffers.io.note.controller.FileController;

import java.util.Scanner;

public class NoteMenu {

    public void viewMenu() {
        Scanner sc = new Scanner(System.in);
        FileController fc = new FileController(); // 컨트롤러 객체 생성

        while(true) {
            System.out.println("****** MyNote ******");
            System.out.println("1. 노트 새로 만들기");
            System.out.println("2. 노트 열기");
            System.out.println("3. 노트 열어서 수정하기");
            System.out.println("4. 끝내기");
            System.out.print("번호를 입력하세요 : ");
            int num = sc.nextInt();

            switch(num) {
                case 1 : fc.fileSave(); break;
                case 2 : fc.filOpen(); break;
                case 3 : fc.fileEdit(); break;
                case 4 : System.out.println("프로그램을 종료합니다."); return;
                default : System.out.println("잘못 입력하셨습니다."); continue;
            }
        }
    }
}
