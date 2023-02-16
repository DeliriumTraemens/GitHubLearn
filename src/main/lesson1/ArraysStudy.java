package main.lesson1;

import org.openjdk.jol.info.ClassLayout;

public class ArraysStudy {
    int[]digitsArr=new int[4];
    {
        digitsArr[0]=5;
        System.out.println(ClassLayout.parseInstance(digitsArr));
    }

}
