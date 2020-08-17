import java.util.*;

interface one
{
	public int add(int a,int b);

}
interface two
{
	public int difference(int a,int b);
}
interface three
{
	public int product(int a,int b);
}
interface four
{
	public int safeDivision(int a,int b);
}


public class Calculator
{
public static void main(String arg[])
{
one calc =(a,b)->(a+b);
System.out.println(calc.add(4,3));

two calc1 =(a,b)->(a-b);
System.out.println(calc1.difference(4,3));

three calc2 =(a,b)->(a*b);
System.out.println(calc2.product(4,3));

four calc3 =(a,b)->(a/b);
System.out.println(calc3.safeDivision(4,3));
}
}
