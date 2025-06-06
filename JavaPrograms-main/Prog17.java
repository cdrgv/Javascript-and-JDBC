/*
What is the Constructor ?
The constructor can initialize the class members
note: whenever we instantiated the class then automatically the constructor executed

Rules:
    1)The constructor name must be a class name
    2)No return type in constructors
Types of Constructors:
    1)Default constructor(With out parameters or arguments)
    2)Parameterised constructor( With parameters or arguments)

Overloading Construrctor:
    if you are using default constructor and parameterised constructor
    using a single class i.e overloading construcotrs

*/

import java.io.*;
import java.util.*;
class Employee
{
    int code;
    String name;
    String desig;
    Employee()
    {
        code=100;
        name="SrinivasaRao.K";
        desig="Engg";
    }
    public void setEmployee(int code,String name,String desig)
    {
        this.code=code;
        this.name=name;
        this.desig=desig;
    }
    public void showEmployee()
    {
        System.out.println("Code  : " + code);
        System.out.println("Name  : " + name);
        System.out.println("Desig : " + desig);
    }
}
class Prog17
{
public static void main(String args[])
{
    int code;
    String name,desig;
    Scanner in=new Scanner(System.in);
    Employee employee=new Employee();
    employee.showEmployee();
    
    System.out.println("Enter code name desig");
    code=in.nextInt();
    name=in.next();
    desig=in.next();
 
    employee.setEmployee(code,name,desig);
    employee.showEmployee();
}
}