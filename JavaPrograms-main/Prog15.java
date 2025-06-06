/*
Functions Overloading ?
The function name is the common and the parameters is different is called a 
functions overloading
*/

import java.io.*;
import java.util.*;
class Prog15
{
    public static int sum(int a,int b)
    {
        return(a+b);
    }
    public static int sum(int a,int b,int c)
    {
        return(a+b+c);
    }
    public static int sum(int a,int b,int c,int d)
    {
        return(a+b+c+d);
    }
    public static float sum(int a,float b)
    {
        return(a+b);
    }
    public static float sum(float a,int b)
    {
        return(a+b);
    }
    public static float sum(float a,float b)
    {
        return(a+b);
    }
    public static void main(String args[])
    {
    int a,b,c,d;
    float e,f;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any four Integers");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    d=in.nextInt();
    System.out.println("Enter any two Float numbers");
    e=in.nextFloat();
    f=in.nextFloat();
    System.out.println("A+B=" + sum(a,b));
    System.out.println("A+B+C=" + sum(a,b,c));
    System.out.println("A+B+C+D=" + sum(a,b,c,d));
    System.out.println("A+E=" + sum(a,e));
    System.out.println("E+A=" + sum(e,a));
    System.out.println("E+F=" + sum(e,f));
    }
}