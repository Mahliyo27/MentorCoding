package Coding;

public class ReversString {


    public static void main(String[] args) {


        String name = "Muhtar";






        String result = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            result += name.charAt(i);

        }

        System.out.println(result);


        String res ="";
        int[] arrr = {12, 44, 66, 77};

        for (int i = arrr.length - 1; i >= 0; i--) {

           res += arrr[i];

        }

        System.out.println(res);


    }

}
