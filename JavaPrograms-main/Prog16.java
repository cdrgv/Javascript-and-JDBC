/*
What is the Class ?
The combination state and behaviour of the object is called class
What is the Object ?
A instance of the class is called object
*/
import java.io.*;
import java.util.*;
class Student
{
    int code;
    String name;
    String course;
    public void setStudent(int intcode,String strname,String strcourse)
    {
        code=intcode;
        name=strname;
        course=strcourse;
    }
    public void showStudent()
    {
        System.out.println("Code   : " +code);
        System.out.println("Name   : " +name);
        System.out.println("Course : " +course);
    }
}
class Prog16
{
    public static void main(String args[])
    {
        Student student1=new Student();
        int code;
        String name,course;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Code Name Course");
        code=in.nextInt();
        name=in.next();
        course=in.next();
        student1.setStudent(code,name,course);
        Student student2=new Student();
        System.out.println("Enter Code Name Course for Student 1");
        code=in.nextInt();
        name=in.next();
        course=in.next();
        student2.setStudent(code,name,course);
        student1.showStudent();
        student2.showStudent();
    }
}