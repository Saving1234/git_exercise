package level03.hard;

public class Application02 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) {
            System.out.println("두 객체는 같은 인스턴스입니다.");
        } else {
            System.out.println("두 객체는 다른 인스턴스입니다.");
        }

    }
}
