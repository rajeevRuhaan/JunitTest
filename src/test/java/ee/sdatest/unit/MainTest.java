package ee.sdatest.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {


    Main main;

    @BeforeEach
    public void setUp(){
        System.out.println("This method setup.");
        main = new Main();
    }
    public int testCustom(){
        return 0;
    }

    @Test
    @DisplayName("This is test for testing main")
     void sumTest1(){
     //   Main main = new Main();
        System.out.println("This method is called after set up method.");

        int result = main.sum(3,2);

        Assertions.assertEquals(5,result);
    }
    @Test
    void sumTest2(){
        int result = main.sum(3,6);
        Assertions.assertNotEquals(5, result);
    }
}
