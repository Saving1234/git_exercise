package practice.level02.hard;

/*
 *   ① VehicleFactory 라는 클래스를 만들고, 다음 두 메소드를 정의한다.
 *      - public static Vehicle create(String type)
 *          · "car"  를 받으면 new Car("가솔린") 을 반환
 *          · "boat" 를 받으면 new Boat("FRP") 을 반환
 *          · 그 외 입력이면 new Vehicle(0) 을 반환
* */
public class VehicleFactory {

    // 정적메소드
    public static Vehicle create(String type) {

        // "car"  를 받으면
        if(type.equals("car")) {
            //  new Car("가솔린") 을 반환
            return new Car("가솔린");

            // "boat" 를 받으면
        } else if (type.equals("boat")) {
            // new Boat("FRP") 을 반환
            return new Boat("FRP");
        } else {
            // 그 외 입력이면 new Vehicle(0) 을 반환
            return new Vehicle(0);
        }
    }

    /*
     *      - public static void runVehicle(Vehicle v)
     *          · 매개변수로 받은 Vehicle 의 move() 를 호출한다.
    * */
    public static void runVehicle(Vehicle v) {
        v.move();
    }
}
