import java.io.*;
class Exception2
{
public static void main(String args[])
{
try
{
DataInputStream in=new DataInputStream(System.in);
int a,b,c;
System.out.println("Enter a values");
a=Integer.parseInt(in.readLine());
System.out.println("Enter b values");
b=Integer.parseInt(in.readLine());
if(a>0 && b>0)
{
c=a/b;
System.out.println("A=" + a + " B=" + b + " C=" + c);
}
else
{
  System.out.println("Division By Zero is Not Possible ");
}
}
catch(ArithmeticException ex)
{
System.out.println("Arithmatic Exception Raised:" + ex);
}
catch(NumberFormatException ex2)
{
System.out.println("NumberFormatException Raised :" + ex2);
}
catch(IOException ex1)
{
System.out.println("IOExcepiton Raised :" + ex1);
}

}
}
