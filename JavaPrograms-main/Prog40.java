import java.io.*;
import java.util.*;
class MultiThread extends Thread
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
sleep(5000);
}
}
System.out.println("Thread is Completed");
}
catch(Exception e)
{
}
} 
}
class Prog40
{
public static void main(String args[])
{
/*MultiThread  obj=new MultiThread ();
obj.start();  */
new MultiThread().start();
}

}
