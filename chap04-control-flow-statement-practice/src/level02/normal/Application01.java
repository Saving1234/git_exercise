package level02.normal;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Q1. 1~10 사이의 정수 한 개를 입력받아 홀수인지 짝수인지 확인하고,
         * 홀수이면 "홀수다.", 짝수이면 "짝수다."라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        } else if (number % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }

        sc.close();
    }
}
