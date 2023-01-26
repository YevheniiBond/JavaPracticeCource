package basic.exeptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FewCatchBlocks {
    public static void main(String[] args) {
        File f = new File("test1.txt");

        try{
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Usim garnogo dnia!");
        }
        catch (FileNotFoundException e){
            System.out.println("Buv piyimanui exeption: " + e);
        }
        catch (NullPointerException e){
            System.out.println("Buv piyimanui exeption: " + e);
        }
        finally {
            System.out.println("finally");
        }
    }
}
