import java.io.*;
import java.util.*;
class ThreadA extends Thread
{
public void run()
{  
try
{
System.out.println("Thread A is running Start.");
for(int i=1;i<=5;i++)
{
System.out.println("Thread A=" + i);
}
System.out.println("Thread A Closed");
}
catch(Exception e)
{
}
}
}
class ThreadB extends Thread
{
public void run()
{
try
{
System.out.println("Thread B is running Start.");
for(int i=1;i<=5;i++)
{
System.out.println("Thread B=" + i);
}
System.out.println("Thread B Closed");
}
catch(Exception e)
{
}
}
}
class ThreadC extends Thread
{
public void run()
{
try
{
System.out.println("Thread C is running Start.");
for(int i=1;i<=5;i++)
{
System.out.println("Thread C=" + i);
}
System.out.println("Thread C Closed");
}
catch(Exception e)
{
}
}
}
class Prog39
{
public static void main(String args[])
{
try
{
ThreadA a=new ThreadA();
ThreadB b=new ThreadB();
ThreadC c=new ThreadC();
a.setPriority(Thread.MIN_PRIORITY);
b.setPriority(Thread.MAX_PRIORITY);
c.setPriority(Thread.NORM_PRIORITY);
System.out.println(a.getPriority());
System.out.println(b.getPriority());
System.out.println(c.getPriority());
a.start();
b.start();
c.start();
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}
