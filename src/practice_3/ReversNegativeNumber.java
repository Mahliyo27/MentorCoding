package practice_3;

public class ReversNegativeNumber {

    public static void main(String[] args) {

      //  reversNumber(1234);


    int sum =  reversNegativeInt(-8754);


    }


    public static int reversNumber(int num) {


       int  reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);


//        int reverse=0;
//
//        while (num  <0){
//            int digits = num %10;
//            reverse =reverse *10 + digits;
//            num/=10;
//        }
//
//        System.out.println("Reversed Negative  Number: " + reverse);
//
//        return num;
//
//    }

        return num;

    }


    public static int reversNegativeInt(int number){


        if (number <0){ // if num is less the zero or negative
          System.out.println("-");
           reversNegativeInt(number* -1);
        } else if (number <10) {
            System.out.println(number);
        }else{
            System.out.println(number % 10);
            reversNegativeInt(number/10);
        }

        return number;
    }
}

/*
 Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int
 */