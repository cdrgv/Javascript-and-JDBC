import java.io.*;
import java.util.*;
class Count extends Thread
{
   Count()
      {
        start();
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
      System.out.println("Thread run is Complete" );
      }
}
class Prog36
{
   public static void main(String args[])
   {
      Count cnt = new Count();
      /*cnt.start();*/
	    try
      {
         while(cnt.isAlive())
         {
           System.out.println("Thread will be alive till the child thread is live");
           Thread.sleep(3000);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );
}
}
