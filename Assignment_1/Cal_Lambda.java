import java.util.*;

	interface A
		{
			public int add(int a,int b);

		}
	interface B
		{
			public int difference(int a,int b);
		}
	interface C
		{
			public int product(int a,int b);
		}
	interface D
		{
			public int safeDivision(int a,int b);
		}


public class Calculator
{
	public static void main(String arg[])
	{
		A calc =(a,b)->(a+b);
		System.out.println(calc.add(4,3));

		B calc1 =(a,b)->(a-b);
		System.out.println(calc1.difference(4,3));

		C calc2 =(a,b)->(a*b);
		System.out.println(calc2.product(4,3));

		D calc3 =(a,b)->(a/b);
		System.out.println(calc3.safeDivision(4,3));
	}
}
