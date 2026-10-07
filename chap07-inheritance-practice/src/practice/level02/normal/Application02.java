package practice.level02.normal;

public class Application02 {

    public static void main(String[] args) {

        Shape circle = new Circle(5.0);
        System.out.println("원의 면적: " + circle.calculateArea());

        Shape rectangle = new Rectangle(10.0, 20.0);
        System.out.println("사각형의 면적: " + rectangle.calculateArea());

    }

}
