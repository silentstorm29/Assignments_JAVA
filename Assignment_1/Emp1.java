import java.util.*;
import java.util.stream.Collectors;

public class Employee1
{
int empYear;
String empName,empAdd;

public void setter(String name,int year,String add)
{
empYear=year;
empAdd=add;
empName=name;
}
public String toString()
{
	System.out.println("\n");
	
return (empName+" "+empYear+" "+empAdd);
}

public static void main(String arg[])
{

Employee1 emp1 = new Employee1();
emp1.setter("Abhishek",2017,"Mumbai");

Employee1 emp2 = new Employee1();
emp2.setter("Akhil",2016,"Bangalore");

Employee1 emp3 = new Employee1();
emp3.setter("Rishi",2018,"Punjab");


List<Employee1> ls = Arrays.asList(emp1,emp2,emp3);

for(Employee1 m:ls)
{
	System.out.println(m);
}

}

}