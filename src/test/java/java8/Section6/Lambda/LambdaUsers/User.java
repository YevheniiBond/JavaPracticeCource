package java8.Section6.Lambda.LambdaUsers;

public class User {

    int age;
    String name;
    int weight;
    boolean sex;
    String speciality;

    public User(int age, String name, int weight, boolean sex, String speciality) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;
    }

    public String toString(){
        return "Age of user is: " + age +";  " + "His name is: " + name + ";  "
                + "His weight is: " + weight + ";  " + "His sex is: "
                + sex + ";  " + "His speciality is: " + speciality + ";  ";
    }
}
