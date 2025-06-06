// Arguments Pass But No Return values
import java.io.*;
import java.util.*;
class Prog12
{
    public static void area(float r)
    {
        float pi=3.1416f,a;
        a=pi*r*r;
        System.out.println(r + " Area is " + a);
    }
    public static void main(String args[])
    {
        int n,i;
        float r;
       Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter Radius value");
            r=in.nextFloat();
            area(r);
        }
    }
}
