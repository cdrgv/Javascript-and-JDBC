import java.io.*;
import java.math.*;
class Prog33
{
  public static void main(String args[])
  {
    double angle=30;
    System.out.println("Degree to Radiuns is: " + Math.toRadians(angle));// converting values to radian
    System.out.println("Degree to Radiuns is: " + Math.round(Math.toRadians(angle)));// converting values to radian
    System.out.println("Sine value of a is: " +Math.sin(angle));
    System.out.println("Cosine value of a is: " +Math.cos(angle));
    System.out.println("Tangent value of a is: " +Math.tan(angle));
    System.out.println("A Sine value of a is: " +Math.asin(angle));
    System.out.println("A Cosine value of a is: " +Math.acos(angle));
    System.out.println("A Tangent value of a is: " +Math.atan(angle));
    System.out.println("H Sine value of a is: " +Math.sinh(angle));
    System.out.println("H Cosine value of a is: " +Math.cosh(angle));
    System.out.println("H Tangent value of a is: " +Math.tanh(angle));

  }
}
