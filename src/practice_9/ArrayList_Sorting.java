package practice_9;

import java.util.*;

public class ArrayList_Sorting {


    /*
          ArrayList - sorting in ascending
          Write a method that can sort the ArrayList in Ascending order without using the sort method
  */
    public static void main(String[] args) {

        int[] arrValue = {1, 9, 0, 4, 81, 2, 4};
        System.out.println(Arrays.toString(sortingArrayAsc(arrValue)));
        // [-1, 0, 2, 4, 4, 9, 81]


    }

    // solution #1 simple algorithm "Bubble sort:
    public static int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        int temp = 0;

        // sort the array in ascending order using two for loops
        // first loop to traverse the array from the starting
        // second loop inside the outer to traverse the next element

        for (int i = 0; i < result.length; i++) {

            for (int j = 0; j < result.length; j++) {

                if (result[i] < result[j]) {    // compare outer loop object with inner loop, if less than swapping
                    temp = result[i];           // swap elements if not in order by using temporary variable
                    result[i] = result[j];      // for swapping code
                    result[j] = temp;
                }
            }
        }
        return result;
    }

}

