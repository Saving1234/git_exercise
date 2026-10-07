package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 부모 클래스의 필드와 메소드를 자식 클래스에서 활용할 수 있다.
         *
         * 클래스명: Employee (부모 클래스)
         * 필드: 이름(name, 문자열), 연봉(salary, 정수)
         * 메소드: 정보 출력(printInfo) - 이름과 연봉을 출력
         *
         * 클래스명: Manager (자식 클래스)
         * 필드: 부서(department, 문자열)
         * 메소드: 정보 출력(printInfo) - 이름, 연봉, 부서를 출력 (메소드 오버라이딩)
         *
         * Employee 객체와 Manager 객체를 생성하고, 각각의 정보 출력 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 이름: 김직원, 연봉: 5000
         * 이름: 박매니저, 연봉: 7000, 부서: 인사부
         * */

        /* Q2. 다음 조건에 맞는 클래스 구조를 작성하고, 객체를 생성하여 메소드를 호출하세요.
         *
         * 복습 포인트:
         * - 상속의 개념을 이해하고 설명할 수 있다.
         * - 추상 클래스와 추상 메소드의 개념을 이해하고 적용할 수 있다.
         *
         * 클래스명: Shape (추상 클래스)
         * 추상 메소드: 면적 계산(calculateArea)
         *
         * 클래스명: Circle (자식 클래스)
         * 필드: 반지름(radius, 실수)
         * 메소드: 면적 계산(calculateArea) - 원의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * 클래스명: Rectangle (자식 클래스)
         * 필드: 가로(width, 실수), 세로(height, 실수)
         * 메소드: 면적 계산(calculateArea) - 사각형의 면적을 계산하여 반환 (메소드 오버라이딩)
         *
         * Circle 객체와 Rectangle 객체를 생성하고, 각각의 면적 계산 메소드를 호출하여 결과를 출력
         *
         * 출력 예시:
         * 원의 면적: 78.54
         * 사각형의 면적: 200.0
         * */

        /* Q3. super() 를 통한 부모 생성자 호출을 직접 구현해 보세요.
         *
         *  복습 포인트:
         *  - super 와 super() 를 이해하고 사용할 수 있다.
         *  - 자식 클래스 생성자에서 부모 생성자를 호출하는 흐름을 이해할 수 있다.
         *
         *  요구사항:
         *   클래스명: Animal (부모 클래스)
         *    - 필드 : String name
         *    - 매개변수 있는 생성자: Animal(String name)
         *       · this.name = name 으로 초기화
         *       · 생성자 안에서 "Animal 생성자 호출 - " + name 을 출력
         *    - 메소드 : void printInfo() — "이름: " + name 을 출력
         *
         *   클래스명: Dog (자식 클래스, Animal 을 상속)
         *    - 필드 : String breed
         *    - 매개변수 있는 생성자: Dog(String name, String breed)
         *       · super(name) 으로 부모 생성자에 name 전달
         *       · this.breed = breed 로 자기 필드 초기화
         *       · 생성자 안에서 "Dog 생성자 호출 - " + breed 를 출력
         *    - 메소드 오버라이딩: printInfo() — "이름: " + name + ", 품종: " + breed 출력
         *       (※ 부모의 name 은 protected 또는 getter 를 통해 접근하도록 작성하세요.)
         *
         *  메인 로직:
         *   - new Dog("바둑이", "진돗개") 를 만들고 printInfo() 호출
         *
         * -- 출력 예시 --
         * Animal 생성자 호출 - 바둑이
         * Dog 생성자 호출 - 진돗개
         * 이름: 바둑이, 품종: 진돗개
         * */
    }

}
