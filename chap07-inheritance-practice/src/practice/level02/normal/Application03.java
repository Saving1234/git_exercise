package practice.level02.normal;

public class Application03 {

    public static void main(String[] args) {

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
         *    - 메소드 : void printInfo()
         *
         *   클래스명: Dog (자식 클래스, Animal 을 상속)
         *    - 필드 : String breed
         *    - 매개변수 있는 생성자: Dog(String name, String breed) — super(name) 호출
         *    - 메소드 오버라이딩: printInfo()
         *
         *  메인 로직:
         *   - new Dog("바둑이", "진돗개") 를 만들고 printInfo() 호출
         *
         * -- 출력 예시 --
         * Animal 생성자 호출 - 바둑이
         * Dog 생성자 호출 - 진돗개
         * 이름: 바둑이, 품종: 진돗개
         * */

        Dog dog = new Dog("바둑이", "진돗개");
        dog.printInfo();

        /* 설명. super 와 super()
         *  - super.   : 부모 클래스의 멤버(필드/메소드)에 접근할 때 사용한다.
         *  - super(...) : 부모 클래스의 생성자를 호출한다. 자식 생성자의 첫 줄에 와야 한다.
         *  자식 객체를 만들 때, 사실은 부모 → 자식 순서로 두 생성자가 모두 호출된다.
         *  super(...) 를 명시적으로 적지 않으면, 컴파일러가 자동으로 super() 를 첫 줄에 삽입한다.
         *  부모에 매개변수 없는 기본 생성자가 없는데 자동 super() 만 있으면 컴파일 에러가 발생한다.
         * */
    }
}
