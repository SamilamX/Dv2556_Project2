package project;

import java.util.Arrays;
public class App {


    //Author: Gaik Teng Ooi
    //Description: Dummy function to print "hello world"
    static String printHi() {

        System.out.println("Hello World!");
        return "Hello World";
    }

    //Author: Ramesh Mummidi

    //Description: sort function is used to sort the array
    static String sort() {
        int [] array = new int [] {90,23,5,109,12,22,67,34};
        Arrays.sort(array);
        String output = "";
        System.out.println("Elements of array sorted in ascending order: ");
        output += array[0];
        for (int i = 1; i<array.length;i++)
        {
            output += " " + array[i] ;
        }
        System.out.println(output);
        return output;

    }

    //Author: Ramesh Mummidi

    //Description: count function is used to count the numbers
    static int count(int num) {
        int count = 0;

        for (; num != 0; num /= 10, ++count) {
        }

        System.out.println("Number of digits: " + count);
        return count;
    }
    public static void main(String[] args) {

        sort();
        count(9999);

    }
    static String printAlphabet(int j) {
		
		String output = "";
	    for(int i = j; i <= 26; i++) {
	      System.out.print((char)(i+64) + " ");
	      output += (char)(i+64);
	      output += " ";
	    }
	   return output;
	   
	}
	
    public static void main(String[] args) {
   
    	printAlphabet(15);
    	
    }
    //Author: Sam Axelsson
    //Description: Merger two strings so that every other character is from input2,
    // it also adds any remaing characters to the output
    static String merger(String input1, String input2) {
        String output = "";
        // if input1 has less character or the same as input2
        int len = input1.length();
        // if input2 have more
        if (input1.length() > input2.length()){
            len = input2.length();
        }
        for(int i = 0; i < len; i++ ) {
            output += input1.charAt(0);
            output += input2.charAt(0);
            input1 = input1.substring(1);
            input2 = input2.substring(1);
        }
        //add the remaing of the bigger string
        output += input1;
        output += input2;
        return output;
    }
}