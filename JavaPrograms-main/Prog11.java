//No Arguments Pass and No Return values
import java.io.*;
import java.util.*;
class Prog11
{
    public static void area()
    {
        float r,pi=3.1416f,a;
       Scanner in=new Scanner(System.in);
        System.out.println("Enter radius value");
        r=in.nextFloat();
        a=pi*r*r;
        System.out.println(r + " Area is " + a);
    }
    public static void main(String args[])
    {
        int n,i;
       Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            area();
        }
    }
}
