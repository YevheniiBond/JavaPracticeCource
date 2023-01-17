package java8.HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> greetings = new ArrayList<>();
        greetings.add("Pryvit");
        greetings.add("Yak ty?");
        greetings.add("Ok");
        greetings.add("Poka");

        for (int i = 0; i < greetings.size(); i++) {
            greetings.set(i, String.valueOf(greetings.get(i).length()));
        }
        System.out.println(greetings);
    }
}
