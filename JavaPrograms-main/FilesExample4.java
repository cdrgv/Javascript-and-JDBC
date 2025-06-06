/*filter the files*/
import java.io.*;

public class FilesExample4
{
public static void main(String a[])
{
File file = new File("e:/rao/");
String[] files = file.list(
new
	FilenameFilter()
	{
	 @Override
        public boolean accept(File dir, String name)
		{
        if(name.toLowerCase().endsWith(".class"))
			{
			return true;
			}
			else
			{
			return false;
    		}
    }
    }
);

for(String f:files)
{
System.out.println(f);
}

}
}
