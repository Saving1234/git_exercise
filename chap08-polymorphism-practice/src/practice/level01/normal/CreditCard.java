package practice.level01.normal;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("신용카드로 결제합니다.");
    }
}
