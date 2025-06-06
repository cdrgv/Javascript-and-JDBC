// Write a Java program to iterate through all elements in a hash list.
import java.util.*;
import java.util.Iterator;
  public class HashSet2 {
  public static void main(String[] args) {

     HashSet<String> h_set = new HashSet<String>();
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
          System.out.println(h_set);
          Iterator<String> p = h_set.iterator();
			while (p.hasNext())
			 {
			 System.out.println(p.next());
			 }

         System.out.println("Size of the Hash Set: " + h_set.size());
         System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
         h_set.removeAll(h_set);
         System.out.println("Size of the Hash Set: " + h_set.size());
         System.out.println("Hash Set after removing all the elements "+h_set);
         System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
         

   }
}
