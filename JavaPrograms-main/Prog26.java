import java.io.*;
interface Comp
{
public static final String objname="KKCC INFO SYSTEMS";
}
interface  Area extends Comp
{
public float getArea(float a,float b);
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
class Prog26
{
public static void main(String args[])
{
Area rectangle = new Rectangle();
Area circle= new Circle();
float a;
a= rectangle.getArea(5,6);
System.out.println("Rectangle Area = " + a);
System.out.println("Object Name=" + rectangle.objname);
a=circle.getArea(4.56f,0f);
System.out.println("Circle Area = " + a);
System.out.println("Object Name=" + circle.objname);
}
}
