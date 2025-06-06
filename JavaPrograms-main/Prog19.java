/*Single Inheritance*/
import java.io.*;
import java.util.*;
class Father
{
    int fcode;
    String fname;
    Father(int fcode,String fname)
    {
        this.fcode=fcode;
        this.fname=fname;
    }
    // public void showFatherDetails()
    // {
    // System.out.println("Father Code " + fcode);
    // System.out.println("Father Name " + fname);
    // }

}
class Child extends Father
{
int code;
String name;
Child(int fcode,String fname,int code,String name)
{
    super(fcode,fname);
    this.code=code;
    this.name=name;
}
void showDetails()
{
    // showFatherDetails();
    System.out.println("Father Code " + fcode);
    System.out.println("Father Name " + fname);
    System.out.println("Child Code " + code);
    System.out.println("Child Name " + name);

}
}

class Prog19
{
    public static void main(String args[])
    {
        int fcode,code;
        String fname,name;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Father Code and Name");
        fcode=in.nextInt();
        fname=in.next();
        System.out.println("Enter Child Code and Name");
        code=in.nextInt();
        name=in.next();
        Child child =new Child(fcode,fname,code,name);
        child.showDetails();
    }
}
