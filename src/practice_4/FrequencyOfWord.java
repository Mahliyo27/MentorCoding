package practice_4;

public class FrequencyOfWord {


    public static void main(String[] args) {



        String str1 = "AAABBBDDDDSSSS";


        System.out.println(frequency(str1));




    }

    public static String frequency(String str){

        String result = ""; // create String result to keep iteration


        for (int i = 0; i <str.length() ; i++) { // this (for loop) for iteration every single index, starting from index 0 to last index of the String
            int count=0; //   I declare int variable  for count each iteration.

            for (int j = 0; j <str.length() ; j++) {
                if (str.charAt(i)==str.charAt(j)){ // to compare each char from i to j if they are equal
                    count++; // count by one  if it not equal don't  count
                }

            }


            result+=str.charAt(i) + ""+ count;  // assign to the result
            str = str.replaceAll("" + str.charAt(i),""); // concatinate charAt  to  the empty string
            // to make  char to String

        }

        return result;

    }


}
