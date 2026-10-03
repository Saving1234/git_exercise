package level02.normal;

public class Application01 {

    public static void main(String[] args) {

        Account account = new Account("123-456");
        account.deposit(5000);
        System.out.println("계좌번호: " + account.getAccountNumber());
        System.out.println("잔액: " + account.getBalance());

    }
}
