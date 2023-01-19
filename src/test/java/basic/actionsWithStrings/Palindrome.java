package basic.actionsWithStrings;

public class Palindrome {
    // what is palindrom - mom, dad, poop, 1234321;
    public static void main(String[] args) {
        String x = "abcdaedcba";
        int i=0, j = x.length()-1;
        while (i<j) {
            if (x.charAt(i) != x.charAt(j)){
                System.out.println("Not palindrome!");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}

