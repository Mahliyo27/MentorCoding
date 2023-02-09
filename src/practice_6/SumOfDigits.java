package practice_6;

public class SumOfDigits {


   //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string


    public static void main(String[] args) {

        String str1 = "ab5c2d4ef-12s";
        System.out.println("The sum of the digits in the String is= "+ sumOfDigits(str1));


      String n =   SumOfDigits.stringNum("10","10");

        System.out.println(n);

        System.out.println(sumOfDigits(str1));


    }

    public static String stringNum (String num1, String num2){


        String result ="";
        int sum = Integer.parseInt(num1); // return me integer

        int sum1 = Integer.parseInt(num2);

        result +=  sum1 + sum;

       return result;

    }




        // return the sum of the digits present in the given String

        public static int sumOfDigits(String str){
            int n = str.length();

            int sum = 0;

            for (int i = 0; i < n; i++){
                if (Character.isDigit(str.charAt(i))){
                    String given = str.substring(i, i+1);
                    sum += Integer.parseInt(given);
                }
            }
            return sum;
        }









    public static int sumOfDigits_s1(String str) {

        int n = str.length();

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (Character.isDigit(str.charAt(i))) {

                if (str.contains("-")) {

                    sum += Integer.parseInt(str.substring(i, i + 1)) * -1;

                } else {

                    sum += Integer.parseInt(str.substring(i, i + 1));
                }

            }

        }
        return sum;
    }


    public static int digit_sum_string (String str){

        int num = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                if (str.startsWith("-")) {

                    num += Integer.valueOf("" + str.charAt(i)) * -1;   // value of OR parseInt works

                } else {
                    String s = "" + str.charAt(i);
                    num += Integer.parseInt("" + str.charAt(i));
                }

            }
        }

        return num;

    }

}
