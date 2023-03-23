package practice_9;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class sortMap {



     /*
        Map - Sort the map by values
        Write a method that can sort the Map by values.
     */

        public static void main(String[] args) {

            Map<String, Integer> unsortedMap = Map.of("a",1,"c", 3,"b",2,"e",5,"d",4);

            System.out.println("sortByValue(unsortedMap) = " + sortByValue(unsortedMap));
            //sortByValue(unsortedMap) = {a=1, b=2, c=3, d=4, e=5}
        }



        public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue());
            // a static method comparingByValue() to help sort a Map by value
            // it returns a COMPARATOR that compares Map.Entry in the natural order of value
            map = new LinkedHashMap<>();

            for (Map.Entry<String, Integer> each : list) {
                map.put(each.getKey(), each.getValue());
            }

            return map;

        }
    }


