package java8.Section6.Stream;

import java8.Section6.Lambda.Cars.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedArray {
    public static void main(String[] args) {
        // sortet Arrays of String by name;
        Student st1 = new Student("D", 'f', 34, 4, 56.8);
        Student st2 = new Student("A", 'f', 34, 4, 56.8);
        Student st3 = new Student("C", 'f', 34, 4, 56.8);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        students = students.stream().sorted(
                        (x, y) -> x.getName().compareTo(y.getName())).
                collect(Collectors.toList());
        System.out.println(students);

        //sorted Array by int
        int[] array = {6, 87, 34, 2, 89, 1, -8, -10, 0};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }


}
