package practice_6;

public class SumOfDigits {


   //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string


    public static void main(String[] args) {


      String n =   SumOfDigits.stringNum("10","10");

        System.out.println(n);


    }

    public static String stringNum (String num1, String num2){


        String result ="";
        int sum = Integer.parseInt(num1); // return me integer

        int sum1 = Integer.parseInt(num2);

        result +=  sum1 + sum;

       return result;

    }

}
