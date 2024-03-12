package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class BoardApp {
    public void run() {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> titleList = new ArrayList<>();
        ArrayList<String> bodyList = new ArrayList<>();

        while(true) {
            System.out.printf("명령어 : ");
            String cmd = scan.nextLine();

            if(cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if(cmd.equals("add")) {
                System.out.println("게시물 제목을 입력해주세요");
                String title = scan.nextLine();
                titleList.add(title);

                System.out.println("게시물 내용을 입력해주세요");
                String body = scan.nextLine();
                bodyList.add(body);

                System.out.println("게시물이 등록되었습니다");

            } else if(cmd.equals("list")) {
                System.out.println("=====");
                for(int i = 0; i < titleList.size(); i++) {
                    String title = titleList.get(i);
                    System.out.println("번호 : " + (i + 1));
                    System.out.printf("제목 : %s\n", title);
                    System.out.println("=====");

                }
            } else if (cmd.equals("update")) {
                System.out.println("수정할 게시물 번호를 입력해주세요 : ");
                int id = Integer.parseInt(scan.nextLine()); // 1 -> index : 0
                // 2 -> index : 1

                System.out.printf("새로운 제목을 입력해주세요 : ");
                String newTitle = scan.nextLine();

                System.out.printf("새로운 내용을 입력해주세요 : ");
                String newBody = scan.nextLine();

                // 인덱스로 찾아서 수정
                titleList.set(id - 1, newTitle);
                titleList.set(id - 1, newBody);

                System.out.printf("%d번 게시물이 수정되었습니다.\n", id);
            }
        }
    }
}
