package practice_7;

public class MinNumber {


    public static void main(String[] args) {

       int[] arr = {12,55,-9,7,-66};

        System.out.println(minNumber(arr));

    }



    //Question1: Array - Find Minimum
    //Write a method that can find the maximum number from an int Array



    public static int minNumber(int[]arr){

        int min = Integer.MAX_VALUE;

        for (int each : arr) {
            if ( min > each){
                min = each;
            }


        }



        return min;
    }

}
