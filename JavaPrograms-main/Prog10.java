import java.io.*;
import java.util.*;
class Prog10
{
    public static void main(String args[])
    {
        int a[][],r,c,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter r,c values");
        r=in.nextInt();
        c=in.nextInt();
        a=new int[r][c];
        System.out.println("Enter " + r + "X" + c + " Matrix values");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The Matrix is ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
         System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}