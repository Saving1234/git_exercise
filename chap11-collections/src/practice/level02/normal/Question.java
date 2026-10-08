package practice.level02.normal;

public class Question {

    public static void main(String[] args) {

        /* Q1. HashSet을 생성하고, 요소를 추가하고, 중복된 요소가 저장되지 않음을 확인하세요.
         *
         * 복습 포인트:
         * - HashSet의 특징을 이해하고 주요 메소드 사용 방법을 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - HashSet에 "Apple", "Banana", "Orange", "Apple"을 추가
         * - "Apple"이 하나만 저장되었는지 확인
         *
         * 출력 예시:
         * HashSet의 크기: 3
         * */

        /* Q2. TreeSet을 생성하고, 요소를 추가하고, 오름차순으로 정렬된 결과를 확인하세요.
         *
         * 복습 포인트:
         * - TreeSet의 특징을 이해하고 주요 메소드 사용 방법을 숙지하여 개발에 적용할 수 있다.
         *
         * 조건:
         * - TreeSet에 5, 3, 8, 1, 2를 추가
         * - 오름차순으로 정렬된 결과를 출력
         *
         * 출력 예시:
         * TreeSet의 요소: [1, 2, 3, 5, 8]
         * */

        /* Q3. LinkedHashSet 을 사용하여 "추가한 순서가 유지되며, 중복은 제거되는" 동작을 확인하세요.
         *
         * 복습 포인트:
         * - LinkedHashSet의 특징을 이해하고 주요 메소드 사용 방법을 숙지하여 개발에 적용할 수 있다.
         * - HashSet과 LinkedHashSet 의 출력 순서 차이를 이해할 수 있다.
         *
         * 조건:
         * - LinkedHashSet<String> 을 생성하고 "C", "A", "B", "A", "D" 순으로 add() 한다.
         * - 저장된 결과를 그대로 출력한다.
         *
         * 출력 예시:
         * LinkedHashSet : [C, A, B, D]
         * */

        /* Q4. Comparator 인터페이스를 사용해 사용자 정의 정렬 기준으로 List 를 정렬하세요.
         *
         * 복습 포인트:
         * - Comparator 인터페이스를 활용하여 정렬을 수행할 수 있다.
         *
         * 조건:
         * - List<String> 을 만들어 ["banana", "fig", "apple", "blueberry"] 를 담는다.
         * - Collections.sort(list, comparator) 또는 list.sort(comparator) 을 이용해
         *   "문자열 길이의 오름차순" 으로 정렬한다.
         *   (길이가 같으면 원래 순서를 유지하면 된다 — 안정 정렬)
         * - 정렬 결과를 출력한다.
         *
         * 출력 예시:
         * 길이 오름차순 : [fig, apple, banana, blueberry]
         * */
    }

}
