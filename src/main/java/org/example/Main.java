package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 반복 횟수 정할 수 없음 => 무한 반복 구조

        // 변수에는 하나의 값만 저장 가능하므로 여러개의 게시물을 저장하려면 ArrayList를 사용한다.
        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> bodyList = new ArrayList<>();
        ArrayList<Integer> updateList = new ArrayList<>();

//        String title = ""; // 딱히 처음에 값이 필요 없음 추후에 입력을 통해 넣을 것임.
//        String body = "";

        while (true) { // 반복 조건이 true이기 때문에 무한 반복
            System.out.print("명령어 : ");
            String cmd = scan.nextLine();

            if (cmd.equals("exit")) { // 숫자가 아닌 경우 같다라는 표현을 할 때 == 이 아닌 .equals()를 사용해야 한다
                System.out.println("프로그램을 종료합니다.");
                break; // 반복문 탈출

            } else if (cmd.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요");
                String title = scan.nextLine();
                titleList.add(title); // titleList 배열에 title을 추가

                System.out.println("게시물 내용을 입력해주세요");
                String body = scan.nextLine();
                bodyList.add(body); //

                System.out.println("게시물이 등록되었습니다.");

            } else if (cmd.equals("list")) {
                System.out.println("==========");
                for (int i = 0; i < titleList.size(); i++) {
                    String title = titleList.get(i);
                    System.out.printf("제목 : %s\n", title);
                    System.out.println("========");

                    String body = bodyList.get(i);
                    System.out.printf("내용 : %s\n", body);
                    System.out.println("=======");
                }
            } //else if (cmd.equals("update")) {
//                System.out.println("수정할 게시물 번호 : ");
//                for (int i = 0; i < updateList.size(); i++) {
//                    System.out.println("없는 게시물 번호입니다.");
//                }
//            }
        }

        // 1. 반복문 제어 하던 방법 : 반복 횟수 세서 특정 횟수 지나면 탈출
        // 2. break문을 사용하여 강제 탈출 가능

//        for(int i = 1; i <= 10; i++) {
//
//            if(i == 5) {
//                break; // i가 5일 때 반복문 탈출
//            }
//            System.out.println(i);
//
    }
}