package lecture.level01.basic;

import java.io.File;
import java.io.BufferedReader;
import java.io.*;

public class NovelReadingBook extends Throwable {

    //작가가 소설쓰기 위해 준비.
    //펜과 종이 준비.
    //펜과 종이를 가지고 오기.
    // 종이. 노트 책상에 펼치거나 만들기.
    // 노트에 쓸 내용 생각.적기.
    // 노트에 내용 적기.

    //글 쓴 노트 찾아서 읽기.
    //노트 찾기 위해 책상으로 가기.
    //책상에서 노트 꺼내기.
    //노트를 펼치기.
    //노트 내용 한줄씩 읽으면서 내려가기.

    public void NovelCreate(){
        File file = new File("src/lecture/level01/basic/example.txt");




        try{
            if (file.exists()){
                System.out.println("파일이 존재합니다");

            }else {


                file.createNewFile();
                System.out.println("파일이 생성되었습니다");


                boolean fileSuccess = file.createNewFile();
                System.out.println(fileSuccess);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }



    public static void main(String[] args) {

        File file = new File("src/lecture/level01/basic/example.txt");




        NovelReadingBook novelrb = new NovelReadingBook(); //1 :
        novelrb.NovelCreate();

    }


}
