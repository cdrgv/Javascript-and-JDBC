// Arguments Pass and Return values
import java.io.*;
import java.util.*;
class Prog13
{
    public static float area(float r)
    {
        float pi=3.1416f,a;
        a=pi*r*r;
        return(a);
    }
    public static void main(String args[])
    {
        int n,i;
        float r,a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter Radius value");
            r=in.nextFloat();
            a=area(r);
            System.out.println(r + " Area is " + a);
        }
    }
}
