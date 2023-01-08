package Practice_2;

public class ConsecutiveNumbers {
    public static void main(String[] args) {


        int N = 100;


        for (int i = 1; i <= N; i++) {


            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");


            } else if (i %2==0 && i %5==0) {
                System.out.println("CodilityCoders");


            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");

            } else if (i % 2 == 0) {
                System.out.println("Codlity");

            } else if (i % 3 == 0) {
                System.out.println("Test");

            } else if (i % 5 == 0) {
                System.out.println("Coders");


            }else{
                System.out.println(i +"");
            }


        }







//        String str = "Sayora";
//
//        String result = "";
//
//        for (int i = str.length()-1; i >=0 ; i--) {
//         result+= str.charAt(i);
//        }
//
//        System.out.println(result);
//


    }
}


