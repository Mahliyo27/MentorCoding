package practice_3;

import java.util.Scanner;

public class ArmstrongNumbers {

    public static void main(String[] args) {



        armstrongNumber(407);


        /*
        A number is thought of as an Armstrong number in java if the sum
        of its own digits raised to the power number of digits gives the number itself.
         For example, 0, 1, 153, 370, 371, 407, 1634, 8208, and 9474 are three-digit
          Armstrong numbers and four-digit Armstrong numbers too. There are many more.
           Let’s consider 407, as it is a three-digit number so it will be expressed as:

     (407) —> (4 4 4) + (0 0 0) + (7 7 7)
      64 + 0 + 343
   => 407

As 407 is a sum of the cube of its digits, therefore it is an Armstrong number.


         */


    }

//    public static void armstrongNumbers(){
//
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please enter number");
//        int number=scan.nextInt();
//        System.out.println("Please enter number of digits");
//          int digit=scan.nextInt();
//          int temp=number;
//          int sum=0;
//        do {
//         int value = temp % 10;
//            temp /= 10;
//            sum += Math.pow (value , digit);
//        } while (temp>0);
//        if (number==sum) {
//            System.out.println("This is an Armstrong number");
//        }else {
//            System.out.println("This is NOT Armstrong number");
//
//
//        }
//
//
//    }
//




//    public static int ArmstrongNumber(int number){
//
//        for (int i = 0; i <number ; i++) {
//
//




    public static void armstrongNumber(int number){

        int sum = 0;


        String stringNumber = String.valueOf(number);  // convert int to string
        //String stringNumber = number + ""; // convert int to string (2. way)


        for (int i = 0; i < stringNumber.length() ; i++) { // to check every number
            int size = stringNumber.length();    // the length of the number
            sum += Math.pow(Integer.parseInt(stringNumber.substring(i, i+1)), size);//153
            // Integer.parseInt==> covert string to the primitive value
            // first number * first number * first number because size is 3
            // second number * second number * second number because size is 3
            // third number * third number * third number because size is 3

        }

        if(sum == number){
            System.out.println(number + " is an armstrong number");
        }else{
            System.out.println(number + " is not an armstrong number");
        }




    }
}










/*
Write a method that can check if a number is Armstrong number
 */