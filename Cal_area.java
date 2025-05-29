import java.util.*;
abstract class Figure
{
int dim1,dim2;
abstract double area();
}
class Rectangle extends Figure
{
Rectangle(int l,int b)
{
dim1=l;
dim2=b;
}
public double area()
{
return dim1*dim2;
}
}
class Triangle extends Figure
{
Triangle(int l,int b)
{
dim1=l;
dim2=b;
}
public double area()
{
return 0.5*(dim1*dim2);
}
}
class Cal_area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int l,b;
System.out.println("Enter the length of the rectangle:");
l=sc.nextInt();
System.out.println("Enter the breadth of the rectangle;");
b=sc.nextInt();
Rectangle r=new Rectangle(l,b);
System.out.println("the area of rectangle "+(double)b+"is;"+r.area());
System.out.println("enter the base of rectangle:");
l=sc.nextInt();
System.out.println("enter the height of rectangle:");
b=sc.nextInt();
Triangle t=new Triangle(l,b);
System.out.println("the area of triangle"+(double)l+"and"+(double)b+"is:"+t.area());
}
}
