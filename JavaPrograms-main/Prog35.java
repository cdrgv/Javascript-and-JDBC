/*
What is multithread ?
multithread is a separate program.
A Single processor can do the multple programs simultaneously.
it executes concurrently or parallely depends upon the system speed.
In Operating system we are calling Multitasking
In Programming Languages we are calling Multithrading

*/
import java.io.*;
import java.util.*;
class Prog35 extends Thread
{
public void run()
{
    try
    {
        System.out.println("My First Thread is Started");
        for(int i=1;i<=5;i++)
        {
            System.out.println("i=" + i);
            if(i==1 || i==3)
            {
            sleep(1000);
            }
        }
        System.out.println("Thread is Completed");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
}
public static void main(String args[])
{
    Prog35  mt=new Prog35 ();
mt.start();
}

}
