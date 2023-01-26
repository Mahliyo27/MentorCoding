package practice_4;

public class RemoveDUp {


    public static void main(String[] args) {

        String str = "AAABBBCCC";

        System.out.println(removeDup(str));


        int[] arr = {1, 1, 2, 2, 3, };




       RemoveDUp d = new RemoveDUp();






    }

    public static String removeDup(String str){

        String result = "";


        for (int i = 0; i <str.length() ; i++) {


              if (!result.contains("" + str.charAt(i))) // if result not contains str

                    result+= ""+str.charAt(i);


            }

        return result;

        }





    }


/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
 */