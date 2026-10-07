package practice.level02.hard;

public class Refrigerator implements Appliance {
    /*
     * 클래스명: Refrigerator (구현 클래스)
     * 메소드: 작동하다(operate) - "냉장고가 작동합니다." 출력 (인터페이스 메소드 구현)
     *
    * */

    @Override
    public void operate() {
        System.out.println("냉장고가 작동합니다.");
    }
}
