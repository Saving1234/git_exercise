package practice.level01.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        list.add(2);

        Collections.sort(list);
        System.out.println("정렬된 리스트: " + list);

    }

}
