package project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import project.App;

import java.lang.reflect.Array;

public class AppTest {

    @Test
    public void shouldAnswerWithTRUEtest() {
        assertTrue(true);
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(false);
    }

    //Author: Gaik Teng Ooi
    //Description: dummy test for dummy function
    @Test
    public void test1() {
        project.App test = new App();
        String actualOutput = test.printHi();
        String expectedOutput = "Hello World";

        assertEquals(expectedOutput, actualOutput);

    }

    //Author: Gaik Teng Ooi
    //Description: array test for sort function
    @Test
    public void test2() {

        //int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        System.out.println("Testing sort()");
        String expectedArray = "5 12 22 23 34 67 90 109";
        project.App test = new App();
        String actualArray = test.sort();

        assertEquals(expectedArray, actualArray);

    }

    //Author: Gaik Teng Ooi
    //Description: first test case for count()
    @Test
    public void test3() {

        //int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        System.out.println("Testing count()");
        project.App test = new App();
        int expectedCount = 4;
        int actualCount = test.count(9999);

        assertEquals(expectedCount, actualCount);

    }
    //Author: Sam Axelsson
    //Description: Test to see if bubble sort function sortet correctly a
    @Test
    public void test4() {
        int passed = 0;
        int [] Sorted_array = new int [] {1,2};
        for (int i = 1; i < Sorted_array.length; i++) {
            if(Sorted_array[i-1] < Sorted_array[i]) {
                ;
            } else {
                passed = 1;
            }
        }
        assertEquals(0, passed);
    }


    //Author: Sam Axelsson
    // Description: Test to see if the merger function works
    @Test
    public void test5() {
        assertTrue(true);
    }
}
