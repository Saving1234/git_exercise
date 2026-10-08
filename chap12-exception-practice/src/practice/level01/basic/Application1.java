package practice.level01.basic;
import java.util.Scanner;
public class Application1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수 입력 :");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("두번째 정수 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine();



        try{

            if(num/num2 == num2){
                System.out.println("나누기 결과 : " + num2);
            }

        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }


}
