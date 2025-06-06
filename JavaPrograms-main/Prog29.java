import java.io.*;
import java.util.*;
class Prog29
{
public static void main(String args[])
{
String pwd,rpwd;
int cnt,r;
cnt=1;
Scanner in=new Scanner(System.in);
do {
  System.out.println("Enter Password  : ");
  pwd=in.next();
  System.out.println("Re-Type Password : ");
  rpwd=in.next();
  r=pwd.compareTo(rpwd);
  if(r==0)
  {
    System.out.println("Passwors is Success");
  }
  else
  {
    System.out.println("Password Not Match Try Again !");
  }
  cnt+=1;
} while (r!=0 && cnt<=3);

}
}
