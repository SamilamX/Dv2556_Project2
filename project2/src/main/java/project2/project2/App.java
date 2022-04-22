package project2.project2;
import java.util.Arrays;
public class App {
    
	
	
	static void sort() {
		//committed by Ramesh
		
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i<array.length;i++)
		{
		System.out.println(array[i]);
		}	

	
	}
	
	static void count() {
		int count = 0, num = 123456;

	    for (; num != 0; num /= 10, ++count) {
	    }

	    System.out.println("Number of digits: " + count);
	}
    public static void main(String[] args) {
    	int [] array = new int [] {90,23,5,109,12,22,67,34};
        sort();
    	count();
    	
    }
    
}