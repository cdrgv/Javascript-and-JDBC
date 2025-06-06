/*Math Functions*/
import java.io.*;
import java.math.*;
class Prog32
{
  public static void main(String args[])
  {
    int a = 28,b= 4;
    System.out.println("Maximum number of a and b is: " + Math.max(a, b));
    System.out.println("Square root of b is: " + Math.sqrt(b));
    System.out.println("Power of x and b is: " + Math.pow(a, b));
    System.out.println("Logarithm of a is: " + Math.log(a));
    System.out.println("Logarithm of b is: " + Math.log(b));
    System.out.println("log10 of a is: " + Math.log10(a));
    System.out.println("log10 of b is: " + Math.log10(b));
    System.out.println("log1p of a is: " + Math.log1p(a)); // return the log of x + 1
    System.out.println("exp of a is: " + Math.exp(a));
    System.out.println("expm1 of a is: " + Math.expm1(a));  // return (a power of 2)-1

  }
}
