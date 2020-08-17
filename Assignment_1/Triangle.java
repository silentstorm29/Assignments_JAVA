import java.util.*;
import java.lang.Math;

class Triangle
{

public double triangleArea(int a,int b,int c)
{
int s;
double area;
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
return area;
}

public static void main(String arg[])
{
Triangle tri =new Triangle();
System.out.println(tri.triangleArea(4,5,6));
}

}