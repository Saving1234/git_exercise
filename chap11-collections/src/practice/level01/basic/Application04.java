package practice.level01.basic;

import java.util.LinkedList;
import java.util.Queue;

public class Application04 {

    public static void main(String[] args) {

        /* Q4. Queue 자료구조를 사용해 FIFO(First-In, First-Out) 동작을 확인하세요.
         *
         * 복습 포인트:
         * - Queue 자료 구조에 대해 이해하고 설명할 수 있다.
         * - Stack과 Queue의 자료 구조에 대해 비교하여 설명할 수 있다.
         * - Queue의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - Queue<String> 을 LinkedList 로 구현해 생성한다. (Queue<String> q = new LinkedList<>();)
         * - offer() 로 "A", "B", "C" 를 차례대로 넣는다.
         * - peek() 으로 맨 앞 요소를 확인해 출력한다.
         * - poll() 으로 모든 요소가 꺼내질 때까지 반복하면서 꺼낸 값을 출력한다.
         *
         * 출력 예시:
         * peek: A
         * poll: A
         * poll: B
         * poll: C
         * */

        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("poll: " + queue.poll());
        }

        /* 설명. Queue 의 FIFO(First-In, First-Out) vs Stack 의 LIFO
         *  Queue:
         *   - offer(e) : 뒤쪽(꼬리)에 요소를 추가한다. add() 와 비슷하지만 실패 시 false 반환.
         *   - peek()   : 맨 앞 요소를 꺼내지 않고 들여다본다.
         *   - poll()   : 맨 앞 요소를 꺼내며 반환한다.
         *  Stack 은 마지막에 넣은 게 먼저 나오지만(LIFO),
         *  Queue 는 먼저 넣은 게 먼저 나온다(FIFO). 줄을 서는 모습을 떠올리자.
         * */
    }
}
