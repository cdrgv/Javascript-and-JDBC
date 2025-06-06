import java.io.*;
import java.util.*;
class Prog8
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a,b values");
        a=in.nextInt();
        b=in.nextInt();
        do{
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Exit");
        System.out.println("Enter Your Choice ");
        c=in.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("A+B=" + (a+b));
            break;
            case 2:
            System.out.println("A-B=" + (a-b));
            break;
            case 3:
            System.out.println("AXB=" + (a*b));
            break;
            case 4:
            System.out.println("A/B=" + (a/b));
            break;
            case 5:
            System.out.println("A%B=" + (a%b));
            break;
            default:
            System.out.println("Your Exit");
        }
        }while(c<=5);
        

    }
}