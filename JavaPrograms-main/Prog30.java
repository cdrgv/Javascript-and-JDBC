import java.lang.*;
import java.io.*;
class Prog30
{
  public static void main(String args[])
  {
    String name="SrinivasaRao",name1="   SrinivasaRao   ";
    System.out.println(name.length());
    System.out.println(name.charAt(0));
    System.out.println(name.indexOf('S'));
    System.out.println(name.substring(3));
    System.out.println(name.substring(3,6));
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println("Rama is a good boy".replace("good","bad"));
    System.out.println(name.equals("SrinivasaRao"));
    System.out.println(name.equalsIgnoreCase("srinivasarao"));
    System.out.println(name.concat(" Garu"));
    System.out.println(name1.trim());
    System.out.println(name.endsWith("Rao"));
    System.out.println(name.startsWith("Sri"));

  }
}
