import java.io.*;
import java.util.*;
interface  Area
{
public float getArea(float l,float w);
public static final String objname="KKCC INFO SYSTEMS";
}
class Rectangle  implements Area
{
public float getArea(float  l,float w)
{
return(l*w);
}
}
class Circle  implements Area
{
public float getArea(float r,float r1)
{
return(3.1416f*r*r);
}
}
class Square implements Area
{
public float getArea(float l,float w)
{
return(l*w);
}
}
class Prog25
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
 Area rectangle = new Rectangle();
 Area circle= new Circle();
 Area square=new Square();
float l,w,r,a;

System.out.println("Enter l,w values");
l=in.nextFloat();
w=in.nextFloat();
a= rectangle.getArea(l,w);
System.out.println("Rectangle Area = " + a);
System.out.println("Object Name=" + rectangle.objname);

System.out.println("Enter Radius values");
r=in.nextFloat();
a=circle.getArea(r,0.0f);
System.out.println("Circle Area = " + a);
System.out.println("Object Name=" + circle.objname);

System.out.println("Enter Side values");
l=in.nextFloat();
a=square.getArea(l,l);
System.out.println("Square Area ="+ a);
System.out.println("Object Name=" + square.objname);
}
}
