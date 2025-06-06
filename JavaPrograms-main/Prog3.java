import java.io.*;
import java.util.*;
class Prog3
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float r,pi=3.1416f,area;
        System.out.println("Enter radius value");
        r=in.nextFloat();
        area=pi*r*r;
        System.out.println(r + " Area is " + area);
    }
}