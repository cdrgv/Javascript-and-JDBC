import java.io.*;
import java.math.*;
import java.text.DecimalFormat;
class Prog34
{
	public static DecimalFormat df=new DecimalFormat("00.00");
  public static void main(String args[])
  {
    double d=456.55656;

    System.out.println("Absolute value of a is: " + Math.abs(-456));// converting values to radian
    System.out.println("Max value of a is: " +Math.max(45,56));
    System.out.println("Min value of a is: " +Math.min(45,56));
    System.out.println("SQrt value of a is: " +Math.sqrt(12));
    System.out.println("Cubic Root value of a is: " +Math.cbrt(12));
    System.out.println("power value of a is: " +Math.pow(2,2));
    System.out.println("sign value of a is: " +Math.signum(-456));
    System.out.println("Ceil value of a is: " +Math.ceil(45.56f));
    System.out.println("Floor value of a is: " +Math.floor(45.56f));
	System.out.println("Round" + df.format(d));
  }
}
