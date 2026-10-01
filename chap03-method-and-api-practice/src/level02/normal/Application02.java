package level02.normal;

public class Application02 {

    public static void main(String[] args) {

        /* Q2. Math 클래스의 static 메소드를 활용해 다음 결과를 출력하세요.
         *  단, Math 클래스의 메소드들은 모두 static 이므로 인스턴스 생성 없이 사용할 수 있습니다.
         *
         *   - Math.max(20, 35)
         *   - Math.min(20, 35)
         *   - Math.abs(-17)
         *   - Math.pow(2, 10)   ← 결과는 double 형
         *   - Math.sqrt(81)     ← 결과는 double 형
         *
         * -- 출력 예시 --
         * max(20, 35) : 35
         * min(20, 35) : 20
         * abs(-17) : 17
         * pow(2, 10) : 1024.0
         * sqrt(81) : 9.0
         * */

        System.out.println("max(20, 35) : " + Math.max(20, 35));
        System.out.println("min(20, 35) : " + Math.min(20, 35));
        System.out.println("abs(-17) : " + Math.abs(-17));
        System.out.println("pow(2, 10) : " + Math.pow(2, 10));
        System.out.println("sqrt(81) : " + Math.sqrt(81));

        /* 설명. static 메소드 호출
         *  Math.max(...) 처럼 클래스 이름으로 직접 호출하는 메소드를 static 메소드라 한다.
         *  - 인스턴스를 생성하지 않아도 호출할 수 있다.
         *  - 인스턴스 멤버에는 접근할 수 없다(인스턴스가 없으니 당연하다).
         *  Math 클래스의 모든 유틸리티 메소드는 이런 방식으로 정의되어 있다.
         * */
    }
}
