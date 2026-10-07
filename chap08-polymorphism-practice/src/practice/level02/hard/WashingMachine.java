package practice.level02.hard;


public class WashingMachine implements Appliance {

    /*
     * 클래스명: WashingMachine (구현 클래스)
     * 메소드: 작동하다(operate) - "세탁기가 작동합니다." 출력 (인터페이스 메소드 구현)
     *
    *
    * */
    @Override
    public void operate() {
        System.out.println("세탁기가 작동합니다.");
    }
}
