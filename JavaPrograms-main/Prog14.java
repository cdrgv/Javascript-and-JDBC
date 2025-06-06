// No Arguments Pass But  Return values
import java.io.*;
import java.util.*;
class Prog14
{
    public static float area()
    {
        float r,pi=3.1416f,a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Radius value");
        r=in.nextFloat();
        a=pi*r*r;
        System.out.print(r);
        return(a);
    }
    public static void main(String args[])
    {
        int n,i;
        float a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            a=area();
            System.out.println(" Area is " + a);
        }
    }
}
