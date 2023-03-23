package practice_9;

import java.util.Arrays;

public class ArrayList_descending {



        //ArrayList - sorting in descending order
        //Write a method that can sort the ArrayList in descending order without using the sort method.


        public static void main(String[] args) {

            int[] arrValue = {-1, 9, 0, 4, 81, 2, 4};
            System.out.println(Arrays.toString(sortingArrayDESC(arrValue)));
            // [81, 9, 4, 4, 2, 0, -1]



        }


    // solution #1 simple algorithm "Bubble sort:
    public static int[] sortingArrayDESC(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        int temp = 0;

        // sort the array in ascending order using two for loops
        // first loop to traverse the array from the starting
        // second loop inside the outer to traverse the next element

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < result.length; j++) {

                if (result[i] > result[j]) {    // compare outer loop object with inner loop, if greater than swapping
                    temp = result[i];           // swap elements if not in order by using temporary variable
                    result[i] = result[j];      // for swapping code
                    result[j] = temp;
                }
            }
        }
        return result;
    }



    }
