package level01.basic;

public class Application03 {

    public static void main(String[] args) {

        /* Q3. 1부터 10까지 합계를 구하고 결과를 출력하세요. (반복문 사용)
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);
    }
}
