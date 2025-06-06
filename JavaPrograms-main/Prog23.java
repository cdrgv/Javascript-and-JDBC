/*
Polymorphisam
method overridding
multiple Inheritance

Abstract Classes
The abstract class inside can accept ordinary methods
                                      ordinary variables
                                      Abstract methods(Declaration only)
                                      Final variables
Note:Every abstract class before we must type abstract keyword

Interfaces
No need of to abstract key bofore the class name why becuase by default
all Interfaces are declared as abstract Classes
The interfaces can accept Static final varibales and
abstract methods(Declaration only)
*/
import java.io.*;
import java.util.*;
abstract class Bike
{
  abstract void getBenifit();
}
class Honda extends Bike
{
void getBenifit()
{
System.out.println("Honda Running Smoothly");
}
}
class Bajaj extends Bike
{
void getBenifit()
{
System.out.println("Bajaj  Gives More Milage");
}
}
class Bullet extends Bike
{
void getBenifit()
{
System.out.println("Bullet is More Power like (350 cc)");
}
}

class Prog23
{
public static void main(String args[])
{
int choice;
Scanner in=new Scanner(System.in);
do
{
System.out.println("Enter Your Choice(Honda-1,Bajaj-2,Bullet-3,Others-[4-9])");
choice=in.nextInt();
if(choice==1)
{
 Bike honda = new Honda();
 honda.getBenifit();
}
else if(choice==2)
	 {
	 Bike baja= new Bajaj();
	 baja.getBenifit();
	 }
	else if(choice==3)
		{
		 Bike bullet= new Bullet();
		 bullet.getBenifit();
		}
		else
		{
		System.out.println("Your Selection is out Range");
		}

}while(choice>0 && choice<=3);
}
}
