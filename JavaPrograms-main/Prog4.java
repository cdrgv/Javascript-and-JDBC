import java.io.*;
import java.util.*;
class Prog4
{
    public static void main(String args[])
    {
        int m,p,c,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m,p,c values");
        m=in.nextInt();
        p=in.nextInt();
        c=in.nextInt();
        avg=((m+p+c)/3);
        if(m>34 && c>34 && p>34)
        {
            if(avg>34 && avg<50)
            {
             System.out.println("Ordianary");   
            }
            else if(avg>=50 && avg<60)
            {
            System.out.println("Second class");
            }
            else if(avg>=60 && avg<75)
            {
            System.out.println("First Class");
            }
            else if(avg>=75 && avg<=100)
            {
                System.out.println("Distinction");
            }
            else if(avg>100)
            {
                System.out.println("Given Marks is Wrong");
            }


        }
        else
        {
            if(m<35)
            System.out.print("Maths  ");
            if(p<35)
            System.out.print("Phy ");
            if(c<35)
            System.out.print("Che ");
            System.out.print(" Failed");
        }
    }
}