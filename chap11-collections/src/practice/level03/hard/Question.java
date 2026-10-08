package practice.level03.hard;

public class Question {

    public static void main(String[] args) {

        /* 안내. 이 레벨은 난이도가 있는 편입니다. 너무 어려우면 모범답안을 먼저 보고
         *      흐름을 파악한 뒤, 직접 다시 풀어보면 학습 효과가 더 좋습니다.
         * */

        /* Q1. 도서 관리 프로그램을 표준 입출력(Scanner 및 콘솔)을 이용해 MVC2 패턴으로 작성하세요.
         *
         * 복습 포인트:
         * - 컬렉션과 자료구조를 이용하여 데이터를 관리하고 CRUD 작업을 수행할 수 있다.
         * - MVC2 패턴을 이해하고 적용할 수 있다.
         *
         * 클래스명: Book
         * 필드: 제목(title, 문자열), 저자(author, 문자열), ISBN(isbn, 정수), 해외 서적 여부(isForeignBook, boolean)
         *
         * 클래스명: Library
         * 필드: 도서 목록(books, ArrayList<Book>)
         * 메소드: 도서 추가(addBook), 도서 조회(getBook), 도서 수정(updateBook), 도서 삭제(deleteBook)
         *
         * 클래스명: BookController
         * 메소드: 도서 추가(addBook), 도서 조회(getBook), 도서 수정(updateBook), 도서 삭제(deleteBook)
         *
         * 클래스명: BookView
         * 메소드: 도서 정보 출력(displayBook), 도서 목록 출력(displayBookList), 메시지 출력(displayMessage)
         *
         * 조건:
         * - 도서를 추가하고, 특정 ISBN으로 도서를 조회하고, 도서를 수정하고, 도서를 삭제하는 기능을 구현
         *
         * 출력 예시:
         * 도서 추가: "Effective Java" 추가
         * 도서 조회: ISBN이 "123456"인 도서 조회
         * 도서 수정: ISBN이 "123456"인 도서의 제목을 "Effective Java 3rd Edition"으로 수정
         * 도서 삭제: ISBN이 "123456"인 도서 삭제
         * */

        /* Q2. HashMap 을 사용해 학생 이름 → 점수 데이터를 관리하는 CRUD 프로그램을 작성하세요.
         *
         * 복습 포인트:
         * - HashMap의 구조 및 특성에 대해 설명할 수 있다.
         * - HashMap의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - HashMap<String, Integer> 를 생성한다.
         * - 다음을 순서대로 수행한 결과를 출력한다.
         *    ① put 으로 ("홍길동", 85), ("김철수", 72), ("박영희", 90) 추가
         *    ② 전체 출력 (Map.entrySet 순회)
         *    ③ 김철수의 점수를 95 로 수정 (put 으로 덮어쓰기)
         *    ④ 박영희 삭제 (remove)
         *    ⑤ "이수정" 의 점수 조회 → 없으면 "데이터 없음" 출력 (containsKey 활용)
         *    ⑥ 최종 전체 출력
         *
         * 출력 예시:
         * 초기 상태:
         * 홍길동 : 85
         * 김철수 : 72
         * 박영희 : 90
         * 김철수 점수 수정 후 김철수 : 95
         * 박영희 삭제 후 size : 2
         * 이수정 조회 결과 : 데이터 없음
         * 최종 상태:
         * 홍길동 : 85
         * 김철수 : 95
         * */

        /* Q3. Properties 클래스를 사용하여 설정 데이터를 저장하고 읽어오세요.
         *
         * 복습 포인트:
         * - Properties의 주요 메소드의 사용 방법을 숙지하고 개발에 적용할 수 있다.
         *
         * 조건:
         * - Properties 인스턴스를 생성한다.
         * - setProperty 로 다음 키-값을 저장한다.
         *      "db.url"      → "jdbc:mysql://localhost:3306/sample"
         *      "db.user"     → "root"
         *      "db.password" → "1234"
         * - getProperty 로 각각의 값을 읽어 출력한다.
         * - 존재하지 않는 키 "db.driver" 를 getProperty 로 조회하되,
         *   기본값 "com.mysql.cj.jdbc.Driver" 를 두 번째 인자로 전달해 출력한다.
         *
         * 출력 예시:
         * db.url    : jdbc:mysql://localhost:3306/sample
         * db.user   : root
         * db.password : 1234
         * db.driver : com.mysql.cj.jdbc.Driver
         * */
    }

}
