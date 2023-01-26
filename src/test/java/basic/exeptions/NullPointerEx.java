package basic.exeptions;

import org.testng.annotations.Test;

public class NullPointerEx {
    @Test
    void abc(){
        String s = null;
        System.out.println(s.length());
    }
}
