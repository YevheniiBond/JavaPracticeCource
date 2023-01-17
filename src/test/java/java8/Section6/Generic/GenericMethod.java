package java8.Section6.Generic;

import java.util.ArrayList;

public class GenericMethod {
    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("hello");
        s1.add("Nihao");
        s1.add("Wo!");
        String se = BaseGenMeth.getSecondElement(s1);
        System.out.println(se);


        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(45);
        a1.add(150);
        Integer ww = BaseGenMeth.getSecondElement(a1);
        System.out.println(ww);

        ArrayList<Double> d1 = new ArrayList<>();
        d1.add(45.5);
        d1.add(56.7);
        d1.add(66.8);
        Double dd = BaseGenMeth.getSecondElement(d1);
        System.out.println(dd);
    }
}

class BaseGenMeth {
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(2);
    }
}