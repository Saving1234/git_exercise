package level03.hard;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Q1. Scanner 를 이용한 대화형 사칙연산 계산기를 만드세요.
         *  두 정수와 연산 기호(+, -, *, /)를 입력 받아 결과를 출력합니다.
         *  단,
         *   - 0 으로 나누는 경우 "0 으로 나눌 수 없습니다." 를 출력 후 종료
         *   - 위 4가지 외 연산 기호가 입력되면 "지원하지 않는 연산입니다." 를 출력 후 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 12
         * 두 번째 정수 : 4
         * 연산 기호(+, -, *, /) : /
         *
         * -- 출력 예시 --
         * 12 / 4 = 3
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int b = sc.nextInt();

        System.out.print("연산 기호(+, -, *, /) : ");
        char op = sc.next().charAt(0);

        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("0 으로 나눌 수 없습니다.");
            } else {
                System.out.println(a + " / " + b + " = " + (a / b));
            }
        } else {
            System.out.println("지원하지 않는 연산입니다.");
        }

        /* 설명. Scanner.next() vs nextLine()
         *  - next()    : 공백 전까지의 한 단어만 읽어온다. 한 글자 입력에 적합.
         *  - nextLine(): 엔터 전까지 한 줄 전체를 읽어온다. 공백 포함 입력에 적합.
         *  여기서는 한 글자 연산 기호만 받으면 되므로 next().charAt(0) 으로 충분하다.
         * */
        sc.close();
    }
}
