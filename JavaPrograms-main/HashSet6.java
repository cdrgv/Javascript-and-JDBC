//Write a Java program to clone a hash set to another hash set.
import java.util.*;
  public class HashSet6 {
  public static void main(String[] args) {
     HashSet<String> h_set = new HashSet<String>();
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
    	System.out.println("Original Hash Set: " + h_set);
    	HashSet <String> new_h_set = new HashSet <String> ();
         new_h_set = (HashSet)h_set.clone();
         System.out.println("Cloned Hash Set: " + new_h_set);
   }
}
