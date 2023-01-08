package practice_3;

public class PrimeNumber {
    public static void main(String[] args) {


        //Prime Numbers are ==> 2,3,5,7,11,13,17 ....

        //Prime Number are ==> 1,4,6,8,9,10,12,14



        //  Prime numbers is a number that is greater then 1 and divided by 1 or itself only
     int sum =   primeNumber(8);
        System.out.println(sum);


      boolean m = isPrime(7);
        System.out.println(m);
    }

    public static boolean isPrime (int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }



    public static int primeNumber( int number ){

        for (int i = 2; i < number; i++) {

        }
            if (number   % 1 == 0){
                System.out.println("It is Not Prime number " + number);
            } else {
                System.out.println("Prime number is " + number);


        }
        return number;

    }



}





/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not

 */