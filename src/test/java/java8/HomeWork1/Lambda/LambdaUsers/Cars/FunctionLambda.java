package java8.HomeWork1.Lambda.LambdaUsers.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {
        Student st1 = new Student("Mykola",'m',18,3,75.5);
        Student st2 = new Student("Anna",'f',16,1,89.5);
        Student st3 = new Student("Volodymyr",'m',19,4,63.0);
        Student st4 = new Student("Valentyna",'f',16,1,79.8);
        Student st5 = new Student("Edd",'m',20,5,90.0);
        Student st6 = new Student("Andy",'m',18,3,61.2);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);

        Function<Student, Double> f = student -> student.avrGrade;
        double res= avrOfSmth(students, student -> (double)student.age);
        System.out.println(res);
    }

    private static double avrOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for(Student st: list ){
            result += f.apply(st);
        }
        result= result/ list.size();
        return result;
    }
}
