/*Hirarchical Inheritance*/
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

}
class Child1 extends Father
{
int code;
String name;
Child1(int fcode,String fname,int code,String name)
{
    super(fcode,fname);
    this.code=code;
    this.name=name;
}
void showDetails()
{
    System.out.println("Father Code " + fcode);
    System.out.println("Father Name " + fname);
    System.out.println("Child Code " + code);
    System.out.println("Child Name " + name);

}
}
class Child2 extends Father
{
int code;
String name;
Child2(int fcode,String fname,int code,String name)
{
    super(fcode,fname);
    this.code=code;
    this.name=name;
}
void showDetails()
{
    System.out.println("Father Code " + fcode);
    System.out.println("Father Name " + fname);
    System.out.println("Child Code " + code);
    System.out.println("Child Name " + name);

}
}


class Prog21
{
    public static void main(String args[])
    {
        int fcode,code1,code2;
        String fname,name1,name2;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Father Code and Name");
        fcode=in.nextInt();
        fname=in.next();
        System.out.println("Enter Child1 Code and Name");
        code1=in.nextInt();
        name1=in.next();
        System.out.println("Enter Child2 Code and Name");
        code2=in.nextInt();
        name2=in.next();
        Child1 child1 =new Child1(fcode,fname,code1,name1);
        Child2 child2 =new Child2(fcode,fname,code2,name2);
        child1.showDetails();
        child2.showDetails();
    }
}
