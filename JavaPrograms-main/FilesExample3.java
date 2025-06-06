import java.io.File;
import java.util.*;
 /*Getting File List From Folder*/
public class FilesExample3
{
public static void main(String a[])
{
        try
          {
            // File file = new File("E:/Rao/");
            //  File[] files = file.listFiles();
            //      for(File f: files)
            //           {
            //            System.out.println(f.getName());
            //            Thread.sleep(100);
            //          }
            File file = new File("E:/Rao/");
            String[] files = file.list();
                 for(String f:files){
                     System.out.println(f);
                     Thread.sleep(100);
                 }

          }
          catch(Exception ex)
          {
System.out.println(ex);
          }

    }
}
