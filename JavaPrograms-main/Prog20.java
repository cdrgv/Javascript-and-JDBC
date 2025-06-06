/*Multilevel Inheritance*/
import java.io.*;
import java.util.*;
class GFather
{
    int gcode;
    String gname;
    GFather(int gcode,String gname)
    {
        this.gcode=gcode;
        this.gname=gname;
    }

}
class Father extends GFather
{
    int fcode;
    String fname;
    Father(int gcode,String gname,int fcode,String fname)
    {
        super(gcode,gname);
        this.fcode=fcode;
        this.fname=fname;
    }

}
class Child extends Father
{
int code;
String name;
Child(int gcode,String gname,int fcode,String fname,int code,String name)
{
    super(gcode,gname,fcode,fname);
    this.code=code;
    this.name=name;
}
void showDetails()
{
    System.out.println("GFather Code " + gcode);
    System.out.println("GFather Name " + gname);
    System.out.println("Father Code " + fcode);
    System.out.println("Father Name " + fname);
    System.out.println("Child Code " + code);
    System.out.println("Child Name " + name);

}
}

class Prog20
{
    public static void main(String args[])
    {
        int gcode,fcode,code;
        String gname,fname,name;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter GFather Code and Name");
        gcode=in.nextInt();
        gname=in.next();
        System.out.println("Enter Father Code and Name");
        fcode=in.nextInt();
        fname=in.next();
        System.out.println("Enter Child Code and Name");
        code=in.nextInt();
        name=in.next();
        Child child =new Child(gcode,gname,fcode,fname,code,name);
        child.showDetails();
    }
}
