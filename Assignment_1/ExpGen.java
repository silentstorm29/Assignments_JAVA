import java.util.*;

class MyException extends Exception 
{
	public String toString() {
return "Value passed is of String type";
} 
}

public class ExpGen
{

public static <T> void twoThird(T number)
{

try{	
	Class<String> a = String.class;
    if (number.getClass() == a)
    {
       throw new MyException();
    }
	else
	{
		//System.out.println((number*2)/3);
	}
	}catch(Exception z)
{
	System.out.println("Exception: "+z);
}
}

public static void main(String arg[])
{
twoThird("ab");
}
}