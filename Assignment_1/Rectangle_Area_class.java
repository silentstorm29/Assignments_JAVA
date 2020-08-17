import java.*;

class Rectangle
{
int width,height;
public void display()
{
System.out.println("Width: "+width+" "+"Height: "+height);
}
}

public class RectangleArea extends Rectangle
{
public void read_input(int w,int h)
{
height=h;
width=w;
display();
}

public void display(String s)
{
System.out.println(s+": "+width*height);

}

public static void main(String[] arg)
{
RectangleArea ra= new RectangleArea();
ra.read_input(12,12);
ra.display("Area");
}
}

