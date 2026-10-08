package practice.level01.basic;

public class Application2 {

    int []arr = new int[5];

    public void index(int a){



        try{

            int arr2 = arr[a];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스가 배열의 범위를 벗어났습니다");
        }


    }

    //try도 메서드.
    //지역변수 이해. (중괄호 안에 들어있는 변수들을 의미. 지역변수는 해당 지역에서만 활성.)


    public static void main(String[] args) {

    Application2 app2 = new Application2();
    app2.index(10);



}

}
