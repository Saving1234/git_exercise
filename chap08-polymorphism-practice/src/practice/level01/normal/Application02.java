package practice.level01.normal;

public class Application02 {

    public static void main(String[] args) {

        Payment[] payments = new Payment[2];
        payments[0] = new CreditCard();
        payments[1] = new Cash();

        for (Payment payment : payments) {
            payment.pay();
        }

    }

}
