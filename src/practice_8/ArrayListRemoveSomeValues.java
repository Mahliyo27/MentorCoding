package practice_8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListRemoveSomeValues {

    // 3) ArrayList - Remove some values
   // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static ArrayList<Integer> removeValues(ArrayList<Integer> arr) {

        // solution 2

            arr.removeIf(number -> number >= 100);
            return arr;
        }







    public static void main(String[] args) {


        ArrayList<Integer> num = new ArrayList<>();

        num.addAll(Arrays.asList(12,33,44,66,100,334,444));


        System.out.println(removeValues(num));



    }






}



