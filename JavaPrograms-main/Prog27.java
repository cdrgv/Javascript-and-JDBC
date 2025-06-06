import java.io.*;
import java.util.*;
class Prog27
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int i,n,p;
String name[],element;
Vector vector=new Vector();
System.out.println("Enter n vaule");
n=in.nextInt();
System.out.println("Enter " + n + " Elements");
for(i=0;i<n;i++)
{
  element=in.next();
  vector.addElement(element);
//vector.addElement(in.next());
}

for(i=0;i<vector.size();i++)
{
System.out.println((i + 1) + ")" + vector.elementAt(i));
}

System.out.println("Which position you want add element");
p=in.nextInt();
element=in.next();
vector.insertElementAt(element,p);

System.out.println("After Inserting  Elements are");
for(i=0;i<vector.size();i++)
{
System.out.println((i + 1) + ")" + vector.elementAt(i));
}
System.out.println("Which position you want remove element");
p=in.nextInt();
vector.removeElementAt(p);
System.out.println("After Removing  Elements are");
for(i=0;i<vector.size();i++)
{
System.out.println((i + 1) + ")" + vector.elementAt(i));
}
name=new String[vector.size()];
vector.copyInto(name);
vector.removeAllElements();
System.out.println("The String elements are");
for(i=0;i<name.length;i++)
{
System.out.println((i+1) + ")" + name[i]);
}
}
}
