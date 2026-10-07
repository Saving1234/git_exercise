package practice.level01.basic;

public class Application01 {

    public static void main(String[] args) {

        Person person = new Person("홍길동", 20);
        person.selfIntroduction();

        Student student = new Student("이학생", 22, 12345);
        student.selfIntroduction();
        student.study();

    }

}
