package practice_6;

import java.util.Arrays;

public class ArrayMaxNum {


    public static void main(String[] args) {


        int[] arr = {12, 33, 55, 3, 8};

        System.out.println(ArrayMaxNum.maxNum(arr));


    }

    public static int maxNum (int[] num) {

        int max = Integer.MIN_VALUE;

        for (int each : num) {


            if (each > max){
                max = each;
            }
        }




        return max;


    }

}

/*
Array -- Find Maximum
Write a method that can find the maximum number from an int Array
 */