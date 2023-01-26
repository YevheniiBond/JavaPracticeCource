package basic.exeptions;

import java.io.*;

public class Test8 {

        static int abc () {
            try {
                File f = new File("test1.txt");
                FileInputStream fis = new FileInputStream(f);
                return 5;

            } catch (FileNotFoundException e) {
                System.out.println("Exeption poyman");
                return 6;

            } finally {
                System.out.println("eto blok finally");
            }

        }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}

