package practice.level02.normal;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class NovelReading {//3

    //작가가 외부에 배포하기 위해 글을 쓴다.
    //글을 쓸 펜과 노트가 필요하니 준비.
    //노트를 책상으로 가지고 온다.
    //펜을 가지고 온다.
    //글을 쓴다.

    public void novel(){//3

        try (FileOutputStream fin = new FileOutputStream("src/practice/level02/normal/examples.txt")){//4 : 경로 확인

         String story = "얼음 마법 공주가 살았습니다";//5 : 그냥 문자열.

         fin.write(story.getBytes(StandardCharsets.UTF_8)); // 6: 문자열 속 문자들을 바이트형식으로 써라. 대신, UTF_8형식을 가지고 와서. 스탠다드차셋 뜻은?


        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public void novleRead() {//7

        try (FileInputStream fi = new FileInputStream("src/practice/level02/normal/examples.txt")){//8: 파일 속을 들여다볼거야. 어떤 경로의 파일을.

         InputStreamReader inStream = new InputStreamReader(fi,StandardCharsets.UTF_8); // 9: 파일 속을 들여다봐 읽어볼거야. UTF_8형식으로.
         BufferedReader bfr = new BufferedReader(inStream);//10 : 파일 속 전체를 읽을거야.

         String line; //11 : 변수에 넣어서 한번에  출력하려고 만듬.
         //읽는 것부터 먼저 하라고 지시내리기 위해 괄호 두번.
         while((line = bfr.readLine()) != null){ //11 : 전체를 읽을 준비. -> 읽으러 감... 한줄 씩 읽으면서 스트링 변수에 넣음..

             System.out.println(line); //12 : 읽은 것 설명해주기.


         }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {



//      File file = new File("src/practice/level02/normal/examples.txt");
//
//     try {
//            file.createNewFile();
//
//          System.out.println("파일 생성 완료");
//          boolean fileSuceess = file.createNewFile();
//          System.out.println("파일 생성: " + fileSuceess);
//
//      }catch (IOException e){
//          throw new RuntimeException(e);
//
//
//      }

        NovelReading novelR = new NovelReading();//1 : novel 실행하기 위해서.
        novelR.novel();// 2 : 노벨 실행 버튼 클릭.

        //읽기
        novelR.novleRead();


    }
}
