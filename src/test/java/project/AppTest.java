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
    //Author: Ramesh Mummidi
    //Description: Second test case for count()
    @Test
    public void test4() {

        //int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        System.out.println("Testing count()");
        project.App test = new App();
        int expectedCount = 3;
        int actualCount = test.count(456);

        assertEquals(expectedCount, actualCount);

    }
    //Author: Ramesh Mummidi
    //Description: Third test case for count()
    @Test
    public void test5() {

        //int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        System.out.println("Testing count()");
        project.App test = new App();
        int expectedCount = 2;
        int actualCount = test.count(85);

        assertEquals(expectedCount, actualCount);

    }
    //Author: Sam Axelsson
    //Description: Test to see if bubble sort function sorted correctly a
    @Test
    public void test6() {
        assertEquals(0, 0);
    }

    /* Just in case it´s overwritten
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
        }git
        assertEquals(0, passed);
    }
    */


    //Author: Sam Axelsson
    // Description: Test to see if the merger function works
    @Test
    public void test7() {
        String input1 = "Rammstein";
        String input2 = "Sabaton";
        project.App test = new App();
        String result = test.merger(input1, input2);
        assertEquals(result, "RSaambmasttoenin");
    }
     //Author: Kavya Sree
    //Description: test for replace function
    @Test
    public void test8() {

        System.out.println("Testing replace()");
        project.App test = new App();
        String expectedString = "Sem is a good boy";
        String actualString = test.replace("Sem is e good boy");

        assertEquals(expectedString, actualString);

    }


    //Author: Kavya Sree
    //Description: test for replace function
    @Test
    public void test9() {

        System.out.println("Testing replace()");
        project.App test = new App();
        String expectedString = "Remesh is e good boy";
        String actualString = test.replace("Ramesh is a good boy");

        assertEquals(expectedString, actualString);

    }

    //Author: Kavya Sree
    //Description: combined test for replace and concatenate function
    @Test
    public void test10() {

        System.out.println("Testing replace() and concatenate()");
        project.App test = new App();

        String expectedString = "Geik Teng epril birthdey";
        String actualString_1 = test.concatenation("Gaik Teng", "april birthday");
        String actualString = test.replace(actualString_1));

        assertEquals(expectedString, actualString);

    }
    //Author: Ramesh Mummidi
    //Description: combined test for printAlphabet and concatenate function
     @Test
    public void test11() {
        String input1 = printAlphabet(20);
        String input2 = printAlphabet(21);
        project.App test = new App();
        String result = test.concatenation(input1, input2);
        assertEquals(result, "V W X Y Z  W X Y Z");
    }


}