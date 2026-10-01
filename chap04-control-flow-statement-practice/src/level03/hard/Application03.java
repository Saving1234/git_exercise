package level03.hard;

import java.util.Scanner;

public class Application03 {

    public static void main(String[] args) {

        /* Q3. 1부터 100 사이의 난수를 발생시키고, 정수를 입력 받아 난수를 맞추는 프로그램을 작성하세요.
         * 입력한 정수보다 난수가 크면 "입력하신 정수보다 큽니다." 출력,
         * 입력한 정수보다 난수가 작으면 "입력하신 정수보다 작습니다." 출력.
         * 정답을 맞추는 경우 "정답입니다. X회 만에 정답을 맞추셨습니다."를 출력하고 프로그램 종료.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * 정답입니다. 3회 만에 정답을 맞추셨습니다.
         * */

        Scanner sc = new Scanner(System.in);

        int random = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        boolean correct = false;

        while (!correct) {

            System.out.print("정수를 입력하세요: ");

            int input = sc.nextInt();
            attempts++;

            if (input > random) {
                System.out.println("입력하신 정수보다 작습니다.");
            } else if (input < random) {
                System.out.println("입력하신 정수보다 큽니다.");
            } else {
                System.out.println("정답입니다. " + attempts + "회 만에 정답을 맞추셨습니다.");
                correct = true;
            }
        }

        sc.close();
    }
}
