package level02.normal;

public class Application01 {

    public static void main(String[] args) {

        /* Q1. 다음 조건을 만족하는 RandomMaker 클래스와 Application01 을 작성하세요.
         *  Math 클래스의 random() 메소드를 활용하여 난수를 만들고 반환하는 메소드를 정의해 봅니다.
         *
         *  RandomMaker 클래스
         *   - generate() : int                          — 1 ~ 100 사이의 정수 난수를 반환
         *   - generateInRange(int min, int max) : int   — min ~ max 사이의 정수 난수를 반환
         *
         *  Application01 클래스
         *   - main 에서 RandomMaker 인스턴스를 생성한 뒤,
         *     ① 1~100 난수 1개를 출력 (generate() 호출)
         *     ② 50~60 난수 1개를 출력 (generateInRange(50, 60) 호출)
         *
         * -- 출력 예시 -- (난수이므로 실행마다 결과가 다름)
         * 1 ~ 100 난수 : 73
         * 50 ~ 60 난수 : 54
         * */

        RandomMaker maker = new RandomMaker();

        System.out.println("1 ~ 100 난수 : " + maker.generate());
        System.out.println("50 ~ 60 난수 : " + maker.generateInRange(50, 60));

        /* 설명. 난수 발생 계산식
         *  Math.random() 은 [0.0, 1.0) 범위의 double 을 반환한다.
         *  → ① 원하는 폭만큼 곱한다: Math.random() * (max - min + 1)
         *  → ② 정수로 자른다: (int) ...
         *  → ③ 시작 값 만큼 더한다: + min
         *  이렇게 하면 [min, max] 사이의 정수 난수를 만들 수 있다.
         * */
    }
}
