import java.io.*;
public class FilesExample6
{
public static void main(String a[])
{
BufferedReader br = null;
Reader r = new InputStreamReader(System.in);
br = new BufferedReader(r);
String str = null;
try
{
do
{
System.out.println("Enter Input, exit to quit.");
str = br.readLine();
System.out.println(str);
}
while (!str.equalsIgnoreCase("exit"));

}
catch (IOException e)
{
e.printStackTrace();
}
finally
{
try
{
if(br != null) br.close();
}catch(Exception ex)
{
ex.printStackTrace();
}
}
}
}
