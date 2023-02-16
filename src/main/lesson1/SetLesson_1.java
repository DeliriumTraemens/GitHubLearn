package main.lesson1;

import org.openjdk.jol.info.ClassLayout;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetLesson_1 {

    public static void main(String[] args) {
        int[]digiArr=new int[]{5,7,9,12};

        Set<Integer> intSet = new HashSet<Integer>();
        intSet.add(2);
        intSet.add(4);
        intSet.add(6);
        intSet.add(8);

        List<String> strList = new LinkedList<String>();
        strList.add("First");
        strList.add("Second");
        strList.add("Third");
        strList.add("Fourth");
        strList.add("Fifth");
        strList.add("Sixth");
        intSet.forEach(System.out::println);

        System.out.println(ClassLayout.parseInstance(intSet).toPrintable());
        System.out.println(ClassLayout.parseInstance(digiArr).toPrintable());
    }
}
