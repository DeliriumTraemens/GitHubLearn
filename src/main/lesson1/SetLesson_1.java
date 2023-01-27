package main.lesson1;

import java.util.HashSet;
import java.util.Set;

public class SetLesson_1 {

    public static void main(String[] args) {
 Set<Integer> intSet=new HashSet<Integer>();
        intSet.add(2);
        intSet.add(4);
        intSet.add(6);
        intSet.add(8);

        intSet.forEach(System.out::println);
    }
}
