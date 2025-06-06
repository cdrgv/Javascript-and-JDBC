import java.io.*;
import java.util.*;
/*CopyCharacters One File to Another File*/
class FilesExample1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String sfname,tfname;
System.out.println("Enter Source file name");
sfname=in.next();
System.out.println("Enter Target file name");
tfname=in.next();
// sfname=args[0];
// tfname=args[1];

File inFile=new File(sfname);
File outFile=new File(tfname);
FileReader  ins=null;
FileWriter outs=null;
try
{
	ins=new FileReader(inFile);
	outs=new FileWriter(outFile);
	int ch;
	while((ch=ins.read())!= -1)
	{
	outs.write(ch);
	}
}
catch(IOException e)
{
	System.out.println(e);
	System.exit(-1);
}
finally
{
	try
	{
	ins.close();
	outs.close();
	}
	catch(IOException e1)
	{
	System.out.println(e1);
	}
}
}
}
