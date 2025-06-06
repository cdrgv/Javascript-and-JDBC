import java.io.*;
import java.util.*;
abstract class Area
{
  String cname;
  abstract float getArea(float param1,float param2);
  public void showName()
  {
  cname="KKCC INFO SYSTEMS";
  System.out.println(cname);
  }
}
class Rectangle extends Area
{
float getArea(float  l,float w)
{
return(l*w);
}
}
class Circle extends Area
{
float getArea(float r,float r1)
{
return(3.1416f*r*r);
}
}

class Prog24
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 Area rectangle = new Rectangle();
 Area circle= new Circle();
float a,r;
int l,w;
System.out.println("Enter l,w values");
l=in.nextInt();
w=in.nextInt();
a= rectangle.getArea(l,w);
rectangle.showName();
System.out.println("Rectangle Area = " + a);
System.out.println("Enter Radius value");
r=in.nextFloat();
circle.showName();
a=circle.getArea(r,0f);
System.out.println("Circle Area = " +a);
}
}
