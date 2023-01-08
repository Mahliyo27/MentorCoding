package Practice_2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {


        int num =100;




        String divisibleBy3 ="";
        String divisibleBy15 ="";
        String divisibleBy5 ="";

        for (int i = 1; i <= num; i++) {

            if (i %3==0 && i %5==0 && i %15==0){
                divisibleBy15+= " "+i;
            }

            if (i %3==0 && i %15 !=0){
                divisibleBy3+=   i + " ";
            }

            if (i %5==0 && i %15 !=0){
                divisibleBy5+=i+" ";
            }

        }


        System.out.println("divisibleBy 15: = " + divisibleBy15);// 15 30 45 60 75 90
        System.out.println("divisibleBy 5: = " + divisibleBy5);//5 10 20 25 35 40 50 55 65 70 80 85 95 100
        System.out.println("divisibleBy 3: = " + divisibleBy3);//3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99

    }
}
