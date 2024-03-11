import java.util.ArrayList;
import java.util.Scanner;
public class JavatextExam {

    public static void main(String[] args) {

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
                    System.out.printf("제목 : %s\n", title);
                    System.out.println("=====");

                    String body = bodyList.get(i);
                    System.out.printf("내용 : %s\n", body);
                    System.out.println("=====");
                }
            }
        }
    }
}
