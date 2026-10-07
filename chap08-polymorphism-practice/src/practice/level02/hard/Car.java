package practice.level02.hard;

/*
 * 클래스명: Car (자식 클래스)
 * 필드: 연료 타입(fuelType, 문자열)
 * 메소드: 이동(move) - "자동차가 도로를 달립니다." 출력 (메소드 오버라이딩)
 *
* */
public class Car extends Vehicle {

    // 필드
    private String fuelType; // 연료타입


    // 생성자
    // 모든필드를 초기화하는 생성자
    public Car(String fuelType) {
//        super(); // 기본 부모 생성자 호출 // 컴파일러가 추가해줄것임
        this.fuelType = fuelType;
    }

    // 메소드
    @Override
    public void move() {
        System.out.println("자동차가 도로를 달립니다.");
    }

    public String getFuelType() {
        return fuelType;
    }
}
