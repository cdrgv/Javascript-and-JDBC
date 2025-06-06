/*File Attributes*/
import java.io.*;
public class FilesExample2
{
public static void main(String[] a)
{
String fname;
DataInputStream in=new DataInputStream(System.in);
try
{
System.out.println("Enter Your File Name");
fname=in.readLine();
File file = new File(fname);
System.out.println(file.canRead());
System.out.println(file.canWrite());
System.out.println(file.createNewFile());
System.out.println(file.exists());
System.out.println(file.getAbsolutePath());
System.out.println(file.isDirectory());
System.out.println(file.isHidden());
System.out.println(file.list());
System.out.println(file.delete());
System.out.println(file.createNewFile());
}
catch(Exception ex)
{
	System.out.println(ex);
}
}
}
