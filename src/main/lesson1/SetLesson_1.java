package main.lesson1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetLesson_1 {

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(2);
        intSet.add(4);
        intSet.add(6);
        intSet.add(8);

        List<String> strList = new LinkedList<String>();

        intSet.forEach(System.out::println);
    }
}
