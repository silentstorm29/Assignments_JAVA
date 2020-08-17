import java.util.*;
import java.util.stream.Collectors;

class Employee
{
int empId;
String empName,empDesignation,empLocation;
double empSalary;

public void setter(int id,String name,String desg,String loc,double sal)
{
empId=id;
empDesignation=desg;
empLocation=loc;
empSalary=sal;
empName=name;
}
public String toString()
{
return (empName+" "+empId+" "+empDesignation+" "+empLocation+" "+empSalary);
}

public static void main(String arg[])
{

Employee emp1 = new Employee();
emp1.setter(1,"Abhi","Manager","Mumbai",105000.00);

Employee emp2 = new Employee();
emp2.setter(2,"Akhil","Manager","Bangalore",105000.00);

Employee emp3 = new Employee();
emp3.setter(3,"Rishi","Assistant","Punjab",80000.00);

Employee emp4 = new Employee();
emp4.setter(4,"Kriti","Manager","Delhi",155000.00);

Employee emp5 = new Employee();
emp5.setter(5,"Shiva","Engineer","Hydrabad",200000.00);

Employee emp6 = new Employee();
emp6.setter(6,"Muskan","Junior","Mumbai",40000.00);

Employee emp7 = new Employee();
emp7.setter(7,"Ayush","Cee","Bangalore",45000.00);

Employee emp8 = new Employee();
emp8.setter(8,"Nishant","Manager","Delhi",165000.00);

Employee emp9 = new Employee();
emp9.setter(9,"Adarsh","Reseacher","Mysore",205000.00);

Employee emp10 = new Employee();
emp10.setter(10,"Sneha","Manager","Hydrabad",12500.00);


List<Employee> ls = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);

List<String> names= ls.stream().map(s->s.empName).collect(Collectors.toList());
System.out.println("Names of all the employee: ");
System.out.println(names);

List<Employee> sall= ls.stream().filter(s->s.empSalary>50000.00).collect(Collectors.toList());
System.out.println("Employee with salary >50k: ");
System.out.println(sall);

List<Employee> locc= ls.stream().filter(s->s.empLocation.startsWith("M")).collect(Collectors.toList());
System.out.println("Employee location starts with M: ");
System.out.println(locc);

List<Employee> des =ls.stream().filter(s->s.empDesignation.endsWith("e")).collect(Collectors.toList());
System.out.println("Employee designation ends with e: ");
System.out.println(des);



}

}