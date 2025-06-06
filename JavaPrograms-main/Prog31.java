//String Tokens
import java.io.*;
import java.util.*;
public class Prog31
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Ramesh Kiran Bhrath Mohan Latha Priya");
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}

}
}
