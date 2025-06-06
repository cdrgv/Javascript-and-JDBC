//Write a Java program to print all the elements of a ArrayList using the position of the elements.
import java.util.ArrayList;
  public class Collections15 {
  public static void main(String[] args) {
  ArrayList <String> c1 = new ArrayList <String> ();
  c1.add("Red");
  c1.add("Green");
  c1.add("Black");
  c1.add("White");
  c1.add("Pink");
  System.out.println("\nOriginal array list: " + c1);
  System.out.println("\nPrint using index of an element: ");
  int no_of_elements = c1.size();
  for (int i = 0; i < no_of_elements; i++)
   System.out.println(c1.get(i));


 }
}
