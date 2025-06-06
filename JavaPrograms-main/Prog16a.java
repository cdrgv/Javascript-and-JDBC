/*if your using private keyword with in the class memebers we can't access out side of the class
other then private it can access*/
import java.io.*;
import java.util.*;
class Person
{
    int code;
    String name;
    String course;
}
class Prog16a
{
    public static void main(String args[])
    {
        Person person=new Person();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Code Name Course");
        person.code=in.nextInt();
        person.name=in.next();
        person.course=in.next();
        System.out.println("Code : " + person.code);
        System.out.println("Name : " + person.name);
        System.out.println("Course : " + person.course);
    }
}