package practice.level01.basic;

import java.util.LinkedList;

public class Application02 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("첫 번째 요소: " + list.getFirst());
        System.out.println("마지막 요소: " + list.getLast());

    }

}
