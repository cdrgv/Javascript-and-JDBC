import java.io.*;
/*ReadLinesFromFile*/
public class FilesExample5
{
public static void main(String a[])
{
DataInputStream in=new DataInputStream(System.in);
BufferedReader br = null;
String strLine = "";
String fname="";
try
{
System.out.println("Enter Your File Name");
fname=in.readLine();
br = new BufferedReader( new FileReader(fname));
int i=1;
while( (strLine = br.readLine()) != null)
{
System.out.println(i+ " " + strLine);
i++;
}

}
catch(FileNotFoundException e)
{
System.err.println("Unable to find the file:" + fname  );
}
catch (IOException e1)
{
 System.err.println("Unable to read the file: " + fname);
}
}
}
