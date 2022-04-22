
package project2.project2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class Test1 {

	@Test
	public void test1() {
		// App test = new App();
	
		String actualOutput = printHi();
		String expectedOutput = "Hello World";
		
		assertEquals(expectedOutput, actualOutput);

	}

}
