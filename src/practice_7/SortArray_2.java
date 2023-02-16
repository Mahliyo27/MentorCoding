package practice_7;

import java.util.Arrays;

public class SortArray_2 {


    public static void main(String[] args) {

        int[] arr = {10, 11,6,17,9, 8, 7};

        int n=0;
        // 10>9

        //n = 9 (i)
        //arr (i) = 10(j)       array = 10,10,8,7
        // arr(j) = 9 (n)       array = 9,10,8,7

        // n = 8 (i)

        for (int i = 0; i<arr.length;i++) {

            for(int j = 0; j<arr.length;j++){

                if(arr[i]>arr[j]){
                    n=arr[i];
                    arr[i]=arr[j];
                    arr[j]=n;
                }

            }

        }

        System.out.println(Arrays.toString(arr));


    }

}
