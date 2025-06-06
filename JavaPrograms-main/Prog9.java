import java.io.*;
import java.util.*;
class Prog9
{
    public static void main(String args[])
    {
        /*int a[],n,i;*/
        int[] a;
        int n,i;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size");
        n=in.nextInt();
        a=new int[n]; //Re initilization array
        System.out.println("Enter " + n + " Elements");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("The Elements are");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nThe Elements in Reverse is ");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i] + " ");
        }
    }
}