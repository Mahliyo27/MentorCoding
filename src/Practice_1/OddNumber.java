package Practice_1;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumber {


    public static void main(String[] args) {



       OddNum();


       evenNumber();







        }



     public static void OddNum(){


       int [] num = {4,6,8,2,5};


         for (int each : num) { // for each loop works just with data structure, it will be give as each number witch not divisible by two
             if (each % 2 != 0) {
                 System.out.println(" Odd number! " + each);

             }
         }







     }


     public static void  evenNumber(){


//         ArrayList<Integer> list = new ArrayList<>();  // wrapper class we can not use primitive data type for arrayList
//
//
//
//         list.addAll(Arrays.asList(1,3,5,7,6,8));// addAll this is bulk  methods
//
//
//         String result = "";
//
//         for (int i = 0; i < list.size(); i++) { // for i loop iterite arrays list number  and given us even numbers
//             if ((i) %2== 0 ){
//
//                 result +=i + " ";
//             }
//
//         }
//
//
//         System.out.println("Even number " + result);
//


         int [] num = {3,6,5,1,7};

         String result = "";

         for (int each : num) { // for each loop works just with data structure, it will be give as each number witch not divisible by two
             if (each % 2 == 0) {

                 result += each;


             }
         }
             System.out.println(  " Even number! " + result);






     }

}
