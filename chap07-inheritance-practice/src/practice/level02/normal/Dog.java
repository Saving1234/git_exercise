package practice.level02.normal;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        /* 설명. super(name) 은 부모 클래스 생성자 Animal(String) 을 호출한다.
         *  super(...) 는 반드시 자식 생성자 첫 줄에 와야 한다.
         * */
        super(name);
        this.breed = breed;
        System.out.println("Dog 생성자 호출 - " + breed);
    }

    @Override
    public void printInfo() {
        System.out.println("이름: " + name + ", 품종: " + breed);
    }
}
