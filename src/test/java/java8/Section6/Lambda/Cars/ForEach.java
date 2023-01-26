package java8.Section6.Lambda.Cars;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.forEach(el ->{
            System.out.print(el);
            el*=2;
            System.out.print(el);
        } );
    }
}