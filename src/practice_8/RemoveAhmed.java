package practice_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

    //2) ArrayList - Remove "Ahmed"
    //Given a list of people'
    // names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed





      public static ArrayList<String> remove1(ArrayList<String> names) {
         Iterator<String> it = names.iterator();
         while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
               it.remove();
         }
         return names;
      }


      // solution 2
      public static ArrayList<String> remove2(ArrayList<String> names) {
         names.removeAll(Arrays.asList(names));
         return names;
      }


      // solution 3
      public static ArrayList<String> remove3(ArrayList<String> names) {
         names.removeIf(name -> name.equals("Ahmed"));
         return names;
      }


   public static void main(String[] args) {


         ArrayList<String>names = new ArrayList<>();


        names.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));


      System.out.println(remove1(names));

      System.out.println(remove2(names));
      System.out.println(remove3(names));

   }


   }





