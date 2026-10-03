package level01.basic;

public class Application01 {

    public static void main(String[] args) {

        Person person = new Person("홍길동", 20);
        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);

    }

}