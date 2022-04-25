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

    //Author: Kavya sree
    //Description: replace function is used to replace the characters
    static String replace(String s1){
        String replaceString=s1.replace('a','e');//replaces all occurrences of a to e
        System.out.println(replaceString);
        return replaceString;
    }

    //Author: Kavya sree
    //Description:Adding two strings with concatenation function
    static String concatenation(String s1, String s2){
        String s = "";
        s = s1 + s2;
        System.out.println(s);//Kavya sree

        return s;
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

    //Author: Sam Axelsson
    //Description: Bubble sort with strings fail on purpose

    static String[] bubbleName(String[] input){

        for(int i = 0; i < input.length; i++){
            for(int ii = i+1; ii < input.length; ii++){
                if( input[ii].compareToIgnoreCase(input[i]) < 0) {
                    String hold = input[i];
                    input[i] = input[ii];
                    input[ii] = hold;
                }
            }
        }
        return input;
    }

    //Author: Gaik Teng Ooi
    //Description: calculates the 'price' of a given word.
    //Each letter has a 'price' and priceOfWord() calculates the sum of each letter's price.
    static int priceOfWord(String word) {

        int price = 0;
        // char[] charArray = new char[word.length()];

        /*for (int i = 0; i < charArray.length; i++) {
            charArray[i] = word.charAt(i);
        }*/

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') price += 1;
            else price += (int) (word.charAt(i));
        }

        System.out.println("Price of your word " + word + " is: " + price);
        return price;

    }

    public static void main(String[] args) {

        sort();
        count(9999);
        concatenation("Kavya", "Sree");
        printAlphabet(15);
        priceOfWord("oil");

    }
  
}  
    	
    
    