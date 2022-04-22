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
	  //Author: Kavya sree

    //Description: replace function is used to replace the characters
    static void replace(){
        String s1="javatpoint is a very good website";  
        String replaceString=s1.replace('a','e');//replaces all occurrences of a to e  
        System.out.println(replaceString); 
    }
  //Author: Kavya sree

    //Description:Adding two strings with concatenation function
    static void concatenation(){
        String s="Kavya"+" Sree";
        System.out.println(s);//Kavya sree
        }
    public static void main(String[] args) {
    	printHi();
    	sort();
    	count();
    	replace();
    	concatenation();
    	
    }
    
  
    
    

    
}