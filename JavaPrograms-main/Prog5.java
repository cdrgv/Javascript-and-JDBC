import java.io.*;
import java.util.Scanner;
class Prog5
{
    public static void main(String args[])
    {
    int n,i;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter n value");
    n=in.nextInt();
    i=1;
    while(i<=10)
    {
        System.out.println(n + "X" + i + "=" + n*i);
        i++;
    }
    }
    
}