package practice.level03.hard;

/* 설명. 인터페이스의 구현체 */
public class Developer implements Worker {
    @Override
    public void work() {
        System.out.println("개발자가 코딩을 시작합니다.");
    }
}
