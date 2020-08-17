import java.util.*;


public class Circle
{
private static double radius=1.0;
private static String color="red";

public Circle()
{}
public Circle(double r)
{}

public double getRadius()
{
return radius;
}

public double getArea()
{
return (radius*radius)*(3.14);
}
}

