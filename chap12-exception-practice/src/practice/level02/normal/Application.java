package practice.level02.normal;

public class Application {

    public void getNumber(int num) throws NegativeNumberException {//4

        if(num<0){//5
            throw new NegativeNumberException("음수는 입력할 수 없습니다");//5-1, /
        } //6

    }//7

    public static void main(String[] args) {

       Application app = new Application();//1
        try {//2
            app.getNumber(-13);//3
    /*7-1*/ } catch (NegativeNumberException e)/*8-1*/ {//8-2
            throw new RuntimeException(e);//8-3
        }

    }

}
