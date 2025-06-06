import java.io.*;
import java.util.*;
class Prog7
{
    public static void main(String args[])
    {
        int amount,sum=0;
        Scanner in=new Scanner(System.in);
        do
        {
            System.out.println("Enter Amount");
            amount=in.nextInt();
            if(amount>0)
            {
                sum=sum+amount;
                System.out.println("Cumilative Amount is :" + sum);
            }
        }while(amount>0);
        System.out.println("The Total Amount  is " + sum);
    }
}