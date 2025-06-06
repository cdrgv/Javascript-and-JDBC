//String Functions Example
import java.io.*;
import java.util.*;
class Prog28
{
public static void main(String args[])
{
String name;
Scanner in=new Scanner(System.in);
int p;
name="Hellow How Are You";
System.out.println("Enter Which position character you want print");
p=in.nextInt();
System.out.println(name.charAt(p));
System.out.println(name.compareTo("hellow How Are You"));
System.out.println(name.compareToIgnoreCase("HELLOW HOW ARE YOU"));
System.out.println(name.concat(" Srinivas"));
System.out.println(name.toLowerCase());
System.out.println(name.toUpperCase());
}
}
