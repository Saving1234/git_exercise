package level04.advanced;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* Q2. 받은 금액과 상품 가격을 입력받아 거스름돈을 대한민국 화폐 단위별로 계산하고 출력하세요.
         * 단, 지폐와 동전을 구분하여 단위를 표기하고, 부족한 금액은 에러 메시지를 출력하세요.
         *
         * -- 입력 예시 --
         * 받으신 금액을 입력하세요 : 100000
         * 상품 가격을 입력하세요 : 22340
         *
         * -- 출력 예시 --
         * ============================
         * 50000원권 지폐 1장
         * 10000원권 지폐 2장
         * 5000원권 지폐 1장
         * 1000원권 지폐 2장
         * 500원권 동전 1개
         * 100원권 동전 1개
         * 50원권 동전 1개
         * 10원권 동전 1개
         * ============================
         * 거스름돈 : 77660원
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("받으신 금액을 입력하세요: ");
        int money = sc.nextInt();

        System.out.print("상품 가격을 입력하세요: ");
        int price = sc.nextInt();

        if (money < price) {
            System.out.println("받으신 금액이 상품 가격보다 적습니다.");
            sc.close();
            return;
        }

        int change = money - price; // 거스름돈 계산

        // 각 화폐 단위별로 처리
        int fiftyThousand = change / 50000;
        change %= 50000;

        int tenThousand = change / 10000;
        change %= 10000;

        int fiveThousand = change / 5000;
        change %= 5000;

        int oneThousand = change / 1000;
        change %= 1000;

        int fiveHundred = change / 500;
        change %= 500;

        int oneHundred = change / 100;
        change %= 100;

        int fifty = change / 50;
        change %= 50;

        int ten = change / 10;
        change %= 10;

        // 출력
        System.out.println("============================");
        if (fiftyThousand > 0) System.out.println("50000원권 지폐 " + fiftyThousand + "장");
        if (tenThousand > 0) System.out.println("10000원권 지폐 " + tenThousand + "장");
        if (fiveThousand > 0) System.out.println("5000원권 지폐 " + fiveThousand + "장");
        if (oneThousand > 0) System.out.println("1000원권 지폐 " + oneThousand + "장");
        if (fiveHundred > 0) System.out.println("500원권 동전 " + fiveHundred + "개");
        if (oneHundred > 0) System.out.println("100원권 동전 " + oneHundred + "개");
        if (fifty > 0) System.out.println("50원권 동전 " + fifty + "개");
        if (ten > 0) System.out.println("10원권 동전 " + ten + "개");
        System.out.println("============================");
        System.out.println("거스름돈 = " + (money - price) + "원");

        sc.close();
    }
}
