package level04.advanced;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        /* Q4. 2 이상의 정수를 입력받아 해당 숫자까지의 소수를 모두 출력하고, 소수의 개수를 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요: 10
         *
         * -- 출력 예시 --
         * 소수: 2, 3, 5, 7
         * 소수의 개수: 4개
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("2 이상의 정수를 입력해주세요.");
            sc.close();
            return;
        }

        int sum = 0;

        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();

        System.out.println("1부터 " + number + "까지 소수의 합: " + sum);

        sc.close();
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
