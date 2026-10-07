package practice.level02.normal;

public class Animal {

    /* 설명. 자식 클래스에서 직접 접근할 수 있도록 protected 로 선언했다. */
    protected String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal 생성자 호출 - " + name);
    }

    public void printInfo() {
        System.out.println("이름: " + name);
    }
}
