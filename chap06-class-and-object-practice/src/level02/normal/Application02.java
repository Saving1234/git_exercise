package level02.normal;

public class Application02 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println("3 + 5 = " + calc.add(3, 5));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));

    }
}
