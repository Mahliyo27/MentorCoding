package practice_5;

import java.util.Arrays;

public class ReversString {

    public static void main(String[] args) {

        String name1 = "Sofiya";

        String name2 = "Kamilla";



        System.out.println(revers(name1));
        System.out.println(Reverse(name2));



    }

    // ================================ String revers=====================================================
    public static String revers(String str) {

        String revers = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            revers += str.charAt(i);
        }


        return revers;
    }


    // ==================================revers=str.toCharArray()[i];===================================================




    public static String Reverse(String str) {

        String reverse="";

        char[]ch = str.toCharArray(); // convert String to charArray


        for (int i = ch.length-1; i >=0 ; i--) {
            reverse+=ch[i];
        }

        return reverse;
    }




    // ==================================reversWithArray===================================================






}


















