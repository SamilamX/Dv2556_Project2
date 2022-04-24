package project2.project2;
import java.util.Arrays;
public class App {
    
	
	//Author: Gaik Teng Ooi
	
	//Description: Dummy function to print "hello world"
	static void printHi() {
		
		System.out.println("Hello World!");
        System.out.println("This is Ramesh!");

	}
	
	
	//Author: Ramesh Mummidi
	
	//Description: sort function is used to sort the array 
	static void sort() {
		
		int [] array = new int [] {90,23,5,109,12,22,67,34};
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		
		for (int i = 0; i<array.length;i++)
		{
			System.out.println(array[i]);
		}	

	
	}
	
	//Author: Ramesh Mummidi
	
	//Description: count function is used to count the numbers
	static void count() {
		int count = 0, num = 123456;

	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
	}
	
    public static void main(String[] args) {
   
    	sort();
    	count();
    	
    }

	{

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