package basic.exeptions;

import java.io.File;
import java.io.FileInputStream;

public class FileWriterAndRider {
    public static void main(String[] args) throws Exception{
        File f = new File("test1.txt"); // треба знати що таке клас File;
        FileInputStream fis = new FileInputStream(f);// а також FileInputStream та FileOutPutStream;
//        System.out.println("file znaydeno!");
        fis.read();
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);
    }
}

