package level03.hard;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        /* Q4. 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별하고 결과를 출력하세요.
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 출력 후 정수를 다시 입력.
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다." 출력.
         *
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         * */

        Scanner sc = new Scanner(System.in);

        boolean isPrime = false;

        while (true) {
            System.out.print("2보다 큰 정수를 하나 입력하세요: ");
            int number = sc.nextInt();

            if (number <= 2) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
            }

            isPrime = true; // 초기값을 소수(true)로 가정
            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    isPrime = false; // 나누어떨어지면 소수가 아님
                    break;
                }
            }

            if (isPrime) {
                System.out.println("소수다.");
            } else {
                System.out.println("소수가 아니다.");
            }
            break; // 정상적인 입력 시 루프 종료
        }

        sc.close();
    }
}
