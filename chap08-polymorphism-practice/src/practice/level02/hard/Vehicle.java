package practice.level02.hard;

/*
 * 클래스명: Vehicle (부모 클래스)
 * 필드: 최대 속도(maxSpeed, 정수)
 * 메소드: 이동(move) - "차량이 이동합니다." 출력
* */
public class Vehicle {

    private int maxSpeed;

    // 매개변수있는 생성자가 없음

    // 기본생성자를 컴파일러가 만들어줌 : 하나라도 다른 생성자가 있으면 만들지 않음!
    public Vehicle() {
    }

    // 모든 필드를 초기화하는 생성자
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("차량이 이동합니다.");
    }

}
