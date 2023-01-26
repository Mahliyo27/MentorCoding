package practice_4;

public class SameLetter {


    public static void main(String[] args) {

       String s = "abc";

       String b = "cao";


        System.out.println(sameLetter(b,s));


    }

    public static boolean sameLetter(String str , String str1){


        for (int i = 0; i <str.length() ; i++) {
            if (str1.indexOf(str.charAt(i)) == -1){
                return false;
            }


            for (int j = 0; j <str1.length() ; j++) {
                if (str1.indexOf(str1.charAt(j)) == -1){
                    return false;
                }

            }
        }


        return true;


    }
}
