/*Default Contructor and Parameterised Constructor*/
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
    Employee(int code,String name,String desig)
    {
        this.code=code;
        this.name=name;
        this.desig=desig;
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
class Prog18
{
public static void main(String args[])
{
    int code;
    String name,desig;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter code name desig");
    code=in.nextInt();
    name=in.next();
    desig=in.next();
    Employee employee=new Employee();
    employee.showEmployee();
    employee.setEmployee(code,name,desig);
    employee.showEmployee();
    Employee employee1=new Employee(102,"Durrga","CSC");
    employee1.showEmployee();
    employee1.setEmployee(code,name,desig);
    employee1.showEmployee();
}
}