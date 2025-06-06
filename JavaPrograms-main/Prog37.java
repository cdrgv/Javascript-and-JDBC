import java.io.*;
import java.util.*;
class MultiThread implements Runnable
/*class MultiThread  extends Thread*/
{
public void run()
{
try
{
System.out.println("Thread is in running Start.");
for(int i=1;i<=5;i++)
{
System.out.println("I=" + i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class Prog37
{
public static void main(String args[])
{
MultiThread mt=new MultiThread();
Thread newobj =new Thread(mt);
/*MultiThread newobj=new MultiThread();*/
newobj.start();
 }
}
