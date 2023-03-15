package practice_8;

import java.util.Arrays;

public class ConcatTwoArrays {

    //1) Array - Concat two arrays
    //Write a return method that can concate two arrays


    public static void main(String[] args) {

        String[] arr = {"Maya","Sue"};

        String[] arr3 = {"Bota","Erdal"};


        System.out.println(Arrays.toString(concatArray(arr, arr3)));


    }


    public static String[] concatArray(String[] str, String[] str1) {


        String[] result = new String[str.length + str1.length]; // new array for concatenations


        int count = 0; // for  counting each Element from the Loop


        for (String each : str) { // For each Loop to put all the element from string str to the String Array result
            result[count++] = each;


        }


        for (String each : str1) {// For each Loop to put all the element from string str1 to the String Array result
            result[count++] = each;


        }

        return result;// this result return me all Element from "str[]" and "str1[]"
    }
}