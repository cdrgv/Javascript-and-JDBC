// Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
import java.util.TreeSet;
public class TreeSet1 {
  public static void main(String[] args) {
  TreeSet<String> tree_set = new TreeSet<String>();
  tree_set.add("Red");
  tree_set.add("Green");
  tree_set.add("Orange");
  tree_set.add("White");
  tree_set.add("Black");
  System.out.println("Tree set: " + tree_set);
  //print all Tree Set elements through for loop
  for (String element : tree_set) {
    System.out.println(element);
    }
 }
}
