//Write a Java program to empty an hash set.
import java.util.*;

  public class HashSet4 {
  public static void main(String[] args) {
     HashSet<String> h_set = new HashSet<String>();
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          h_set.add("Pink");
          h_set.add("Yellow");
    System.out.println("Original Hash Set: " + h_set);
    System.out.println("Size of the Hash Set: " + h_set.size());
    h_set.removeAll(h_set);
    System.out.println("Size of the Hash Set: " + h_set.size());
    System.out.println("Hash Set after removing all the elements "+h_set);
   }
}
