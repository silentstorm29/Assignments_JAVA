import java.util.*;

class Complex
{
public void sum(int i1,int j1,int i2,int j2)
{
System.out.println("Sum:");
int real,img;
real=i1+i2;
img=j1+j2;
System.out.println(real+"i"+"+"+img+"j");
}

public void difference(int i1,int j1,int i2,int j2)
{
System.out.println("\nDifference:");
int real,img;
real=i1-i2;
img=j1-j2;
System.out.println(real+"i"+"+"+img+"j");
}

public void product(int i1,int j1,int i2,int j2)
{
System.out.println("\nProduct:");
int real,img;
real=i1*i2;
img=j1*j2;
System.out.println(real+"i"+"+"+img+"j");
}


public static void main(String arg[])
{
Complex obj = new Complex();
Scanner sc = new Scanner(System.in);

int real1,real2,img1,img2;
System.out.println("Enter real amd imaginary value of complex number 1:");
real1=sc.nextInt();
img1=sc.nextInt();

System.out.println("Enter real amd imaginary value of complex number 2:");
real2=sc.nextInt();
img2=sc.nextInt();
obj.sum(real1,img1,real2,img2);
obj.difference(real1,img1,real2,img2);
obj.product(real1,img1,real2,img2);
}
}

