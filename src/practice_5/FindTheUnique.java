package practice_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheUnique {


    public static void main(String[] args) {





        String str = "AAABBBCCCDEF";

        System.out.println(unique(str));
        System.out.println(uniqueChar(str));
    }

    public static String unique(String str){


            String[] arr = str.split("");
            String unique1 = "";

            for (int j = 0; j < arr.length; j++) {
                int num = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(arr[j])) {
                        num++;
                    }
                }
                if (num == 1) {
                    unique1 += arr[j];
                }
            }

            return unique1;
        }





        public static Map<Character, Integer> uniqueChar(String str){





            Map<Character, Integer> map = new LinkedHashMap<>();

            for (String each : str.split("")) {
                int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
                if(frequency == 1)
                    map. put(each.charAt(0), frequency);

            }

            return map;

        }


}

