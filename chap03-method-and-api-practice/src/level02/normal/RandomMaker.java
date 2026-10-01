package level02.normal;

public class RandomMaker {

    /* 설명. 1 ~ 100 사이의 정수 난수를 반환한다. */
    public int generate() {
        return (int) (Math.random() * 100) + 1;
    }

    /* 설명. min ~ max 사이의 정수 난수를 반환한다.
     *  Math.random() 은 0.0 이상 1.0 미만의 double 을 반환하므로,
     *  (max - min + 1) 을 곱한 뒤 정수형 변환 후 min 을 더해 범위를 맞춘다.
     * */
    public int generateInRange(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
