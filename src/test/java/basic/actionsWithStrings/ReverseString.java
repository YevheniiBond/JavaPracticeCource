package basic.actionsWithStrings;

public class ReverseString {

    static String name = "Anastasia";

    public static void main(String[] args) {
        for (int i = name.length()-1; i >= 0 ; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
