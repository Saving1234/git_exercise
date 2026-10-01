package level03.hard;

import java.util.Scanner;

public class Application05 {

    public static void main(String[] args) {

        /* Q5. 문자열과 검색할 문자를 입력 받아, 해당 문자열에서 검색할 문자가 몇 개 포함되어 있는지를 출력하세요.
         * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 종료.
         * 대소문자를 구분하여 검색.
         *
         * -- 입력 예시 --
         * 문자열 입력 : apple
         * 문자 입력 : p
         *
         * -- 출력 예시 --
         * 포함된 갯수 : 2개
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String input = sc.nextLine();

        // 영문자 확인 방법 #1 : 기존 ASCII 코드 활용
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                sc.close();

                return;
            }
        }

        // 영문자 확인 방법 #2 : 정규 표현식(Regular Expression) 활용
        // 나중에 배울 예정이지만, 미리 검색해서 공부해보면 도움이 된다.(비밀번호 복잡하게 만들 때 자주 사용됨)
//        if (!input.matches("[a-zA-Z]+")) {
//            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
//            sc.close();
//            return;
//        }

        System.out.print("문자 입력: ");
        char searchChar = sc.nextLine().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == searchChar) {
                count++;
            }
        }

        System.out.println("포함된 갯수: " + count + "개");

        sc.close();
    }
}
