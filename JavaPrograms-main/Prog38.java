import java.io.*;
import java.util.*;
class Count implements Runnable
//class Count extends Thread
{
Thread mythread=new Thread(this, "");
Count()
{
mythread.start();
}
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("Printing the count " + i);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("mythread run is over" );
   }
}
class Prog38
{
    public static void main(String args[])
    {
       Count cnt = new Count();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Thread will be alive till the child thread is live");
            Thread.sleep(3000);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Thread interrupted");
       }
       System.out.println("Thread run is over" );
    }
}
