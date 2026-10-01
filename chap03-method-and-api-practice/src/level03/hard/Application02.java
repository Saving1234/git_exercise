package level03.hard;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* Q2. Scanner 의 next() 와 nextLine() 의 차이를 직접 체험해보는 문제입니다.
         *  사용자에게 다음 정보를 차례로 입력 받아 그대로 출력하세요.
         *
         *   ① 정수 한 개 (nextInt 사용)
         *   ② 이름 한 줄 (nextLine 사용. 공백을 포함할 수 있음)
         *   ③ 한 단어로 된 좋아하는 색 (next 사용)
         *
         *  단, nextInt() 다음에 nextLine() 을 호출하면
         *  엔터(개행 문자)가 그대로 남아있어 의도치 않게 빈 문자열이 입력되는 문제가 있습니다.
         *  이 문제를 해결하려면 nextInt() 호출 직후에 sc.nextLine() 을 한 번 더 호출해
         *  남아있는 개행을 비워줘야 합니다.
         *
         * -- 입력 예시 --
         * 나이를 입력하세요 : 25
         * 이름을 입력하세요 : 홍 길동
         * 좋아하는 색을 한 단어로 입력하세요 : 파랑
         *
         * -- 출력 예시 --
         * 나이 : 25
         * 이름 : 홍 길동
         * 좋아하는 색 : 파랑
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();          // ★ 입력 버퍼에 남은 개행 비우기

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("좋아하는 색을 한 단어로 입력하세요 : ");
        String color = sc.next();

        System.out.println("나이 : " + age);
        System.out.println("이름 : " + name);
        System.out.println("좋아하는 색 : " + color);

        /* 설명. Scanner 사용 시 주의 사항
         *  nextInt(), nextDouble(), next() 같은 토큰 단위 메소드는
         *  입력의 숫자/단어만 가져가고 마지막 엔터(\n)는 버퍼에 남겨둔다.
         *  바로 이어서 nextLine() 을 호출하면, 그 \n 이 즉시 읽혀서
         *  빈 문자열이 들어오게 된다.
         *  이를 막기 위해 nextInt() 직후에 sc.nextLine() 을 한 번 더 호출하여
         *  남은 개행을 비워주는 것이 일반적인 패턴이다.
         * */
        sc.close();
    }
}
