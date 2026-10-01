package level02.normal;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        /* Q2. BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중입니다.",
         * 정상체중(20 이상 25 미만)인 경우 "당신은 정상체중입니다.",
         * 과체중(25 이상 30 미만)인 경우 "당신은 과체중입니다.",
         * 비만(30 이상)인 경우 "당신은 비만입니다."를 출력하세요.
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 입니다.
         *
         * -- 입력 예시 --
         * 체중(kg)을 입력하세요: 67
         * 신장(m)을 입력하세요: 1.7
         *
         * -- 출력 예시 --
         * 당신은 정상체중입니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("체중(kg)을 입력하세요: ");
        double weight = sc.nextDouble();

        System.out.print("신장(m)을 입력하세요: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 20) {
            System.out.println("당신은 저체중입니다.");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("당신은 정상체중입니다.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("당신은 과체중입니다.");
        } else {
            System.out.println("당신은 비만입니다.");
        }

        sc.close();
    }
}
