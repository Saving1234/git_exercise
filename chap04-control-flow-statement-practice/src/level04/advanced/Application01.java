package level04.advanced;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Q1. 국어, 영어, 수학 점수를 입력받아 평균 점수가 60점 이상이면서 각 과목이 40점 이상이면 "합격입니다!"를 출력하세요.
         * 단, 평균 점수 미달인 경우 "평균 점수 미달로 불합격입니다."를 출력,
         * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격입니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 국어 점수를 입력하세요 : 60
         * 영어 점수를 입력하세요 : 30
         * 수학 점수를 입력하세요 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 영어 점수 미달로 불합격입니다.
         * 수학 점수 미달로 불합격입니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요: ");
        int korean = sc.nextInt();

        System.out.print("영어 점수를 입력하세요: ");
        int english = sc.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int math = sc.nextInt();

        double average = (korean + english + math) / 3.0;

        boolean isFail = false;

        if (average < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
            isFail = true;
        }
        if (korean < 40) {
            System.out.println("국어 점수 미달로 불합격입니다.");
            isFail = true;
        }
        if (english < 40) {
            System.out.println("영어 점수 미달로 불합격입니다.");
            isFail = true;
        }
        if (math < 40) {
            System.out.println("수학 점수 미달로 불합격입니다.");
            isFail = true;
        }

        if (!isFail) {
            System.out.println("축하합니다! 합격입니다!");
        }

        sc.close();
    }
}
