package project2.project2;
import java.util.Arrays;
public class App {
    
	static void printHi() {
		
		System.out.println("Hello World!");
        System.out.println("This is Ramesh!");

	
	}
	
    public static void main(String[] args) {
    int [] array = new int [] {90,23,5,109,12,22,67,34};
	Arrays.sort(array);
	System.out.println("Elements of array sorted in ascending order: ");
	for (int i = 0; i<array.length;i++)
	{
	System.out.println(array[i]);
	}	
    	//hi sam
    	printHi();
    	
    }
    
}
