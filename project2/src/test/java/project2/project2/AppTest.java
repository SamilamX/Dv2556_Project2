package project2.project2;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.Test;

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
  		// App test = new App();
  	
  		String actualOutput = printHi();
  		String expectedOutput = "Hello World";
  		
  		assertEquals(expectedOutput, actualOutput);

  	}
  	
  	//Author: Gaik Teng Ooi
  	//Description: test for function sort()
  	@Test
  	public void test2() {
  		
  		//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
  		int [] expectedArray = new int [] {5, 12, 22, 23, 34, 67, 90, 109};
  		int [] actualArray = sort();
  		
  		assertEquals(expectedArray, actualArray); 
  		
  	}
  	
  	//Author: Gaik Teng Ooi
  	//Description: test for dummy function
  	@Test
  	public void test3() {
  		
  		//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
  		int [] expectedArray = new int [] {5, 12, 22, 23, 34, 67, 90, 109};
  		int [] actualArray = sort();
  		
  		assertEquals(expectedArray, actualArray); 
  		
  	}

  	//Author: Gaik Teng Ooi
  	//Description: dummy test for dummy function
  	@Test
  	public void test4() {
  		
  		//int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
  		int [] expectedArray = new int [] {5, 12, 22, 23, 34, 67, 90, 109};
  		int [] actualArray = sort();
  		
  		assertEquals(expectedArray, actualArray); 
  		
  	}
  	
  	
}
