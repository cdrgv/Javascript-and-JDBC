//Write a Java program to compare two hash set.
import java.util.*;
  public class HashSet10 {
  public static void main(String[] args) {
          HashSet<String> h_set = new HashSet<String>();
		  //String elements;
          h_set.add("Red");
          h_set.add("Green");
          h_set.add("Black");
          h_set.add("White");
          HashSet<String>h_set2 = new HashSet<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
         for (String element : h_set)
		 {
         //System.out.println(h_set2.contains(element) ? element : "");
		 if(h_set2.contains(element))
		 {
			 System.out.println(element);
		 }
		 
         }
     }
}
