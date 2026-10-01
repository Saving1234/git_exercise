package level04.advanced;

import java.util.Scanner;

public class Application05 {

    public static void main(String[] args) {

        /* Q5. 사용자가 정수를 입력하여 높이를 지정하면 해당 높이의 피라미드를 별(*)로 출력하세요.
         *
         * -- 입력 예시 --
         * 높이를 입력하세요: 4
         *
         * -- 출력 예시 --
         *    *
         *   ***
         *  *****
         * *******
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("피라미드 높이를 입력하세요: ");
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {

            // 공백 출력
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
