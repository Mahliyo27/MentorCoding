package practice_7;

import java.util.Arrays;

public class SortDescending {

    //Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};


    public static void main(String[] args) {


        int[] arr = {10,20,7, 8, 90};

        System.out.println((Arrays.toString(sortDescending(arr))));
    }

  public static   int[] sortDescending(int[] arr){

          int temp =0;

    int[] result = Arrays.copyOfRange(arr, 0, arr.length);

            for (int i = 0; i < result.length; i++) {

        for (int j = 0; j < result.length; j++) {
            if (result[i] > result[j]) {
                temp= result[i];
                result[i] = result[j];
                result[j] = temp;
            }
        }

    }

            return result;

}


    }


