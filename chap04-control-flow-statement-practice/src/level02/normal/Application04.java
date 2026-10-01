package level02.normal;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {

        /* Q4. 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number = sc.nextInt();

        String result = ""; // String으로 결과를 저장

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result += "박"; // 짝수인 경우 "박" 추가
            } else {
                result += "수"; // 홀수인 경우 "수" 추가
            }
        }

        System.out.println(result); // 최종 결과 출력

        sc.close();
    }
}
