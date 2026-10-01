package level01.basic;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args) {

        /* Q1. 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }

        /* 설명. sc.close()에 대하여:
         *  지금까지는 Scanner 객체 사용 시 close() 메서드를 사용한 적이 없다.
         *  사실 Scanner 객체는 내부적으로 입력 스트림(ex: System.in)을 사용하는데,
         *  Scanner 객체를 사용한 후 필요 없어지면 이 입력 스트림을 닫아 리소스 누스를 방지하고
         *  자원을 효율적으로 관리할 수 있다.
         *  만약 닫지 않는다면 시스템 자원이 계속 점유되어 성능 저하나 충돌 문제를 발생시킨 수 있다.
         *  Java 7 버전 이상부터는 try-with-resources를 사용해 자동으로 닫는 방식이 권장되는데 이는 뒤에서 배울 예정이다.
         * */
        sc.close();     // 안 써도 크게 지장은 없으나 위의 설명을 한 번 읽어보는 것을 추천한다.
    }
}
