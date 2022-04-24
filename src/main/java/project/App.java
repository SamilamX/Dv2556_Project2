package project;

import java.util.Arrays;
public class App {


    //Author: Gaik Teng Ooi
    //Description: Dummy function to print "hello world"
    static String printHi() {

        System.out.println("Hello World!");
        System.out.println("This is Ramesh!");
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

}