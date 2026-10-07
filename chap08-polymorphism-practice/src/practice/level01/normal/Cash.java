package practice.level01.normal;

public class Cash implements Payment {

    @Override
    public void pay() {
        System.out.println("현금으로 결제합니다.");
    }
}
